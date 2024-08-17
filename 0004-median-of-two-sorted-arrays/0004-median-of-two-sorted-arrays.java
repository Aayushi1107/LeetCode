class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] c= new int[m+n];
        System.arraycopy(nums1,0,c,0,m);
        System.arraycopy(nums2,0,c,m,n);
        Arrays.sort(c);
        if(c.length%2==1){
            return c[c.length/2];
        }
        return (c[(c.length/2)-1]+c[c.length/2])/2.0;
    }
}