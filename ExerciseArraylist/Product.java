package ExerciseArraylist;

public class Product {
   static private int idcurrent = 0;
    private int id;
    private String name;
    public Product(){}

    public Product(String name) {
        this.id = ++idcurrent;
        this.name = name;
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

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
