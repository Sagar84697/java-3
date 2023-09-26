
import java.util.Scanner;
import java.util.ArrayList;

public class Billing {

	public static void main(String[] args) {
		//This ArrayList will store the details of the items the user orders//
		ArrayList<Bill> a1 = new ArrayList<Bill>();
		char ch = 'Y';
		String itemname = "";
		int slno, quantity;
		float cost = 0.0f, subtotal = 0.0f, grandtotal = 0.0f;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("___________________\n" +
		                   "       M E N U      \n" +
		                   "___________________\n" +
		                   "slno  itemname  cost\n" +	
		                   "____________________\n" +
		                   "1      IDLY        20\n" +
		                   "2      DOSA        30\n" +
		                   "3      POORI       40\n" +
		                   "4      VADA        10\n" +
		                   "5      WATER       20\n" +
		                   "_____________________\n");
		
		while (ch == 'Y') {
			System.out.print("enter your item choice:  ");
			slno = sc.nextInt();
			System.out.print("enter the quantity:    ");
			quantity = sc.nextInt();
			
			switch (slno) {
				case 1:
					itemname = "IDLY";
					cost = 20;
					subtotal = cost * quantity;
					break;
				case 2:
					itemname = "DOSA";
					cost = 30;
					subtotal = cost * quantity;
					break;
				case 3:
					itemname = "POORI";
					cost = 40;
					subtotal = cost * quantity;
					break;
				case 4:
					itemname = "VADA";
					cost = 10;
					subtotal = cost * quantity;
					break;
				default:
					System.out.println("wrong items no");
			}
			
			grandtotal=grandtotal+subtotal;
			a1.add(new Bill(itemname, cost, quantity, subtotal));
			System.out.print("Do you want to buy anything more? \ntype 'Y' for more : ");
			ch = sc.next().toUpperCase().charAt(0);
		}
			System.out.println("please enter the tip amnt");
			float tip =sc.nextFloat();
			
			if(tip<(0.1f*grandtotal))
			{
				tip=(0.1f*grandtotal);
			}
			System.out.println("___________________\n" +
			                   "       B I L L     \n" +
			                   "itemName Cost Quantity Subtotal\n" +
			                   "___________________");
			for (int i = 0; i < a1.size(); i++) {
				System.out.println(a1.get(i));
			}
			System.out.println("___________________");
			System.out.println("Grand total : " + grandtotal+"    " + "tip amnt : "+tip);
			System.out.println();
			System.out.println("   totalbill :  "+(grandtotal+tip));
		}
	}


class Bill {
	String itemName = "";
	float cost = 0.0f, subtotal = 0.0f;
	int quantity;
	
	Bill(String itemName, float cost, int quantity, float subtotal) {
		this.itemName = itemName;
		this.cost = cost;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}
	
	@Override
	public String toString() {
		return itemName + "    " + cost + "    " + quantity + "    " + subtotal;
	}
}
	


