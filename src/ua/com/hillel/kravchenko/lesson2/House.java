package ua.com.hillel.kravchenko.lesson2;
/*
3. Создайте класс House. Заполните Ваш новый дом “мебелью”
(подсказка: мебель - это отдельные классы, то есть внутри дома будут параметры = новые классы),
для примера достаточно 2-3 вещи/предмета в доме. У каждой вещи также должно быть пару характеристик.
*/
public class House {

    FurnitureForLivingRoom sofa = new FurnitureForLivingRoom ("Yellow", "Big", 50);

    FurnitureForBedroom bed = new FurnitureForBedroom ();

    public void setBed(FurnitureForBedroom bed) {
        this.bed = bed;
    }
}
