import java.util.*;
public class Main
{	// 100 - 120
	public static int CountSpecificNumbers(int m, int n) {
		int count=0;
		if(m>n) {
			return -1;
		}
		for(int i=m; i<n; i++) {
			boolean isvalid = true;

			int number =i;
			int digit=number;
			while(number!=0) {
				digit = number%10;
				if(digit != 1 && digit != 4 && digit != 9) {
					isvalid=false;
					break;
				}
				else {
					number=number/10;
				}
			}
			if(isvalid) {
				count++;
			}
		}
		return count;

	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m:");
		int m = sc.nextInt();
		System.out.println("Enter n:");
		int n = sc.nextInt();

		int res = CountSpecificNumbers(m,n);
		System.out.println(res);
	}
}