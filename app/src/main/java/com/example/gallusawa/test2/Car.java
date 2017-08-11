package com.example.gallusawa.test2;

import java.io.Serializable;

/**
 * Created by gallusawa on 8/11/17.
 */

public class Car implements Serializable{

    String carModel;
    String carYear;
    String carType;

    public Car(String carModel, String carYear, String carType) {
        this.carModel = carModel;
        this.carYear = carYear;
        this.carType = carType;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
