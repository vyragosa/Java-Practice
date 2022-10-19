package Practice23.Task2;

public interface Queue {

    /**
     * Инвариант: size' = size + 1
     * Предусловие: element != null, element immutable
     * Постусловие: queue'[0...size - 1] = queue[0...size - 1]
     * Постусловие: queue'[size' - 1] =  element
     */
    void enqueue(Object element);

    /**
     * Предусловие: size > 0
     * Постусловие: Result = queue[0]
     */
    Object element();

    /**
     * Инвариант: size' = size - 1
     * Предусловие: size > 0
     * Постусловие: queue'[0...size - 1] = queue[1...size - 1]
     * Постусловие: Result = queue[0]
     */
    Object dequeue();

    /**
     * Инвариант: size' = size - 1
     * Предусловие: size > 0
     * Постусловие: queue'[0...size' - 1] = queue[0...size' - 1]
     */
    Object remove();

    /**
     * Предусловие: size > 0
     * Постусловие: Result = queue[size - 1]
     */
    Object peek();

    /**
     * Инвариант: size' = size + 1
     * Предусловие : element != null, element immutable
     * Постусловие: queue'[1...size' - 1] = queue[0...size - 1]
     * Постусловие: queue[0] = element
     */
    void push(Object element);

    /**
     * Постусловие: Result = size
     */
    int size();

    /**
     * Постусловие: Result = size > 0?
     */
    boolean isEmpty();

    /**
     * Инвариант: size' = 0;
     * Постусловие: Clear the queue
     */
    void clear();

    /**
     * Постусловие: Result = queue[0...size - 1]
     */
    Object[] toArray();
}
