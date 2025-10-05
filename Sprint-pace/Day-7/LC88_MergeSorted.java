class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0; int j=0;
        while(i<m && j<n){
            int n1 = nums1[i]; int n2 = nums2[j];
            if(n1<=n2){
                list.add(n1);
                i++;
            }
            else{
                list.add(n2);
                j++;
            }
        }
        while(i<m){
            list.add(nums1[i]);
            i++;
        }
        while(j<n){
            list.add(nums2[j]);
            j++;
        }
        int p=0;
        for(int k=0;k<list.size();k++){
            nums1[p++]=list.get(k);
        }
    }
}