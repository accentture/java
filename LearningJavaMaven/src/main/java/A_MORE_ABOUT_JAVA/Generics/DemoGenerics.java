
package A_MORE_ABOUT_JAVA.Generics;


/*
    --generics : it means parameterized types
    --with Generics we can create classes with differents data types
    --an entity as class, interface and function can operate with generics

*/

class Generic <T> {
    T typeGeneric;
    
    Generic(T typeGeneric){
        this.typeGeneric = typeGeneric;
    }
    
    public T getTypeGeneric (){
        return this.typeGeneric;
    }
    
}

public class DemoGenerics {
    public static void main(String[] args) {
        Generic <Integer> firstDemoGeneri = new Generic <Integer>(15);
        System.out.println("---firt demo " + firstDemoGeneri.getTypeGeneric());
        
        Generic <String> secondDemoGeneric = new Generic <String>("fifteen");
        System.out.println("---second demo " + secondDemoGeneric.getTypeGeneric());
        
    }
}
