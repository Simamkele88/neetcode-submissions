class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int size = strs.length;
        List<char[]> list = new ArrayList<>();
        List<String> strList = new ArrayList<>();
        List<List<String>> toReturn = new ArrayList<>();
        for(int i = 0; i < size; i++){
            list.add(strs[i].toCharArray());
            Arrays.sort(list.get(i));
            strList.add(strs[i]);
        }
        for(int i = 0; i < size; i++){
            List<String> temp = new ArrayList<>();
            if(strList.get(i) == null) continue;
            temp.add(strList.get(i));
            for(int j = i + 1; j < size; j++){
                if(strList.get(j) != null && Arrays.equals(list.get(i), list.get(j)) ){
                    temp.add(strList.get(j));
                    strList.set(j,null);
                }   
            }
            toReturn.add(temp);
        }
        return toReturn;
    }
}
