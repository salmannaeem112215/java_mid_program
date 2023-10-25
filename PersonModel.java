public abstract class PersonModel {
    private int id;
    private String name;

    public PersonModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void details() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public void details(String val) {
        System.out.println(val + " ID: " + id);
        System.out.println(val + " Name: " + name);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
