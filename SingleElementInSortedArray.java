class Solution {
    public int singleNonDuplicate(int[] nums) {
    if(nums.length==0 || nums==null) return 0;
        int low=0; int high=nums.length-1;
        while(low<high)
        {
            int mid= low+ (high-low)/2;
            if(mid%2==1) mid--;
            if(nums[mid]!=nums[mid+1]) high=mid;
            else low=mid+2;
        }
    return nums[low];
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);
            
            int ret = new Solution().singleNonDuplicate(nums);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}
