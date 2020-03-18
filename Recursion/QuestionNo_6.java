import java.util.*;
public class Main
{
    public static int median(int[] a1,int[] a2,int len){
        int Thres = len - 1;
        int count = 0,point1=0,point2=0;
        while(count < Thres){
            if(a1[point1]<a2[point2]){
                point1++;
            }
            else point2++;
            count++;
        }
        return (a1[point1]+a2[point2])/2;
    }
	public static void main(String[] args) {
	    int n;
	    Scanner scan = new Scanner(System.in);
	    n = scan.nextInt();
	    int[] a1 = new int[n];
	    int[] a2 = new int[n];
	    for(int i=0;i<n;i++)
	    a1[i] = scan.nextInt();
	    for(int i=0;i<n;i++)
	    a2[i] = scan.nextInt();
	    System.out.print(median(a1,a2,n));
	}
}
