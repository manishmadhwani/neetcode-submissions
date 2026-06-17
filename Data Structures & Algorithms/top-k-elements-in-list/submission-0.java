class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num)) map.put(num, map.get(num)+1);
            else map.put(num, 1);
        }

        PriorityQueue<Pair> queue= new PriorityQueue<>((a, b)-> {
            if (a.freq== b.freq) return 0;
            else if(a.freq> b.freq) return -1;
            else return 1;
        });

        for (int key: map.keySet()) {
            Pair pair= new Pair(key, map.get(key));
            queue.add(pair);
        }

        int[] arr= new int[k];
        int index= 0;
        while (k>0 && queue.size()>0) {
            Pair pair = queue.poll();
            arr[index]= pair.val;
            k--;
            index++;
        }
        return arr;
    }
}

class Pair {
    int val;
    int freq;
    Pair (int val, int freq) {
        this.val= val;
        this.freq= freq;
    }
}
