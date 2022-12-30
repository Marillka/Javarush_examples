package solid.single_responsibility.good;

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
}

class EntityRepository {
    public void insert(Entity entity) {};
    public void delete() {};
    public void update() {};
}
