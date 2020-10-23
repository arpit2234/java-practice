package array;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,64,44,46,6,4,46,12,496,6,4,23,4,-41,7,-4,9,5};
		int n =a.length;
		
		for(int i=0;i<n-1;i++) {
			int minInd=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[minInd]) {
					minInd=j;
					
				}
				
				
			}
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
			}
			
		for(int i:a) {
			System.out.print(i + " ");
		}
		}

	}


