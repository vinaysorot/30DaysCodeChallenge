class Search {  
     public static int missing(int a[],int n) 
     { 
         int expectedTotal=(n*(n+1))/2;
         int total=0;
         for(int i=0;i<n-1;i++)
         {
           total=total+a[i];
           
         }
         return expectedTotal-total;
        }  
public static void main(String args[]) {  
 int a[] = {1,3,6,4,5};
		int k = a.length;
		int miss=missing(a,k+1);
	
  System.out.println("Missing element is  =" + miss );  
}  
}  
