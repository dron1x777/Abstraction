public class WarehouseManager {

    // Рассчитывает общую стоимость всех товаров с учетом скидок
    // ПОЛИМОРФИЗМ: автоматически вызовет правильный getDiscountedPrice()
    // у каждого наследника свой!
    public static double calculateTotalValue(Product[] products) {
        // TODO: пройти по массиву
        // TODO: для каждого товара вызвать getTotalValue()
        // TODO: суммировать и вернуть результат
        double total = 0;
        for( int i = 0; i < products.length; i++ ) {
            total += products[i].getTotalValue();
        }
        return total;
    }

    // Находит все просроченные товары
    // ПОЛИМОРФИЗМ: вызовет isExpired() для каждого товара
    // у FoodProduct — проверяет дату, у остальных — всегда false
    public static Product[] findExpiredProducts(Product[] products) {
        // TODO: первый проход — посчитать количество просроченных
        // TODO: создать массив нужного размера
        // TODO: второй проход — заполнить массив просроченными товарами
        int count = 0;
        for( int i = 0; i < products.length; i++ ) {
            if(products[i].isExpired() == true) {
                count++;
            }
        }
        Product[] expiredProducts = new Product[count];
        for( int i = 0; i < products.length; i++ ) {
            if( products[i].isExpired() ) {
                expiredProducts[i] = products[i];
            }
        }
        return products;
    }

    // Выводит информацию обо всех товарах
    // ПОЛИМОРФИЗМ: каждый тип выведет свою информацию через displayInfo()
    public static void displayAllProducts(Product[] products) {
        // TODO: пройти по массиву
        // TODO: для каждого товара вызвать displayInfo()
        // TODO: вывести разделитель "---" между товарами
        for( int i = 0; i < products.length; i++ ) {
            products[i].displayInfo();
            System.out.println("--------------------------------------------");
        }
    }

    // Считает общую экономию от всех скидок
    public static double calculateTotalDiscount(Product[] products) {
        // TODO: для каждого товара:
        // TODO:   originalPrice = getPrice() * getQuantity()
        // TODO:   discountedPrice = getTotalValue()
        // TODO:   экономия = originalPrice - discountedPrice
        // TODO: суммировать всю экономию и вернуть
        double total = 0;
        for( int i = 0; i < products.length; i++ ) {
            double price = products[i].getPrice() * products[i].getQuantity();
            double discountedPrice = products[i].getTotalValue();
            total += price - discountedPrice;
        }
        return total;
    }

    // Выводит условия хранения для каждого товара
    // ПОЛИМОРФИЗМ: у каждого наследника своя реализация getStorageConditions()
    public static void printStorageRequirements(Product[] products) {
        // TODO: для каждого товара вывести:
        // TODO: getName() + ": " + getStorageConditions()
        for( int i = 0; i < products.length; i++ ) {
            System.out.println(products[i].getName() + ": " + products[i].getStorageConditions());
        }
    }

    // Находит самый дорогой товар (по цене со скидкой)
    public static Product findMostExpensive(Product[] products) {
        // TODO: найти товар с максимальным getDiscountedPrice()
        // Подсказка: заведите переменную Product most = products[0]
        // и сравнивайте в цикле
        int max = 0;
        for( int i = 0; i < products.length; i++ ) {
            if( products[i].getDiscountedPrice() > max ) {
                max = products[i].getQuantity();
            }
        }
        System.out.println("Most Expensive Product: " + max);
        return null;
    }

    // Находит все товары определённого типа
    // INSTANCEOF: проверяет, является ли объект экземпляром нужного класса
    public static Product[] findByType(Product[] products, Class<?> type) {
        // TODO: первый проход — посчитать сколько товаров нужного типа
        //       Подсказка: type.isInstance(products[i])
        // TODO: создать массив нужного размера
        // TODO: второй проход — заполнить массив
        int count = 0;
        for( int i = 0; i < products.length; i++ ) {
            if (type.isInstance(products[i])) {
                count++;
            }
        }
        Product[] products1 = new Product[count];
        for( int i = 0; i < products.length; i++ ) {
            if( type.isInstance(products[i]) ) {
                products1[i] = products[i];
            }
        }
        return products1;
    }

    // Считает среднюю скидку по всему складу в процентах
    public static double calculateAverageDiscount(Product[] products) {
        // TODO: для каждого товара посчитать скидку в процентах:
        // TODO:   discount = (getPrice() - getDiscountedPrice()) / getPrice() * 100
        // TODO: вернуть среднее значение по всем товарам
        double total = 0;
        for( int i = 0; i < products.length; i++ ) {
            double discount = (products[i].getPrice() - products[i].getDiscountedPrice()) / products[i].getPrice() * 100;
            total += discount;
        }

        return total/products.length;
    }
}