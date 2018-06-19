package codecheck;

import java.text.Normalizer;

public class App {
	public static void main(String[] args) {

		for (int i = 0, l = args.length; i < l; i++) {
			String input_str =  Normalizer.normalize(args[i], Normalizer.Form.NFKC);
			String[] input_spr;

			if(input_str.indexOf("\\s+") != -1){
				input_spr = input_str.split(" ", 0);
			}

			if (input_spr.length > 0){
				for (int j = 0; j < input_spr.length; j++) {
					String input =  input_spr[j];
					output(input);
				}
			}else{
				output(input_str);
			}
		}
	}

	private static void output(String input_str) {
		int input_int = Integer.parseInt(input_str);
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
				}else{
					System.out.println("smart");
				}
		}else{
		System.out.println("invalid");
		}
	}


}
