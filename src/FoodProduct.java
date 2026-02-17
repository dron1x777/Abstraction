import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FoodProduct extends Product {
    private LocalDate expirationDate;
    private boolean requiresRefrigeration;
    // true = нужен холодильник (молоко, мясо)
    // false = не нужен (хлеб, крупы)

    public FoodProduct(String name, double price, int quantity,
                       LocalDate expirationDate, boolean requiresRefrigeration) {
        // TODO: вызвать конструктор родителя
        // TODO: инициализировать свои поля
        super(name, price, quantity);
        this.expirationDate = expirationDate;
        this.requiresRefrigeration = requiresRefrigeration;
    }

    // РЕАЛИЗОВАТЬ: скидка 50% если срок годности истекает скоро
    @Override
    public double getDiscountedPrice() {
        // TODO: если isExpiringSoon() == true, вернуть price * 0.5
        // иначе обычную цену
        if (isExpiringSoon()) {
            return price * 0.5;
        }
        return price;
    }

    // РЕАЛИЗОВАТЬ: проверка срока годности
    @Override
    public boolean isExpired() {
        // TODO: сравнить expirationDate с текущей датой
        // если expirationDate < LocalDate.now() вернуть true
        if (expirationDate < LocalDate.now()) {
            return true;
        }
        return false;
    }
    expirationDate.isBefore(LocalDate.now())

    // РЕАЛИЗОВАТЬ: условия хранения зависят от requiresRefrigeration
    @Override
    public String getStorageConditions() {
        // TODO: если requiresRefrigeration == true
        //       вернуть "Хранить в холодильнике при 0-4°C"
        //       иначе "Хранить в сухом прохладном месте"
        if (requiresRefrigeration) {
            return "Хранить в холодильнике при 0-4°C";
        }
        return "Хранить в сухом прохладном месте";
    }

    // РЕАЛИЗОВАТЬ: вывести инфо + предупреждение если просрочено
    @Override
    public void displayInfo() {
        // TODO: вывести название, цену со скидкой, количество
        // TODO: вывести срок годности и требования к холодильнику
        // TODO: если isExpired() == true, вывести "⚠ ПРОСРОЧЕНО!"
        System.out.println("name: " + name);
        System.out.println("price: " + getPrice());
        System.out.println("quantity: " + getQuantity());
        System.out.println("expirationDate: " + expirationDate);
        System.out.println("requiresRefrigeration: " + requiresRefrigeration);
        if (isExpiringSoon()) {
            System.out.println("⚠ ПРОСРОЧЕНО!");
        }
    }

    // Вспомогательный метод — реализовать самостоятельно
    private boolean isExpiringSoon() {
        // TODO: вернуть true если до expirationDate осталось меньше 7 дней
        // Подсказка: используйте ChronoUnit.DAYS.between(LocalDate.now(), expirationDate)
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), expirationDate);
        if (daysLeft >= 0 && daysLeft <= 7) {
            return true;
        }
        return false;
    }
}
