package tasks.leveltwo.classesfortask;

public class Cat {
    private Integer age;
    private String name;
    private Person owner;
    private Rectangle territory;

    public Cat(Integer age, String name, Person owner, Rectangle territory) {
        this.age = age;
        this.name = name;
        this.owner = owner;
        this.territory = territory;
    }

    public Cat(Integer age, String name, Person owner) {
        this.age = age;
        this.name = name;
        this.owner = owner;
    }

    public Cat(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Rectangle getTerritory() {
        return territory;
    }

    public void setTerritory(Rectangle territory) {
        this.territory = territory;
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", territory=" + territory +
                '}';
    }
}
