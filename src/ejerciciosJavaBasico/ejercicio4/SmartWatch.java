package ejerciciosJavaBasico.ejercicio4;

public class SmartWatch extends SmartDevice {

    boolean sincronizarPhone;

    boolean mp3;

    String materialPulsera;

    Boolean medirPulso;

public SmartWatch(){

}

    public SmartWatch(String marca, String modelo, int year, boolean wifi, double batteryMah, boolean cargadorTipoC, int autonomiaBateriaHoras, boolean sincronizarPhone, boolean mp3, String materialPulsera, Boolean medirPulso) {
        super(marca, modelo, year, wifi, batteryMah, cargadorTipoC, autonomiaBateriaHoras);
        this.sincronizarPhone = sincronizarPhone;
        this.mp3 = mp3;
        this.materialPulsera = materialPulsera;
        this.medirPulso = medirPulso;
    }
}
