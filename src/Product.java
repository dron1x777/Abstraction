public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;
    private int productId;
    private int counter;

    public Product(String name, double price, int quantity) {
        // TODO: инициализировать поля
        // productId генерируется автоматически
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.productId = ++counter;
    }

    // АБСТРАКТНЫЕ МЕТОДЫ — тела нет, наследник ОБЯЗАН реализовать
    // Иначе — ошибка компиляции!
    public abstract double getDiscountedPrice();
    public abstract boolean isExpired();
    public abstract String getStorageConditions();
    public abstract void displayInfo();

    // КОНКРЕТНЫЙ метод — общий для всех, переопределять не нужно
    // Формула: getDiscountedPrice() * quantity
    public double getTotalValue() {
        // TODO: реализовать
        return getDiscountedPrice() * quantity;
    }

    public String getName()  { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
}