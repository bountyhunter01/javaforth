package example;

public class gx {

	public static void main(String[] args) {
		String[] classGroup = { "chu", "git", "class" };
		for (int i = 0; i < classGroup.length; i++) {

			if (i == 0) {
				System.out.println(classGroup[0] + " is good");
				
			} else {
				System.out.println(classGroup[1]);
				System.out.println(classGroup[2]);
				break;
			}
		}
	}

}
