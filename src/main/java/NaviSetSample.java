import java.util.NavigableSet;
import java.util.TreeSet;

public class NaviSetSample {

	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<String>();

		set.add("BC");
		set.add("BCD");

		System.out.println("A : " + set.ceiling("A"));
		System.out.println("B : " + set.ceiling("B"));

		System.out.println("BA : " + set.ceiling("BA"));
		System.out.println("BC : " + set.ceiling("BC"));
		System.out.println("BD : " + set.ceiling("BD"));
	}

}
