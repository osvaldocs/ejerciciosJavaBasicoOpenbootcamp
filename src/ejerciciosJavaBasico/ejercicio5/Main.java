package ejerciciosJavaBasico.ejercicio5;

public class Main {

    public static void main(String[] args) {

        CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.findall();
        cocheCRUD.delete();

    }
}

interface CocheCRUD {
     void save();

    void findall();


     void delete();

}

 class CocheCRUDImpl implements CocheCRUD {

     @Override
     public void save() {
         System.out.println("save");
     }

     @Override
     public void findall() {
         System.out.println("findall");
     }

     @Override
     public void delete() {
         System.out.println("delete");
     }
 }




/*
Crear una interfaz CocheCRUD

Crear una implementación CocheCRUDImpl que implemente la interfaz CocheCRUD.

Como métodos de CocheCRUD podemos poner:

save()
findAll()
delete() que simplemente impriman por consola el nombre del propio método.
Desde una clase Main, Crear un objeto de tipo CocheCRUDImpl y llamar a cada uno de los métodos.

CocheCRUD cocheCrud = new CocheCRUDImpl();
 */