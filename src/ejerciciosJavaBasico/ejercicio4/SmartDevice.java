package ejerciciosJavaBasico.ejercicio4;

public class SmartDevice {
    protected String marca;

    protected String modelo;

    protected int year;

    protected boolean wifi;

    protected double batteryMah;

    protected boolean cargadorTipoC;

    protected int autonomiaBateriaHoras;


    public SmartDevice(){

    }

    public SmartDevice(String marca, String modelo, int year, boolean wifi, double batteryMah, boolean cargadorTipoC, int autonomiaBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.wifi = wifi;
        this.batteryMah = batteryMah;
        this.cargadorTipoC = cargadorTipoC;
        this.autonomiaBateriaHoras = autonomiaBateria;
    }
}

