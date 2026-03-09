package bank.generics;

import java.util.ArrayList;
import java.util.List;

public class DataStore<T> {

    private List<T> data = new ArrayList<>();

    public void add(T value) {
        data.add(value);
    }

    public List<T> getAll() {
        return data;
    }
}