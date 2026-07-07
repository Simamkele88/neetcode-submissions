class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int size = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[k];
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        List<Integer> keys = new ArrayList<>();
        System.out.println(list);
        for(Map.Entry<Integer, Integer> entry : list){
            keys.add(entry.getKey());
        }
        for(int i = 0; i < k; i++){
            result[i] = keys.get(i);
        }
        return result;
    }
}
