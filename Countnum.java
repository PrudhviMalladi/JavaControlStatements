public class Countnum {
 public static void main(String[] args) {
    int n =11100099;
    int count =0;
    while(n>0){
        int rem = n % 10;
        if(rem==9){
            count++;
        }
        n=n/10;
    }
    System.out.println(count);
 }   
}
