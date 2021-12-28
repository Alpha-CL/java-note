package relation_rely;

public class Pig {

    public String name;
    public int weight = 20;

    // 构造方法
    public Pig() {
    }
    // 重构构造方法
    public Pig(String name) {
        this.name = name;
    }

    // 描述小猪被杀了
    public void beKilled () {
        System.out.println(this.name + "被杀了, 好惨啊～");
    }

    /**
     * 猪长肉
     *
     *      - 每个月长上一个月的两倍
     *      - 返回最终体重
     */
    public void growUp(int month) {
        for(int i = 0; i < month; i++) {
            this.weight *= 2;
        }
    }

    public int getWeight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }
}
