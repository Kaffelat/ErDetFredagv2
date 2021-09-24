package Services;

public class ErDetFredag {
        public static double test() {
                int q = 24;
                int m = 9;
                int j = 2021 / 100;
                int k = 2021 % 100;
                return calculater(q, m, j, k);

        }
        public static double calculater (int q, int m, int j, int k){
                double h = ((q + 13*(m +1)/5 + k + k/4 + j/4 -2*j)%7);
                double d = (((h+5)%7) + 1);
                return d;

        }

}
