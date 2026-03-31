package ProjectsOfPractice;
import java.util.*;

public class LogAndTrigonCalculator {





    // ─── TRIGONOMETRIC FUNCTIONS ───────────────────────────────────────────────

    static double sine(double degrees) {
        return Math.sin(Math.toRadians(degrees));
    }

    static double cosine(double degrees) {
        return Math.cos(Math.toRadians(degrees));
    }

    static double tangent(double degrees) {
        double result = Math.tan(Math.toRadians(degrees));
        if (Double.isInfinite(result)) {
            System.out.println("Undefined! tan(90°) or tan(270°) is not defined.");
            return Double.NaN;
        }
        return result;
    }

    static double inverseSine(double value) {
        if (value < -1 || value > 1) {
            System.out.println("Invalid input! Value must be between -1 and 1.");
            return Double.NaN;
        }
        return Math.toDegrees(Math.asin(value));
    }

    static double inverseCosine(double value) {
        if (value < -1 || value > 1) {
            System.out.println("Invalid input! Value must be between -1 and 1.");
            return Double.NaN;
        }
        return Math.toDegrees(Math.acos(value));
    }

    static double inverseTangent(double value) {
        return Math.toDegrees(Math.atan(value));
    }

    // ─── LOGARITHMIC FUNCTIONS ─────────────────────────────────────────────────

    static double log10(double x) {
        if (x <= 0) {
            System.out.println("Invalid input! Value must be greater than 0.");
            return Double.NaN;
        }
        return Math.log10(x);
    }

    static double naturalLog(double x) {
        if (x <= 0) {
            System.out.println("Invalid input! Value must be greater than 0.");
            return Double.NaN;
        }
        return Math.log(x);
    }

    static double logCustomBase(double x, double base) {
        if (x <= 0) {
            System.out.println("Invalid input! Value must be greater than 0.");
            return Double.NaN;
        }
        if (base <= 0 || base == 1) {
            System.out.println("Invalid base! Base must be > 0 and not equal to 1.");
            return Double.NaN;
        }
        return Math.log(x) / Math.log(base);  // change of base formula
    }

    // ─── MENUS ─────────────────────────────────────────────────────────────────

    static void trigMenu(Scanner sc) {
        System.out.println("\n─── Trigonometric Calculator ───");
        System.out.println("1. sin(x)");
        System.out.println("2. cos(x)");
        System.out.println("3. tan(x)");
        System.out.println("4. asin(x)  → inverse sine");
        System.out.println("5. acos(x)  → inverse cosine");
        System.out.println("6. atan(x)  → inverse tangent");
        System.out.println("7. Back to Main Menu");
        System.out.print("Choose : ");

        int choice = getIntInput(sc);

        if (choice == 7) return;

        double value;

        if (choice >= 1 && choice <= 3) {
            System.out.print("Enter angle in degrees : ");
        } else if (choice >= 4 && choice <= 6) {
            System.out.print("Enter value : ");
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        value = getDoubleInput(sc);
        double result;

        switch (choice) {
            case 1 -> result = sine(value);
            case 2 -> result = cosine(value);
            case 3 -> result = tangent(value);
            case 4 -> result = inverseSine(value);
            case 5 -> result = inverseCosine(value);
            case 6 -> result = inverseTangent(value);
            default -> { System.out.println("Invalid choice!"); return; }
        }

        if (!Double.isNaN(result)) {
            System.out.printf("Result : %.6f%n", result);
        }
    }

    static void logMenu(Scanner sc) {
        System.out.println("\n─── Logarithmic Calculator ───");
        System.out.println("1. log base 10");
        System.out.println("2. Natural log (ln)");
        System.out.println("3. log with custom base");
        System.out.println("4. Back to Main Menu");
        System.out.print("Choose : ");

        int choice = getIntInput(sc);

        if (choice == 4) return;

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.print("Enter value : ");
        double x = getDoubleInput(sc);
        double result;

        if (choice == 3) {
            System.out.print("Enter base : ");
            double base = getDoubleInput(sc);
            result = logCustomBase(x, base);
        } else if (choice == 1) {
            result = log10(x);
        } else {
            result = naturalLog(x);
        }

        if (!Double.isNaN(result)) {
            System.out.printf("Result : %.6f%n", result);
        }
    }

    // ─── INPUT HELPERS ─────────────────────────────────────────────────────────

    // Safely reads an integer, re-prompts if invalid
    static int getIntInput(Scanner sc) {
        while (true) {
            String input = sc.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid! Enter a number : ");
            }
        }
    }

    // Safely reads a double, re-prompts if invalid
    static double getDoubleInput(Scanner sc) {
        while (true) {
            String input = sc.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid! Enter a valid number : ");
            }
        }
    }

    // ─── MAIN ──────────────────────────────────────────────────────────────────

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("\u2554\u2550\u2550\u2550\u2550\u2550\u2550\u2557");
//        System.out.println("\u2551  Scientific Calculator  \u2551");
//        System.out.println("\u255A\u2550\u2550\u2550\u2550\u2550\u2550\u255D");
        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║  Scientific Calculator  ║");
        System.out.println("╚══════════════════════════════════╝");

        while (true) {
            System.out.println("\n─── Main Menu ───");
            System.out.println("1. Trigonometric Calculator");
            System.out.println("2. Logarithmic Calculator");
            System.out.println("3. Exit");
            System.out.print("Choose : ");

            int choice = getIntInput(sc);

            switch (choice) {
                case 1 -> trigMenu(sc);
                case 2 -> logMenu(sc);
                case 3 -> {
                    System.out.println("Exiting... Goodbye!");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

