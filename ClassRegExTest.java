package Junit;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class ClassRegExTest {

	@Test
	public void firstnameTest() {
		ClassRefEx ur = new ClassRefEx();
		boolean result = ur.firstname("Mrunali");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void lastnameTest() {
		ClassRefEx ur = new ClassRefEx();
		boolean result = ur.firstname("Deore");
		Assert.assertEquals(true, result);
	}

}
