import java.util.*;
class question_6{
  public static int single(int[] numsarray,int  length ) {
       HashSet<Integer> k =new HashSet<>();
       int sum1=0;
       for(int i=0;i<length;i++) {
           sum1+=numsarray[i];
           k.add(numsarray[i]);
        }
       int sum2=0;
       for(int i=0;i<length;i++){
           if(k.contains(numsarray[i])){
               k.remove(numsarray[i]);
                        sum2+=3*numsarray[i];
                 }
       }
      return (sum2-sum1)/2;
   }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num =scan.nextInt();
    int[] numarray = new int[num];
    for(int i=0;i<num;i++){
      numarray[i]=scan.nextInt();
    }
    System.out.print(single(numarray,num));
  }
}
