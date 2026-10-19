package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

//    A PhysicalProduct IS-A Product because it is a specialized type of product.
//    A ShoppingCart HAS-A collection of a product because it.contains products.

    private double weightKg;
    private String dimensions;

    // No-argument constructor
    public PhysicalProduct() {
    }

    // Full constructor
    public PhysicalProduct(
            Long id,
            String name,
            double price,
            double weightKg,
            String dimensions) {

        super(id, name, price);

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // Getter for weightKg
    public double getWeightKg() {
        return weightKg;
    }

    // Getter for dimensions
    public String getDimensions() {
        return dimensions;
    }
}