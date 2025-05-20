import java.util.EmptyStackException;

public class MyStack {
	public boolean empty() {
		return true;
	}

	public int size() {
		return 0;
	}

	public Object peek() {
		throw new EmptyStackException();
	}

	public Object push(Object elem) {
		return elem;
	}

	public int search(Object elem) {
		return -1;
	}

	//public String toString() {
	//	return super().toString();
	//}
}