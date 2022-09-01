import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//возможность считывать данные с клавиатуры
        System.out.print("Введите ваше имя: ");
        String userName = in.nextLine();//считывание данных с клавиатуры и запись их в переменную
        System.out.println("Welcome "+userName+"!");

        String myFirstHomeWork;//обьявление переменной
        final int NUM = 2022;
        String word = " Android";
        myFirstHomeWork = NUM + word;//присваивание значения переменной myFirstHomeWork
        System.out.println(myFirstHomeWork);
        if (NUM<0){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM>0) {
            System.out.println("Вы сохранили положительное число");
        }else System.out.println("Вы сохранили ноль");
    }
}