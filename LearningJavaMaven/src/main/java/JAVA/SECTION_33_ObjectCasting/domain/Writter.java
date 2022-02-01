package JAVA.SECTION_33_ObjectCasting.domain;

public class Writter extends Employee {
    final WritingType writingType;
    
    public Writter(String name, double salary, WritingType writingType){
        super(name, salary);
        this.writingType = writingType; 
    }
    
    @Override
    public String getDetails(){
        return super.getDetails() + " writing type " + writingType.getDescription();
    }

    
    //if we dont't implements toString() method, when this class is showed in the console, it will be showed the memory direction of this object
    @Override
    public String toString() {
        return "Writter{" + "writingType=" + writingType + '}' + " " + super.toString() ;
    }
    
    public WritingType getWrittingType(){
        return writingType;
    }
    
}
