class Solution{
    public int[] topKFrequent(int[] nums,int k){
        if(k==nums.length) return nums;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> map.get(a)- map.get(b);
//it'll make the least valued keys at head & remove them when we'll poll from head
//& we'll get top k greater valued keys            
        );
        for(int n : map.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }
        int arr[] = new int[k];
        for(int i =0;i<k; i++ ){
            arr[i] = heap.poll();
        }
        return arr; 
    }
}


//alternately you can use list then sort it then put it in arraylist convert to array and return answer
        // List<Map.Entry<Integer,Integer>> entrylist = new ArrayList<>(map.entrySet());