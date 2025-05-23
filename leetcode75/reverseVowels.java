//leetcode75 (problem 5)
//345. Reverse Vowels of a String 


class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length-1;

        while(i < j){
            while("aeiouAEIOU".indexOf(chars[i]) == -1 && i < j){
                i++;
            }
            while("aeiouAEIOU".indexOf(chars[j]) == -1 && i < j){
                j--;
            }
            if(i != j){
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }
        }
    return new String(chars);
    }
}