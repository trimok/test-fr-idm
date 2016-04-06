package test.fr.idm;

import java.util.Map;
import java.util.TreeMap;

public class RaceResults {

	private Map<Integer, String> map = new TreeMap<>();

	public void onNewResult(String tagNumber, TimeDuration resultTime) {
		map.put(resultTime.getDuration(), tagNumber);
	}

	public void printResults() {
		System.out.println("Résultats de l'épreuve :");

		try {
			for (Integer duration : map.keySet()) {
				System.out.println(map.get(duration) + " : " + new TimeDuration(duration).toString());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		RaceResults raceResult = new RaceResults();

		try {
			raceResult.onNewResult("RFID 101", new TimeDuration(2000));
			raceResult.onNewResult("RFID 102", new TimeDuration(1000));
			raceResult.printResults();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
