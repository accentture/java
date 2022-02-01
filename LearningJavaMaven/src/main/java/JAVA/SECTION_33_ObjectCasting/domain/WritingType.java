package JAVA.SECTION_33_ObjectCasting.domain;

public enum WritingType {
    CLASSIC("Hand writing xd"),
    MODERN("Digital writting");
    
    private final String description;
    
    
    //constructor of enum
    private WritingType(String description){
        this.description = description;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    
}
