import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. Создайте массив для хранения товаров
        Product[] warehouse = new Product[15];

        // ПОДСКАЗКА: new Product() — вызовет ошибку компиляции, почему?
        // Product является абстрактным классом — нельзя создать напрямую!

        // 2. Заполните массив разными типами товаров:

        // 5 ElectronicsProduct (разные бренды, гарантии, количества)
        // TODO: warehouse[0] = new ElectronicsProduct(...)
        // TODO: warehouse[1] = new ElectronicsProduct(...)
        // TODO: warehouse[2] = new ElectronicsProduct(...)
        // TODO: warehouse[3] = new ElectronicsProduct(...)
        // TODO: warehouse[4] = new ElectronicsProduct(...)
        warehouse[0] = new ElectronicsProduct("phone", 35000, 1, 24, "iphone");
        warehouse[1] = new ElectronicsProduct("macbook", 75000, 2, 20, "hz");
        warehouse[2] = new ElectronicsProduct("phone", 23456, 4, 50, "samsung");
        warehouse[3] = new ElectronicsProduct("phone", 65435, 2, 43, "rwbte");
        warehouse[4] = new ElectronicsProduct("laptop", 23456, 3, 12, "5frdvf");

        // 5 FoodProduct (разные сроки годности, хотя бы 2 просроченных)
        // TODO: warehouse[5] = new FoodProduct(...)
        // TODO: warehouse[6] = new FoodProduct(...)
        // TODO: warehouse[7] = new FoodProduct(...)
        // TODO: warehouse[8] = new FoodProduct(...)
        // TODO: warehouse[9] = new FoodProduct(...)
        warehouse[5] = new FoodProduct("milk", 120, 2, LocalDate.of(2026, 8,22), true);
        warehouse[6] = new FoodProduct("cookies", 12, 243, LocalDate.of(2025, 8,12), false);
        warehouse[7] = new FoodProduct("chips", 200, 3, LocalDate.of(2026, 4,17), false);
        warehouse[8] = new FoodProduct("fish", 500, 1, LocalDate.of(2024, 3,23), true);
        warehouse[9] = new FoodProduct("carrot", 40, 6, LocalDate.of(2026, 8,28), true);

        // 5 ClothingProduct (разные размеры и сезоны)
        // TODO: warehouse[10] = new ClothingProduct(...)
        // TODO: warehouse[11] = new ClothingProduct(...)
        // TODO: warehouse[12] = new ClothingProduct(...)
        // TODO: warehouse[13] = new ClothingProduct(...)
        // TODO: warehouse[14] = new ClothingProduct(...)
        warehouse[10] = new ClothingProduct("t shirt", 890, 1, "M","Лето");
        warehouse[11] = new ClothingProduct("shirt", 890, 1, "XL","Зима");
        warehouse[12] = new ClothingProduct("jacket", 890, 1, "S","Осень");
        warehouse[13] = new ClothingProduct("pant", 890, 1, "XLLL","Весна");
        warehouse[14] = new ClothingProduct("socks", 890, 3, "M","Лето");

        // 3. Выведите информацию обо ВСЕХ товарах
        // ПОЛИМОРФИЗМ: один метод — разный вывод для каждого типа!
        // TODO: вызвать WarehouseManager.displayAllProducts(warehouse)
        WarehouseManager.displayAllProducts(warehouse);

        // 4. Посчитайте и выведите общую стоимость склада с учетом скидок
        // TODO: вызвать WarehouseManager.calculateTotalValue(warehouse)
        // TODO: вывести результат
        System.out.println(WarehouseManager.calculateTotalValue(warehouse));

        // 5. Найдите и выведите все просроченные товары
        // TODO: вызвать WarehouseManager.findExpiredProducts(warehouse)
        // TODO: пройти по результату и вывести название каждого товара
        Product[] expiredProducts =
                WarehouseManager.findExpiredProducts(warehouse);

        for (Product p : expiredProducts) {
            System.out.println(p.getName());
        }

        // 6. Посчитайте и выведите общую экономию от всех скидок
        // TODO: вызвать WarehouseManager.calculateTotalDiscount(warehouse)
        // TODO: вывести результат
        System.out.println(WarehouseManager.calculateTotalDiscount(warehouse));

        // 7. Выведите условия хранения для всех товаров
        // TODO: вызвать WarehouseManager.printStorageRequirements(warehouse)
        WarehouseManager.printStorageRequirements(warehouse);

        // 8. Найдите и выведите самый дорогой товар
        // TODO: вызвать WarehouseManager.findMostExpensive(warehouse)
        // TODO: вызвать displayInfo() у найденного товара
        Product mostExpensiveProducts = WarehouseManager.findMostExpensive(warehouse);
        for (Product p : warehouse) {
            if (p.getPrice() == mostExpensiveProducts.getPrice()) {
                System.out.println(p.getName());
            }
        }

        // 9. Найдите товары определённого типа через instanceof
        // TODO: вызвать WarehouseManager.findByType(warehouse, ElectronicsProduct.class)
        // TODO: вызвать WarehouseManager.findByType(warehouse, FoodProduct.class)
        // TODO: вызвать WarehouseManager.findByType(warehouse, ClothingProduct.class)
        // TODO: вывести количество найденных товаров каждого типа
        System.out.println(Arrays.toString(WarehouseManager.findByType(warehouse, ElectronicsProduct.class)));
        System.out.println(Arrays.toString(WarehouseManager.findByType(warehouse, FoodProduct.class)));
        System.out.println(Arrays.toString(WarehouseManager.findByType(warehouse, ClothingProduct.class)));

        // 10. Посчитайте и выведите среднюю скидку по складу
        // TODO: вызвать WarehouseManager.calculateAverageDiscount(warehouse)
        // TODO: вывести результат в процентах
        System.out.println(WarehouseManager.calculateAverageDiscount(warehouse));

    }
}