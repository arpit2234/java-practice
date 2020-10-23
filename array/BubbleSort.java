package array;

public class BubbleSort {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]= {1,64,44,6,46,6,4,46,12,496,6,4,4,23,4,-41,7,-4,9,5};
			int n =a.length;
			boolean sorted =true;
			
			for(int i=0;i<n-1;i++) {
			for(int j =0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
				}	
				}
			if(sorted) {break;}
			
			}
			for(int i:a) {
				System.out.print(i+" ");
			}
			
			
		}

	}



