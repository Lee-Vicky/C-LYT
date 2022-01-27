import java.util.*;

public class Week8 {
    static Random random=new Random();
    public static void test(){
        System.out.println(task1("abbc","dog cat cat fish"));
        System.out.println(task2(new int[]{1,2,2,3,0}));
        for(int i=0;i<5;i++){
            int target = random.nextInt(15) - 3;
            System.out.println("target:"+target+"\tresult"+task3(new int[]{0,4,5,6,8},target));
        }
    }
    public static void main(String[] args) {
        test();
    }
    public static boolean task1(String pattern, String str) {
        boolean res=true;
        String[] words=str.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        Map<Object,Integer> map=new HashMap<>();
        for(Integer i=0;i<pattern.length();i++){
            if(map.put(pattern.charAt(i),i)!=map.put(words[i],i)){
                return false;
            }
        }
        return res;
    }
    public static int task2(int[] nums) {
        int res=0;
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return num;
            }
            set.add(num);
        }
        return 0;
    }
    public static int task3(int []nums,int target){
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
