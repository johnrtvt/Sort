package HeapSort;

public class NullEntryException extends Exception {
	
	private static final String message = "There is a null entry in the list";
	
	@Override
	public String getMessage() {
		return message;
	}

}
