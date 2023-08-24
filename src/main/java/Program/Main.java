package Program;

public class Main {
    public static void main(String[] args) {

        HashTable hashTable = new HashTable<>();
        hashTable.add(1,5);
        hashTable.add(5,2);

        System.out.println(hashTable.find(1));
    }
}