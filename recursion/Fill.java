package recursion;

//import java.util.Arrays;

public class Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
                };
		floodFill(a,1,1,5,1);
		print(a);
	}
	static void floodFill(int a[][],int r,int c,int toFill,int preFill) {
		int rows=a.length;
		int cols=a[0].length;
		if(r<0 || r>=rows || c<0 || c>=cols) {
			return;
		}
		if(a[r][c]!=preFill) {
			return;
		}
		a[r][c]=toFill;
		floodFill(a,r-1,c,toFill,preFill);
		floodFill(a,r,c-1,toFill,preFill);
		floodFill(a,r+1,c,toFill,preFill);		
		floodFill(a,r,c+1,toFill,preFill);

	}
	public static void print(int a[][]) 
    { 
        // Loop through all rows 
        for (int i = 0; i < a.length; i++) {
        	
        	System.out.println(); 
  
            // Loop through all elements of current row 
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " "); 
            }
            }
    } 
//	  { 
//	        // Loop through all rows 
//	        for (int[] row : a) 
//	  
//	            // converting each row as string 
//	            // and then printing in a separate line 
//	            System.out.println(Arrays.toString(row)); 
//	    } 

}
