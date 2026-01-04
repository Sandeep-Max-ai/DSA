class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length;
        int n=image[0].length;
        for(int i=0;i<m;i++){
            int start=0;int end=image[i].length-1;
            while(start<=end){
                int temp=image[i][start]^1;
                image[i][start]=image[i][end]^1;
                image[i][end]=temp;
                start++;end--;
            }
        }
        return image;
        
    }
}