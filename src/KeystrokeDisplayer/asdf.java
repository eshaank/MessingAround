package KeystrokeDisplayer;

public class asdf {
	public static void main(String[] args) {
		int number = 10;
		String handle = "hi";
		System.out.println("BEGIN \nINSERT INTO public.threatdata2(threat, handle) VALUES(" + number + " , " + "'"
				+ handle + "'" + "); \nEXCEPTION WHEN unique_violation THEN\nEND;");
	}
}
