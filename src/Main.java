public class Main {
    public static void main(String[] args) {
    // Задача 1
        System.out.println("Задача 1");
        int hoursInDay = 24;
        System.out.println("Значение переменной hoursInDay с типом int равно " + hoursInDay);
        byte someNumber = 127;
        System.out.println("Значение переменной someNumber с типом byte равно " + someNumber);
        short dontMen = 32_500;
        System.out.println("Значение переменной dontMen с типом short равно " + dontMen);
        long actualNum = 17_550_065L;
        System.out.println("Значение переменной actualNum с типом long равно " + actualNum);
        float nitrogen= - 195.75F;
        System.out.println("Значение переменной nitrogen с типом float равно " + nitrogen);
        double someThing = 99_999_999.5;
        System.out.println("Значение переменной someThing с типом double равно " + someThing);

        //Задача 2
        System.out.println("Задача 2");
         float a = 27.12F;
         long b = 987_678_965_549L;
         double c =  2.786;
         boolean d = false;
         int e = 569;
         short f = -159;
         char g = 27897;
         byte h = 67;

         //Задача 3
        System.out.println("Задача 3");
        byte ludmPavPupils = 23; //Ученики Людмилы Павловны
        byte annaSergPupils = 27; //Ученики Анны Сергеевны
        byte ekatAndrPupils = 30; //Ученики Екатерины Андреевны
        short amountOfPaper =  480;
        byte paperPerPupil = (byte) (amountOfPaper/ (ludmPavPupils + annaSergPupils + ekatAndrPupils));
        System.out.println("На каждого ученика рассчитано " + paperPerPupil+" листов бумаги.");

        //Задача 4
        System.out.println("Задача 4");
        int perfomancePerMinute = 16/2;
        int perfomancePer20Min = perfomancePerMinute*20;
        System.out.println("За 20 минут машина произвела бутылок " + perfomancePer20Min + " штук");
        int perfomancePerOneDay = perfomancePer20Min*72;
        System.out.println("За сутки машина произвела бутылок " + perfomancePerOneDay + " штук");
        int perfomancePerThreeDays = perfomancePerOneDay*3;
        System.out.println("За 3 дня машина произвела бутылок " + perfomancePerThreeDays + " штук");
        int perfomancePerOneMonth = perfomancePerThreeDays*10;
        System.out.println("За 1 месяц машина произвела бутылок " + perfomancePerOneMonth + " штук");

        //Задача 5
        System.out.println("Задача 5");
        int amountOfPaint = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int amountOfPossiblePaintedClasses = (amountOfPaint/(whitePaintPerClass+brownPaintPerClass));
        int amountOfPurchasedWhiteColor = amountOfPossiblePaintedClasses*whitePaintPerClass;
        int amountOfPurchasedBrownColor = amountOfPossiblePaintedClasses*brownPaintPerClass;
        System.out.println("В школе, где " + amountOfPossiblePaintedClasses + " классов, нужно "+ amountOfPurchasedWhiteColor +" банок белой краски и "+ amountOfPurchasedBrownColor + " банок коричневой краски");

        //Задача 6
        System.out.println("Задача 6");
        int bananaWeightPerOneUnit = 80 ;
        int milkCapacityPerOneUnit = 105;
        int iceCreamWeightPerOneUnit = 100;
        int eggsWeightPerOneUnit = 70;
        double totalWeightInGrams = bananaWeightPerOneUnit*5 + milkCapacityPerOneUnit*2 + iceCreamWeightPerOneUnit*2 + eggsWeightPerOneUnit*4;
        double totalWeightInKilos = totalWeightInGrams / 1000;
        System.out.println("Вес спорт-завтрака в граммах составляет " + totalWeightInGrams +" грамм" + " или "+ totalWeightInKilos + " килограмм.");

        //Задача 7
        System.out.println("Задача 7");
        int loseWeightPerDayGramsPlan1 = 250;
        int loseWeightPerDayGramsPlan2 = 500;
        int loseWeightPerDayGramsAverage = (loseWeightPerDayGramsPlan1+loseWeightPerDayGramsPlan2)/2;
        System.out.println("Возможная средняя потеря веса в день составляет "+ loseWeightPerDayGramsAverage);
        int amountOfNecessaryLoseWeightGrams = 7*1000;
        System.out.println("Необходимый для потери вес в граммах составляет "+ amountOfNecessaryLoseWeightGrams);
        int firstPlan = amountOfNecessaryLoseWeightGrams/loseWeightPerDayGramsPlan1;
        System.out.println("Похудение по первому плану займет "+ firstPlan + " дней");
        int secondPlan = amountOfNecessaryLoseWeightGrams/loseWeightPerDayGramsPlan2;
        System.out.println("Похудение по второму плану займет "+ secondPlan + " дней");
        int averagePlan = amountOfNecessaryLoseWeightGrams/loseWeightPerDayGramsAverage;
        System.out.println("Похудение по усредненному плану займет "+ averagePlan + " дней");

        //Задача 8
        System.out.println("Задача 8");
        int mashaSalaryPerMonth = 67_760;
        int mashaSalaryPerYear = mashaSalaryPerMonth*12;
        int mashaRaisedSalaryPerMonth = (int) (mashaSalaryPerMonth + 1.1);
        int mashaRaisedSalaryPerYear = mashaRaisedSalaryPerMonth *12;
        System.out.println( "Маша теперь получает "+ mashaRaisedSalaryPerMonth +" рублей. Годовой доход вырос на "+ (mashaRaisedSalaryPerYear - mashaSalaryPerYear) +" рублей");

        int denisSalaryPerMonth = 83_690;
        int denisSalaryPerYear = denisSalaryPerMonth*12;
        int denisRaisedSalaryPerMonth = (int) (denisSalaryPerMonth * 1.1);
        int denisRaisedSalaryPerYear = denisRaisedSalaryPerMonth*12;
        System.out.println( "Денис теперь получает "+ denisRaisedSalaryPerMonth +" рублей. Годовой доход вырос на "+ (denisRaisedSalaryPerYear - denisSalaryPerYear) +" рублей");

        int kristinaSalaryPerMonth = 76_230;
        int kristinaSalaryPerYear = kristinaSalaryPerMonth*12;
        int kristinaRaisedSalaryPerMonth = (int) (kristinaSalaryPerMonth * 1.1);
        int kristinaRaisedSalaryPerYear = kristinaRaisedSalaryPerMonth*12;
        System.out.println( "Кристина теперь получает "+ kristinaRaisedSalaryPerMonth +" рублей. Годовой доход вырос на "+ (kristinaRaisedSalaryPerYear - kristinaSalaryPerYear) +" рублей");

    }
}