class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);//如果没有就初始为0然后+1次
        }
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((o1,o2)->(o2.getValue()-o1.getValue()));
        for(Map.Entry entry: map.entrySet()){
            priorityQueue.offer(entry);//自动排序
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = priorityQueue.remove().getKey();
        }
        return res;
    }
}