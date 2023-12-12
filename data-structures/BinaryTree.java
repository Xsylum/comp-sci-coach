public interface BinaryTree<E> extends Tree<E> {

	Position<E> leftChild(Position<E> pos);
	Position<E> rightChild(Position<E> pos);

}