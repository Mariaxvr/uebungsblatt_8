package h2;

public class H2_Main {
    public static void main(String[] args) {

        SimpleList myList = new SimpleList();

        myList.append(12);
        myList.append(45);
        myList.append(66);
        myList.append(12);
        myList.append(45);
        myList.append(60);

        System.out.println("Initiale Liste:");
        myList.printList();

        myList.insertAfter(45, 4);
        System.out.println("Nach insertAfter(45, 4):");
        myList.printList();

        System.out.println("findFirst(45) liefert Knoten mit Wert: " +
                myList.findFirst(45).value);

        myList.delete(45);
        System.out.println("Nach delete(45):");
        myList.printList();
    }
}