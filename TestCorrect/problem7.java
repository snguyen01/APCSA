
/**
 * Write a description of class problem7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class problem7
{
    input variable count = 13; 
    int[] nums = new int[count];
    double sum;
    double ave;
        for (int i = 0; i < count; i++){
            sum = sum + nums[i];
        }
    ave = (double) sum/count;
    return ave;
}
