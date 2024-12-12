package HomeWorks.hm20;

public class Car {
    private String modelName;
    private int yearOfRelease;
    private String manufacturer;
    private String enginePower;
    private String color;
    private int price;

    public Car(String modelName, int yearOfRelease, String manufacturer, String enginePower, String color, int price) {
        this.modelName = modelName;
        this.yearOfRelease = yearOfRelease;
        this.manufacturer = manufacturer;
        this.enginePower = enginePower;
        this.color = color;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(String enginePower) {
        this.enginePower = enginePower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        if (yearOfRelease > 1925)
            this.yearOfRelease = yearOfRelease;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price > 0)
            this.price = price;
    }

    void dataOfCar(){
        System.out.println("********** Данные автомобиля **********");
        System.out.println("Название модели: " + modelName);
        System.out.println("Год выпуска: " + yearOfRelease);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Мощность двигателя: " + enginePower);
        System.out.println("Цвет машины: " + color);
        System.out.println("Цена: " + price);
        System.out.println("=======================================");
    }

}
