package week6.day2.classroom;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer{
	int maxCount=2;
	int reTry=0;
	public boolean retry(ITestResult result) {
		if(!result.isSuccess() && reTry < maxCount) {
			reTry++;
			return true;
		}
		return false;
	}

}
