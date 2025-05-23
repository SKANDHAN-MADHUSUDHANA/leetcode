Leetcode 75 (problem 1)
1768. Merge Strings Alternately

/*
### This is a problem which checks your ability to loop though multiple strings ###
### Conditional checks for boundaries ###
### String construction using StringBuilder ###


### we can apply this logic when two strings or arrays are being used ###
### combine or compare elements from both the sequences ###
### Merging, Comparing, or synchronizing sequences ###
*/

// The below solution is in java 

// solution to understand how the logic works in detail 
class Solution {
	public String mergeAlternately(String word1, String word2) {
		StringBuilder merged = new StringBuilder();
		if(word1.length() >= word2.length()){
			int i = 0;
			while(i < word2.length()){
				merged.append(word1.charAt(i)).append(word2.charAt(i));
				i++;
			}
			merged.append(word1.substring(i));
		}else{
			int i = 0;
			while(i < word1.length()){
				merged.append(word1.charAt(i)).append(word2.charAt(i));
				i++;
			}
			merged.append(word2.substring(i));
		}
	return merged.toString();
	}

} 



// More readable solution 

class Solution{
	public String mergeAlternately(String word1, String word2){
		int i = 0;
		int len1 = word1.length();
		int len2 = word2.length();
		StringBuilder merged = new StringBuilder();
		
		while(i < len1 || i < len2) {
			if(i < len1) {
				merged.append(word1.charAt(i));
			} 
			if(i < len2) {
				merged.append(word2.charAt(i));
			}
			i++;
		} 
	return merged.toString();
	}

} 
