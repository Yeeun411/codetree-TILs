import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Reading product name and code for the second product from input
        String productName = scanner.next();
        int productCode = scanner.nextInt();
        
        // Creating the first Product instance with predefined values
        Product codetree = new Product("codetree", 50);
        
        // Creating the second Product instance with values read from input
        Product inputProduct = new Product(productName, productCode);
        
        // Outputting the details of both products
        codetree.printProductDetails();
        inputProduct.printProductDetails();
    }
}

class Product {
    private String name;
    private int code;
    
    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
    
    public void printProductDetails() {
        System.out.println("product " + this.code +" is "+ this.name);
    }
}