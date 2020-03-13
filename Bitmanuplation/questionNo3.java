import java.util.HashSet;
import java.util.Scanner;

public class ok {
	static int maxxor(int arr[])
    {
	int max=0,mask=0,temp=0;
	for(int i=31 ;i>=0;i--)
	{
	    mask = mask | (1<<i);
	    HashSet<Integer> set = new HashSet<>();
	    for(int num : arr)
            set.add(num&mask);
        temp = max | (1<<i);
        for(int prefix : set)
        {
            if(set.contains(prefix ^ temp))
                max = temp;
        }
	}
	return max;
    }
	
	    public static void main(String[] args)
	    {   
	    Scanner scan = new Scanner(System.in);
	    int n=scan.nextInt();
	    int[] array = new int[n];
	    for(int i=0;i<n;i++){
	    array[i]=scan.nextInt();
	    }
	    System.out.println(maxxor(array));
	    }
	    
	}


