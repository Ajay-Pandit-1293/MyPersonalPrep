package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCode2946 {
    public static void main(String[] args) {
        int m;int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many fucking rows do you want in this fucking Matrix : ");
        m=sc.nextInt();
        System.out.print("Enter how many fucking coloumns do you want in this fucking Matrix : ");
        n=sc.nextInt();
        int[][] Matrix = new int[m][n];

        for(int i=0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print("Enter the element of "+(i+1)+"th row and the "+(j+1)+"th coloumn : ");
                Matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.print("Now tell me for how many rotations to check : ");
        int k = sc.nextInt();

        System.out.println("-------------------------------------------------------------------------------");
        Solution s = new Solution();

        boolean result = s.areSimilar(Matrix,k);
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("So the result is : ");
        if(result){
            System.out.println("->After the "+k+" rotations - Both Matrix are fucking Similar dude !!!");
        }else{
            System.out.println("->After the "+k+" rotations - Both Matrix are not Similar dude , Fuck You man !!!");
        }
    }

    static class Solution {
        public boolean areSimilar(int[][] mat, int k) {
            int m = mat.length;
            int n = mat[0].length;
            int[][] copy = new int[m][n];
            for (int i = 0;i<m;i++){
                for (int j = 0;j<n;j++){
                    copy[i][j]=mat[i][j];
                }
            }

            for(int i = 0;i<m;i++){
                if (i%2==0){
                    for (int t = 0;t<k;t++){
                        rotationleft(mat,i);
                    }
                }else{
                    for(int t=0;t<k;t++){
                        rotationright(mat,i);
                    }
                }
            }

            if (!Arrays.deepEquals(copy, mat)) return false;
            return true;

        }


        public void rotationleft(int[][] mat,int row){
            int temp = mat[row][0];
            for (int j = 0;j<mat[row].length-1;j++){
                mat[row][j]=mat[row][j+1];
            }
            mat[row][mat[row].length-1]=temp;
        }

        public void rotationright(int[][] mat,int row){
            int temp = mat[row][mat[row].length-1];
            for (int j = mat[row].length-1;j>0;j--){
                mat[row][j]=mat[row][j-1];
            }
            mat[row][0]=temp;
        }
    }
}
