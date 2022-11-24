package Practice20.Task3;

import java.io.Serializable;

class Generic<T extends Comparable, V extends Animal & Serializable, K> {
	private final T t;
	private final V v;
	private final K k;

	public Generic(T t, V v, K k) {
		this.t = t;
		this.v = v;
		this.k = k;
	}

	public T getT() {
		return t;
	}

	public V getV() {
		return v;
	}

	public K getK() {
		return k;
	}

	@Override
	public String toString() {
		return "Generic{" +
				"T=" + t +
				", V=" + v +
				", K=" + k +
				'}';
	}
}
