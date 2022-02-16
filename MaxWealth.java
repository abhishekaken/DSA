public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1},{1,2,4}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] person: accounts) {
            int sum = 0;
            for (int account: person) {
                sum=account+sum;
            }
            if(sum>max) {
                max=sum;
            }
        }
        return max;
    }
}
