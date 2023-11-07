package ejerciciosJavaBasico.ejercicio4;

public class Main {

    public static void main(String[] args) {

        SmartWatch S1 = new SmartWatch("Xiaomi", "S1", 2019, true, 470, false, 72, true, false, "goma", true);
        System.out.println(S1.marca);
        System.out.println(S1.modelo);
        System.out.println(S1.year);
        System.out.println(S1.wifi);
        System.out.println(S1.batteryMah);
        System.out.println(S1.cargadorTipoC);
        System.out.println(S1.autonomiaBateriaHoras);
        System.out.println(S1.sincronizarPhone);
        System.out.println(S1.mp3);
        System.out.println(S1.materialPulsera);
        System.out.println(S1.medirPulso);

        SmartPhone xiaomi9 = new SmartPhone("Xiaomi","Mi 9", 2018, true, 4500, true, 18, "4G", 2, "Helio G80", 6, true, true);
        System.out.println(xiaomi9.marca);
        System.out.println(xiaomi9.modelo);
        System.out.println(xiaomi9.year);
        System.out.println(xiaomi9.wifi);
        System.out.println(xiaomi9.batteryMah);
        System.out.println(xiaomi9.cargadorTipoC);
        System.out.println(xiaomi9.autonomiaBateriaHoras);
        System.out.println(xiaomi9.tipoDeRed);
        System.out.println(xiaomi9.cantidadSim);
        System.out.println(xiaomi9.procesador);
        System.out.println(xiaomi9.memoriaRam);
        System.out.println(xiaomi9.sumergible);
        System.out.println(xiaomi9.nfc);

    }
}


/*
Crear una clase SmartDevice

Crear las clases hijas:

SmartPhone SmartWatch

Agregar atributos tal cual tendrían esos objetos en la realidad.

Crear constructor vacío y con todo los parámetros para cada clase.

Desde una clase Main: crear objetos de cada una y utilizarlos para imprimir sus valores por consola.
 */