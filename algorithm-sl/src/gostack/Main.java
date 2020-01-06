package gostack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	static List<Command> commands;
	static List<Long> goStack;
	static boolean flag = true;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("src/input/input_3425.txt"));
		Scanner sc = new Scanner(System.in);

		while (true) {
			commands = new ArrayList<>();
			while (true) {
				String input = sc.nextLine();
				if (input.equals("QUIT")) {
					return;
				}
				if (input.equals("END")) {
					break;
				}

				String[] src = input.split(" ");
				if (src.length == 2) {
					commands.add(new Command(src[0], Long.parseLong(src[1])));
				} else {
					commands.add(new Command(src[0], 0L));
				}
			}
	
			int count = sc.nextInt();
			for (int i = 0; i < count; i++) {
				flag = true;
				Long init = sc.nextLong();
				if (init > 1000000000) {
					System.out.println("ERROR");
					continue;
				}
				goStack = new ArrayList<>();
				goStack.add(init);
				for (Command command : commands) {
					flag = command.calculateOrder(goStack);	
					System.out.println(goStack.toString());
					if (!flag) {
						break;
					}
				}
				if (!flag | goStack.size() != 1) {
					System.out.println("ERROR");
				} else {
					System.out.println(goStack.get(0));
				}
			}
			System.out.println();
		}
	}
 
	static class Command {
		private String order;
		private Long number;

		Command(String order, Long number) {
			this.order = order;
			this.number = number;
		}
		
		public boolean calculateOrder(List<Long> goStack) {
			switch(order) {
				case "NUM":
					return calcNum(goStack);
				case "POP":
					return calcPop(goStack);
				case "DUP":
					return calcDup(goStack);
				case "INV":
					return calcInv(goStack);
				case "SWP":
					return calcSwp(goStack);
				case "ADD":
					return calcAdd(goStack);
				case "SUB":
					return calcSub(goStack);
				case "MUL":
					return calcMul(goStack);
				case "DIV":
					return calcDiv(goStack);
				case "MOD":
					return calcMod(goStack);
			}
			return true;
		}
		
		private boolean calcNum(List<Long> goStack) {
			if (Math.abs(number) > 1000000000) {
				return false;
			}
			goStack.add(0, number);
			return true;
		}
		
		private boolean calcPop(List<Long> goStack) {
			if (goStack.isEmpty()) {
				return false;
			}
			goStack.remove(0);
			return true;
		}
		
		private boolean calcDup(List<Long> goStack) {
			if (goStack.isEmpty()) {
				return false;
			}
			goStack.add(0, goStack.get(0));
			return true;
		}
		
		private boolean calcInv(List<Long> goStack) {
			if (goStack.isEmpty()) {
				return false;
			}
			Long first = goStack.remove(0);
			goStack.add(0, -first);
			return true;
		}
		
		private boolean calcSwp(List<Long> goStack) {
			if (goStack.size() < 2) {
				return false;
			}
			Long first = goStack.remove(0);
			goStack.add(1, first);
			return true;
		}
		
		private boolean calcAdd(List<Long> goStack) {
			if (goStack.size() < 2 || Math.abs(goStack.get(0) + goStack.get(1)) > 1000000000) {
				return false;
			}
			Long first = goStack.remove(0);
			Long second = goStack.remove(0);
			goStack.add(0, first + second);
			return true;
		}
		
		private boolean calcSub(List<Long> goStack) {
			if (goStack.size() < 2 || Math.abs(goStack.get(1) - goStack.get(0)) > 1000000000) {
				return false;
			}
			Long first = goStack.remove(0);
			Long second = goStack.remove(0);
			goStack.add(0, second - first);
			return true;
		}
		 
		private boolean calcMul(List<Long> goStack) {
			if (goStack.size() < 2 || Math.abs(goStack.get(0) * goStack.get(1)) > 1000000000) {
				return false;
			}
			Long first = goStack.remove(0);
			Long second = goStack.remove(0);
			goStack.add(0, first * second);
			return true;
		}
		 
		private boolean calcDiv(List<Long> goStack) {
			if (goStack.size() < 2 || goStack.get(0) == 0 || Math.abs(goStack.get(1) / goStack.get(0)) > 1000000000) {
				return false;
			}
			Long first = goStack.remove(0);
			Long second = goStack.remove(0);
			if (second < 0) {
				goStack.add(0, -Math.abs(second) / first);
			} else {
				goStack.add(0, second / first);
			}
			return true;
		}
	
		private boolean calcMod(List<Long> goStack) {
			if (goStack.size() < 2 || goStack.get(0) == 0 || Math.abs(goStack.get(1) % goStack.get(0)) > 1000000000) {
				return false;
			}
			Long first = goStack.remove(0);
			Long second = goStack.remove(0);
			if (second < 0) {
				goStack.add(0, -Math.abs(second) % first);
			} else {
				goStack.add(0, Math.abs(second % first));
			}
			return true;
		}	
	}

}
