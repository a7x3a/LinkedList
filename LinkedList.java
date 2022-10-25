public class LinkedList<T> {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
    }

     LinkedList(T value) {
        this.head = new Node(value);
    }

     Node getHead() {
        return this.head;
    }

     void addInFront(T value) {
        Node node = new Node(value, this.head);
        this.head = node;
    }

     void traverse() {
        Node p = this.head;
        while (p != null) {
            System.out.print("{ " + p.getValue() + " }");
            p = p.getNext();
        }
    }

     void deleteHead() {
        this.head = this.head.getNext();
    }

     boolean isEmpty() {
        if (head != null) {
            return false;
        } else {
            return false;
        }
    }

     boolean find(T value) {

        Node pointer = this.head;
        while (pointer != null) {
            {
                if (pointer.getValue() == value) {
                    return true;
                }
                pointer = pointer.getNext();
            }

        }
        return false;
    }

    void insertAfter(T find, T value) {
        Node pointer = this.head;
        while (pointer != null) {
            if (pointer.getValue() == find) {
                Node node = new Node(value, pointer.getNext());
                pointer.setNext(node);
            }
            pointer = pointer.getNext();
        }
    }

    void insertBefore(T find, T value) {
        Node p = this.head;
        while (p != null) {
            if(p.getValue()==this.head.getValue()){
                addInFront(value);
                break;
            }
            if (p.getNext().getValue() == find) {
                Node node = new Node(value, p.getNext());
                p.setNext(node);
                break;
            }
            p = p.getNext();
        }

    }


     int getSize() {
        Node p = this.head;
        while (p != null) {
            this.size++;
            p = p.getNext();
        }
        return this.size;
    }

     void addAtEnd(T value) {
        Node p = this.head;
        while (p != null) {
            if (p.getNext() == null) {
                Node node = new Node(value, p.getNext());
                p.setNext(node);
                break;
            }
            p = p.getNext();
        }
    }

    void deleteLast() {
        Node p = this.head;
        while (p != null) {
            if (p.getNext().getNext() == null) {
                p.setNext(p.getNext().getNext());
            }
            p = p.getNext();
        }
    }

     void delete(T value) {
        Node p = this.head;
        while (p != null) {
            if (p.getNext() != null) {
                if (p.getNext().getValue() == value) {
                    p.setNext(p.getNext().getNext());
                    break;
                }
            } else if (p.getNext() == null) {
                deleteHead();
            }
            p = p.getNext();
        }


    }
}
