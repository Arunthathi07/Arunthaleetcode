class Solution {
    public int lengthOfLongestSubstring(String s) {
       int start=0;
        int end=0;
        int max=Math.min(s.length(),1);
        Set<Character> sp=new HashSet<>();
        while(end<s.length())
        {
            char c=s.charAt(end);
            while(sp.contains(c))
            {
                sp.remove(s.charAt(start));
                start+=1;
            }
            sp.add(c);
            int windowsixe=end-start+1;
            max=Math.max(max,windowsixe);
            end +=1;
        }
        return max;
    }
}