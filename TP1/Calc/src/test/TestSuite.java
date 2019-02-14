package test;

public class TestSuite extends Test {
	public static void main(String[] args){
		TestErrors.main(args);
		TestGreen.main(args);
		TestBlue.main(args);
		/*
		TestRed.main(args);
		TestNonRecRed.main(args);
		TestRedNoLoop.main(args);
		//*/
	}
}
