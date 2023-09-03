//----------------Task5-----------------//
//--Question:-Find a non unique duplicate of an array of integer--//
import java.util.HashSet;
public class Non_unique_duplicate {
    public static int Task5NonDublicate(int[]nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if(set.contains(nums)){
                return num;
            }
            set.add(num);
        }
        return -1;//no duplicate Found
    }
    public static void main(String args[]){
        int[]nums={1,2,3,4,5};
        int duplicate=Task5NonDublicate(nums);
        System.out.println("Duplicate Element" +duplicate);
    }
}