
/*
Given an array A of n positive numbers. The task is to find the first Equilibrium Point in an array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Note: Retun the index of Equilibrium point. (1-based index)

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
*/

class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Yoint leftSum=0;
    int rightSum=0;
    int leftSum=0;
    for(int i=0;i<n;i++){
        leftSum +=arr[i];
    }
    
    for(int i=0;i<n;i++){
        
        leftSum -=arr[i]; /*13-0
                            12-0 //1st
                            9-1 //2nd
                            4-4 //3rd*/
        
        if(leftSum==rightSum){
            //System.out.println(leftSum);
            return i+1;
        }else{
            rightSum +=arr[i];
        }
    }
        // Your code here
        return -1;
        
    }
}
