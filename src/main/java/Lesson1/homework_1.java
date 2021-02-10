package Lesson1;

public class homework_1 {

    public static void main(String[] args){
        System.out.println("Задание №2");
        initVar();
        System.out.println(" ");

        System.out.println("Задание №3");
        System.out.println("  Результат вычисления: " + expressionEvaluation(13,2,22,123));
        System.out.println(" ");

        System.out.println("Задание №4");
            if (valueCheck(5,11) == true){
                 System.out.println("Сумма переменных более 10 и менее 20");
            } else System.out.println("Сумма переменных менее 10 или более 20");
        System.out.println(" ");

        System.out.println("Задание №5");
            if (checkPositive(-87) == true){
              System.out.println("Число положительное");
            } else System.out.println("Число отрицательное");
        System.out.println(" ");

        System.out.println("Задание №6");
            if (checkNegative(-87) == true){
                System.out.println("Число отрицательное");
            } else System.out.println("Число положительное");
        System.out.println(" ");

        System.out.println("Задание №7");
        stringMessage("Александр Евгеньевич");
        System.out.println(" ");

        System.out.println("Задание №8");
        if (definitionLeapYear(2016) == true) {
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");



    }

    private static void initVar() {
        int varInt = 5;
        byte varByte = 122;
        short varShort = 1133;
        long varLong = 523311131;
        float varFloat = (float) 45.321;
        double varDouble = 233.123332322443;
        char varChar = 324;
        boolean varBoolean = true;
        System.out.print("  integer " + varInt);
        System.out.print("  byte " + varByte);
        System.out.print("  short " + varShort);
        System.out.print("  long " + varLong);
        System.out.print("  float " + varFloat);
        System.out.print("  double " + varDouble);
        System.out.print("  char " + varChar);
        System.out.print("  boolean " + varBoolean);
    }

    private static int expressionEvaluation(int varA, int varB, int varC, int varD) {
         return  (int)(varA * (varB + (double)(varC / varD)));
    }

    private static boolean valueCheck(int varA, int varB) {
        return ((varA + varB >= 10) && (varA + varB <=20));
    }

    private static boolean checkPositive(int varA) {
        return varA>=0;
    }

    private static boolean checkNegative(int varA) {
        return varA<0;
    }

    private static void stringMessage(String varA) {
        System.out.println("Привет, " + varA);
    }

    private static boolean definitionLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return  true;
        } else return false;

    }


}
