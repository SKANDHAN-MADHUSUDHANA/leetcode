//leetCode 75 (problem 2)
//1071. Greatest Common Divisor of Strings



class Solution {
	public String gcdOfStrings(String str1, String str2){
		int len1 = str1.length();
		int len2 = str2.length();
		
		if(!(str1 + str2).equals(str2 + str1)){
			return "";
		}
		
		int gcdLength = gcd(len1, len2);
		return str1.substring(0, gcdLength);
	}

	public int gcd(int len1, int len2){
        int result = 0;
		if( len1 <= len2) {
			int iterator = len1;
			while(iterator > 0){
				if((len1 % iterator == 0) && (len2% iterator == 0)){
					result = iterator;
                    break;
				}
				iterator--;
			}	
		}else{
			int iterator = len2;
			while(iterator > 0){
				if((len1 % iterator == 0) && (len2% iterator == 0)){
					result = iterator;
                    break;
				}
				iterator--;
			}
		}
        return result;
	}

} 




// we can replace the gcd() method with the below method which is an implementation of Euclidean Algorithms

public static int gcd(int len1, int len2) {
    while (len2 != 0) {
        int temp = len2;
        len2 = len1 % len2;
        len1 = temp;
    }
    return a;
}



//recursive approach 
public static int gcd(int len1, int len2) {
    if (len2 == 0) return len1;
    return gcd(len2, len1 % len2);
}
