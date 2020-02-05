package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnection());

        System.out.println(getDBConnectionSupplier.get());
    }

    static String getDBConnection() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionSupplier = ()
            -> List.of(
            "jdbc://localhost:5423/users",
            "jdbc://localhost:5423/customers");

}
