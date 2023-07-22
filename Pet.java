import java.util.HashMap;

public abstract class Pet {
   
    protected Owner owner;

    public Owner getOwner(){
        return owner;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
    //Будет содержать список обученных команд
    protected HashMap<String, Command> listCommand = new HashMap<>();
    
    protected String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    protected int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    //Выполнит указанную команду
    public void runCommand(String command){
        listCommand.get(command).run();
    }
    //Обучить команде
    public void teachCommand(String name_command, Command command){
        listCommand.put(name_command, command);
    }

    public abstract void greet();
}
