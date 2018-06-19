package codecheck;

import java.text.Normalizer;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		for (int i = 0, l = args.length; i < l; i++) {
			String input_str =  Normalizer.normalize(args[i], Normalizer.Form.NFKC);
						ArrayList input_list = new ArrayList();

			if(input_str.indexOf("\\s+") != -1){
				input_list.add(input_str.split(" ", 0));
			}

			if (input_list.size() > 0){
				for (int j = 0; j < input_list.size(); j++) {
					String input =  (String) input_list.get(j);
					output(input);
				}
			}else{
				output(input_str);
			}
		}
	}

	private static void output(String input_str) {

		int input_int = 0;
		int result = 0;
	    try {
	    	input_int = Integer.parseInt(input_str);
	    	result = input_str.indexOf("3");

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
        } catch (NumberFormatException e) {
    		System.out.println("invalid");
        }

	}


}
