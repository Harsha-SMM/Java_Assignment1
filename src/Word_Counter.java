import java.util.HashSet;
import java.util.Scanner;

public class Word_Counter {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        System.out.println("Enter a long text");
        String text= scanner.nextLine();
        String[] stringArray=text.split(" ");
        for(String str : stringArray){
            hashSet.add(str);
        }
        System.out.println("Number of unique words in text is "+hashSet.size());
    }
}
