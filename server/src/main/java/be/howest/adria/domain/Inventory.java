package be.howest.adria.domain;

import java.util.Objects;
import java.util.UUID;

public class Inventory {
    private UUID inventoryId;
    private UUID productId;
    private int quantityAvailable;
    private Address warehouseAddress;

    public Inventory( UUID inventoryId, UUID productId, int quantityAvailable, Address warehouseAddress ) {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.quantityAvailable = quantityAvailable;
        this.warehouseAddress = warehouseAddress;
    }

    public UUID getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId( UUID inventoryId ) {
        this.inventoryId = inventoryId;
    }

    public UUID getProductId() {
        return productId;
    }

    public void setProductId( UUID productId ) {
        this.productId = productId;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable( int quantityAvailable ) {
        this.quantityAvailable = quantityAvailable;
    }

    public Address getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress( Address warehouseAddress ) {
        this.warehouseAddress = warehouseAddress;
    }

    @Override
    public boolean equals( Object o ) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Inventory inventory = ( Inventory ) o;
        return inventoryId == inventory.inventoryId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inventoryId);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "inventoryId=" + inventoryId +
                ", productId=" + productId +
                ", quantityAvailable=" + quantityAvailable +
                ", warehouseAddress=" + warehouseAddress +
                '}';
    }
}
