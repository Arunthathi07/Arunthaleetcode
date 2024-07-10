class Solution {
    public int mostWordsFound(String[] sentences) {
       int n=sentences.length;
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,sentences[i].split(" ").length);
        }
        return max;
    }
}