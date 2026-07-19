class ListNode {
    int val;
    ListNode next;
    ListNode prev;
    ListNode(int val) {
        this.val = val;
    }
}

class MyLinkedList {
    int size;
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        
        ListNode curr;
        if (index + 1 < size - index) {
            curr = head.next;
            for (int i = 0; i < index; ++i) {
                curr = curr.next;
            }
        } else {
            curr = tail.prev;
            for (int i = 0; i < size - index - 1; ++i) {
                curr = curr.prev;
            }
        }
        
        return curr.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;
        
        ListNode pred, succ;
        if (index < size - index) {
            pred = head;
            for (int i = 0; i < index; ++i) {
                pred = pred.next;
            }
            succ = pred.next;
        } else {
            succ = tail;
            for (int i = 0; i < size - index; ++i) {
                succ = succ.prev;
            }
            pred = succ.prev;
        }
        
        size++;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        
        ListNode pred, succ;
        if (index < size - index) {
            pred = head;
            for (int i = 0; i < index; ++i) {
                pred = pred.next;
            }
            succ = pred.next.next;
        } else {
            succ = tail;
            for (int i = 0; i < size - index - 1; ++i) {
                succ = succ.prev;
            }
            pred = succ.prev.prev;
        }
        
        size--;
        pred.next = succ;
        succ.prev = pred;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
