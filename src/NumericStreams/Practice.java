package NumericStreams;

public class Practice {

	public static void main(String[] args) {

		String[] strTime = new String[3];

		strTime[0] = "09:30AM-10:00AM";
		strTime[1] = "11:30AM-12:40PM";
		strTime[2] = "01:30PM-02:30PM";

		String smallestSet = "02:30PM";

		if (smallestSet.contains("PM") && (!smallestSet.contains("12"))) {

			smallestSet = smallestSet.replace("PM", "");
			int time = 12 + Integer.parseInt(smallestSet.substring(0, 2));
			smallestSet = smallestSet.replace(smallestSet.substring(0, 2), Integer.toString(time));

		}
		System.out.println(smallestSet);

	}

}
