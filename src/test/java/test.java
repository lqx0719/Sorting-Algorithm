public class test {
    public static void main(String[] args) {
        int[] nums = {16,7,3,20,17,8};
        Sort sort = new Sort(nums);
        sort.HeapSort();
        nums = sort.getNums();
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
