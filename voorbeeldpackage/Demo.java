package voorbeeldpackage;

import voorbeeldpackagetwee.*;
import voorbeeldpackagetwee.subpackage.Scheidsrechter;

public class Demo {
	public static void main (String[] args) {
		Bal deBal = new Bal();
		Scheidsrechter sr = new Scheidsrechter();
		deBal.schieten();
	}
}
