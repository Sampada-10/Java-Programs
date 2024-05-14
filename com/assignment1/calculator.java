package com.assignment1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator {
	    private JFrame frame;
	    private JPanel panel;
	    private JTextField display;
	    private JButton[] buttons;

	    private String currentInput = "";
	    private double result = 0;
	    private char operator = ' ';

	    public calculator() {
	        frame = new JFrame("Calculator");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(300, 400);
	        frame.setLayout(new BorderLayout());

	        display = new JTextField();
	        display.setEditable(false);
	        frame.add(display, BorderLayout.NORTH);

	        panel = new JPanel(new GridLayout(4, 4));
	        frame.add(panel, BorderLayout.CENTER);

	        buttons = new JButton[16];
	        String[] buttonLabels = {
	            "7", "8", "9", "/",
	            "4", "5", "6", "*",
	            "1", "2", "3", "-",
	            "0", ".", "=", "+"
	        };

	        for (int i = 0; i < 16; i++) {
	            buttons[i] = new JButton(buttonLabels[i]);
	            panel.add(buttons[i]);
	            buttons[i].addActionListener(new ButtonClickListener());
	        }

	        frame.setVisible(true);
	    }

	    private class ButtonClickListener implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            String command = e.getActionCommand();

	            if (command.matches("[0-9]")) {
	                currentInput += command;
	                display.setText(currentInput);
	            } else if (command.matches("[+\\-*/=]")) {
	                if (!currentInput.isEmpty()) {
	                    double input = Double.parseDouble(currentInput);
	                    performOperation(input);
	                    operator = command.charAt(0);
	                    currentInput = "";
	                }
	            } else if (command.equals(".")) {
	                if (!currentInput.contains(".")) {
	                    currentInput += ".";
	                    display.setText(currentInput);
	                }
	            } else if (command.equals("C")) {
	                clear();
	            }
	        }
	    }

	    private void performOperation(double input) {
	        switch (operator) {
	            case '+':
	                result += input;
	                break;
	            case '-':
	                result -= input;
	                break;
	            case '*':
	                result *= input;
	                break;
	            case '/':
	                if (input != 0) {
	                    result /= input;
	                } else {
	                    display.setText("Error");
	                    clear();
	                }
	                break;
	            case '=':
	                result = input;
	                break;
	            default:
	                result = input;
	                break;
	        }
	        display.setText(String.valueOf(result));
	    }

	    private void clear() {
	        currentInput = "";
	        result = 0;
	        operator = ' ';
	        display.setText("");
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new calculator());
	    }
	}

