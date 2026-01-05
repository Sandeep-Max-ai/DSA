class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>>result=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer>L=new ArrayList<>();
            for(int j=0;j<=i;j++){
                L.add(1);
            }
            result.add(L);
        }

        for(int i=2;i<n;i++){
            for(int j=1;j<i;j++){
                int value=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                result.get(i).set(j,value);
            }
        }
        return result;

        
    }
}