class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> fMap = new HashMap<>();

        for(int n : nums){
            fMap.put(n, fMap.getOrDefault(n, 0)+ 1);
        }

        PriorityQueue<Integer> pq = 
            new PriorityQueue<>((a,b) -> fMap.get(a) - fMap.get(b));
        
        for(int i : fMap.keySet()){

            pq.offer(i);

            if(pq.size() > k){
                pq.poll();
            }

        }

        int[] result = new int[k];

        for(int i = k-1; i >= 0 ; i--){
            result[i] = pq.poll();
        }
        
        return result;

    }
}
