public interface Tree<E> extends Iterable<E> {
	
	Position<E> getRoot();

	Iterable<Position<E>> getChildren(Position<E> pos);
	int getChildCount(Position<E> pos);

	Position<E> getParent(Position<E> pos);

	int getDepth(Position<E> pos);
	int getHeight(Position<E> pos);
}
