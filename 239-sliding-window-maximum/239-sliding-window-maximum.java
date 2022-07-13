class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
//         int[] res = new int[nums.length - k + 1];
//         // System.out.println(res.length);
//         if(nums.length == 1){
//             return nums;
//         }
//         else if(nums.length == 2){
//             if(k == 2){
//                 int[] arr = new int[1];
//                 arr[0] = Math.max(nums[0], nums[1]);
//                 return arr;    
//             }
//             else{
//                 return nums;
//             }
            
//         }
//         else{
        
// //             for(int i=0; i<res.length; i++){
// //                 int temp = nums[i] > nums[i+1] ? nums[i] : nums[i+1];
// //                 int max = temp > nums[i+2] ? temp : nums[i+2];
// //                 res[i] = max;
// //             }

// //             return res;   
            
//             int index = 0;
//             int k1 = k;
//             int ans = 0;
//             for(int i=0; i<nums.length; i++){
//                 // System.out.println(k);
//                 if(k1>0){
//                     if(ans < nums[i]){
//                         ans = nums[i];
//                     }
                    
//                     // System.out.println(ans);
//                     k1--;
                    
//                 }
//                 // System.out.println(ans);
//                 if(k1 == 0){
//                     k1 = k;
//                     res[index] = ans;
                    
//                     ans = 0;
//                     i = index;
//                     index++;
//                 }
//             }
//         }
//         return res;
        
        
//        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2) -> n2-n1);
//         int n = arr.length;
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i = 0; i < k; i++) {
//             pq.add(arr[i]);
//         }
//         ans.add(pq.peek());
//         pq.remove(arr[0]);
        
//         for(int i = k; i < n; i++) {
//             pq.add(arr[i]);
//             ans.add(pq.peek());
//             pq.remove(arr[i-k+1]);
//         }
//         int a[] = new int[ans.size()];
//         for(int j = 0; j < ans.size(); j++) {
//             a[j] = ans.get(j);
//         }
//         return a;
        
        int n = nums.length;
        int left = 0, right = 0;
        int[] res = new int[n - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();
        int index = 0;
        
        while(right < n) {
            //expand window
            while(dq.size() > 0 && nums[dq.peekLast()] < nums[right]) {
                dq.pollLast();
            }
            dq.addLast(right);
            
            //when the window hits a sweet spot
            //contract window 
            if(right - left + 1 == k) {
                res[index++] = nums[dq.peekFirst()];
                if(dq.peekFirst() == left) {
                    dq.pollFirst();
                }
                left++;
            }
            right++;
        }
        return res;
    }
}