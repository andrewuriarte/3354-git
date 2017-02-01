package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Please provide only integers to add");
        } catch (Exception e){
		System.out.println("Please provide integers to add");
	}
    }

    private static int addArguments(String[] args) {
	int total = 0;
        for(int i = 0; i < args.length; i++){
		total += Integer.valueOf(args[i]);
	}
	return total;
	//return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
    }
}
