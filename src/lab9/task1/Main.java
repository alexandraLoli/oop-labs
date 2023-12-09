import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface TransactionPublisher {
    void createTransaction(Person person);
}

interface BalanceObserver {
    void update();
}

interface PaymentStrategy {
    void pay(Integer amount);
}

class Shop implements TransactionPublisher {
    private final Random priceGenerator = new Random(56);
    private final RandomPaymentFactory paymentFactory = new RandomPaymentFactory();
    private final ArrayList<Person> customers = new ArrayList<>();

    public void addCustomers(List<Person> customers) {
        this.customers.addAll(customers);
    }

    public ArrayList<Person> getCustomers() {
        return customers;
    }

    @Override
    public void createTransaction(Person person) {
        // TODO - use price generator bounded to 100!
    }
}

class Person implements BalanceObserver {
    private String IBAN;
    private String cardNumber;
    private String name;
    private String surname;
    private Integer balance;
    private Integer limit;

    // TODO - All args constructor, getters, setters

    @Override
    public void update() {
        // TODO
    }

    public boolean payBy(PaymentStrategy strategy, Integer amount) {
        // TODO
        return true;
    }
}

class CardPayment implements PaymentStrategy {
    private final Person person;

    public CardPayment(Person person) {
        this.person = person;
    }

    @Override
    public void pay(Integer amount) {
        // TODO
    }
}
class VoucherPayment implements PaymentStrategy {
    private final Person person;
    public VoucherPayment(Person person) {
        this.person = person;
    }
    @Override
    public void pay(Integer amount) {
        // TODO
    }
}

class BankAccountPayment implements PaymentStrategy {
    private final Person person;

    public BankAccountPayment(Person person) {
        this.person = person;
    }

    @Override
    public void pay(Integer amount) {
        // TODO
    }
}

class RandomPaymentFactory {
    private enum PaymentType { CARD, IBAN, VOUCHER }
    private static final Random random = new Random(1234565);

    public PaymentStrategy getPaymentMethod(Person person) {
        return switch (PaymentType.values()[random.nextInt(3)]) {
            case CARD -> amount -> {}; // TODO - replace with constructor call
            case IBAN -> amount -> {}; // TODO - replace with constructor call
            case VOUCHER -> amount -> {}; //TODO - replace with constructor call
        };
    }
}


public class Main {

    // DO NOT MODIFY
    private static void test(Person... people) {
        Shop shop = new Shop();
        Random random = new Random(2023);
        shop.addCustomers(List.of(people));

        for (int i = 0; i < 20; i++) {
            int idx = random.nextInt(0,4);
            shop.createTransaction(shop.getCustomers().get(idx));
        }
    }

    public static void main(String[] args) {
//        TODO - uncomment when done for testing
//        Person p1 = new Person("RORNCB221", "523123222", "Gheorghe", "Iliescu", 1234, 287);
//        Person p2 = new Person("RORNCB222", "523123223", "Ion", "Popescu", 823, 150);
//        Person p3 = new Person("RORNCB223", "523123224", "Giani", "Orlando", 99, 480);
//        Person p4 = new Person("RORNCB224", "523123225", "Florin", "Andone", 606, 500);
//        test(p1, p2, p3, p4);
    }
}