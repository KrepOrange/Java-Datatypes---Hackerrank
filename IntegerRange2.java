import java.text.DecimalFormat;
import java.util.Scanner;

public class IntegerRange2 {
    public static void main(String[] args) {
        //variable
        Scanner range = new Scanner(System.in);
        double theNumber;

        byte byteMin = (byte) (-1 * Math.pow(2, 7)), byteMax = (byte) (Math.pow(2, 7) - 1);
        short shortMin = (short) (-1 * Math.pow(2, 15)), shortMax = (short) (Math.pow(2, 15) - 1);
        int intMin = (int) (-1 * Math.pow(2, 31)), intMax = (int) (Math.pow(2, 31) - 1);
        long longMin = (long) (-1 * Math.pow(2, 63)), longMax = (long) (Math.pow(2, 63) - 1);

        /*System.out.print("Give me the number!\n$ ");
        theNumber = range.nextDouble();*/
        DecimalFormat decFormat = new DecimalFormat("0.#");

        for(int i = 0; i < 6; i++){

            theNumber = range.nextDouble();

            if (theNumber < longMin || theNumber > longMax)
                System.out.println(decFormat.format(theNumber) + " can't be fitted anywhere.");
            else if (theNumber >= byteMin && theNumber <= byteMax)
                System.out.println(decFormat.format(theNumber) + " can be fitted in:\n* byte\n* short\n* int\n* long");
            else if(theNumber >= shortMin && theNumber <= shortMax)
                System.out.println(decFormat.format(theNumber) + " can be fitted in:\n* short\n* int\n* long");
            else if(theNumber >= intMin && theNumber <= intMax)
                System.out.println(decFormat.format(theNumber) + " can be fitted in:\n* int\n* long");
            else
                System.out.println(decFormat.format(theNumber) + " can be fitted in:\n* long");
        }
    }
}
