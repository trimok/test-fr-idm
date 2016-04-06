package test.fr.idm;

public class TestTimeDuration {

	public static void main(String[] args) {
		TestTimeDuration test = new TestTimeDuration();
		test.testTimeDuration();

	}

	public void testTimeDuration() {
		try {
			System.out.println(new TimeDuration(0));
			System.out.println(new TimeDuration(732));
			System.out.println(new TimeDuration(7242));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
