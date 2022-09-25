package ua.com.hillel.kravchenko.lesson2;
/*
2. Создайте класс с 3 параметрами final. Создайте в нем конструктор по-умолчанию и конструктор со всеми параметрами.
Создайте для всех полей getter и setter.

ps: Задание с подвохом. Если что-то заметили, закомментируйте эту часть кода и напишите комментарий.
*/
public class SecondTask {

    final char firstFinalVar;
    final int secondFinalVar;
    final double thirdFinalVar;

    public SecondTask () {
        this.firstFinalVar = 0;
        this.secondFinalVar = 0;
        this.thirdFinalVar = 0;

    }


    public SecondTask (final char firstFinalVar, final int secondFinalVar, final double thirdFinalVar) {

        this.firstFinalVar = firstFinalVar;
        this.secondFinalVar = secondFinalVar;
        this.thirdFinalVar = thirdFinalVar;
    }

//Касательно "подвоха", то тут наверное имелось ввиду то, что переменные с модификатором final, а следовательно
//мы не можем сделать для них "сеттеры". Ведь мы не можем перезаписать финальную переменную.

    public char getFirstFinalVar() {
        return firstFinalVar;
    }


    public int getSecondFinalVar() {
        return secondFinalVar;
    }


    public double getThirdFinalVar() {
        return thirdFinalVar;
    }

}
