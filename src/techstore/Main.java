package techstore;

public class Main {
	public static void main(String[] args) {
		SystemExploitation s1 = SystemExploitation.Windows;
		SystemExploitation s2 = SystemExploitation.Ubuntu;
		System.out.println(s1);
		System.out.println(s2);
		
	
		for (SystemExploitation t : SystemExploitation.values()) {
			System.out.println(t);
		}
	}
}
