 public class MyCircularDeque {

    // 1��������Ƴɶ�̬���飬ʹ�þ�̬���鼴��
    // 2����� head �� tail ָ�����
    // 3��head == tail ������ʱ���ʾ����Ϊ��
    // 4��tail + 1 == head

    private int capacity;
    private int[] arr;
    private int front;
    private int rear;

    /**
     * Initialize your data structure here. Set the size of the deque to be k.
     */
    public MyCircularDeque(int k) {
        capacity = k + 1;
        arr = new int[capacity];

        // ͷ��ָ��� 1 �����Ԫ�ص�λ��
        // ����ʱ���ȼ����ٸ�ֵ
        // ɾ��ʱ������ +1��ע��ȡģ��
        front = 0;
        // β��ָ����һ������Ԫ�ص�λ��
        // ����ʱ���ȸ�ֵ���ټ�
        // ɾ��ʱ������ -1��ע��ȡģ��
        rear = 0;
    }

    /**
     * Adds an item at the front of Deque. Return true if the operation is successful.
     */
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        arr[front] = value;
        return true;
    }

    /**
     * Adds an item at the rear of Deque. Return true if the operation is successful.
     */
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        arr[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }

    /**
     * Deletes an item from the front of Deque. Return true if the operation is successful.
     */
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        // front �����������Ŀ�ͷ�������� +1
        front = (front + 1) % capacity;
        return true;
    }

    /**
     * Deletes an item from the rear of Deque. Return true if the operation is successful.
     */
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        // rear ������������ĩβ�������� -1
        rear = (rear - 1 + capacity) % capacity;
        return true;
    }

    /**
     * Get the front item from the deque.
     */
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    /**
     * Get the last item from the deque.
     */
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        // �� rear Ϊ 0 ʱ��ֹ����Խ��,��Ϊrearʼ��ָ��յĸ�����
        return arr[(rear - 1 + capacity) % capacity];
    }

    /**
     * Checks whether the circular deque is empty or not.
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * Checks whether the circular deque is full or not.
     */
    public boolean isFull() {
        // ע�⣺�������Ƿǳ����������
        return (rear + 1) % capacity == front;
    }
}
 