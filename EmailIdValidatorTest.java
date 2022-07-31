package Junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EmailIdValidatorTest {
	private String emailId;

	public EmailIdValidatorTest(String emailId, boolean expected) {
		this.emailId = emailId;

	}
	
	@Parameters
	public static Iterable<Object[]> data() {
		return Arrays.asList(new Object[][]{
				{"mrunali@testdomain.com", true},
				{"mrunali.deore@testdomain.com", true},
				{"mrunali@deoredomain.com", true},
				{"mrunali@deoredomaincom", false},
				{"mruu-deore@testdomain", false},
				{"testdomain.com", false}
		}
				);
	}
	
	@Test
	public void testIsValidEmailId() throws Exception {
		boolean actual= EmailId.isValid(emailId);
		
	}
}