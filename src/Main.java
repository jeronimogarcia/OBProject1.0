public class Main {
    public static void main(String[] args) {
        int result = suma(3,4,5);
        System.out.println(result);

        Cars myCar = new Cars();
        myCar.DoorPlus(1);
        System.out.println(myCar.doors);
    }

    public static int suma (int a, int b, int c) {
        return a+b+c;
    }

    static class Cars {
        public int doors = 4;

        public void DoorPlus(int n) {
            this.doors = doors+n;
        }
    }
}