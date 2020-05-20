public class Sort {
    int[] nums;

    public Sort(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }

    public void HeapSort(){
        for(int i=nums.length/2-1;i>=0;i--){
            AdjustHeap(i,nums.length);
        }

        for(int i=nums.length-1;i>=0;i--){
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            AdjustHeap(0,i);
        }

    }

    public void AdjustHeap(int i,int len){
        int k = i, temp = nums[i], index = 2*i+1;
        while(index<len){
            if(index + 1 <len && nums[index+1] > nums[index]) index ++;
            if(nums[index] > temp){
                nums[k] = nums[index];
                k = index;
                index = 2*k+1;
            }else{
                break;
            }
            nums[k] = temp;
        }
    }
}
