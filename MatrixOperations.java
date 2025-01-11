import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        int matrix;
        Scanner input = new Scanner(System.in);
        System.out.println("SELECT OPTIONS ACCORDING TO YOUR WORK\n");
        System.out.println("* 2D matrix = 1\n* 3D matrix = 2");
        matrix = input.nextInt();

        if (matrix != 1 && matrix != 2) {  // Fixed condition
            System.out.println("Select correct option.");
        } else {
            switch (matrix) {
                case 1:
                    int A[][] = new int[2][2];
                    int B[][] = new int[2][2];
                    int C[][] = new int[2][2];

                    System.out.println("Enter Matrix A Data:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (!input.hasNextInt()) {
                                System.out.println("Invalid input! Enter numbers only.");
                                input.next();
                                return;
                            }
                            A[i][j] = input.nextInt();
                        }
                    }

                    System.out.println("Enter Matrix B Data:");
                    for (int i = 0; i < 2; i++) {
                        for (int j = 0; j < 2; j++) {
                            if (!input.hasNextInt()) {
                                System.out.println("Invalid input! Enter numbers only.");
                                input.next();
                                return;
                            }
                            B[i][j] = input.nextInt();
                        }
                    }

                    System.out.println("Choose an operation:\nddition\nSubtraction\nMultiplication\nDivision");
                    char op = input.next().charAt(0);

                    switch (op) {
                        case '+':
                            System.out.println("Matrix Addition Result:");
                            for (int i = 0; i < 2; i++) {
                                for (int j = 0; j < 2; j++) {
                                    C[i][j] = A[i][j] + B[i][j];
                                    System.out.print(C[i][j] + " ");
                                }
                                System.out.println();
                            }
                            break;

                        case '-':
                            System.out.println("Matrix Subtraction Result:");
                            for (int i = 0; i < 2; i++) {
                                for (int j = 0; j < 2; j++) {
                                    C[i][j] = A[i][j] - B[i][j];
                                    System.out.print(C[i][j] + " ");
                                }
                                System.out.println();
                            }
                            break;

                        case '*':
                            System.out.println("Matrix Multiplication Result:");
                            for (int i = 0; i < 2; i++) {
                                for (int j = 0; j < 2; j++) {
                                    C[i][j] = A[i][j] * B[i][j];  // Element-wise multiplication (not dot product)
                                    System.out.print(C[i][j] + " ");
                                }
                                System.out.println();
                            }
                            break;

                        case '/':
                            System.out.println("Matrix Division Result:");
                            for (int i = 0; i < 2; i++) {
                                for (int j = 0; j < 2; j++) {
                                    if (B[i][j] == 0) {
                                        System.out.println("Error! Division by zero.");
                                        return;
                                    }
                                    C[i][j] = A[i][j] / B[i][j];
                                    System.out.print(C[i][j] + " ");
                                }
                                System.out.println();
                            }
                            break;

                        default:
                            System.out.println("Invalid operation! Choose +, -, *, or /.");
                    }
                    break;

                case 2:
                    int a[][] = new int[3][3];
                    int b[][] = new int[3][3];
                    int c[][] = new int[3][3];
                    int d[][] = new int[3][3];

                    System.out.println("Enter Data of Matrix A :");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (!input.hasNextInt()) {
                                System.out.println("Invalid input! Enter numbers only.");
                                input.next();
                                return;
                            }
                            a[i][j] = input.nextInt();
                        }
                    }

                    System.out.println("Enter Data of Matrix B:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (!input.hasNextInt()) {
                                System.out.println("Invalid input! Enter numbers only.");
                                input.next();
                                return;
                            }
                            b[i][j] = input.nextInt();
                        }
                    }

                    System.out.println("Enter Data of Matrix C:");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if (!input.hasNextInt()) {
                                System.out.println("Invalid input! Enter numbers only.");
                                input.next();
                                return;
                            }
                            c[i][j] = input.nextInt();
                        }
                    }

                    System.out.println("Choose an operation: \nddition\nSubtraction\nMultiplication\nDivision");
                    char cp = input.next().charAt(0);

                    switch (cp) {
                        case '+':
                            System.out.println("Matrix Addition Result:");
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    d[i][j] = a[i][j] + b[i][j] + c[i][j];
                                    System.out.print(d[i][j] + " ");
                                }
                                System.out.println();
                            }
                            break;

                        case '-':
                            System.out.println("Matrix Subtraction Result:");
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    d[i][j] = a[i][j] - b[i][j] - c[i][j];
                                    System.out.print(d[i][j] + " ");
                                }
                                System.out.println();
                            }
                            break;

                        case '*':
                            System.out.println("Matrix Multiplication Result:");
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    d[i][j] = a[i][j] * b[i][j] * c[i][j];  // Element-wise multiplication
                                    System.out.print(d[i][j] + " ");
                                }
                                System.out.println();
                            }
                            break;

                        case '/':
                            System.out.println("Matrix Division Result:");
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    if (b[i][j] == 0 || c[i][j] == 0) {
                                        System.out.println("Error! Division by zero.");
                                        return;
                                    }
                                    d[i][j] = a[i][j] / b[i][j] / c[i][j];
                                    System.out.print(d[i][j] + " ");
                                }
                                System.out.println();
                            }
                            break;

                        default:
                            System.out.println("Invalid operation! Choose +, -, *, or /.");
                    }
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + matrix);
            }
        }
        input.close();
    }
}
