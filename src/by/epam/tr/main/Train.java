package by.epam.tr.main;

public class Train {
	private int number;
	private String route;
	private String time;

	private Train(int number, String route, String time) {
		this.number = number;
		this.route = route;
		this.time = time;
	}

	private static void sort(Train[] listTrain) {
		for (int i = 0; i < listTrain.length - 1; i++) {
			boolean isSorted = false;
			int buf;
			while (!isSorted) {
				isSorted = true;
				
					if (listTrain[i].number > listTrain[i + 1].number) {
						isSorted = false;

						buf = listTrain[i].number;
						listTrain[i].number = listTrain[i + 1].number;
						listTrain[i + 1].number = buf;
					}
				}
			
			}
		for (int i = 0; i < listTrain.length; i++)
			System.out.println(listTrain[i].number + "  " + listTrain[i].route + "  " + listTrain[i].time);
		}
	

	public static void main(String[] args) {
		Train[] listTrain = { 
				new Train(5, "Minsk", "10.00"),
				new Train(8, "Moscow", "20.15"),
				new Train(12, "Tashkent", "19.45"),
				new Train(4, "Kiev", "15.00"),
				new Train(77, "Grodno", "12.00"), };
		sort(listTrain);
	}
}
