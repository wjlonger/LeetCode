package com.coder.队列和栈;

public class MyCircularQueue {

    /**
     *
     * 设计你的循环队列实现。 循环队列是一种线性数据结构，其操作表现基于 FIFO（先进先出）
     * 原则并且队尾被连接在队首之后以形成一个循环。它也被称为“环形缓冲器”。
     *
     * 循环队列的一个好处是我们可以利用这个队列之前用过的空间。
     * 在一个普通队列里，一旦一个队列满了，我们就不能插入下一个元素，即使在队列前面仍有空间。
     * 但是使用循环队列，我们能使用这些空间去存储新的值。
     *
     * 你的实现应该支持如下操作：
     *
     * MyCircularQueue(k): 构造器，设置队列长度为 k 。
     * Front: 从队首获取元素。如果队列为空，返回 -1 。
     * Rear: 获取队尾元素。如果队列为空，返回 -1 。
     * enQueue(value): 向循环队列插入一个元素。如果成功插入则返回真。
     * deQueue(): 从循环队列中删除一个元素。如果成功删除则返回真。
     * isEmpty(): 检查循环队列是否为空。
     * isFull(): 检查循环队列是否已满。
     *
     *
     * 示例：
     *
     * MyCircularQueue circularQueue = new MycircularQueue(3); // 设置长度为 3
     *
     * circularQueue.enQueue(1);  // 返回 true
     *
     * circularQueue.enQueue(2);  // 返回 true
     *
     * circularQueue.enQueue(3);  // 返回 true
     *
     * circularQueue.enQueue(4);  // 返回 false，队列已满
     *
     * circularQueue.Rear();  // 返回 3
     *
     * circularQueue.isFull();  // 返回 true
     *
     * circularQueue.deQueue();  // 返回 true
     *
     * circularQueue.enQueue(4);  // 返回 true
     *
     * circularQueue.Rear();  // 返回 4
     *
     *
     *
     * 提示：
     *
     * 所有的值都在 0 至 1000 的范围内；
     * 操作数将在 1 至 1000 的范围内；
     * 请不要使用内置的队列库。
     */

    int[] data;     // 存放循环队列的数据
    int head;       // 循环队列头
    int tail;       // 循环队列尾
    int len;        // 循环队列的最大长度
    int count;      // 循环队列的元素个数

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data = new int[k];
        head = 0;
        tail = 0;
        len = k;
        count = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (isFull()) {
            //循环队列满
            return false;
        } else {
            // 插入元素到队尾，队尾索引值增一，元素个数增一
            data[tail] = value;
            count++;
            tail = (tail + 1) % len;
            return true;
        }
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) {
            //循环队列空
            return false;
        } else {
            // 队头索引值增一，元素个数减一
            head = (head + 1) % len;
            count--;
            return true;
        }
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()) {
            //循环队列空
            return -1;
        } else {
            return data[head];
        }
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()) {
            //循环队列空
            return -1;
        } else {
            // 队尾元素位于队尾索引值减一的位置，但若队尾循环到索引 0 的位置，队尾元素位于数组最后
            int temp = tail == 0 ? (len-1) : (tail-1);
            return data[temp];
        }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return count == 0;  // 队列元素个数为零，队列空
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return count == len;    // 队列元素个数为数组最大长度，队列满
    }
}
