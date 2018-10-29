
public class StringManipulation {
	
	public static void main(String args[]) {
		String str= "the rains have started here s";
		String str1= "the rains Have started here s";
		
		System.out.println(str.length());		//29
		System.out.println(str.charAt(5)); 		//a
		
		System.out.println(str.indexOf('s'));		//first occurrence of s
		System.out.println(str.indexOf('s',(str.indexOf('s'))+1));
		System.out.println(str.indexOf('s',str.indexOf('s',(str.indexOf('s'))+1)+1));
		
		System.out.println(str.equals(str1));	//false
		
		System.out.println(str.equalsIgnoreCase(str1));	//true
		
		String str2= "*#@ Hello world &&";
		
		System.out.println(str2.replaceAll("[^a-zA-Z0-9 ]",""));	// Hello world
		
		String str3= "   HW  ";
		
		System.out.println(str3.trim());   //HW
		
		String str4= "Hello_world_Welcome";
		
		String words[]= str4.split("_");
		
		//for (int i=0; i<words.length; i++)
		for(String names: words) {
		System.out.println(names); //Hello
									//world
									//Welcome
		}
		
		int a=100 ;
		int b= 300;
		 
		System.out.println(str4+a+b); // jvm runs from left to right 
		
		System.out.println(a+b+str4);	//400Hello_world_Welcome
		
		System.out.println(str4+(a+b)); 	//Hello_world_Welcome400
		
		System.out.println(str4+str3);		//Hello_world_Welcome   HW  
		
		String date="02-05-1993";
		
		System.out.println(date.replace("-", "/"));		//02/05/1993
		
		
		
		
		
		
	}

}