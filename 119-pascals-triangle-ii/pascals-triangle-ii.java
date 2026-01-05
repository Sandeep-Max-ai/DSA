class Solution {
    public List<Integer> getRow(int n) {
        
        if(n==0){
            List<Integer>Base=new ArrayList<>();

            Base.add(1);
            return Base;
        }
        List<List<Integer>>ans=new ArrayList<>();
        for(int i=0;i<=n;i++){
            List<Integer>L=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    L.add(1);
                }else{
                    int value=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    L.add(value);
                    
                }
            }
            ans.add(L);
        }
        return ans.get(n);
        
    }
}