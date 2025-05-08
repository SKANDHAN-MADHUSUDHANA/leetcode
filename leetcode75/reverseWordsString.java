//leetcode 75 (problem 6)
//151. Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1; i > 0; i-- ){
            sb.append(words[i] + " ");
        }
        sb.append(words[0]);
    return sb.toString();
    }
}