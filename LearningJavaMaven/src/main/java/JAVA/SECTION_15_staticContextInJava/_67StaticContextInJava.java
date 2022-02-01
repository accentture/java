/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_15_staticContextInJava;

/**
 *
 * @author Tom
 */
public class _67StaticContextInJava {

        
    /*
        --static context: Carga de clases en memoria
        --dynamic context: Carga de objetos creados en memoria
    
        --the static context can not access to dynameic context, becuase to access to dynamic contex, it is necessary that the objects are created
        --on the other hand dynamic context can access to static context
    
        --static allways is asociated with static ocntext
    
        --when a method or property is modified in static context, it wil be able to be seen by all objects created
    
        --to access to static context, use name of class
    */
    private int idPerson;
    private String name;
    private static int counterperson; //by deafult will be 0
    
    public _67StaticContextInJava(String name ){
        
        //use name class for static values
        _67StaticContextInJava.counterperson++;
        
        //use this keyword for no static values
        this.name = name;
        this.idPerson = _67StaticContextInJava.counterperson;
    }

    public int getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;  //use this to set value
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounterperson() {
        return counterperson;
    }

    public static void setCounterperson(int aCounterperson) {
        counterperson = aCounterperson;
    }

    @Override //this keyword indicate what we are averringing method of lower (toString)
    
    //toString method() used to present in adecuated way the information of the class
    public String toString() {
        return "_67StaticContextInJava{" + "idPerson=" + idPerson + ", name=" + name + '}';
    }
    
    
    
}
