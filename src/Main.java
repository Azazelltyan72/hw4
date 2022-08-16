public class Main {
    public static void main(String[] args) {
        // Задание 1
            int i = 0;
            while ( i < 10 ) {
                i ++;
                System.out.print( i + " ");
            }
        System.out.println();
        for (; i > 0; i --) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        // Задание 2
        int friday = 1;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница " + friday + "-e число. Необходимо подготовить отчет.");
        }

        System.out.println();
        // Задание 3
        int cometYear = 0;
        int thisYear = 2022;
        int startYear = thisYear - 200;
        int endYear = thisYear + 100;
        for (;cometYear <= endYear; cometYear +=79) {
            if (cometYear >= startYear) {
                System.out.println(cometYear);
            }

        }




    }
}