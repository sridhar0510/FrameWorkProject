package org.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JunitRunner1 {
	
	@Test
	public void tc6() {
		Result rs = JUnitCore.runClasses(SampleClass1.class,SampleClass2.class);
        System.out.println("Run Count: "+rs.getRunCount());
        System.out.println("Failure Count:"+rs.getFailureCount());
        System.out.println("Ignore Count:"+rs.getIgnoreCount());
        System.out.println("Run Time:"+rs.getRunTime());
        
        List<Failure> fail = rs.getFailures();
        
        for (Failure eachFailure : fail) {
        	
        	System.out.println(eachFailure);
			
		}
	}

}
