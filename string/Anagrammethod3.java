package string;

public class Anagrammethod3 {
	public static void main(String[] args) {
     String a="ab555cd";
     String b="acb5ss55d";
     boolean anagram=true;
     
     int al[]=new int[256];
    
     for(char c:a.toCharArray()) {
    	 int index=(int) c;
    	al[index]++;
    	 
     }
     for(char c:b.toCharArray()) {
    	 int index=(int) c;
    	al[index]--;
    	 
     }
for(int i=0;i<256;i++) {
	if(al[i]!=0) {
		anagram=false;
		break;
	}
}
if(anagram) {
	 System.out.println("String are  anagram");
	
}
else {
	 System.out.println("String are not anagram");
	
}
     
     

}
}