package Task_03;

import java.util.Arrays;
import java.util.Scanner;

public class MyCalendar {

	private int year;
	private int size;
	private int capacity = 1;
	private DayOff[] daysOff;

	public MyCalendar() {
		super();
		this.daysOff = new DayOff[capacity];
	}

	public MyCalendar(int year) {
		super();
		this.year = year;

		this.daysOff = new DayOff[capacity];

	}

	public DayOff dayOffCreating() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date");
		int date = sc.nextInt();
		System.out.println("Enter Month");
		String month = sc.next();
		DayOff dayoff = new DayOff(date, month);
		return dayoff;
	}

	public void addDayOff(DayOff dayoff) {

		if (size < capacity) {
			System.out.println("size < capacity" + size + " < " + capacity);
			System.out.println("daysOff.length " + daysOff.length);
			daysOff[size] = dayoff;
			size++;

		} else {
			System.out.println("size !< capacity" + size + " ? " + capacity);
			DayOff[] temp = new DayOff[size];
			temp = daysOff;
			daysOff = new DayOff[capacity * 2];
			for (int i = 0; i < temp.length; i++) {
				daysOff[i] = temp[i];
			}
			daysOff[size] = dayoff;
			size++;
			capacity = capacity * 2;
		}

	}

	@Override
	public String toString() {
		return "Calendar [year=" + year + ", daysOff=" + Arrays.toString(daysOff) + "]";
	}

	class DayOff {

		private int day;
		private String month;

		public DayOff(int day, String month) {
			super();
			this.day = day;
			this.month = month;
		}

		@Override
		public String toString() {
			return "DayOff [day=" + day + ", month=" + month + "]";
		}

	}

}
