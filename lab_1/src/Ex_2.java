import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        String str = input.next();
        StringBuffer str1 = new StringBuffer(str);
        str1 = str1.reverse();
        String str2 = str1.toString();
        if(str.equals(str1)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
