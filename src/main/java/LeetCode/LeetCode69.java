package LeetCode;

import java.util.Scanner;

public class LeetCode69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to fing its squareroot : ");
        int n = sc.nextInt();
        int k=mySqrt(n);
        System.out.println("So the sqrt is : "+k);
    }

    // THis solution has bugs , comment it and use the below for the correct one.
    public static int mySqrt(int x) {
        int counter=0;
        for(int i =1;i<Integer.MAX_VALUE;i++){
            if(x==0){
                return 0;
            }
            if(x==1){
                return 1;
            }
            if(i>x/2){
                break;
            }else{
                if(x/i==i){
                    counter =i;
                    break;
                }else if(x/i<x/2){
                    counter =i-2;

                }
            }


        }

        return counter;
    }
}


//This is the correct solution
//public static int mySqrt(int x) {
//    if (x == 0) return 0;
//
//    for (int i = 1; i <= x / i; i++) {   // i*i <= x, but written as i <= x/i to avoid overflow
//        if ((i + 1) > x / (i + 1)) {     // (i+1)*(i+1) > x → i is the answer
//            return i;
//        }
//    }
//
//    return x; // only reached when x == 1
//}
