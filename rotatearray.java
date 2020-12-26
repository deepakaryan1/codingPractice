
/*Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

Input:
The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

Output:
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.*/
 import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	         Scanner in = new Scanner(System.in);
	         int test = in.nextInt();
	         while(test-->0)
	         {
	             int N = in.nextInt();
	             int D = in.nextInt();
	             int a[]= new int[N];
	             for(int i=0; i<N; i++)
	             {
	                a[i] = in.nextInt();
	             }
	             Solution ob = new Solution();
	             ob.rotate(a,N,D);
	             for(int i = 0;i<N;i++){
	                 System.out.print(a[i] + " ");
	             }
	             System.out.println();
	         }
	 }
}

class Solution{
    
    void reverse(int a[], int low, int high){
        while(low < high){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;high--;
        }
    }
    void rotate(int a[],int n,int d){
        reverse(a,0,d-1);
        reverse(a,d,n-1);
        reverse(a,0,n-1);
    }
}
