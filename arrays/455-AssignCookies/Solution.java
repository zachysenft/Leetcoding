import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {

        //logm logn hit.. if not sorted
        Arrays.sort(g);
        Arrays.sort(s);

        int contentChildren = 0;

        //need to check each child
        for(int i = 0; i < g.length; i++) {            
            if(matchCookie(g[i], s)) {
                contentChildren++;
            }
        }
        
        return contentChildren;
    }

    public boolean matchCookie(int greed, int[] cookies) {
        for(int i = 0; i < cookies.length; i++) {
            if(cookies[i] >= greed) {
                cookies[i] = -1;
                return true;
            }
        }
        return false;
    }

}

class OptimizedSolution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int j = 0;
        int i = 0;
        
        int ans = 0;
        
        while(i < g.length && j < s.length){
            if(g[i] <= s[j]){                
                ans++;
                i++;
            }
            j++;
        }
        return ans;
    }
}