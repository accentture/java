package JAVA.SECTION_3_tiposPrimitivosEnJava;

public class _16TiposPrimitivosTiposFlotantes {
    public static void main(String[] args) {
        /*
        tipos primitivos de tipo flotante: float, doble
        float: 32 bits
        double : 64 bits

        --estos puede almacenar valores mas grandes que de tipo int

            */

        //tipo flotante
        float numeroFloat1 = 10.0F;//las literares de tipo floatnate por defecto son de tipo double en java, no se puede almacenar de forma inmediata a tipo float, para corregir esto se puede añadir F al final del numero para indicar que es de tipo flotante

        float numeroFloat2 = (float)10.0; //otra forma de arreglar el problema con double
        float numeroFloat3 = (float)3.4028235E38F; //numero maximo permitido en la literal float
        float numeroFloat4 = (float)3.4028236E38D; //habara perdida de presición igualmente
        
        System.out.println("============================= FLOAT " );
        System.out.println("numero Float 1 = " + numeroFloat1);
        System.out.println("numero Float 2 = " + numeroFloat2);
        System.out.println("numero Float 3 = " + numeroFloat3);
        System.out.println("numero Float 4 = " + numeroFloat4);
        System.out.println("valor minimo float " + Float.MIN_VALUE);
        System.out.println("valor maximo float = " + Float.MAX_VALUE);
        
        
        
        //tipo double
        double numeroDouble1 = 10;
        System.out.println("============================= DOUBLE " );
        System.out.println("numero double 1 = " + numeroDouble1);
        System.out.println("valor minimo double " + Double.MIN_VALUE);
        System.out.println("valor maximo double = " + Double.MAX_VALUE);
    }
    

}
