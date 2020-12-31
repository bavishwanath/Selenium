package WebdriverMethods;

public class ArryStringsJava {
	public static void main(String args[]) {
		String name = "Vishwanatha - Ananda B.E ";
		String[] names = name.split("-");
		String formattedName1 = names[0].trim();
		String formattedName2 = names[1].trim();
		
		System.out.println(formattedName1);
		System.out.println(formattedName2);
		System.out.println(formattedName1.isEmpty());
		System.out.println(formattedName1.equalsIgnoreCase("vishwanatha"));
		
	}

}
