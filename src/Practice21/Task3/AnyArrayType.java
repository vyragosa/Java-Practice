package Practice21.Task3;

class AnyArrayType<E> {
	private E[] array;

	public E[] getArray() {
		return array;
	}

	public void setArray(E[] array) {
		this.array = array;
	}

	public E get(int i) {
		return array[i];
	}
}
