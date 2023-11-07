package Datastructures;

import java.util.*;
public class Linearsearch {
    static int linearsearch(int arr[],int tar){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the range : ");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values : ");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the target value : ");
        int tar=s.nextInt();
        int ans=linearsearch(arr,tar);
        System.out.println(ans);
    }
}
