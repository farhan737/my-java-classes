package farhan.experiments.main;

public class TextStyling {
	public static void main(String[] args) {
		// Bold text
		System.out.println("\033[1mThis is bold text!\033[0m");

		// Normal text
		System.out.println("This is normal text.");

		// Bold mixed with normal
		System.out.println("Normal \033[1mBold\033[0m Normal again");

		System.out.println("\033[3mThis is italic text!\033[0m");

		// Normal text
		System.out.println("This is normal text.");

		// Mixed italic + bold
		System.out.println("\033[1mBold \033[3mBold+Italic\033[0m Normal");

		// Red text
		System.out.println("\033[31mThis is red text\033[0m");

		// Green text on yellow background
		System.out.println("\033[32;43mGreen text on Yellow background\033[0m");

		// Bold blue text
		System.out.println("\033[1;34mThis is bold blue text\033[0m");

		// Underlined magenta
		System.out.println("\033[4;35mThis is underlined magenta text\033[0m");

		// Bright cyan on bright black background
		System.out.println("\033[96;100mBright cyan on bright black background\033[0m");
	}

//		 \033[30m → Black
//	     \033[31m → Red
//	     \033[32m → Green
//	     \033[33m → Yellow
//	     \033[34m → Blue
//	     \033[35m → Magenta
//	     \033[36m → Cyan
//	     \033[37m → White
//	     \033[90m → Bright Black (Gray)
//	     \033[91m → Bright Red
//	     \033[92m → Bright Green
//	     \033[93m → Bright Yellow
//	     \033[94m → Bright Blue
//	     \033[95m → Bright Magenta
//	     \033[96m → Bright Cyan
//	     \033[97m → Bright White

	
//		 \033[40m → Black background
//	     \033[41m → Red background
//	     \033[42m → Green background
//	     \033[43m → Yellow background
//	     \033[44m → Blue background
//	     \033[45m → Magenta background
//	     \033[46m → Cyan background
//	     \033[47m → White background
//	     \033[100m → Bright Black background
//	     \033[101m → Bright Red background
//	     \033[102m → Bright Green background
//	     \033[103m → Bright Yellow background
//	     \033[104m → Bright Blue background
//	     \033[105m → Bright Magenta background
//	     \033[106m → Bright Cyan background
//	     \033[107m → Bright White background

}
