import com.sun.xml.internal.bind.v2.model.annotation.Quick;

import java.util.Queue;

public class Sort {
   int[] nums;

    public Sort(int[] nums) {
        this.nums = nums;
    }

    public int[] getNums() {
        return nums;
    }

    public void HeapSort(){
        System.out.println("Heap Sort!");
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

    public void InsertSort(){
        System.out.println("Insert Sort!");
        for(int i=1;i<nums.length;i++){
            int temp = nums[i];
            int j;
            for(j = i - 1;j>=0;j--){
                if(nums[j] > temp){
                    nums[j+1] = nums[j];
                }else break;
            }
            nums[j+1] = temp;
        }
    }

    public void SelectSort(){
        System.out.println("Select Sort!");
        for(int i=0;i<nums.length;i++){
            int min = nums[i];
            int index = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<min){
                    min = nums[j];
                    index = j;
                }
            }
            if(index != i){
                nums[index] = nums[i];
                nums[i] = min;
            }
        }
    }

    public void BubbleSort(){
        System.out.println("Bubble Sort!");
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length-i-1;j++){
                int temp = nums[j];
                if(nums[j+1]<nums[j]){
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }

    public void ShellSort(){
        System.out.println("Shell Sort!");
        for (int gap=nums.length/2;gap>0;gap/=2){
            for (int i=0;i<gap;i++){
                for(int j=i+gap;j<nums.length;j+=gap){
                    if(nums[j]<nums[j-gap]){
                        int temp = nums[j];
                        int index = j-gap;
                        while(index>=0 && nums[index]>temp){
                            nums[index+gap] = nums[index];
                            index -= gap;
                        }
                        nums[index+gap] = temp;

                    }
                }
            }
        }
    }

    public void QuickSort(int left,int right){
        System.out.println("Quick Sort!");
        if(left>=right) return;
        int i = left,j = right;
        int temp = nums[left];
        while(i<j){
            while(i<j && nums[j]>=temp) j--;
            nums[i] = nums[j];
            while(i<j && nums[i]<=temp) i++;
            nums[j] = nums[i];
        }
        nums[i] = temp;
        QuickSort(left,i-1);
        QuickSort(i+1,right);
    }

    public void MergeSort(int left,int right){
        if(left < right){
            int mid = (left+right)/2;
            MergeSort(left,mid);
            MergeSort(mid+1,right);
            Merge(left,mid,right);
        }
    }

    public void Merge(int left,int mid,int right){
        System.out.println("Merge sort!");
        int i=left;
        int j=mid+1;
        int[] newNums = new int[right-left+1];
        int k = 0;
        while(i<=mid && j<=right){
            if(nums[i]<nums[j]){
                newNums[k++] = nums[i++];
            }else{
                newNums[k++] = nums[j++];
            }
        }
        while(i<=mid){
            newNums[k++] = nums[i++];
        }
        while (j<=right){
            newNums[k++] = nums[j++];
        }

        for(int m = 0;m<right-left+1;m++){
            nums[left+m] = newNums[m];
        }
    }

    public void AdjustHeap(int i,int len){
        int k = i, index = 2*i+1;
        int temp = nums[i];
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
