class HashEntry {

    int key;
    int value;

    HashEntry(int key, int value) {
	this.key = key;
	this.value = value;
    }
    
    
}

public class HashMap {

    HashEntry[] table;
    final static int TABLE_SIZE = 128;
    
    HashMap() {
	table = new HashEntry[TABLE_SIZE];

	for(int i = 0; i < TABLE_SIZE; i++) {
	    table[i] = null;
	}
    }

    public int get(int key) {
	int hash = (key % TABLE_SIZE);

	while(table[hash] != null && table[hash].key != key) {
	    // System.out.println("ok");
	    hash = (hash + 1) % TABLE_SIZE;
	}

	if(table[hash] == null) {
	    return -1;
	} else {
	    return table[hash].value;
	}
    }

    public void put(int key, int value) {
	int hash = (key % TABLE_SIZE);
	while(table[hash] != null && table[hash].key != key) {
    	    // System.out.println("ok2");
	    hash = (hash + 1) % TABLE_SIZE;
	}
        table[hash] = new HashEntry(key, value);
    }

    public static void main(String[] args) {

	HashMap map = new HashMap();
	map.put(1, 1);
	map.put(2, 1);
	map.put(3, 1);
	map.put(4, 1);
	map.put(5, 1);
	map.put(129, 4);

	System.out.println(map.get(129));

	
    }


}	   
