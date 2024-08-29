class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int max=capacity;
        int steps=0;
        for(int i=0;i<plants.length;i++){
            if(max-plants[i]<0){
                max=capacity;
                steps+=i+1;
                steps+=i;
                max-=plants[i];

            }else{
                steps++;
                max-=plants[i];
            }
        }
        return steps;
    }
}