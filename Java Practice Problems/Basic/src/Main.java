import java.sql.SQLOutput;
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int m = (a/2)+1;
        int l=m;
        int u=m;
        for (int i=1;i<=a;i++) {
            int c=1;
            for (int j=1;j<=a;j++) {
                if (j>=l && j<=u){
                    if (c==1) {
                        System.out.print("# ");
                        c--;
                    }
                    else{
                        System.out.print("  ");
                        c++;
                    }
                }
                else{
                    System.out.print("  ");
                }
            }
            if (i<m){
                l--;
                u++;
            }
            else{
                l++;
                u--;
            }
            System.out.println( );
        }
    }
}