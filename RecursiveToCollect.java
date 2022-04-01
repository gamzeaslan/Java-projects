package recursivetocollect;
import java.util.Scanner;
public class RecursiveToCollect {
    
    static int collect(int last){
        
        if(last==1){
            return 1;
        }
        
        return last+collect(last-1);
    }
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("End Value : ");
        int last=input.nextInt();
        
        System.out.println(collect(last));
    }
    
    
}
