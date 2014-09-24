import java.util.Scanner;
class Calculadora {
public static void main (String args []) {
	int op,a,b;
	Scanner s = new Scanner (System.in);
	System.out.println("Digite OP");
	op = s.nextInt();
	switch (op) {
	case 0:
		System.out.println("Soma");
		break;
	case 1:
		System.out.println("sub");
	break;
	case 2:
		System.out.println("div");
	break;
	case 3:
		System.out.println("mult");
	break;
	}

}
}