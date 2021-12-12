import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("**************第一题****************");
        System.out.print("输入：");
        int x=scan.nextInt();
        int result=reverse(x);
        System.out.println("输出："+result);
        System.out.println("**************第二题****************");
        System.out.print("需要n阶你才能到达楼顶：n=");
        int n=scan.nextInt();
        int m=climbStairs(n);
        System.out.println("有"+m+"种方法可以爬到楼顶");
        System.out.println("**************第三题****************");
        int[] nums = {1,2,3};
        List<List<Integer>> res = subsets(nums);
        for (List<Integer> re : res) {
            System.out.println(re);
        }
    }
    public static int reverse(int x) {
        if (x > 230 || x < -231 || x == 0) {
            return 0;
        }
        int result = 0;
        while (x != 0) {
            int tmp = result;
            result = result * 10 + x % 10;
            x = x / 10;
            if(result / 10 != tmp){
                return  0;
            }
        }
        return result;
    }
    public static int climbStairs(int n) {
        if( n == 1 || n == 0 )
            return 1;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Integer l = nums.length;
        int n = (int) Math.pow(2, l); //结果集个数

        for (int i = 0; i<n; i++) {
            String s = Integer.toBinaryString(i); //二进制字符串
            List<Integer> temp = new ArrayList<>();
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) == '1') {
//                    System.out.println("j:"+j);
                    temp.add(nums[s.length()-1-j]); //索引数组下标
                }
            }
            result.add(temp);
        }
        return result;
    }
}

