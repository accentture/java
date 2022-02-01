/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JAVA.SECTION_25_ManagamentEnum;

/**
 *
 * @author Tom
 */





enum Color1{
    RED,
    GRREN,
    BLUE;
    
    //we can use main method in a enum, therefore we can use enum directly
    public static void main(String[] args){
        Color c1 = Color.RED;
        System.out.println(c1);
    }    
    
    
}

/*
    Enum and Inheritance :

    1. toString() method is overridden in java.lang.Enum class,which returns enum constant name.
    2. num can implement many interfaces.

*/

class Enums2 {
    public static void main(String[] args) {
        
        //values(), ordinal() and valueOf() methods :
        Color1 arr[] = Color1.values(); //values(): return all values present inside enum
        
        for(Color1 col: arr){
            System.out.println(col + " at index " + col.ordinal()); //ordinal(): return index in enum
        }
        
        System.out.println(Color1.valueOf("RED")); //valueOf() : return object of Color wiht constant given
        
        // Uncommenting second line causes exception
        // System.out.println(Color.valueOf("WHITE"));
    }
}
/*
    **enum and constructor
    --enums can contain a constructor that will be loaded separately of every enum
    --we can't create objects directly in enums, hence we can't invoke ocnstructor directly
*/


/*
    **enum and methods
    --enum can contain both concrete methods and abstract methods. If an enum class has an abstract method, then each instance of the enum class must implement it
*/
enum Color2{
    RED, GREE, BLUE;
    
    // enum constructor called separately for each constant
    private Color2(){
        System.out.println("Constructor called for : " + this.toString());
    }
    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

class Enums3{
    public static void main(String[] args) {
        Color2 c1 = Color2.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}