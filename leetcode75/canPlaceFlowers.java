//leetcode 75(problem 4)
//605. Can Place Flowers


class Solution {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		for(int i = 0; i < flowerbed.length; i++){
			if(flowerbed[i] == 0){
                if((i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length-1 || flowerbed[i+1]==0)){
                    flowerbed[i] = 1;
                    n--;
                    if(n==0) return true;
                    i++;
                }
            }
		}
	return n <= 0;
	}	
}