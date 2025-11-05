// Problem 2 LC-2011. Final Value of Variable After Performing Operations
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0; int size = operations.length;
        for(int i=0;i<size;i++){
            String op = operations[i];
            if(op.equals("X++")||op.equals("++X") ) x++;        
            else if(op.equals("X--")||op.equals("--X")) x--;
        }
        return x;
    }
}