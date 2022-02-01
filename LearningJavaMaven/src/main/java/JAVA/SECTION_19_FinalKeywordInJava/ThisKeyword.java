package JAVA.SECTION_19_FinalKeywordInJava;

public class ThisKeyword {
    /*
        --when final keyword is declared, a value can't be modified, it is a constant
    
        -they are 3 ways to declarea a final variable
        1. only declared
        2. initialized, if they are many constructor, it must be initialized there also
        3. between  a static block
    
    */
    
    //a final variable with direct initialization
    //a static should uppercase as good practice
    final int THESHOLD = 5; //declared variable
    
    //a blank final variable
    final int CAPACITY;
    final int MINIMUN;
    
    
    //static variable with final keyword initialized
    static final double PI = 3.141592653589793;
    
    
    static final double EULERCONSTANT;
    //  instance initializer block
    {
        CAPACITY = 25;
    }
    
    //static initializer block for initializing EULERCONSTANT
    static {
        EULERCONSTANT = 2.3;
    }
    
    //if they are more of a constructor, I must to initialize MINIMUN variable also
    ThisKeyword(){
        MINIMUN = -1;//initialized variable
    }
    
    //I stayed here : Reference final variable 
            
    
    
}
