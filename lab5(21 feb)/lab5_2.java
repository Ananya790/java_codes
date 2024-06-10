// Interface for Personal Loan
interface PersonalLoan {
    float find_Simple_Interest(float principal, int year);
}

// Bank1 class implementing PersonalLoan interface
class Bank1 implements PersonalLoan {
    static float interest_rate = 0.10f;

    Bank1() {
        System.out.println("Bank1 Constructor called");
    }

    Bank1(float principal, int year) {
        this();
        float interest = find_Simple_Interest(principal, year);
        System.out.println("Simple Interest for Bank1: " + interest);
    }

    @Override
    public float find_Simple_Interest(float principal, int year) {
        return principal * interest_rate * year;
    }
}

// Bank2 class implementing PersonalLoan interface
class Bank2 implements PersonalLoan {
    static float interest_rate = 0.15f;

    Bank2() {
        System.out.println("Bank2 Constructor called");
    }

    Bank2(float principal, int year) {
        this();
        float interest = find_Simple_Interest(principal, year);
        System.out.println("Simple Interest for Bank2: " + interest);
    }

    @Override
    public float find_Simple_Interest(float principal, int year) {
        return principal * interest_rate * year;
    }
}

// Main class to demonstrate run time polymorphism
public class lab5_2 {
    public static void main(String[] args) {
        PersonalLoan bank1Loan = new Bank1(10000, 2);
        PersonalLoan bank2Loan = new Bank2(10000, 2);
        
        // Run-time polymorphism example
        bank1Loan.find_Simple_Interest(10000, 2); // Calls Bank1's method
        bank2Loan.find_Simple_Interest(10000, 2); // Calls Bank2's method
    }
}