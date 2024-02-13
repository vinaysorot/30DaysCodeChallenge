import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        int sum=0;
        
        for(int i=0;i<a.length;i++)
        {
         maxi=Math.max(maxi,a[i]);
        mini=Math.min(mini,a[i]);
         sum=sum+a[i];
        }
        int avg=sum/2;
        System.out.println("maximum is :"+ maxi);
        System.out.println("minimum is :"+ mini);

        System.out.println("Sum is:"+sum);
        System.out.println("Average is :"+avg);

    }
}
