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


//enums are used when We know values at compile time
//it is not necessary that data of enums keep constant all time
//in Java we can add variables, methods and constructors to enums
//the main objective of enums is to define our own data type

enum Color {
    RED, //recomendable to use capital letters
    GREEN,
    blue
}

class Enums1 {
    public static void main(String[] args) {
        Color c1 = Color.RED; //since is is static we can use directly Enum name
        Color c2 = Color.blue;
        System.out.println("red color: " + c1);
        System.out.println("red color: " + c2);
    }
    
}

/* internally above enum Color is converted to
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}*/
enum Day{ //enum use implicitly public static final
    SUNDAY,
    MONDAY,
    TUESDAY,    
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY   
}

class Test{
    Day day;
    public Test(Day day){
        this.day = day;
    }
    public void dayIsLike(){
        
        switch (day){
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
        
    }
    public static void main(String[] args) {
        String str = "MONDAY";
        Test t1 = new Test(Day.valueOf(str));
        t1.dayIsLike();
    }
    
}










