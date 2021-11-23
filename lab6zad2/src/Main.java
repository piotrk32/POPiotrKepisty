public class Main {

    public static void main(String[] args)
    {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        IntegerSet set3 = new IntegerSet();
        set1.insertElement(10);
        set1.insertElement(15);
        set1.insertElement(20);
        set1.insertElement(30);
        System.out.println(set1);

        set2.insertElement(10);
        set2.insertElement(14);
        set2.insertElement(25);
        set2.insertElement(30);
        System.out.println(set2);

        set3.insertElement(10);
        set3.insertElement(15);
        set3.insertElement(20);
        set3.insertElement(35);
        System.out.println(set3);
        System.out.print("PO ZMIANACH"+"\n");

        set2.deleteElement(30);
        set2.deleteElement(35);
        System.out.println(set2);

        System.out.println(IntegerSet.union(set1, set2));

        System.out.println((IntegerSet.intersection(set1, set2)));

        System.out.println(set1.equals(set3));
        System.out.println(set1.equals(set2));
        System.out.print(set2.toString());



    }
}
