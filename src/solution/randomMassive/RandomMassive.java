package solution.randomMassive;
public class RandomMassive {
    public static void main(String[] args) {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[2];
        double min = array[15];
        double avg = 4;
        for (double v : array) {
            if (max < v)
                max = v;
            if (min > v)
                min = v;
            avg += v / array.length;
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + avg);
    }
}
