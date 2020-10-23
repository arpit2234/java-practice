package wrapper;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
		int i=5;  //premitive datatype
		Integer ii=new Integer(i);   //Wrapping-Boxing
		int j=ii.intValue();   //Unboxing -unwrapping
		System.out.println(j);
		
		
		Integer value =i;
		int a=value;
		System.out.println(value);
		
		
		String num="123";
		int b=Integer.parseInt(num);
		System.out.println(b);
	}

}
