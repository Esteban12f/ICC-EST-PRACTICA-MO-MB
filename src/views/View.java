package views;
import java.util.Scanner;
import modeles.Person;

public class View {

    private Scanner scanner;

    public int showMenu(){
        System.out.println("Menu");
        System.out.println("1. Ingrese Personas");
        System.out.println("100. Salir");
        return scanner.nextInt();
    }

    public Person inputPerson(){
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }

    public String inputName(){
        System.out.println("Ingrese el nombre: ");
        return scanner.nextLine();
    }

    public int inputAge(){
        System.out.println("Ingrese la edad: ");
        return scanner.nextInt();
    }

    public int inputInt(String mensaje){
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public int selectSortingMethod() {
        System.out.println("Ingrese la condicion a ordenar");
        System.out.println("1. Por nombre ");
        System.out.println("2. Por edad");
        System.out.println("Ingrese una opcion: ");
        return scanner.nextInt();
    }
}
