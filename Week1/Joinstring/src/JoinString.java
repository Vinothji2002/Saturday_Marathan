import java.util.*;
public class JoinString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.next();
		String str2=scan.next();
		String str=joinStrings(str1,str2);
		System.out.println(str);
	}
	public static String joinStrings(String str1, String str2) {
		return str1 + str2;
	}
}
