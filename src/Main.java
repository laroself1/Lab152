import java.util.Scanner;
//switch
public class Main{
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter Number X");
        int X = reader.nextInt();
        switch(X){
            case 1 :
                System.out.println("one");break;
            case 2:
                System.out.println("two");break;
            case 3:
                System.out.println("three");break;
            case 4:
                System.out.println("four");break;
            case 5:
                System.out.println("five");
            case 6:
                System.out.println("six");break;
            case 7:
                System.out.println("seven");
            case 8:
                System.out.println("eight");
            case 9:
                System.out.println("nine");
            default: System.out.println("Other");}}}
//nested - class Nested