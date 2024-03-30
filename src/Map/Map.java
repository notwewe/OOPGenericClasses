package Map;

import java.util.ArrayList;

public class Map<Key, Value> {
    private ArrayList<Key> keys;
    private ArrayList<Value> values;

    public Map() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(Key key, Value value) {
        boolean found = false;
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) {
                values.set(i, value);
                found = true;
                break;
            }
        }
        if (!found) {
            keys.add(key);
            values.add(value);
        }
    }

    public Value get(Key key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) {
                return values.get(i);
            }
        }
        return null;
    }

    public Value remove(Key key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals(key)) {
                keys.remove(i);
                return values.remove(i);
            }
        }
        return null;
    }
}