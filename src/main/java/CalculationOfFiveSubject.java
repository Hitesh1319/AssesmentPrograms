import java.util.Scanner;

public class CalculationOfFiveSubject {
    public CalculationOfFiveSubject() {
        int eng =52, phy=54, chem=78, math=86, comp=99;
        int total, average, percentage;

        total = eng + phy + chem + math + comp;
        average = total / 5;
        percentage = (total / 500) * 100;

        System.out.println("Total marks =" + total);
        System.out.println("Average marks =" + average);
        System.out.println("Percentage ="+ percentage);
    }
    public static void main(String[]args)
    {

    }
}
 class printNumber extends CalculationOfFiveSubject{
    public static void main(String[] args) {

        CalculationOfFiveSubject obj = new CalculationOfFiveSubject();
        System.out.println(obj);
    }
}
