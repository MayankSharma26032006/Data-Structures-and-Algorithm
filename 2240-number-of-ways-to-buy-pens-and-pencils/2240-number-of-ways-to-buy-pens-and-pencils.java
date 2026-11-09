class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long count = 0;
        int pens = 0;
        while(pens*cost1 <= total) {
            int money = total - pens*cost1;
            int pencils = money/cost2;
            count += pencils + 1;
            pens++;
        }
        return count;
    }
}