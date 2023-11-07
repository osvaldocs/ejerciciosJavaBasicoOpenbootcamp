package ejerciciosJavaBasico.ejercicio4;

public class SmartPhone extends SmartDevice {

    String tipoDeRed;

    int cantidadSim;

    String procesador;

    int memoriaRam;

    boolean sumergible;

    boolean nfc;


    public SmartPhone(){

    }

    public SmartPhone(String marca, String modelo, int year, boolean wifi, double batteryMah, boolean cargadorTipoC, int autonomiaBateriaHoras, String tipoDeRed, int cantidadSim, String procesador, int memoriaRam, boolean sumergible, boolean nfc) {
        super(marca, modelo, year, wifi, batteryMah, cargadorTipoC, autonomiaBateriaHoras);
        this.tipoDeRed = tipoDeRed;
        this.cantidadSim = cantidadSim;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.sumergible = sumergible;
        this.nfc = nfc;
    }

}
