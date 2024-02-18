package java_12_02_24;

public class Product {
    private String name;
    private double price;

    public void saveToDatabase() {
        // Сохранение товара в базу данных
    }
    
    public void generateInvoice() {
        // Генерация счета для товара
    }
    

    public void sendEmailConfirmation() {
        // Отправка электронного письма с подтверждением
    }
}


class Product2 {
    private String name;
    private double price;


    public Product2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void saveToDatabase() {
        // Сохранение товара в базу данных
    }

    public void generateInvoice() {
        // Генерация счета для товара
    }


    public void sendEmailConfirmation() {
        // Отправка электронного письма с подтверждением
    }
}