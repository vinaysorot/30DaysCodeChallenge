import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        int a[]={5,5,5,6,7,2,9,2,6,2};
        Scanner sc=new Scanner(System.in);
        int count=0;
        int target = sc.nextInt();
        int n=a.length;
        for(int i=0;i<n;i++){
           if( a[i]==target){
            count ++;
           }
        }
        
        System.out.println("count is:"+count);
    }
}
