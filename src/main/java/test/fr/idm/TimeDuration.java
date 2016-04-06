package test.fr.idm;

public class TimeDuration {

	private class BadBadValueException extends Exception {
		private static final long serialVersionUID = 1L;
	}

	private int duration;
	private int second;
	private int minut;
	private int hour;

	public TimeDuration(int duration) throws BadBadValueException {
		super();
		if (duration < 0) {
			throw new BadBadValueException();
		}
		this.duration = duration;

		hour = duration / 3600;
		minut = duration / 60 - hour * 60;
		second = duration % 60;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMinut() {
		return minut;
	}

	public void setMinut(int minut) {
		this.minut = minut;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		if (hour == 0 && minut == 0) {
			return "" + second + "s";
		} else if (hour == 0) {
			return "" + minut + "m" + " " + second + "s";
		} else {
			return "" + hour + "h" + " " + "" + minut + "m" + " " + second + "s";
		}
	}

}
