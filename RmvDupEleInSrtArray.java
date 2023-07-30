
/*
Here i used two different ways to solve the problem 
    1=>using collection solve problem
    2=>using traditional method also 

    N = 5
Array = {2, 2, 2, 2, 2}
Output: 2

N = 4
Array = {1, 2, 2, 4}
Output: 1 2 4
*/

class Solution {
    int remove_duplicate(int A[],int N){
        // code here
    
        int j=1;
        for(int i=1;i<N;i++){
            

            if(A[i-1]!=A[i]){
                A[j]=A[i];
                j++;
            }
        }
        return j;
    }
}
