class Pet {

    public Pet(String name, int age, String owner, String types) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.types = types;
    }

    protected String name;
    protected int age;
    protected String owner;
    protected String types;
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    public String getTypes() {
        return types;
    }


    @Override
    public String toString() {
        return name +
                "the types"+ types;
    }
    public String speak() {
        return "I am a" + types + "and I say";
    }
}

class Domestic extends Pet {
    public Domestic(String name, int age, String owner, String types) {
        super(name, age, owner, types);
    }


}





public class Multilevel {
}
