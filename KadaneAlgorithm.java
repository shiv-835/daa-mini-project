import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KadaneAlgorithm implements MaxSubArrayAlgorithm {

    @Override
    public int maxSubArraySum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        KadaneUI ui = new KadaneUI();
        ui.createAndShowGUI();
    }
}

interface MaxSubArrayAlgorithm {
    int maxSubArraySum(int[] arr);
}

class KadaneUI {
    private JFrame frame;
    private JTextField inputField;
    private JLabel resultLabel;

    public void createAndShowGUI() {
        frame = new JFrame("Kadane's Algorithm");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(3, 1));

        JLabel instructionLabel = new JLabel("Enter array elements separated by commas:");
        frame.add(instructionLabel);

        inputField = new JTextField();
        frame.add(inputField);

        JButton calculateButton = new JButton("Calculate Maximum Subarray Sum");
        frame.add(calculateButton);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateMaxSubArraySum();
            }
        });

        resultLabel = new JLabel("Result: ");
        frame.add(resultLabel);

        frame.setVisible(true);
    }

    private void calculateMaxSubArraySum() {
        String inputText = inputField.getText();
        String[] inputArray = inputText.split(",");
        int[] arr = new int[inputArray.length];

        try {
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i].trim());
            }

            KadaneAlgorithm kadane = new KadaneAlgorithm();
            int result = kadane.maxSubArraySum(arr);
            resultLabel.setText("Result: Maximum Subarray Sum is " + result);
        } catch (NumberFormatException e) {
            resultLabel.setText("Error: Please enter valid integers separated by commas.");
        }
    }
}