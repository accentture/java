
package JAVA.SECTION_36_Interfaces;

public interface _132_IUsingIntefaces {

}

/*
    --it is possible to have parent and child interfaces

 */
interface IAccessData {

    //an attribute has a value mandatory
    int MAX_REGISTER = 10; //it is a constant

    //all methods of a inteface has abstract methods by default
    void insert();

    void list();

    void update();

    void remove();
}

//obligate to implement behavior defined by the interfaces
class ImplementationMySql implements IAccessData {

    public void insert() {
        System.out.println("Insert from MySQL");
    }

    public void list() {
        System.out.println("list from MySQL");
    }

    public void update() {
        System.out.println("update from MySQL");
    }

    public void remove() {
        System.out.println("remove from MySQL");
    }
}


class ImplementationOracle implements IAccessData {

    public void insert() {
        System.out.println("Insert from Oracle");
    }

    public void list() {
        System.out.println("list from Oracle");
    }

    public void update() {
        System.out.println("update from Oracle");
    }

    public void remove() {
        System.out.println("remove from Oracle");
    }
} 


//creating varibles of type interface
//in POO the target is create generic code
class TestInterface {
    public static void main(String[] args) {
        IAccessData data = new ImplementationMySql();
        data.list(); //caaling implememtation from MySQL implementation
        
        //reusing data variable
        data = new ImplementationOracle();
        data.list(); //calling implementation of Oracle
               
        //printing data throght method
        print(data);
    }
    
                            //passing an inteface as param
                            //we can add interface behavior in a method
    public static void print(IAccessData data){
        data.list();
    }
    
}
