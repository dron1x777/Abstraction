public class ClothingProduct extends Product {
    private String size;
    private String season;

    public ClothingProduct(String name, double price, int quantity,
                           String size, String season) {
        // TODO: вызвать конструктор родителя
        // TODO: инициализировать свои поля
        super(name, price, quantity);
        this.size = size;
        this.season = season;
    }

    // Одежда не портится — реализация уже дана, объяснить почему именно так
    @Override
    public boolean isExpired() {
        System.out.println("Одежда не портится");
        return false;
    }

    // РЕАЛИЗОВАТЬ: сезонная распродажа — скидка 30% на одежду не в сезон
    @Override
    public double getDiscountedPrice() {
        // TODO: получить текущий сезон через getCurrentSeason()
        // TODO: если season == "Зима" и текущий == "Лето", скидка 30%
        // TODO: если season == "Лето" и текущий == "Зима", скидка 30%
        // TODO: иначе обычная цена
        if (getCurrentSeason().equalsIgnoreCase("Зима") && season.equalsIgnoreCase("Лето")) {
            price = price - (price * 30 / 100);
            return price;
        } else if (getCurrentSeason().equalsIgnoreCase("Лето") && season.equalsIgnoreCase("Зима")) {
            price = price - (price * 30 / 100);
            return price;
        }
        return price;
    }

    // РЕАЛИЗОВАТЬ: условия хранения одежды
    @Override
    public String getStorageConditions() {
        // TODO: вернуть подходящую строку условий хранения одежды
        return "Держать в темлых местах с средней температурой!";
    }

    // РЕАЛИЗОВАТЬ: вывести инфо + размер и сезон
    @Override
    public void displayInfo() {
        // TODO: вывести название, цену со скидкой, количество
        // TODO: вывести размер и сезон
        System.out.println("name: " + name + " price: " + getDiscountedPrice() + " quantity: " + quantity);
        System.out.println("size: " + size + " season: " + season);
    }

    private String getCurrentSeason() {
        return "Зима"; // упрощение для задания
    }
}
