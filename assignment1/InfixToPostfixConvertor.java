package session2.assignment1;

import java.util.Scanner;

/**
 * 
 * @author Amit
 *
 */
public class InfixToPostfixConvertor {

	/**
	 * takes the string to be converted into postfix and returns the postfix
	 * expression
	 * 
	 * @param infix
	 * @return
	 */
	public String infixToPostfix(String infix) {
		Stack<Character> stack = new Stack<Character>();
		String postfix = "";
		int inputLength = infix.length();
		int pos = 0;
		while (pos < inputLength) {
			char ch = infix.charAt(pos);
			if (checkCharType(ch) == Constants.IS_CHAR) {
				postfix += ch;
				pos++;
				continue;
			} else if (checkCharType(ch) == Constants.IS_ADDITION_OPERATOR
					|| checkCharType(ch) == Constants.IS_SUBSTRACTION_OPERATOR) {
				int prec1 = 1;
				while (!stack.isEmpty()) {
					char temp = (char) stack.pop();
					if (temp == '(') {
						stack.push(temp);
						break;
					} else {
						int prec2;
						if (checkCharType(temp) == Constants.IS_ADDITION_OPERATOR
								|| checkCharType(temp) == Constants.IS_SUBSTRACTION_OPERATOR) {
							prec2 = 1;
						} else {
							prec2 = 2;
						}
						if (prec2 < prec1) {
							stack.push(temp);
							break;
						} else
							postfix += temp;

					}
				}
				stack.push(ch);
			} else if (checkCharType(ch) == Constants.IS_MULTIPLICATION_OPERATOR
					|| checkCharType(ch) == Constants.IS_DIVISION_OPERATOR) {
				int prec1 = 2;
				while (!stack.isEmpty()) {
					char temp = (char) stack.pop();
					if (temp == '(') {
						stack.push(temp);
						break;
					} else {
						int prec2;
						if (checkCharType(temp) == Constants.IS_ADDITION_OPERATOR
								|| checkCharType(temp) == Constants.IS_SUBSTRACTION_OPERATOR) {
							prec2 = 1;
						} else {
							prec2 = 2;
						}
						if (prec2 < prec1) {
							stack.push(temp);
							break;
						} else {
							postfix += temp;
						}

					}
				}
				stack.push(ch);
			} else if (checkCharType(ch) == Constants.IS_LEFT_PARENTHESIS) {
				stack.push(ch);
			} else if (checkCharType(ch) == Constants.IS_RIGHT_PARENTHESIS) {
				while (!stack.isEmpty()) {
					char chx = stack.pop();
					if (chx == '(')
						break;
					else {
						postfix += chx;
					}

				}
			}
			pos++;
		}
		while (!stack.isEmpty()) {
			char chx = stack.pop();
			if (checkCharType(chx) != Constants.IS_LEFT_PARENTHESIS
					&& checkCharType(chx) != Constants.IS_RIGHT_PARENTHESIS)
				postfix += chx;
		}
		return postfix;
	}

	/**
	 * checks the type of character entered and returns the type--char/+/-/*
	 * 
	 * @param ch
	 * @return
	 */
	public int checkCharType(char ch) {
		int type = 0;
		if ((ch + "").codePointAt(0) >= 65 && (ch + "").codePointAt(0) <= 90) {
			type = Constants.IS_CHAR;
		} else if (ch == '+') {
			type = Constants.IS_ADDITION_OPERATOR;
		} else if (ch == '-') {
			type = Constants.IS_SUBSTRACTION_OPERATOR;
		} else if (ch == '*') {
			type = Constants.IS_MULTIPLICATION_OPERATOR;
		} else if (ch == '/') {
			type = Constants.IS_DIVISION_OPERATOR;
		} else if (ch == '(') {
			type = Constants.IS_LEFT_PARENTHESIS;
		} else {
			type = Constants.IS_RIGHT_PARENTHESIS;
		}
		return type;
	}

	public static void main(String[] args) {
		System.out.println("Enter the infix expression");
		Scanner scanner = new Scanner(System.in);
		try {

			String postfix = new InfixToPostfixConvertor()
					.infixToPostfix(scanner.next());
			System.out.println("Postfix expr: " + postfix);
		} catch (Exception exception) {
			System.out.println("Sorry something went wrong : " + exception);

		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}
