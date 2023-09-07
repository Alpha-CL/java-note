package src.relation.relation_inherit;

public class Test {

    public static void main(String[] args) {

        Car car = new Car();

        /**
         * 因未赋给属性赋值, 则内部会产生空对象, 空对象调用属性则会报错
         *
         * 使用重载
         */

        car.brand = "宝马";
        car.type = "z4";
        car.color = "宝石蓝";
        car.wheel = new Wheel();
        car.wheel.brand = "米其林";
        car.wheel.size = 400;
        car.wheel.color = "武士黑";

        car.showCar();
    }
}