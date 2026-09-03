package ArrayProgram;

import java.util.Scanner;
public class _32_MergeTwoArrayInplace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m+n];
        int[] arr2 = new int[n];

        for(int i=0;i<m+n;i++){
            arr1[i] = sc.nextInt();
        }

        for(int j=0;j<n;j++){
            arr2[j] = sc.nextInt();
        }

        int i=m-1,j=n-1,k=m+n-1;
        while(i>=0 && j>=0){
            if(arr1[i] > arr2[j]){
                arr1[k] = arr1[i];
                k--;
                i--;
            }
            else{
                arr1[k] = arr2[j];
                k--;
                j--;
            }
        }

        while(j>=0){
            arr1[k] = arr2[j];
            k--;
            j--;
        }

        for(int a=0;a<m+n;a++){
            System.out.print(arr1[a] + " ");
        }
    }
}

/*
3
3
2 4 6 0 0 0
1 3 5
output
1 2 3 4 5 6
 */
