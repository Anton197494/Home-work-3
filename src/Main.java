public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a = 50000;
        System.out.println("Значение переменной с типом а равно "+ a);
        byte b = 127;
        System.out.println("Значение переменной с типом b равно "+ b);
        short c = 32700;
        System.out.println("Значение переменной с типом c равно "+ c);
        long d = 5000;
        System.out.println("Значение переменной с типом d равно "+ d);
        float e = 3.75f;
        System.out.println("Значение переменной с типом e равно "+ e);
        double l = 4.57d;
        System.out.println("Значение переменной с типом l равно "+ l);

        float k = 27.12f;
        long h = 987678965549L;
        double z = 2.786d;
        short n = 569;
        short g = -159;
        int s = 27897;
        byte f = 67;

        byte oneClass = 23;
        byte twoClass = 27;
        byte threeClass = 30;
        short paper = 480;
        int totalStudent = oneClass + twoClass + threeClass;
        int paperPerStudent = paper/totalStudent;
        System.out.println("На каждого ученика расчитано "+paperPerStudent+" листов бумаги");

        byte performanceTwoMinutes = 16;
        int performanceOneMinutes = performanceTwoMinutes/2;
        int performanceTwentyMinutes = performanceOneMinutes * 20;
        System.out.println("За 20 минут машина произвела "+performanceTwentyMinutes+ " бутылок");
        int oneDayMinutes = 1440;
        int performanceDay = performanceOneMinutes * oneDayMinutes;
        System.out.println("За сутки машина произвела "+performanceDay+ " бутылок");
        int threeDayMinutes = 3*oneDayMinutes;
        int performanceThreeDay = threeDayMinutes * performanceOneMinutes;
        System.out.println("За три дня машина произвела "+performanceThreeDay+ " бутылок");
        int oneMonthMinutes = oneDayMinutes * 30;
        int performanceOneMonth = performanceOneMinutes * oneMonthMinutes;
        System.out.println("За месяц машина произвела "+performanceOneMonth+ " бутылок");

        byte totalCansOfPain = 120;
        byte whiteCansOfPainOfOneClass = 2;
        byte brownCansOfPainOfOneClass = 4;
        int CansOfPainOfOneClass = whiteCansOfPainOfOneClass + brownCansOfPainOfOneClass;
        int totalClassInSchool = totalCansOfPain/CansOfPainOfOneClass;
        int whiteCansOfPainOfSchool = whiteCansOfPainOfOneClass * totalClassInSchool;
        int brownCansOfPainOfSchool = brownCansOfPainOfOneClass * totalClassInSchool;
        System.out.println("В школе где " + totalClassInSchool + " классов, нужно " + whiteCansOfPainOfSchool + " банок белой краски и " + brownCansOfPainOfSchool + " банок коричневой краски");

        short bananaWeightInGram = 5 * 80;
        short milkWeightInGram = 105 * 2;
        short iceCreamWeightInGram = 100 * 2;
        short eggsWeightInGram = 70 * 4;
        int weightOfSportBreakfastInGram = bananaWeightInGram + milkWeightInGram + iceCreamWeightInGram + eggsWeightInGram;
        float weightOfSportBreakfastInKilogram = (float) weightOfSportBreakfastInGram/1000;
        System.out.println("Вес спортзавтрака составляет " + weightOfSportBreakfastInGram + " грамм");
        System.out.println("Вес спортзавтрака составляет " + weightOfSportBreakfastInKilogram + " килограмм");

        short massInGram = 7 * 1000;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        int numberOfDays1 = massInGram / weightLoss1;
        int numberOfDays2 = massInGram / weightLoss2;
        System.out.println ("Если спортсмен в день будет худеть на " + weightLoss1 + " грамм, то чтобы достигнуть результатов похудения ему понадобится " + numberOfDays1 + " дней");
        System.out.println ("Если спортсмен в день будет худеть на " + weightLoss2 + " грамм, то чтобы достигнуть результатов похудения ему понадобится " + numberOfDays2 + " дней");

        int mashaSalary1 = 67760;
        int denisSalary1 = 83690;
        int kristinaSalary1 = 76230;
        double mashaSalary2 = mashaSalary1 * 1.1;
        double denisSalary2 = denisSalary1 * 1.1;
        double kristinaSalary2 = kristinaSalary1 * 1.1;
        int mashaSalaryInYear1 = mashaSalary1 * 12;
        int denisSalaryInYear1 = denisSalary1 *12;
        int kristinaSalaryInYear1 = kristinaSalary1 *12;
        double mashaSalaryInYear2 = mashaSalary2 * 12;
        double denisSalaryInYear2 = denisSalary2 * 12;
        double kristinaSalaryInYear2 = kristinaSalary2 * 12;
        double differenceMashaSalaryInYear = mashaSalaryInYear2 - mashaSalaryInYear1;
        double differenceDenisSalaryInYear = denisSalaryInYear2 - denisSalaryInYear1;
        double differenceKristinaSalaryInYear = kristinaSalaryInYear2 - kristinaSalaryInYear1;
        System.out.println ("Маша теперь получает "+ mashaSalary2 + " рблей. Годовой доход вырос на " + differenceMashaSalaryInYear + " рублей.");
        System.out.println ("Денис теперь получает "+ denisSalary2 + " рблей. Годовой доход вырос на " + differenceDenisSalaryInYear + " рублей.");
        System.out.println ("Кристина теперь получает "+ kristinaSalary2 + " рблей. Годовой доход вырос на " + differenceKristinaSalaryInYear + " рублей.");

























    }


}
