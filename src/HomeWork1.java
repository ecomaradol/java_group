public class HomeWork1 {

    public static void main(String[] args) {
       /* Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения
        переменным на ваш выбор и вывести следующие строки:
        a == b - если переменные равны
        a < b - если переменная a меньше b
        a > b - если переменная b меньше a */
        int a = 30;
        int b = 30;

        int c = 30;
        int d = 40;
        int z = a + b;

        if (a == b) {
            System.out.println("a = b");
        } else if (a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");
        }
        /*Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения
         переменным на ваш выбор и вывести следующие строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная
        */
        if (z % 2 != 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
        /*Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор
        и вывести следующие строки:
        больше 10 - если переменная больше 10
        меньше 100 - если переменная меньше 100
        результат деления на 2 больше 20 - если это соответствует истине
        значение переменной между 5 и 40 включительно - если это правда
        значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
        */
        int q = 41;
        if (q > 10) {
            System.out.println ("больше 10");
        } else if (q < 100)
            System.out.println ("меньше 100");

        if (q / 2.0 > 20) {
            System.out.println ("результат деления на 2 больше 20");
        }

        if ((q>=5) && (q <= 40)) {
            System.out.println ("значение переменной между 5 и 40 включительно");
        } else
            System.out.println("значение переменной меньше 5 или больше 40");


       //Необходимо вывести числа от 0 до 15
        for (int i = 0; i <= 15; i++ )
        {
            System.out.println(i);
        }
        /* Необходимо вывести все положительные степени числа 5 которые меньше 10000
        (результат возведения в степень меньше 10000).
         */
        for (int g = 5; g < 10000 ; g = g * 5){
            System.out.println(g);
        }
        /*Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        Реализовать 2 варианта:
        -использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        -без использования конструкции if (шаг цикла на ваше усмотрение).
        */
        System.out.println("-----");
        //int k = 40;

        for (int k = 40; k <=60; k =k + 1) {
            if (k % 4 == 0) {
                System.out.println(k);
            }
        }
        System.out.println("-------");
        for (int p = 40; p <= 60; p = p +4) {
            System.out.println(p);
        }

    }

}
