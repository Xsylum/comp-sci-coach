/**
 * Map is an abstract data type that associates a value to a key
 * Keys in this definition are unique values, used to obtain an associated value
 * 
 */
public abstract class MapADT<K, V> {

	/**
	 * Should return the value associated with the Key k, or null if no k exists within the structure
	 * 
	 * @returns the value associated with k (or null if k does not exist)
	 */
	public abstract V get(K k);
	public abstract void put(K k, V v);
}