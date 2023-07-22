import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5);
        cat.setAge(35); //Выведет на консоль ошибку: Слишком большой возраст так как метод базового абстрактного класса переопределен
        cat.setAge(3.5); //Вызовется перегруженный метод для типа double
        Owner owner = new Owner("Николай");
        cat.setOwner(owner);
        cat.greet();
        cat.wagTheTail();

        Cat cat2 = new Cat("Тефтель", 10);
        Cat cat3 = new Cat("Картошка", 11);
        Cat cat4 = new Cat("Мурзик", 2);
        Cat cat5 = new Cat("Соня", 6);
        Cat cat6 = new Cat("Зефир", 15);

        List<Pet> petList = Arrays.asList(cat, cat2, cat3, cat4, cat5, cat6);

        //Передаем компаратор реализованный в лямбда выражении для сортировки котов по возрасту
        petList.sort((x, y) -> x.getAge() - y.getAge());

        System.out.println(petList);

    }

}
