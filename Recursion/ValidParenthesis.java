import java.util.Scanner;
import java.util.Stack;

public class paren {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		paren obj = new paren();
		obj.recc("",n);

	}

	    public void recc(String input,int n){
	        if(input.length()>=2*n){
	            if(check(input))
	          System.out.println(input);  
	            return;
	        }
	        recc((input+"(("),n);
	       recc((input+"()"),n);
	        recc((input+"))"),n);
	    }
	    public boolean check(String ip){
	        Stack<Character> s1 = new Stack<Character>();
	        for(int i=0 ;i < ip.length();i++){
	            if(s1.isEmpty())
	                s1.push(ip.charAt(i));
	            else if(s1.peek()=='(' && ip.charAt(i)==')')
	                s1.pop();
	            else 
	                  s1.push(ip.charAt(i));
	        }
	      if(s1.isEmpty())
	          return true;
	        return false;
	    }
	   
	

}
