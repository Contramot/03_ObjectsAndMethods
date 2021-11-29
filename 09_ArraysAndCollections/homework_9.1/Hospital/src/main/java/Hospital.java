import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов

        float[] patientsTemperatures = new float[patientsCount];
        for (int i = 0; i < patientsTemperatures.length; i++) {
            float value = (float)(Math.random() * ((40 - 32) + 1)) + 32;
            patientsTemperatures[i] = (float) Math.round(value * 10) / 10;
        }

        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */

//        for (float temp : temperatureData) {
//            System.out.println(temp);
//        }

        float sumTemperature = 0;
        int healthyPatients = 0;
        StringBuilder temperatureToString = new StringBuilder();

        for (int i = 0; i < temperatureData.length; i++) {
            sumTemperature += temperatureData[i];
            if (temperatureData[i] >= 36.2 && temperatureData[i] < 37) {
                healthyPatients += 1;
            }

            temperatureToString.append(temperatureData[i]);
            if (i == temperatureData.length - 1) {
                break;
            }
            temperatureToString.append(" ");
        }

        float averageTemperature = 0;
        averageTemperature = (float) Math.round(sumTemperature / temperatureData.length * 100) / 100;

        String report =
                "Температуры пациентов: " + temperatureToString +
                        "\nСредняя температура: " + averageTemperature +
                        "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}
