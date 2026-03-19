package Test;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        String s ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        s=sc.nextLine();
        int length = 0;
        int countvowel=0;
        int countconsonants=0;
        for(char c : s.toCharArray()){
            length++;
            if ("aeiouAEIOU".indexOf(c)!=-1){
                countvowel++;
            }else if(Character.isLetter(c)){
                countconsonants++;
            }
        }

        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        String rev = new String(arr);


        System.out.println("Length: "+length);
        System.out.println("Vowels: "+countvowel);
        System.out.println("Consonants: "+countconsonants);
        System.out.println("Reversed: "+rev);
        if (rev.equals(s)){
            System.out.println("Palindrome: Yes");
        }else{
            System.out.println("Palindrome: No");
        }

    }
}
