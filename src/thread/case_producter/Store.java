package thread.case_producter;

import java.util.ArrayList;

public class Store {

    private ArrayList<String>  list = new ArrayList<String>();

    public void add() {
        if(list.size() < 20) {
            list.add("a");
        } else {
            return;
        }
    }

    public String get() {
        return list.remove(0);
    }
}
