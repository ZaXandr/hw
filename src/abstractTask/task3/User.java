package abstractTask.task3;

public class User extends BaseEntity{
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getInfo() {
        return "User: " + name + ", " + super.getInfo();
    }
}
