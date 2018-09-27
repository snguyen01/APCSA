
/**
 * Write a description of class Prob4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prob4
{
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        int b[]=new int[a.length];
        
        //copying one array to another
        for(int i=0;i<a.length;++i){
            b[i]=a[i];
        }
        
        //printing array
        for(int i=0;i<b.length;++i){
            System.out.print(b[i]+" ");
        }
    }

}
