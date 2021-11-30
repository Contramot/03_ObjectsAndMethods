public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        // Метод генерации массива температур пациентов

        float[] patientsTemperatures = new float[patientsCount];
        for (int i = 0; i < patientsTemperatures.length; i++) {
            float value = (float)(Math.random() * 8) + 32;
            patientsTemperatures[i] = (float) Math.round(value * 10) / 10;
        }

        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        Метод расчёта и вывода средней температуры по больнице, количества здоровых пациентов,
            а также температуры всех пациентов.
        */

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

        float averageTemperature;
        averageTemperature = (float) Math.round(sumTemperature / temperatureData.length * 100) / 100;

        String report =
                "Температуры пациентов: " + temperatureToString +
                        "\nСредняя температура: " + averageTemperature +
                        "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}
