import org.junit.Test;

import br.ebix.Estado;


public class TestCombo {
	
	@Test
	public void TestEnumValues() {
		
		for (Estado e : Estado.values() ) {
			System.out.println(e.toString());
		}
		
	}
}
