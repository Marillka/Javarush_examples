package solid.single_responsibility.bad;

public class Entity {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Entity get() {
        return this;
    }

    public void insert(Entity entity) {};
    public void delete() {};
    public void update(){};
}
