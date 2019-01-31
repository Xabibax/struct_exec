package test;

public class TestSuite extends Test {
	public static void main(String[] args){
		TestGreen.main(args);
		TestGreenError.main(args);
		TestGreenPlus.main(args);
		TestGreenType.main(args);
		/*
		TestErrors.main(args);
		TestBlue.main(args);
		TestRed.main(args);
		TestNonRecRed.main(args);
		TestRedNoLoop.main(args);
		//*/
	}
}
