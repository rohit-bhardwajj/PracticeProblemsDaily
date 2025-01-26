import java.util.*;
public Class Solution{
     public boolean isValidSudoku(char board[][]){
        //using 9 HashSets pairs for each ,9 rows,9cols,& 9 boxes
        int N=9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];
      
      for(int i=0;i<N;i++){
        rows[i] = new HashSet<>();
        cols[i] = new HashSet<>();
        boxes[i] = new HashSet<>();
      }
      for(int r=0;r<N;r++){
        for(int c=0;c<N;c++){
            char val = board[r][c];
            if(val == '.') continue;
            if(!rows[r].add(val)) return false;
            if(!cols[c].add(val)) return false;
            int indx = 3*(r/3) + c/3;
            if(!boxes[indx].add(val)) return false;
        }
      }
      return true;
    }
}