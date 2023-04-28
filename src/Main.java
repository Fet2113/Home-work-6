public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
                        }

    public static void task1() {
            System.out.println("Задача 1 - 2");
            int [] simbol = new int [3];
            simbol [0] = 1;
            simbol [1] = 2;
            simbol [2] = 3;
            int simbol1 = simbol[0];
            int simbol2 = simbol[1];
            int simbol3 = simbol[2];
            double [] dsimbol = {1.57, 7.654, 9.986};
            double dsimbol1 = dsimbol[0];
            double dsimbol2 = dsimbol[1];
            double dsimbol3 = dsimbol[2];
            int [] randomsimbol = {13, 666, 21};
            int randomsimbol1 = randomsimbol[0];
            int randomsimbol2 = randomsimbol[1];
            int randomsimbol3 = randomsimbol[2];
            System.out.print(simbol1 + ", " + simbol2 + ", " + simbol3);
            System.out.println();
            System.out.print(dsimbol1 + ", " + dsimbol2 + ", " + dsimbol3);
            System.out.println();
            System.out.print(randomsimbol1 + ", " + randomsimbol2 + ", " + randomsimbol3);
            System.out.println();
                       }
     public static void task2() {
        System.out.println("Задача 3");
         int [] simbol = new int [3];
         simbol [0] = 1;
         simbol [1] = 2;
         simbol [2] = 3;
         for (int index = simbol.length - 1; index >= 0; index--) {

            System.out.print(simbol[index] + ", ");         }
         System.out.println();

         double [] dsimbol = {1.57, 7.654, 9.986};
         double dsimbol1 = dsimbol[0];
         double dsimbol2 = dsimbol[1];
         double dsimbol3 = dsimbol[2];
         for (int index = dsimbol.length - 1; index >= 0; index--) {

             System.out.print(dsimbol[index] + ", ");}
         System.out.println();

         int [] randomsimbol = {13, 666, 21};
         int randomsimbol1 = randomsimbol[0];
         int randomsimbol2 = randomsimbol[1];
         int randomsimbol3 = randomsimbol[2];
         for (int index = randomsimbol.length - 1; index >= 0; index--) {

             System.out.print(randomsimbol[index] + ", ");
         }
         System.out.println();}

        public static void task3() {
        System.out.println("Задача 4");
            int [] simbol = new int [3];
            simbol [0] = 1;
            simbol [1] = 2;
            simbol [2] = 3;
            for (int i = 0; i < simbol.length - 1; i++ ) {
                if (simbol[i] % 2 != 0) simbol[i]++;
                System.out.print(simbol[i]+ ", ");
            }
            if (simbol[simbol.length - 1] % 2 != 0) simbol[simbol.length - 1]++;
            System.out.print(simbol.length - 1);
    }}
