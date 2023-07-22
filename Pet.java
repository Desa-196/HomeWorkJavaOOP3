public abstract class Pet {
   
    protected Owner owner;

    public Owner getOwner(){
        return owner;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }

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

    public abstract void greet();
}
