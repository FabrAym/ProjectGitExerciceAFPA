package test.java;



import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.java.ProjectGit.Compteur;




public class CompteurTest {
	Compteur cpt;
	@Before
	public void initiali() {
		cpt = new Compteur();
	}
	@Test
	public void testIncrement() {
		Assert.assertEquals(1, cpt.increment());
		Assert.assertEquals(2, cpt.increment());
	//	Assert.fail("C'est pas bon");
	}
	@Test
	public void testDecrement() {
		Assert.assertEquals(-1, cpt.decrement());
		Assert.assertEquals(-2, cpt.decrement());
	}
	
}
