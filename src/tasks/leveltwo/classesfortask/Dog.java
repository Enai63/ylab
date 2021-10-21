package tasks.leveltwo.classesfortask;

public class Dog {
    private Integer age;
    private String name;
    private Person owner;

    public Dog(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog(Integer age, String name, Person owner) {
        this.age = age;
        this.name = name;
        this.owner = owner;
    }

    public Dog() {
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
}
