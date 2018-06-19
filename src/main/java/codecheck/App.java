package codecheck;

public class App {
	public static void main(String[] args) {

		for (int i = 0, l = args.length; i < l; i++) {
			int input_int = Integer.parseInt(args[i]);
			String input_str =  args[i];
			int result = input_str.indexOf("3");

			if ((0 < input_int) && (input_int <= 1000)){
					if((input_int % 3 ==0) && (result != -1)){
						System.out.println("dumb");
					}
					else if(input_int % 3 ==0){
						System.out.println("idiot");
					}
					else if(result != -1){
						System.out.println("stupid");
					}
					else{
					System.out.println("smart");
					}
			}
			System.out.println("invalid");
		}
	}
}
