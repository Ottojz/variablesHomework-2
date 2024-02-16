public class Main {
    public static void main(String[] args) {

        //task 1

        byte b = 64;
        short s = 256;
        int i = 65536;
        long l = 1234567890L;
        float f = 12.65f;
        double d = 24.312505213;

        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        //task 2

        float fl = 27.12f;
        long lo = 987678965549L;
        double dou = 2.786;
        short sh = 569;
        short sho = -159;
        short shor = 27897;
        byte by = 67;

        //task 3

        byte ludmilaStudents = 23;
        byte annaStudents = 27;
        byte ekaterinaStudents = 30;
        int allStudents = ludmilaStudents + annaStudents + ekaterinaStudents;
        short allPaper = 480;
        float paperPerStudent = allPaper / allStudents;

        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

        //task 4

        byte performancePerTwoMinutes = 16;
        int performancePerTwentyMinutes = performancePerTwoMinutes * 10;
        int performancePerDay = performancePerTwentyMinutes * 3 * 24;
        int performancePerThreeDays = performancePerDay * 3;
        float performancePerMonth = performancePerDay * 365 / 12;

        System.out.println("За 20 минут машина произвела " + performancePerTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + performancePerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + performancePerThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + performancePerMonth + " штук бутылок");

        //task 5

        byte allCans = 120;
        byte whiteCans = 2;
        byte brownCans = 4;
        int cansPerClass = whiteCans + brownCans;
        int allClasses = allCans / cansPerClass;
        int allWhiteCans = allClasses * whiteCans;
        int allBrownCans = allClasses * brownCans;

        System.out.println("В школе, где " + allClasses + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски");

        //task 6

        short bananas = 5 * 80;
        short milk = 200 / 100 * 105;
        short icecream = 2 * 100;
        short eggs = 4 * 70;
        int breakfastWeight = bananas + milk + icecream + eggs;
        float breakfastKilos = breakfastWeight / 1000f;

        System.out.println("Вес завтрака спортсмена составляет " + breakfastWeight + " граммов");
        System.out.println("Это " + breakfastKilos + " килограмма");

        //task 7

        byte weightLoss = 7;
        int weightGrammsLoss = weightLoss * 1000;
        short minDayLoss = 250;
        short maxDayLoss = 500;
        int minDays = weightGrammsLoss / minDayLoss;
        int maxDays = weightGrammsLoss / maxDayLoss;
        float averageDays = (minDays + maxDays) / 2f;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то на похудение уйдет " + minDays + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то на похудение уйдет " + maxDays + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 250-500 грамм, то на похудение, в среднем, уйдет " + averageDays + " день");

        //task 8

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristSalary = 76230;
        int mashaSalaryNew = mashaSalary * 11 / 10;
        int denisSalaryNew = denisSalary * 11 / 10;
        int kristSalaryNew = kristSalary * 11 / 10;
        int mashaYearSalary = mashaSalary * 12;
        int denisYearSalary = denisSalary * 12;
        int kristYearSalary = kristSalary * 12;
        int mashaYearSalaryNew = mashaSalaryNew * 12;
        int denisYearSalaryNew = denisSalaryNew * 12;
        int kristYearSalaryNew = kristSalaryNew * 12;
        int mashaYearSalaryDiff = mashaYearSalaryNew - mashaYearSalary;
        int denisYearSalaryDiff = denisYearSalaryNew - denisYearSalary;
        int kristYearSalaryDiff = kristYearSalaryNew - kristYearSalary;

        System.out.println("Маша теперь получает " + mashaSalaryNew + " рублей. Годовой доход вырос на " + mashaYearSalaryDiff + " рублей");
        System.out.println("Денис теперь получает " + denisSalaryNew + " рублей. Годовой доход вырос на " + denisYearSalaryDiff + " рублей");
        System.out.println("Кристина теперь получает " + kristSalaryNew + " рублей. Годовой доход вырос на " + kristYearSalaryDiff + " рублей");

        //all

    }
}