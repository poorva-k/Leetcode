class Solution {
    public int maxArea(int[] height) {
        int max = 0 ; 
        int lp = 0 ;  
        int rp = height.length -1; 
        while(lp < rp ){
            int area = (rp-lp)*(Math.min(height[lp], height[rp]));
            if (max< area)
                max = area;
            if(height[lp]< height[rp])
                lp++;
            else 
                rp--;
        }
        return max; 
    }
}