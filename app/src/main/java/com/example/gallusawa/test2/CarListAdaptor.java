package com.example.gallusawa.test2;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by gallusawa on 8/11/17.
 */

public class CarListAdaptor {

    List<car> carList = new ArrayList<>();

    public CarListAdaptor(List<Car> foodList) {
        this.carList = carList;
    }


    public class ViewHolder extends RecyclerView.Adapter<CarListAdaptor.ViewHolder>{

        TextView carModel;
        TextView carYear;
        TextView carType;



        public ViewHolder(View itemView) {

            super(itemView);

          c = (TextView) itemView.findViewById(R.id.textView1);
            carType = (TextView) itemView.findViewById(R.id.textView2;
            carYear = (TextView) itemView.findViewById(R.id.textView3);
        }


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d(TAG, "onCreateViewHolder: ");
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carlist_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: ");
        final int p=position;
        final Car car = carList.get(position);
        holder.carModel.setText(car.getCarModel());
        holder.carType.setText(car.getCarType());
        holder.carYear.setText(car.getCarYear());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Car> c = new ArrayList<>();
                c.add(new Car("Honda", "Accord", "2007"));
                c.add(new Car("Mercedez", "serie 325", "2013"));
                c.add(new Car("Toyota", "Corola", "2003"));

                Intent i = new Intent(v.getContext(), DetailsActivity.class);
                Car z2 = null;
                for(int x=0;x<c.size();x++)
                    if(car.getCarModel().equals(c.get(x).getCarModel()))
                        z2 = c.get(x);
                i.putExtra("Animal", z2);
                v.getContext().startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {

        return carList.size();
    }


}