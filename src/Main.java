import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in=new Scanner(System.in);
        int x;
        x=in.nextInt();
        if(x>=0)
            System.out.printf("%d",x);
        if(x<0)
            System.out.printf("%d",x*-1);
    }
}
