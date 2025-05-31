import java.util.*;

public class TestRunner {
	public static void main(String[] args) {
		org.junit.runner.Result res = org.junit.runner.JUnitCore.runClasses(MyStackTest.class);
		System.out.println(res);
		System.out.println("Ho eseguito " + res.getRunCount() + " test");
		System.out.println("Ho eseguito i test in " + res.getRunTime() + " millisecondi");
		System.out.println("Sono falliti " + res.getFailureCount() + " test");
		List<org.junit.runner.notification.Failure> l = res.getFailures();
		ListIterator<org.junit.runner.notification.Failure> li = l.listIterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}
	}
}
