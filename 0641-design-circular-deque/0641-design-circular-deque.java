class MyCircularDeque {
    int[] arr;
    int front;
    int rear;
    int size;
    int capacity;

    public MyCircularDeque(int k) {
        arr = new int[k];
        capacity = k;
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean insertFront(int value) {
        if(size==capacity)return false;

        if(size==0){
            front = 0;
            rear = 0;
        }
        else{
            front = (front-1+capacity)%capacity;
        }

        arr[front] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if(size==capacity)return false;

        if(size==0){
            front = 0;
            rear = 0;
        }
        else{
            rear = (rear+1)%capacity;
        }

        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if(size==0)return false;

        front = (front+1)%capacity;
        size--;

        if(size==0){
            front = 0;
            rear = -1;
        }

        return true;
    }

    public boolean deleteLast() {
        if(size==0)return false;

        rear = (rear-1+capacity)%capacity;
        size--;

        if(size==0){
            front = 0;
            rear = -1;
        }

        return true;
    }

    public int getFront() {
        if(size==0)return -1;
        return arr[front];
    }

    public int getRear() {
        if(size==0)return -1;
        return arr[rear];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==capacity;
    }
}