package com.company.Clases;

public class SmartPhone extends SmartDevice{
    String camara;
    int almacenamiento;

    public SmartPhone(){
        super();
    };

    public SmartPhone(String procedasador, String tipoPantalla, String color, String bateria, String camara, int almacenamiento) {
        super(procedasador, tipoPantalla, color, bateria);
        this.camara = camara;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara='" + camara + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", procedasador='" + procedasador + '\'' +
                ", tipoPantalla='" + tipoPantalla + '\'' +
                ", color='" + color + '\'' +
                ", bateria='" + bateria + '\'' +
                '}';
    }
}
