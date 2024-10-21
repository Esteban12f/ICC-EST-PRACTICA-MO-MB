package controller;

import modeles.Person;

public class SortingMethods1 {
    public void sortByNameBubble(Person[] persons) {

        for (int i = 0; i < persons.length - 1; i++){
            for (int j = 0; j < persons.length - 1 - i; j++){
                if (persons[j].getName().compareTo(persons[j + 1].getName())){
                    Person temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }

    public void sortByAgeWithSelection(Person[] persons) {
        for (int i = 0; i < arreglo.length; i++){
            int key = i;
            for( int j = i + 1; j < arreglo.length; j++){
                if (arreglo[j] < arreglo[key]){
                    key = j;
                }
            }

            int aux = arreglo[key];
            arreglo[key] = arreglo[i];
            arreglo[i] = aux;
        }
    }