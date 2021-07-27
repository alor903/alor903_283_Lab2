import java.io.InputStreamReader;
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(new InputStreamReader(System.in));
		while (scan.hasNextLine()) {
	        String data = scan.nextLine();
	        if(data.equals("0")) {
	        	break;
	        }
	        String[] splitStr = data.split("\\s+");

	        int maxProfit = Integer.parseInt(splitStr[2]) - Integer.parseInt(splitStr[1]);
	        int minPrice = Integer.parseInt(splitStr[1]);
	        for(int i = 2; i <= Integer.parseInt(splitStr[0]); i++) {
	        	if(Integer.parseInt(splitStr[i]) - minPrice > maxProfit) {
	        		maxProfit = Integer.parseInt(splitStr[i]) - minPrice;
	        	}

	        	if(Integer.parseInt(splitStr[i]) < minPrice) {
	        		minPrice = Integer.parseInt(splitStr[i]); 
	        	}
	        }
	        if(maxProfit < 0) {
	        	maxProfit = 0;
	        }
	        System.out.print(maxProfit + "\n");
	        System.out.print(345);
	      }
		scan.close();
	}
}