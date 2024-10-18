package inClass;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ThreadEx {



    public static void main(String[] args){
        // Thread th = new Thread(new Runnable(){
        //     public void run(){
        //         for(int i = 0; i < 10; i++){
        //             System.out.println(Thread.currentThread().getName() + "->" + i);
        //         }
        //     }
        
        // }
        // );
        // th.start();

        // myImplementation m1 = new myImplementation();
        // myImplementation m2 = new myImplementation();
        // myImplementation m3 = new myImplementation();


        // //execute tasks using 1 single thread pool;
        // ExecutorService es = Executors.newSingleThreadExecutor();
        // es.execute(m1);
        // es.execute(m2);
        // es.execute(m3);
        // es.shutdown();

        // //execute tasks using multiple thread pools;
        // ExecutorService es1 = Executors.newFixedThreadPool(3);
        // es1.execute(m1);
        // es1.execute(m2);
        // es1.execute(m3);
        // es1.shutdown();


        List<Product> products = new ArrayList<Product>();
        products.add(new Product(1L, "iwatch", "Apple watch", "watch"));
        products.add(new Product(2L, "Apple iPad", "Apple tablet", "computer"));
        products.add(new Product(3L, "Apple book", "book", "paperbook"));
        products.add(new Product(4L, "Apple iPhone", "iPhone", "phone"));
        products.add(new Product(5L, "Apple umbrella", "umbrella", "umbrella"));

        products.forEach((p) -> {
            System.out.println(p.toString());
        });

        // products.forEach(Product::toString);

        //only retrieve products with category mobile
        //using stream and lambda functions
        List<Product> filteredProducts = new ArrayList<>();
        filteredProducts = products
            .stream()
            .filter(p -> p.getCategory().equals("phone"))
            .collect(Collectors.toList());

        filteredProducts.forEach(Product::print);


        List<Person> person = new ArrayList<>();
        LocalDate ld = LocalDate.of(1996, 9, 20);
        Date currentDate = Date.from(ld.atStartOfDay(ZoneId.systemDefault()).toInstant());


        person.add(new Person(1L, "Samuel", "Phuar", 420, currentDate));
        person.add(new Person(2L, "Greg", "Flower", 4200.0, currentDate));
        person.add(new Person(3L, "Tom", "Bob", 42000.0, currentDate));
        person.add(new Person(4L, "Wang", "Justin", 420000.0, currentDate));
        person.add(new Person(5L, "Shiv", "Brad", 4200000.0, currentDate));

        Comparator<Person> compare = Comparator.comparing(p -> p.getFirstName());
        person.sort(compare);
        person.forEach(p -> {
            System.out.println(p.toString());
        });

        Comparator<Person> compareMultiple = Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName);
        person.sort(compareMultiple);
        person.forEach(p -> System.out.println(p.toString())
        );



        InterfaceExample<Integer> addOperation = (a, b) -> {
            return a + b;
        };

        InterfaceExample<Integer> multiplyOperation = (a, b) -> {
            return a * b;
        };

        System.out.println("addOpeartion " + addOperation.process(3, 2));

        System.out.println("multiplyOpeartion " + multiplyOperation.process(3, 2));
    }
}
