package controller;
import modeles.Person;
import views.View;

public class Controller {
    
    private View view;
    private SortingMethods1 sortingMethods;
    private SearchMethods1 searchMethods;
    private Person[] persons;



    public Controller(View view, SortingMethods1 sortingMethods, SearchMethods1 searchMethods){
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        System.out.println("Controller created");
    }

    public void start(){
        int option = 0;
        do{
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;

                case 2:
                    addPerson();
                    break;

                case 3:
                    sortPersons();
                    break;
                case 100:
                    System.out.println("Adios");
                    break;
            
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 0);
    }

    public void sortPersons() {
        int sortingOption = view.selectSortingMethod();

        if (sortingOption == 1){
            sortingMethods.sortByNameBubble(persons);
        } else if (sortingOption == 2){
            sortingMethods.sortByAgeWithSelection(persons);
        } else {
            view.showMessage("Opcion no valida :/");
        }
    }

    public void inputPersons(){
        System.out.println("Ingrese el numero de personas: ");
        int numeroPersonas = view.inputInt("Ingrese el numero de personas: ");
        persons = new Person[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++){
            persons[i] = view.inputPerson();
        }
    }

    public void addPerson(){

        if (persons == null){
            view.showMessage("No existe el arreglo, ingrese las personas por primera vez");
            inputPersons();
        } else {
            int numeroPersonas = view.inputInt("Ingrese el numero de persona a adicionar: ");
        
        Person[] personsTemp = new Person[persons.length + numeroPersonas];

        for (int i = 0; i < persons.length; i++){
            personsTemp[i] = persons[i];
        }

        for (int i = persons.length; i < personsTemp.length; i++){
            persons[i] = view.inputPerson();
        }
        }
        
    }

}

