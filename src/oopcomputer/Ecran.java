/*
 * Ecranul calculatorului
 */
package oopcomputer;

/**
 *
 * @author Turbotwins
 */
public class Ecran {

    private String afisaj = "0";
    private Carcasa stapana;

    
    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }
    
    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String afisaj) {
        
        switch (afisaj) {
            case "+":
                operatiuneLocala('+');
                break;
            case "-":
                operatiuneLocala('-');
                break;
            case "*":
                operatiuneLocala('*');
                break;
            case "/":
                operatiuneLocala('/');
                break;
            case "=":
                break; 
            default:
                System.out.println(afisaj);
        }
        this.afisaj = afisaj;
    }
/**
 * Private method for computation
 */   
    private void operatiuneLocala(char c) {
        stapana.getAlu().setOperandUnu(Integer.getInteger(afisaj));
        stapana.getAlu().setOperator(c);
        afisaj = Character.toString(c);
        System.out.println(afisaj);
    }   
}