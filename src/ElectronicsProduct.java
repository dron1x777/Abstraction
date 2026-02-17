public class ElectronicsProduct extends Product {
    private int warrantyMonths;
    private String brand;

    public ElectronicsProduct(String name, double price, int quantity,
                              int warrantyMonths, String brand) {
        // TODO: вызвать конструктор родителя
        // TODO: инициализировать свои поля
        super(name, price, quantity);
        this.warrantyMonths = warrantyMonths;
        this.brand = brand;
    }

    // Электроника не портится — реализация уже дана, объяснить почему именно так
    @Override
    public boolean isExpired() {
        System.out.println("Электроника не портится");
        return false;
    }

    // РЕАЛИЗОВАТЬ: скидка 10% если quantity > 5
    @Override
    public double getDiscountedPrice() {
        // TODO: если quantity > 5, вернуть price * 0.9
        // иначе вернуть обычную цену
        if (quantity > 5) {
            return price * 0.9;
        }
        return price;
    }

    // РЕАЛИЗОВАТЬ: особые условия хранения
    @Override
    public String getStorageConditions() {
        // TODO: вернуть "Сухое помещение, температура 15-25°C"
        return "Сухое помещение, температура 15-25°C";
    }

    // РЕАЛИЗОВАТЬ: вывести инфо о товаре + бренд и гарантия
    @Override
    public void displayInfo() {
        // TODO: вывести название, цену со скидкой, количество
        // TODO: дополнительно вывести бренд и гарантию
        System.out.println("name: " + name + ", price: " + getDiscountedPrice() + ", quantity: " + quantity);
        System.out.println("brand: " + brand+ ", warrantyMonths: " + warrantyMonths);
    }

    public int getWarrantyMonths() { return warrantyMonths; }
}
