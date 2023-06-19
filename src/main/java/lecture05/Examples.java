package lecture05;

import java.util.*;

public class Examples {
    public static void main(String[] args) {}

    public static void testArrayDeclarationElementInit() {
        String[] carBrands = {"Audi", "Bmw", "Volvo", "Mercedes"};
        int[] evenNumbers = {2, 4, 6, 8, 10};
        double[] degrees = {0, 0.5, 1, 1.5, 2, 2.5};

        System.out.println(carBrands[0]);
        System.out.println(evenNumbers[2]);
        System.out.println(degrees[5]);

        System.out.println(carBrands.length);
        System.out.println(evenNumbers.length);
        System.out.println(degrees.length);
    }

    public static void testArrayDeclaration() {
        String[] cars = new String[3];
        cars[0] = "Volvo";
        cars[1] = "Bmw";
        cars[2] = "Mercedes";
        System.out.println(cars[1]);
    }

    public static void testArrayElementValue() {
        String[] carBrands = {"Audi", "Bmw", "Volvo", "Mercedes"};
        carBrands[1] = "Karuca";
        System.out.println(carBrands[1]);
    }

    public static void testArrayLoop() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    public static void testArrayForEachLoop() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }

    public static void testMultidimensionalArray() {
/*        int[][] arr=new int[3][3];//3 row and 3 column
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;
        arr[2][0]=7;
        arr[2][1]=8;
        arr[2][2]=9;*/

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    public static void testArrayListDeclaration() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
    }

    public static void testArrayListOperations() {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.set(1, "Mercedes");
        cars.remove(2);
        System.out.println(cars);
        System.out.println(cars.get(0) /*Aceess element*/);

        for (String i : cars) {
            System.out.println(i);
        }
        Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }

    }

    public static void testLinkedListInit() {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(0));
    }

    public static void testLinkedListOperations() {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.addFirst("BMW");
        cars.addLast("Ford");
        cars.add(2, "Mazda");

        System.out.println(cars);
        System.out.println(cars.get(1));
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

        cars.remove();
        System.out.println(cars);

        cars.removeFirst();
        System.out.println(cars);

        cars.removeLast();
        System.out.println(cars);

        cars.removeAll(cars);
        System.out.println(cars);
    }

    public static void testQueue() {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(15);

        int numElements = queue.size();

        System.out.println("Queue elements: " + queue);

        for (int i = 0; i < numElements; i++) {
            System.out.println("Removed element: " + queue.poll());
        }
    }

    public static void testStack() {
        Stack<String> elements = new Stack<>();

        elements.push("Test1");
        elements.push("Test2");
        elements.push("Test3");
        elements.push("Test4");
        System.out.println("Stack elements: " + elements);

        System.out.println("Element removed: " + elements.pop());
        System.out.println("Stack elements: " + elements);


        elements.push("Test5");
        System.out.println("Stack elements: " + elements);
    }

    public static void testHashSetIterator() {
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Two");
        set.add("Two");
        set.add("Two");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println(set.size());

    }

    public static void testHashSetForEach() {
        HashSet<String> set = new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Two");
        set.add("Two");
        set.add("Two");
        for (String i : set) {
            System.out.println(i);
        }
        System.out.println(set.size());
    }

    public static void testHashSetOperations() {
        HashSet<String> set = new HashSet<>();
        set.add("Niki");
        set.add("Ivan");
        set.add("Georgi");
        set.add("Stoyan");
        System.out.println("An initial list of elements: " + set);
        set.remove("Ivan");
        System.out.println("After invoking remove(object) method: " + set);
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Ekaterina");
        set1.add("Maya");
        set.addAll(set1);
        System.out.println("Updated List: " + set);
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: " + set);
        set.removeIf(str -> str.contains("Nik"));
        System.out.println("After invoking removeIf() method: " + set);
        set.clear();
        System.out.println("After invoking clear() method: " + set);
    }

    public static void testHashMapEntrySet() {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static void testHashMapKeySet() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Mango");
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        for (Integer i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }
    }

    public static void testHashMapOperations() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(100, "Ivan");
        hm.put(101, "Georgi");
        hm.put(102, "Stoyan");
        System.out.println("Initial list of elements:");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Updated list of elements:");
        hm.replace(102, "Miroslav");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Updated list of elements:");
        hm.replace(101, "Georgi", "Anton");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        System.out.println("Updated list of elements:");
        hm.replaceAll((k, v) -> "Asen");
        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}