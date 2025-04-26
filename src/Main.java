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







    }


}
