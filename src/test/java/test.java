public class test {
    public static void main(String[] args) {
        int[] nums = {98,86,68,58,42,42};
        Sort sort = new Sort(nums);
        sort.MergeSort(0,nums.length-1);
        nums = sort.getNums();
        for (Integer num : nums) {
            System.out.print(num + " ");
        }

        //check stablization
        /*
        Item[] nums = new Item[6];
        nums[0] = new Item(98,0);
        nums[1] = new Item(86,1);
        nums[2] = new Item(68,2);
        nums[3] = new Item(58,3);
        nums[4] = new Item(42,4);
        nums[5] = new Item(42,5);
        SortStabCheck sort2 = new SortStabCheck(nums);
        sort2.HeapSort();
        nums = sort2.getNums();
        for (Item num : nums) {
            System.out.println(num.getNum() + " "+num.getIndex());
        }
        */


    }
}
