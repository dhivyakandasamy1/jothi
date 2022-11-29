package testnglist;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener :  builtin interface:  onstart, on finish, ontestsuccess, ontestfailure, ontestskipped
import org.testng.annotations.Listeners;

	// class<=> interface :   class definition:  implements Interfacename 
	
	// right click=> source=> override/implement methods 

//@Listeners(testnglist.c1.class)
public class c1 implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is success ");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("finished ");
	}
	
	

}
