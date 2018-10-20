public class EquationCalculator {

    public void findEquationRoots(String[] values) {

        if (values == null || values.length != 3) {
            throw new IllegalArgumentException("Check amount of quadratic equation parameters. CORRECT FORMAT EXAMPLE : '2 4 2'");
        }

        Double a = parseToDouble(values[0]);
        Double b = parseToDouble(values[1]);
        Double c = parseToDouble(values[2]);
        double x1, x2, x;

        double discriminant = Math.pow(b, 2) - 4*a*c;
        System.out.println("Discriminant D = " + discriminant);

        if (discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("X1 = " + x1 + "\n" + "X2 = " + x2);
        } else if (discriminant == 0) {
            x = -b / (2 * a);
            System.out.println("X = " + x);
        } else {
            System.out.println("Equation has no roots!");
        }
    }

    private Double parseToDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (Exception e) {
            throw new IllegalArgumentException("Wrong value");
        }
    }
}
