package JAVA.SECTION_39_CollectionsAPI.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class TestCollections {

    public static void main(String[] args) {
        learningSet();
    }

    public static void learningList() {

        //the list maintains the order of entered elements
        //interface List 
        //a list is more slow that a set
        List miList = new ArrayList();
        miList.add("Lunes");
        miList.add("Martes");
        miList.add("Miercoles");
        miList.add("Jueves");
        miList.add("Viernes");
        miList.add("Viernes"); //it is possible to double the elements in a list

        //usting functions type Lambda (as arrow function)
        //we does not needt specify the type, the type will be used from the defined collection
        miList.forEach((element) -> {
            System.out.println("element = " + element);
        });
    }

    public static void learningSet() {
        //the set does not maintaint the order of entered elements
        //using Set interface
        //use a set is recommendable if we want that the operations are very fast
        Set miSet = new HashSet();
        miSet.add("Lunes"); // add method is defined in the parent class Collection 
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes"); 
        miSet.add("Viernes"); //it is not possible to double the elements in a set
        
        miSet.forEach((element) -> {
            System.out.println("element = " + element);
        });
    }

}
