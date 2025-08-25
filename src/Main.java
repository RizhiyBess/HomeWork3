//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte a = 127;
        System.out.println("Значение переменной с типом byte равно " + a);
        short b = 25000;
        System.out.println("Значение переменной с типом short равно " + b);
        int c = 2000000;
        System.out.println("Значение переменной с типом int равно " + c);
        long d = 5500000L;
        System.out.println("Значение переменной с типом long равно " + d);
        float e = 2.5f;
        System.out.println("Значение переменной с типом float равно " + e);
        double f = 10.256;
        System.out.println("Значение переменной с типом double равно " + f);

        float a2 = 27.12f;
        long b2 = 987678965549L;
        double c2 = 2.786;
        short d2 = 569;
        int e2 = -159;
        short f2 = 27897;
        byte g2 = 67;
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);
        System.out.println(d2);
        System.out.println(e2);
        System.out.println(f2);
        System.out.println(g2);

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short piper = 480;
        int totalStudents = lP + aS + eA;
        int sheetsPerStudent = piper / totalStudents;
        System.out.println("На каждого ученика расчитано " + sheetsPerStudent + " листов бумаги");

        byte machinePerformance2Min = 16;
        int machinePerformance20Min = machinePerformance2Min * 10;
        int machinePerformance1Day = machinePerformance20Min * 72;
        int machinePerformance3Day = machinePerformance1Day * 3;
        int machinePerformance1Month = machinePerformance1Day * 30;
        System.out.println("За 20 минут машина произвела " + machinePerformance20Min + " штук бутылок");
        System.out.println("За сутки машина произвела " + machinePerformance1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformance3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + machinePerformance1Month + " штук бутылок");

        byte totalPaints = 120;
        byte oneClass = 6;
        int totalClasses = totalPaints / oneClass;
        byte oneClassBrownPaints = 4;
        byte oneClassWhitePaints = 2;
        int totalBrownPaints = oneClassBrownPaints * totalClasses;
        int totalWhitePaints = oneClassWhitePaints * totalClasses;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaints + " банок белой краски и " + totalBrownPaints + " банок коричневой краски");

        float weight1Banana = 80f;
        float weight100MlMilk = 105f;
        float weight1IceCreamBriquette = 100f;
        float weight1Egg = 70f;
        float weightOfBananasInTheRecipe = weight1Banana * 5;
        float weightOfMilkInTheRecipe = weight100MlMilk * 2;
        float weightOfIceCreamInTheRecipe = weight1IceCreamBriquette * 2;
        float weightOfEggInTheRecipe = weight1Egg * 4;
        float breakfast = weightOfBananasInTheRecipe + weightOfMilkInTheRecipe + weightOfIceCreamInTheRecipe + weightOfEggInTheRecipe;
        float breakfastKg = breakfast / 1000;
        System.out.println("Вес завтра составляет " + breakfast + " гр или " + breakfastKg + " кг");

        float weightLoss1 = 0.25f;
        float weightLoss2 = 0.5f;
        float totalReset = 7f;
        float dayWeightLoss1 = totalReset / weightLoss1;
        float dayWeightLoss2 = totalReset / weightLoss2;
        float averageNumberOfDays = (dayWeightLoss1 + dayWeightLoss2) / 2;
        System.out.println("Спортсмену при потере 250г потребуется " + dayWeightLoss1 + " дней, при потере 500г " + dayWeightLoss2 + " дней, в среднем " + averageNumberOfDays + " дней");

        double salaryMaria = 67760;
        double salaryYearMaria = salaryMaria * 12;
        double raisingMaria = salaryMaria * 0.1 + salaryMaria;
        double raisingYearMaria = raisingMaria * 12;
        double salaryDifferenceMaria = raisingYearMaria - salaryYearMaria;
        System.out.println("Маша теперь поучает " + raisingMaria + " рублей. Годовой доход вырос на " + salaryDifferenceMaria + " рублей");
        double salaryDenis = 83690;
        double salarYearDenis = salaryDenis * 12;
        double raisingDenis = salaryDenis * 0.1 + salaryDenis;
        double raisingYearDenis = raisingDenis * 12;
        double salaryDifferenceDenis = raisingYearDenis - salarYearDenis;
        System.out.println("Денис теперь получает " + raisingDenis + " рублей. Годовой доход вырос на " + salaryDifferenceDenis + " рублей");
        double salaryKristina = 76230;
        double salaryYearKristina = salaryKristina * 12;
        double raisingKristina = salaryKristina * 0.1 + salaryKristina;
        double raisingYearKristina = raisingKristina * 12;
        double salaryDifferenceKristina = raisingYearKristina - salaryYearKristina;
        System.out.println("Кристина теперь получает " + raisingKristina + " рублей. Годовой доход вырос на " + salaryDifferenceKristina + "рублей");
    }
}