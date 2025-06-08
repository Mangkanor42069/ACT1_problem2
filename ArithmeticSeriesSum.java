/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arithmeticseriessum;

import java.util.Scanner;

/**
 *
 * @author acer
 */
    public class ArithmeticSeriesSum {

        private int n;

        public ArithmeticSeriesSum(int n) {
            this.n = n;
        }

        public int calculateSum() {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }

        public void displayResult() {
            System.out.println("The sum of the arithmetic series up to " + n + " is: " + calculateSum());
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the upper limit: ");
            int Input = scanner.nextInt();
            scanner.close();

            ArithmeticSeriesSum seriesSum = new ArithmeticSeriesSum(Input);
            seriesSum.displayResult();
        }
    }
