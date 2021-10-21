package tasks.leveltwo.classesfortask;

public class Women {
    private Person owner;

    public Women(Person owner) {
        this.owner = owner;
    }

    public Women() {
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
