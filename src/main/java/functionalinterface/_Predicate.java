package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("0700000000"));
        System.out.println(isPhoneNumberValid("09009877300"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09009877300"));

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("09009877300")
        );

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000")
        );

        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003")
        );

    }

    static boolean isPhoneNumberValid(String numberPhone) {
        return numberPhone.startsWith("07") && numberPhone.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = numberPhone -> numberPhone.startsWith("07") && numberPhone.length() == 11;

    static Predicate<String> containsNumber3 = numberPhone -> numberPhone.contains("3");

}
