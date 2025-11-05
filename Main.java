public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
	int c = 0;
        int resultat = Operation.produit(a, b);
	int resultat1 = Operation.addition(a, b);
	int resultat2 = Operation.soustraction(a, b);
	float resultat3 = Operation.division(a, b);
	float resultat4 = Operation.division(a, c);
 	System.out.println("Bienvenue");
        System.out.println(a +"*" + b+"=" + resultat);
	System.out.println(a +"+" + b+"=" + resultat1);
	System.out.println(a +"-" + b+"=" + resultat2);
	System.out.println(a +"/" + b+"=" + resultat3);
	System.out.println(a +"/" + c+"=" + resultat4);
	System.out.println("Au revoir");
	
}
}
