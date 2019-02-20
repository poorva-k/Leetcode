class Solution {
    public String countAndSay(int n) {
        if(n ==1)
            return "1";
        if(n==2)
            return "11";
        char[] previous = "11".toCharArray();
        String out ="";
        for (int i = 3 ; i <=n ; i ++){
            int count = 1;
            String nw="";
            
            for( int j = 1 ; j < previous.length; j ++){
                if (previous[j-1] == previous[ j ])
                    count ++;
                else {
                    nw = nw + count + previous[j-1];
                    count = 1;
                    
                }
                if(j == previous.length -1 )
                        nw = nw + count+ previous[j];
                
            }
            previous = nw.toCharArray() ; 
            out = nw;
        }
        
        return out;
    }
}