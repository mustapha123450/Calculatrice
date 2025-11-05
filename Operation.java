public class Operation {
        public static int produit(int x, int y){
                return x*y;
        }
  public static int addition(int x, int y){
                return x+y;
        }
  public static int soustraction(int x, int y){
                return x-y;
        }
  public static float division(int x, int y){
		if (y!=0){
                return (float) x / (float) y;}
		else {return 0;}
        }
}
