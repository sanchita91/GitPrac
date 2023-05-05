package bit.com;

import org.testng.annotations.Test;

public class String_Prac {
	
	
	
	
	public void stringClass() {
		/* String literal-String Constant pool> Whenever we create string literals
		 * with same value,String pool will not create a new object rather it will use 
		 * the same object reference and store the value so instead of creating 2
		 * object will refer to the same object this way we are properly using memory and not wasting space
		 */
		
		String s1="Hello";
		String s2="Hello";
		String s3="hello";
		
		/* String Object or Heap > whenever we create string object with same value
		 * string object will create separate reference for each object
		 */
		String s4= new String("Welcome");
		String s5=new String("Welcome");
		
		/* Mutable means changeable Immutable means not changeable string is always Immutable
		 * Immutable if you change the  value then it will create a new object and replace the original object
		 */
		s1="More Hello";
		String sAdd= s1+s2;
		
		//String literal or String Constant pool
		
		String e1="hi";
		String e2="hi";
		String e3="cat";
		
		//string heap
		String e4=new String("hi");
		String e5=new String("hi");
	}
		@Test
		public void test1() {
			String s1="Hello";
			String s2="Hello";
			String s3="hello";
			String s4="Today is saturday and its sunny";
			
		}
		/*@Test
		public void test2() {
		String d= "United state of america"	;
		int d1=d.lastIndexOf('a');
		int d2=d.indexOf('a', d1+1);
		System.out.println(d2);
		System.out.println();
		
		String f="12abcd32";
		String f1=f.replace("abcd", "");
		System.out.println(f1);
			
		}
		*/
	
		/*public void test3() {
			String a = "12abcd32";
		//	String xp = a.replace("abcd", ",");
			//String d[] = xp.split(",");
			
			String b[] =  a.split("abcd");
			int c = Integer.parseInt(b[0]);
			int d = Integer.parseInt(b[1]);
			System.out.println(c+d);
			
		}*/
			
		
			public void dublicateChar()
			{
			String g="hello how are you";
			char[]k=g.toCharArray();
			
			for(int i=0;i<k.length;i++) {
				for(int j=i+1;j<k.length;j++)
				{
					if(k[i]==k[j])
					{
						System.out.println(k[i]+ "is duplicate");
					}
					
				}
			}
			
		}
			
			
			public void StringTest() {
				String s1=" Hello ";
				String s2="Hello";
				String s3="hello";
				String s4="Today is Saturday and its sunny";
				String s5="";
				String s6="Hello Hello Hello";
				System.out.println("======================================================================");
				System.out.println(s1.length());
				System.out.println(s1.charAt(2));
				//System.out.println(valueOf("o"));
				System.out.println(s1.concat(" Pen"));
				System.out.println(s4.contains("its sunny"));
				System.out.println(s4.startsWith("Today"));
				//its upper case so its false
				System.out.println(s4.endsWith("Sunny"));
				System.out.println(s1.indexOf('l'));
				//false because its upper-case
				System.out.println(s1.equals(s3));
				System.out.println(s4.lastIndexOf('o'));
				System.out.println(s5.isEmpty());
				System.out.println(s3.length());
				System.out.println(s1.trim().length());
				System.out.println(s6.replace("e", "a"));
				System.out.println(s6.substring(2));
				System.out.println(s6.substring(2, 5));
				System.out.println(s6.toLowerCase());
				System.out.println(s6.toUpperCase());
				
			}
			
			public void testAscending ()
			{
				//print character in ascending order
				String s="Today is saturday and i feel great today is saturday";
				char sp[]=s.toCharArray();
				
				for(int i=0;i<sp.length;i++) {
					
					System.out.println(sp[i]);
					
				}
				
				
			}
			
			public void testDecending() {
				
				String s="Today is saturday and i feel great today is saturday";
				 char[] st=s.toCharArray();
				 
				 for(int i=st.length-1;i>=0;i--) {
					 System.out.println(st[i]); 
					 
				 }
				 
			}
			
			
			public void testAscending2()
			{
				String s="Today is saturday and i feel great today is saturday";
				 char[] st=s.toCharArray();
				 for(char a:st) {
					 System.out.println(a);
					 
				 }
			}
			
			public void testAscending3() {
				
				String[] sd= {"hi","hello","pen"};
				for(String j:sd)
				{
					System.out.println(j);
				}
			}
			
			public void printSentenceByWord()
			{
				String s="Today is saturday and is feel great today is saturday";
				String[] sd=s.split("is");
				for(String f:sd) {
					System.out.println(f);
				}
				
			}
			
			public void SplitSentenceByCondition() {
				String s="Today is saturday and is feel great today is saturday";
				String[]sj=s.split(" ", 6);
				for(String f:sj) {
					System.out.println(f);
				}
			}
			
			public void differentEqualHashcode() {
				String s ="fb";
				String d="FB";
				String s1=s.toLowerCase();
				String s2=d.toLowerCase();
				System.out.println(s.hashCode());
				System.out.println(d.hashCode());
				if(s1.equals(s2)) 
					{
						System.out.println("is equal");
					}
					else
					{
						System.out.println("is not equal");
				    }
			}
		
			public void findSecondAFormFirst()
			{
                
					//how to find second  a from "United states of America"
				
				String s="United states of america";
				int f=s.indexOf('a');
				System.out.println(f);
				System.out.println(s.indexOf('a', f+1));
				int j=s.indexOf('a', f+1);
				char l=s.charAt(j);
				System.out.println(l);
			}
			
			public void findSecondOFormLast() {
				String s="Unitoed staotes of america";
				int a=s.lastIndexOf('o');
				int c=s.lastIndexOf('o',a-1);
				System.out.println(c);
				System.out.println(s.charAt(c));
			}
			
			@Test
			public void ReverseAstring() {
				String s="United states of america";
				 char[] x=s.toCharArray();
				 
				for(int i=x.length-1;i>=0;i--) {
					System.out.println(x[i]);
				}
			}
			@Test
			public void removeSpaceBetweenWord() {
				String s="how are you";
				String[] z=s.split("");
				for(int i=0;i<z.length;i++) {
					System.out.println(z[i]);
				}
			}
			
		
		
		
	}

	 
		

	


