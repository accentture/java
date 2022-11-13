package FromJavascriptToJava.Arrays;

public class BookImplementation implements Book {
    String name;
    String author;
    BookImplementation(String name, String author){
        this.name = name;
        this.author = author;
    }

    /*@Override
    public int compareTo(Object o) {
        BookImplementation help = (BookImplementation) o;
        int result = this.name.compareTo(help.name);

        return result;
    }*/

    /*public int compareTo(BookImplementation o)
    {
        float result = this.z - o.z;
        if (result == 0f) result = this.y - o.y;
        return ((int)(result));
    }*/
}
