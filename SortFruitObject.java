import java.util.Arrays;

public class SortFruitObject{

	public static void main(String args[]){

		Fruit[] fruits = new Fruit[4];

		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70);
		Fruit apple = new Fruit("Apple", "Apple description",100);
		Fruit orange = new Fruit("Orange", "Orange description",80);
		Fruit banana = new Fruit("Banana", "Banana description",90);

		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;

		Arrays.sort(fruits);

		int i=0;
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
			", Quantity : " + temp.getQuantity());
		}

	}
} 
class Fruit implements Comparable<Fruit>{
	
		private String fruitName;
		private String fruitDesc;
		private int quantity;
	
		public Fruit(String fruitName, String fruitDesc, int quantity) {
			super();
			this.fruitName = fruitName;
			this.fruitDesc = fruitDesc;
			this.quantity = quantity;
		}
	
		public String getFruitName() {
			return fruitName;
		}
		public void setFruitName(String fruitName) {
			this.fruitName = fruitName;
		}
		public String getFruitDesc() {
			return fruitDesc;
		}
		public void setFruitDesc(String fruitDesc) {
			this.fruitDesc = fruitDesc;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	
		public int compareTo(Fruit compareFruit) {
	
			int compareQuantity = ((Fruit) compareFruit).getQuantity();
	
			//ascending order
			System.out.println(this.quantity);
			return this.quantity - compareQuantity;
	
			//descending order
			//return compareQuantity - this.quantity;
	
		}
	}
