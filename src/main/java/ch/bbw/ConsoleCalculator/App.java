package ch.bbw.ConsoleCalculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator calculator = new Calculator();
    	int valueA = 0;
    	int valueB = 0;
    	
    	System.out.println("Console Calculator");
    	System.out.println("============");
    	System.out.println();
    	
    	valueA = 10;
    	valueB = 20;
    	System.out.println("Die Summe von " + valueA + " und " + valueB  + " ist " + calculator.summe(valueA, valueB));
    }
}
