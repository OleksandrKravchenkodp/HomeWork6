package ua.com.hillel.kravchenko.lesson2;
/*
1. Создайте новый класс, у которого должно быть 9 переменных (8 примитивов разного типа + String);
Для каждой переменной напишите getter и setter;
Напишите конструкторы начиная от конструктора по-умолчанию до конструктора с 9 параметрами;
*/
public class FirstTask {

    private byte firstVar;
    private short secondVar;
    private int thirdVar;
    private long fourthVar;
    private float fifthVar;
    private double sixthVar;
    private boolean logicVar;
    private char symbol;
    private String firstString;

    public FirstTask() {

    }

    public FirstTask(byte firstVar) {

        this.firstVar = firstVar;

    }

    public FirstTask(byte firstVar, short secondVar) {

        this.firstVar = firstVar;
        this.secondVar = secondVar;

    }

    public FirstTask(byte firstVar, short secondVar, int thirdVar) {

        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;

    }

    public FirstTask(byte firstVar, short secondVar, int thirdVar, long fourthVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
        this.fourthVar = fourthVar;
    }

    public FirstTask(byte firstVar, short secondVar, int thirdVar, long fourthVar, float fifthVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
        this.fourthVar = fourthVar;
        this.fifthVar = fifthVar;
    }

    public FirstTask(byte firstVar, short secondVar, int thirdVar, long fourthVar, float fifthVar, double sixthVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
        this.fourthVar = fourthVar;
        this.fifthVar = fifthVar;
        this.sixthVar = sixthVar;
    }

    public FirstTask(byte firstVar, short secondVar, int thirdVar, long fourthVar, float fifthVar, double sixthVar,
                     boolean logicVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
        this.fourthVar = fourthVar;
        this.fifthVar = fifthVar;
        this.sixthVar = sixthVar;
        this.logicVar = logicVar;
    }

    public FirstTask(byte firstVar, short secondVar, int thirdVar, long fourthVar, float fifthVar, double sixthVar,
                     boolean logicVar, char symbol) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
        this.fourthVar = fourthVar;
        this.fifthVar = fifthVar;
        this.sixthVar = sixthVar;
        this.logicVar = logicVar;
        this.symbol = symbol;
    }

    public FirstTask(byte firstVar, short secondVar, int thirdVar, long fourthVar, float fifthVar, double sixthVar,
                     boolean logicVar, char symbol, String firstString) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
        this.fourthVar = fourthVar;
        this.fifthVar = fifthVar;
        this.sixthVar = sixthVar;
        this.logicVar = logicVar;
        this.symbol = symbol;
        this.firstString = firstString;
    }

    public byte getFirstVar() {

        return firstVar;

    }

    public void setFirstVar(byte firstVar) {

        this.firstVar = firstVar;

    }

    public short getSecondVar() {

        return secondVar;

    }

    public void setSecondVar(short secondVar) {

        this.secondVar = secondVar;

    }



    public int getThirdVar() {

        return thirdVar;

    }

    public void setThirdVar(int thirdVar) {

        this.thirdVar = thirdVar;

    }

    public long getFourthVar() {

        return fourthVar;

    }

    public void setFourthVar(long fourthVar) {

        this.fourthVar = fourthVar;

    }

    public float getFifthVar() {

        return fifthVar;

    }

    public void setFifthVar(float fifthVar) {

        this.fifthVar = fifthVar;

    }

    public double getSixthVar() {

        return sixthVar;

    }

    public void setSixthVar(double sixthVar) {

        this.sixthVar = sixthVar;

    }

    public boolean isLogicVar() {

        return logicVar;

    }

    public void setLogicVar(boolean logicVar) {

        this.logicVar = logicVar;

    }

    public char getSymbol() {

        return symbol;

    }

    public void setSymbol(char symbol) {

        this.symbol = symbol;

    }

    public String getFirstString() {

        return firstString;

    }

    public void setFirstString(String firstString) {

        this.firstString = firstString;

    }

}
