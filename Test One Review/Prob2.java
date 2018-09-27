
/**
 * Write a description of class Prob2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prob2
{
    public static void main (String[] args){
        int[] rNum = new int[100];
        
        for(int i = 0; i<rNum.length; i++){
           rNum[i] = (int) (6*Math.random()+1);
        }
        for (int i = 0; i < rNum.length; i++){
            System.out.print(rNum[i]);
        }
        System.out.println();

        for(int i = rNum.length-1; 1>=0; i--) {
            System.out.println("Numbers:" + i +rNum[i]);
        }
    }

}
