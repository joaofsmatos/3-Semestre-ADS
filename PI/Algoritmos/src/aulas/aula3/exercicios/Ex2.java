package aulas.aula3.exercicios;

import java.util.Calendar;

public class Ex2 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get((Calendar.YEAR)));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get((Calendar.DAY_OF_MONTH)));
        System.out.println(calendar.get((Calendar.HOUR)));
        System.out.println(calendar.get((Calendar.HOUR_OF_DAY)));
        System.out.println(calendar.get((Calendar.MINUTE)));
        System.out.println(calendar.get((Calendar.SECOND)));
        calendar.set(Calendar.YEAR, 1990);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        System.out.println(calendar.get((Calendar.YEAR)));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get((Calendar.DAY_OF_MONTH)));
        System.out.println(calendar.get((Calendar.HOUR)));
        System.out.println(calendar.get((Calendar.HOUR_OF_DAY)));
        System.out.println(calendar.get((Calendar.MINUTE)));
        System.out.println(calendar.get((Calendar.SECOND)));
    }

}
