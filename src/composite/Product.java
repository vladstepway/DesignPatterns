package composite;

import java.math.BigDecimal;

public class Product implements Item {

    private int productId;
    private String productName;
    private String productMaterial;
    private BigDecimal productCost;
    private String productCurrency;

    public Product() {
    }

    public Product(int productId, String productName, String productMaterial, String productCost, String productCurrency) {
        this.productId = productId;
        this.productName = productName;
        this.productMaterial = productMaterial;
        this.productCost = new BigDecimal(productCost);
        this.productCurrency = productCurrency;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductMaterial() {
        return productMaterial;
    }

    public void setProductMaterial(String productMaterial) {
        this.productMaterial = productMaterial;
    }

    public BigDecimal getProductCost() {
        return productCost;
    }

    public void setProductCost(BigDecimal productCost) {
        this.productCost = productCost;
    }

    public String getProductCurrency() {
        return productCurrency;
    }

    public void setProductCurrency(String productCurrency) {
        this.productCurrency = productCurrency;
    }


    @Override
    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (getProductId() != product.getProductId()) return false;
        if (!getProductName().equals(product.getProductName())) return false;
        if (!getProductMaterial().equals(product.getProductMaterial())) return false;
        if (!getProductCost().equals(product.getProductCost())) return false;
        return getProductCurrency().equals(product.getProductCurrency());
    }

    @Override
    public int hashCode() {
        int result = getProductId();
        result = 31 * result + getProductName().hashCode();
        result = 31 * result + getProductMaterial().hashCode();
        result = 31 * result + getProductCost().hashCode();
        result = 31 * result + getProductCurrency().hashCode();
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Product:\n");
        stringBuilder.append("product id: " + getProductId() + "\n");
        stringBuilder.append("product name: " + getProductName() + "\n");
        stringBuilder.append("product material: " + getProductMaterial() + "\n");
        stringBuilder.append("product cost: " + getProductCost() + "\n");
        stringBuilder.append("product currency: " + getProductCurrency() + "\n");
        return stringBuilder.toString();
    }
}
