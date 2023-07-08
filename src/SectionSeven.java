import java.util.Scanner;

public class SectionSeven {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage () {

        Scanner sc = new Scanner(System.in);
        int sum= 0;
        long average= 0;
        int count = 0;
        System.out.println("enter numbers, then a letter to stop it");
        while (true) {
            String nextEntry = sc.nextLine();
            System.out.println("number token, another one please ");
            try{
                int validNum =Integer.parseInt(nextEntry);
                sum+=validNum;
                count++;
            }
            catch(NumberFormatException nfe){
                break;
            }
        }
         average = Math.round((double) sum/count);

        System.out.println("SUM = " + sum+ " AVG = "+average);
    }

}
