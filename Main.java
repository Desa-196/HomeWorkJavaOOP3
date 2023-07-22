public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 5);
        cat.setAge(35); //Выведет на консоль ошибку: Слишком большой возраст так как метод базового абстрактного класса переопределен
        cat.setAge(3.5); //Вызовется перегруженный метод для типа double
        Owner owner = new Owner("Николай");
        cat.setOwner(owner);
        cat.greet();
        cat.wagTheTail();

    }

}
