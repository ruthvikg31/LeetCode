class Solution {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=1;i<=numRows;i++){
            List<Integer> list2 = new ArrayList<Integer>();
            int c=1;
            for(int j=1;j<=i;j++){
                list2.add(c);
                c= c*(i-j)/j;
            }
            list.add(list2);
        }
     return list;   
    }
}
