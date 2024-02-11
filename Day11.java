class Search {  
     public static void insertionSort(int a[]) {  
        int n = a.length;  
        for (int j = 1; j < n; j++) {  
            int key = a[j];  
            int i = j-1;  
            while ( (i > -1) && ( a [i] > key ) ) {  
                a [i+1] = a [i];  
                i--;  
            }  
            a[i+1] = key;  
        }  
     }
public static int binarySearch(int a[], int n, int val) {  
 int low=0;int high=n-1;
 while(low<=high){
     int mid=(low+high)/2;
     if(a[mid]==val) return mid+1;
     if(mid<val) low=mid+1;
     else if(mid>val) high=mid-1;
 }
  return -1;  
}  
public static void main(String args[]) {  
 int a[] = { 64, 34, 25, 12, 22, 11, 90 };
		int n = a.length;
		insertionSort(a); 
		System.out.print("The elements of the array are after sort: ");
		for (int i = 0; i < n; i++)  
  System.out.print("  " + a[i]);  
  System.out.println();  
  int val = 12; 
  
  
  int res = binarySearch(a, n, val); 
  System.out.println();  
  
  
  System.out.println("Element to be searched is: " + val);  
  if (res == -1)  
  System.out.println("Element is not present in the array");  
  else  
  System.out.println("Element is present at " + res +" position of array");  
}  
}  
