package com.questions;

public class SumNonPrimeIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1[] = {10,20,30,4,05,0,60,5,0,8};
        int total = 0;
        for (int i = 0 ; i<input1.length ; i++){
            if(isPrime(i) == false){
                total+=input1[i];
            }
        }
        System.out.println(total);
        
		
	}
     public static boolean isPrime(int n){
         boolean check = true;
         if (n==2){
             return true;
         }
         else if(n==0 || n==1){
             return false;
         }
         else{
             for (int index = 2; index<n ; index++ ){
                 if(n%index == 0){
                     return false;
                 }
             }
         }
         return check;
     }
}