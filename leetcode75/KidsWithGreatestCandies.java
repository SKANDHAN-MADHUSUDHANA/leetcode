//Leetcode 75 (problem 3)
//1431. Kids With the Greatest Number of Candies


class Solution {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> result = new ArrayList<>();
		int largest = 0;
		
		//Use this version of for each loop when you are just reading through the array and not making any changes or there is no need to access the index position of an element in the array
		for(int candy : candies) {
			if(candy > largest){
				largest = candy;
			}
		}
		
		for(int candy : candies) {
			if(candy + extraCandies >= largest) {
				result.add(true);
			}else{
				result.add(false);
			}
		}
	return result;  
	}
}