package userregistration;
import org.junit.Assert;
import org.junit.Test;

class Junit{
	
	@Test
	public void testWhenFirstName_isProper_returnTrue() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validateName("Kalpesh");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void testWhenFirstName_isNotProper_returnFalse() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validateName("123Kalpesh");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void testWhenLastName_isProper_returnTrue() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validateName("Patil");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenLastName_isNotProper_returnFalses() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validateName("Pi321");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testWhenEmail_isProper_returnTrue() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validateEmail("kalpesh321@gmail.com");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenEmail_isNotProper_returnTrue() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validateEmail("_kalp@google.co.aus");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testWhenMobileNumber_isProper_returnTrue() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validateMobileNumber("91 9988776655");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenMobileNumber_isNotProper_returnFalses() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validateMobileNumber("9876543210");
		Assert.assertFalse(result);
	}
	
	@Test
	public void testWhenPassword_isProper_returnTrue() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validatePassword("Password321$pkkakmd");
		Assert.assertTrue(result);
	}
	
	@Test
	public void testWhenPassword_isNotProper_returnFalses() {
		UserRegistration validate = new UserRegistration();
		boolean result = validate.validatePassword("passwordjsnfksjf");
		Assert.assertFalse(result);
	}}
