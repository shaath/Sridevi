package methods;

import java.io.IOException;

public class UserLoginTC {

	public static void main(String[] args) throws IOException
	{
		OrgHrmLib  om=new OrgHrmLib();
		
		String res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("SharathChandraGande", "SharathChandraGande");
		System.out.println("Application Login "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application Closed Successfully");

	}

}
