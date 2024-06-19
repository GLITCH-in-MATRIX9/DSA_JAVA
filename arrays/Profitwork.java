class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int totalProfit = 0;
        
        // Iterate over each worker
        for (int i = 0; i < worker.length; i++) {
            int maxProfit = 0;
            
            // For each worker, find the job with the highest profit they can perform
            for (int j = 0; j < difficulty.length; j++) {
                if (worker[i] >= difficulty[j]) {
                    maxProfit = Math.max(maxProfit, profit[j]);
                }
            }
            
            totalProfit += maxProfit;
        }
        
        return totalProfit;
    }
}
