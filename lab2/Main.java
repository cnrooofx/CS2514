public class Main {
    final static Integer VALUE = 1;
    public static void main(String[] args) {
        System.out.println("Conor");

        final Integer value1 = Integer.valueOf(VALUE);
        final Integer value2 = Integer.valueOf(VALUE);

        System.out.println(value1 == value2);
        System.out.println(value1.equals(value2));

        final Integer auto1 = VALUE;
        final Integer auto2 = VALUE;

        System.out.println(auto1 == auto2);
        System.out.println(value1 == auto1);
        System.out.println(value2 == auto2);
        System.out.println(auto1.equals(auto2));
        System.out.println(value1.equals(auto1));
        System.out.println(value2.equals(auto2));

        final Integer result = auto1 * 2;
        System.out.println(result);
    }
}
