package Top_16_Programms;

public class Array_Desc {
	
	public static void main(String[] args) {
		int a[]= {1,2,5,4,7,9,5,8};
		int n=a.length;
		int i,j,temp=0;
		//Now arrange array elements in ascending order
		for(i=0;i<n;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		//Print array in ascending order...
		System.out.print("\nArray Elements in Descending Order: ");
		for(i=0;i<n;i++) {
			System.out.print(a[i]);
		}
	}

}
