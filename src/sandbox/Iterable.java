package sandbox;

public interface Iterable<Item> extends Iterator<Item> {
	Iterator<Item> iterator();
}
