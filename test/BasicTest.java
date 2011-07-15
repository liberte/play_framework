import org.junit.*;
import play.test.*;
import models.*;

public class BasicTest extends UnitTest 
{

@Test

	public void tryConnectAsUser() 
	{

    new User("bob@gmail.com", "secret", "Bob").save();
    
   
    assertNotNull(User.connect("bob@gmail.com", "secret"));
    assertNull(User.connect("bob@gmail.com", "badpassword"));
    assertNull(User.connect("tom@gmail.com", "secret"));
	}
	
	public void CreateAndRetrieveUser()
	{
	
	new User("bob@gmail.com","secret","Bob")._save();
	User bob = User.find("byEmail", "bob@gmail.com").first();
	
	assertNotNull(bob);
	assertNotNull("Bob",bob.fullname);
	
	
	}

}
