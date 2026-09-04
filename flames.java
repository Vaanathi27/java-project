import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("enter the first name");
	    String s1 = sc.nextLine();
	    System.out.println("enter the second name");
	    String s2 = sc.nextLine();
	    String s3 = "flames"; 
	    int count = 0;
	     for(int i = 0; i < s1.length();i++){
	        
	       for (int j = 0; j <  s2.length();j++){
	           if(s1.charAt(i) == s2.charAt(j))
	       
	            {
	              
	              s1 = s1.substring(0,i);
	              s2 = s2.substring(0, j) + s2.substring(j + 1);
	              count++;
                  break;
                }
	   
	        }
	    }
	System.out.println(count);
	
	int result = s1.length() + s2.length() -(2 * count);
	
	System.out.println(result);
   StringBuilder a = new StringBuilder("FLAMES");

int index = 0;

while (a.length() > 1) {

    index = (index + result ) % a.length();

    a.deleteCharAt(index);
}

System.out.println(a);

char ch = a.charAt(0);

if (ch == 'F')
    System.out.println("Friends");
else if (ch == 'L')
    System.out.println("Love");
else if (ch == 'A')
    System.out.println("Affection");
else if (ch == 'M')
    System.out.println("Marriage");
else if (ch == 'E')
    System.out.println("Enemy");
else
    System.out.println("Sister");
	}
}
