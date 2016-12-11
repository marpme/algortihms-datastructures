package hashing;

/**
 * Class description ...
 * Included in hashing
 *
 * @author Marvin Piekarek (s0556014)
 * @version 1.0
 * @since 05. Dec 2016
 */
public class HashMap<T> implements IHashable{

    private int m;

    private IProbing probeFunc;

    private HashEntry[] entries;

    public HashMap(int m, IProbing probe) {
        this.m = m;
        this.probeFunc = probe;
        entries = new HashEntry[m];
    }

    @Override
    public int hash(int key, int j) {
        return Math.floorMod(Math.floorMod(key, this.m) - probeFunc.probe(j, 0, 0), m);
    }

    public void add(int key, T data){

        HashEntry<T> a = new HashEntry<>(key, data, false);

        int hashValue = hash(a.key, 0);
        int j = 0;

        while(checkCollision(hashValue, a.key) && j != m){
            hashValue = hash(a.key, j);
            j++;
        }

        entries[hashValue] = a;
    }

    public Object get(int key){

        int hashValue = hash(key, 0);
        int j = 0;

        while(!checkFound(hashValue, key) && j != m){
            hashValue = hash(key, j);
            j++;
        }

        if(j == m) return null;

        return entries[hashValue].data;

    }

    public void remove(int key){
        int hashValue = hash(key, 0);
        int j = 0;

        while(!checkFound(hashValue, key) && j != m){
            hashValue = hash(key, j);
            j++;
        }

        if(j == m) return;

        entries[hashValue].markAsDelete = true;
    }

    private boolean checkFound(int hashValue, int key){
        if(entries[hashValue] == null) return false;
        if(entries[hashValue].key == key) return true;
        return false;
    }

    private boolean checkCollision(int hashValue, int key){
        if (entries[hashValue] == null) return false;
        if (entries[hashValue].key == key && !entries[hashValue].markAsDelete) return true;
        if (entries[hashValue].markAsDelete) return false;

        return true;
    }

    @Override
    public String toString() {

        String out = "";

        for (HashEntry k : entries) {
            out += "       " + k.toString() + "\n";
        }

        return "HashMap{ \n" +
                "   m = " + m +
                ",\n   probeFunc = " + probeFunc.getClass().getSimpleName() +
                ",\n   entries = { \n" + out + "   }" +
                "\n}";
    }

    private class HashEntry<X> {

        int key;

        X data;

        boolean markAsDelete;

        public HashEntry(int key, X data, boolean markAsDelete) {
            this.key = key;
            this.data = data;
            this.markAsDelete = markAsDelete;
        }

        public HashEntry() {
            this.key = 0;
            this.data = null;
            this.markAsDelete = false;
        }

        @Override
        public String toString() {
            return "HashEntry{" +
                    "key=" + key +
                    ", data=" + data +
                    ", markAsDelete=" + markAsDelete +
                    '}';
        }
    }

}