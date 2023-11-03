package src.old.relations.Inherit;

public class Car {

    public String brand;        // 品牌
    public String type;         // 类型
    public String color;        // 颜色

    public Wheel wheel;         // 车轮

    public void showCar() {     // 展示车的各种属性

        System.out.println("这是一辆" + brand + "牌" + type + "型号," + color + "的小汽车");

        System.out.println("车上搭载着" + wheel.brand + "牌的" + wheel.size + "尺寸" + wheel.color + "颜色的车轮");
        wheel.turn();
    }
}