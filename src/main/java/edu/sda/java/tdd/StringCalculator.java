package edu.sda.java.tdd;

public class StringCalculator {
    public int sum(String argument) {

        if (argument.isEmpty()) {
            return 0;
        } else {
            String delimiter = ",";
            String inputNumbers = argument;

            if (argument.startsWith("//")) {
                int delimiterIndex = argument.indexOf("\n");
                if (delimiterIndex != -1) {
                    delimiter = argument.substring(2, delimiterIndex);
                    inputNumbers = argument.substring(delimiterIndex + 1);
                }
            }

            String[] nums = inputNumbers.split("[,\\n" + delimiter + "]");
            int sum = 0;
            StringBuilder negativeNumbers = new StringBuilder();
            boolean hasNegative = false;
            for (String num : nums) {
                int n = Integer.parseInt(num);
                if (n < 0) {
                    if (negativeNumbers.length() > 0) {
                        negativeNumbers.append(", ");
                    }
                    negativeNumbers.append(n);
                    hasNegative = true;
                }
                sum += n;
            }
            if (hasNegative) {
                throw new IllegalArgumentException("Negatives not allowed: " + negativeNumbers);
            }
            return sum;
        }
    }
}






