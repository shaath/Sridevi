package methods;

import java.io.IOException;

public class TestSuite {

	public static void main(String[] args) throws IOException 
	{
		//Login
		OrgHrmLib  om=new OrgHrmLib();
		
		String res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application Closed Successfully");
		
		//EmpReg
		res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgEmpReg("Vignan", "Kumar","Emp1234");
		System.out.println("Employee Registration "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application Closed Successfully");
		
		//Userreg
		
		res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("Admin", "admin");
		System.out.println("Application Login "+res);
		
		res=om.OrgUserReg("Vignan Kumar", "VignaKumar123456", "VignaKumar123456", "VignaKumar123456");
		System.out.println("User Registration "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application Closed Successfully");
		
		//UserLogin
		res=om.OrgLaunch("http://opensource.demo.orangehrmlive.com");
		System.out.println("Application Launch "+res);
		
		res=om.OrgLogin("VignaKumar123456", "VignaKumar123456");
		System.out.println("Application Login "+res);
		
		res=om.OrgLogout();
		System.out.println("Application Logout "+res);
		
		om.OrgClose();
		System.out.println("Application Closed Successfully");
	}

}
