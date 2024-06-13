import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<3;i++) {
            System.out.println("Enter a number");
            int n = scanner.nextInt();
            if(n>0)
                System.out.println(n+" is positive");
            else
                System.out.println(n+" is negative");
        }
    }
}