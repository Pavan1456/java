package com.questions;

public class Stable_Unstable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2277 , 2003 ,0400,5006, 7788};
        int sum =0;
        for (int index= 0; index < arr1.length; index++){
            if(isStable(arr1[index]) == true){
                sum += arr1[index];
            }
            else{
                sum -= arr1[index];
            }
        }
        System.out.print("The sum stable number - sum of unstable number = ");
        System.out.print( sum);

		// throw new UnsupportedOperationException("findPassword(int input1,int input2,int input3,int input4,int input5)");
	}

    public static boolean isStable(int n){
        int number = n;
        int remainder = 0;
        int arr[] = new int[10];
        int place = 1;
        while(number != 0){
            remainder = number % 10;
            number = number/10;
            arr[remainder]++;
        }
        for (int i = 0 ; i<10 ; i++){
            if(arr[i] != 0){
                place = arr[i];
                break;
            }
        }
        for (int i1 = 0 ; i1<10 ; i1++){
            if(arr[i1] != 0){
                if(arr[i1] != place){
                    return false;
                }
            }
        }
        return true;
    }
}