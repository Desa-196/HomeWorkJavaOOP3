public class Cat extends Pet implements Caudate, Jump{
    
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Реализация абстрактного метода представиться 
    @Override
    public void greet(){
        System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s \n", name, age, owner.getName());
    }

    //Реализация метода повилять хвостом интерфейса Caudate(Хвостатый)
    @Override
    public void wagTheTail(){
        System.out.println("Виляет хвостом");
    }
    @Override
    public void jump(){
        System.out.println("Прыжок");
    }

    //Переопределение метода установки возраста
    @Override
    public void setAge(int age){
        if(age <= 25) this.age = age;
        else System.out.println("Ошибка установки возраста. Слишком большой возраст!");
    }

    //Перегрузка метода
    public void setAge(double age){
        age = Math.round(age);
        if(age <= 25) this.age = (int)age;
        else System.out.println("Ошибка установки возраста. Слишком большой возраст!");
    }
    @Override
    public String toString(){
        return String.format("Имя: %s Возраст: %s", name, age);
    }

}