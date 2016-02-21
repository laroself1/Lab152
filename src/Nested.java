import java.util.Scanner;
//nested if
public class Nested{
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter Number X");
        int X = reader.nextInt();
        if (X==1) {
            System.out.println("one");
        }
        else if (X==2){
            System.out.println("two");}
        else if (X==3){
            System.out.println("three");}
        else if (X==4){
            System.out.println("four");}
        else if (X==5){
            System.out.println("five");}
        else if (X==6){
            System.out.println("six");}
        else if (X==7){
            System.out.println("seven");}
        else if (X==8){
            System.out.println("eight");}
        else if (X==9){
            System.out.println("nine");}
        else if (X>9){System.out.println("Other");}}}