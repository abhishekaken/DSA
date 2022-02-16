public class EvenDigit {
    public static void main(String[] args) {
        int[] nums={2,4,6,8,10,12,14,16,18,20};
        System.out.println(findNumbers(nums));
        }

    private static int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if(Integer.toString(i).length()%2==0){
                count++;
            }
        }
            return count;
    }
}
