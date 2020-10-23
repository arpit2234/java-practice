package recursion;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          permutation("abc",0,2);
	}
	static void permutation(String s,int l,int r)
	{
		if(l==r) {
			System.out.println(s);
		}
		for(int i=l;i<=r;i++) {
			s=interChangeChar(s,l,i);
			permutation(s,l+1,r);
			s=interChangeChar(s,l,i);
			
		}
	}
	static String interChangeChar(String s,int a,int b) {
		char array[]=s.toCharArray();
		char temp=array[a];
		array[a]=array[b];
		array[b]=temp;
		return String.valueOf(array);
	}
}
