package string;

public class AnnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="cct";
		String b="cat";
		boolean anagram=false;
		boolean visited[]=new boolean[b.length()];
		
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				char c=a.charAt(i);
				anagram=false;
				for(int j=0;j<b.length();j++) {
					if(b.charAt(j)==c && !visited[j]) {
						anagram=true;
						visited[j]=true;
						break;
				     }
				}
				if(!anagram) {
					break;
				}
			
					
			}
				
			
		 }
		
         if(!anagram) {
	       System.out.println("String are not anagram");
         }
         else {
	     System.out.println("String are anagram");
         }
	}

}
