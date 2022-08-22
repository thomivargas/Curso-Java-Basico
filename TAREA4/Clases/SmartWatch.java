package com.company.Clases;

public class SmartWatch extends SmartDevice{

    public SmartWatch(){}
    public SmartWatch(String procedasador, String tipoPantalla, String color, String bateria) {
        super(procedasador, tipoPantalla, color, bateria);

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "procedasador='" + procedasador + '\'' +
                ", tipoPantalla='" + tipoPantalla + '\'' +
                ", color='" + color + '\'' +
                ", bateria='" + bateria + '\'' +
                '}';
    }
}
