
public class TestSandwich {

	public static void main(String[] args) {
		Sandwich firstSandwich = new Sandwich();
		firstSandwich.setMainIngredient("Wheat");
		firstSandwich.setBreadType("Tuna");
		firstSandwich.setPrice(4.99);
		System.out.println("You ordered " + firstSandwich.getMainIngredient() +
				" on " + firstSandwich.getBreadType() + " which costs $" + firstSandwich.getPrice());

	}

}
