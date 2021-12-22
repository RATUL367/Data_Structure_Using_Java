//Write a Java program to concatenate a given string with itself of a given number of times
//Original string: PHP
//After repeating 7 times: PHPPHPPHPPHPPHPPHPPHP

package StringProject;

import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want?");
        int n = sc.nextInt();
        String str = sc.nextLine();
        int i = 0;
        while (0<n){
            str.concat(str);
            i++;
        }
        System.out.println("After repeating "+ n +" times: "+str);
    }
}
