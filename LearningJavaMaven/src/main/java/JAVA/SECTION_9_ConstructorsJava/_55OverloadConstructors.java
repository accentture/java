package JAVA.SECTION_9_ConstructorsJava;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tom
 */
public class _55OverloadConstructors {
    private int num;
    _55OverloadConstructors(){
        num = 100;
    }
    _55OverloadConstructors(int theNum){
        this(); //callling to default constructor
        num += theNum;
    }
    _55OverloadConstructors(int num2, int num3){
        this(); //callling to default constructor
        num += (num2 * num3);
    }
    private int getNum(){
        return num;
    }
    public static void main(String[] args) {
        System.out.println("Normal: ");
        _55OverloadConstructors normaal = new _55OverloadConstructors();
        System.out.println(normaal.getNum());
        
        System.out.println("With overload: ");
        _55OverloadConstructors overload = new _55OverloadConstructors(45);
        System.out.println(overload.getNum());
        
        System.out.println("With overload x2: ");
        _55OverloadConstructors overload2 = new _55OverloadConstructors(5, 5);
        System.out.println(overload2.getNum());
    }
}
