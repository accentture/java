/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zDesignPatterns.Singleton;

/**
 *
 * @author Tom
 */

//This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
class Singleton {
    
    //create an object of Singleton
    public static Singleton instance = new Singleton();
    
    //making private void instance of singleton
    private Singleton(){}
    
    public static Singleton getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello I am singleton");
    }
}

class SingletonDemo {
    public static void main(String[] args) {
        Singleton _singleton = Singleton.getInstance();
        _singleton.showMessage();
    }
}


