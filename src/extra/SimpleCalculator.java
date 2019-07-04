package extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String rb =JOptionPane.showInputDialog("Insert number");

String ra =JOptionPane.showInputDialog("Insert another number");
int cv = Integer.parseInt(rb);
int fh = Integer.parseInt(ra);
// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "choose a mathematical problem", " calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation == 0) {
	
	add (cv,fh);
}
if (operation == 1) {
	subtract (cv,fh);   	
}
if (operation == 2) {
	
	multiply (cv,fh);
}
if (operation == 3) {
	
	divide (cv,fh);
}



// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static void add(int num1, int num2) { 
	JOptionPane.showMessageDialog(null, num1+"+"+num2+"="+(num1+num2));
}
	// 4. Create similar methods for subtraction, multiplication and division.


static void subtract(int num1, int num2) {
	JOptionPane.showMessageDialog(null,  num1+"-"+num2+"="+(num1-num2));
}

static void multiply(int num1, int num2) {
	JOptionPane.showMessageDialog(null,num1+"*"+num2+"="+(num1*num2));
}

static void divide(int num1, int num2) {
	JOptionPane.showMessageDialog(null,num1+"/"+num2+"="+(num1/num2));
}




}
