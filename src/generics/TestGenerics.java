/*
 * Java program test generics
 */
package generics;

/**
 *
 * @author Turbotwins
 */
public class TestGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a box for Integer
        GenericBox<Integer> boxForInteger = new GenericBox<>();
        Integer value = 5;
        boxForInteger.setContent(value);
        
        System.out.println("Box For Integer Contains :" + boxForInteger.getContent().toString());
        
        // create a box for String
        GenericBox<String> boxForString = new GenericBox<>();
        String message = "Hello Java 9 collegues";
        boxForString.setContent(message);
        
        System.out.println("Box For Strings Contains :" + boxForString.getContent());
        
        //create a box for Viezure
        GenericBox<Viezure> boxForViezure = new GenericBox<>();
        Viezure viezurelePrim = new Viezure();
        boxForViezure.setContent(viezurelePrim);
        
        System.out.println("Box For Viezuri Contains :" + boxForViezure.getContent().getNumarPicioareViezure());
    }
    
}
