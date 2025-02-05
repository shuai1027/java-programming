package test12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        try {
            File file = new File("D:\\java_IDEA\\lianxi\\src\\test12\\Weather.txt");
            Scanner input = new Scanner(file);
            for (int k = 0; k < NUMBER_OF_DAYS * NUMBER_OF_HOURS; k++) {
                int day = input.nextInt();
                int hour = input.nextInt();
                double temperature = input.nextDouble();
                double humidity = input.nextDouble();
                data[day - 1][hour - 1][0] = temperature;
                data[day - 1][hour - 1][1] = humidity;
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: Weather.txt");
            return;
        }

        for (int i = 0; i < NUMBER_OF_DAYS; i++) {
            double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
            for (int j = 0; j < NUMBER_OF_HOURS; j++) {
                dailyTemperatureTotal += data[i][j][0];
                dailyHumidityTotal += data[i][j][1];
            }
            System.out.println("Day " + (i + 1) + "'s average temperature is " + dailyTemperatureTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + (i + 1) + "'s average humidity is " + dailyHumidityTotal / NUMBER_OF_HOURS);
        }
    }
}
