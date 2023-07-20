package ExerciseArraylist;

import TestMap.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private static List<Product> list;

    public ProductManager() {
        list = new ArrayList<>();
    }

    public static void main(String[] args) {
        ProductManager listProduct = new ProductManager();
        listProduct.add(new Product("Banh my"));
        listProduct.add(new Product("Banh canh"));
        listProduct.add(new Product("Banh chuoi"));
        listProduct.add(new Product("Banh bong"));

        listProduct.displayAll();;

    }

    public void add(Product product) {
        list.add(product);
    }

    public void update(int id, Product product) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                list.set(i, product);
                break;
            }
        }
    }

    public void delete(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()) {
                list.remove(i);
                break;
            }
        }
    }

    public void displayAll() {
        for (Product item : list) {
            System.out.printf("ID la %d va Name la %s \n", item.getId(), item.getName());
        }
    }
    public void search(int id) {
        for (Product item: list) {
            if (id == item.getId()) {
                System.out.printf("Product found : ID la %d va Name is %s \n",item.getId(),item.getName());
            }
        }
    }
    public void arrange() {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product product, Product product1) {
                return Integer.compare(product.getId(),product1.getId());
            }
        });
    }
}
