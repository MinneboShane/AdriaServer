package be.howest.adria.domain;

import java.util.Objects;
import java.util.UUID;

public class Product {
    private UUID productId;
    private int name;
    private String description;
    private double price;
    private CategoryType categoryType;
    private double weight;

    public Product( UUID productId, int name, String description, double price, CategoryType categoryType, double weight ) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.categoryType = categoryType;
        this.weight = weight;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId( UUID productId ) {
        this.productId = productId;
    }

    public int getName() {
        return name;
    }

    public void setName( int name ) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice( double price ) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription( String description ) {
        this.description = description;
    }

    public CategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType( CategoryType categoryType ) {
        this.categoryType = categoryType;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight( double weight ) {
        this.weight = weight;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Product product = ( Product ) o;
        return productId == product.productId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(productId);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name=" + name +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", categoryType=" + categoryType +
                ", weight=" + weight +
                '}';
    }
}
