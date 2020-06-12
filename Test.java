/**
 * the Test class is used to test the methods of BankQueue
 * @author Cade Lueker 
 */
public class Test {
  public static void main(String[] args) {
    // create items of Person class to enqueue
    Person cade = new Person("cade","lueker");
    Person julia = new Person("julia","lueker");
    Person hideki = new Person("Hideki","the Shiba");
    // create the BankQueue instance
    BankQueue<Person> b = new BankQueue<Person>();
    // enqueue
    b.enqueue(cade);
    b.enqueue(julia);
    b.enqueue(hideki);
    System.out.println(b);
    //dequeue each item one at a time and show it is working
    b.dequeue();
    System.out.println("should have 2 entries: \n"+b);
    b.dequeue();
    System.out.println("should have 1 entry: \n"+b);
    b.dequeue();
    System.out.println("should be empty: \n"+b);
    
    // make new people to add
    Person john = new Person("john","bogo");
    Person james = new Person("james","miller");
    Person sam = new Person("sam","francis");
    Person ben = new Person("ben","francis");
    Person alex = new Person("alex","jaccard");
    Person brandon = new Person("brandon","barton");
    // enqueue them
    b.enqueue(john);
    b.enqueue(james);
    b.enqueue(sam);
    b.enqueue(ben);
    b.enqueue(alex);
    b.enqueue(brandon);
    // show that the quitter method selectively removes items from the queue at beginning, middle, and end
    System.out.println(b.quitter(john));
    System.out.println(b.quitter(brandon));
    System.out.println(b.quitter(sam));
    System.out.println("should tell me hes not there: \n" + b.quitter(sam));
    System.out.println(b.quitter(ben));
    System.out.println(b.quitter(alex));
    System.out.println(b.quitter(james));
    System.out.println("should be empty: \n"+b);
  }
}