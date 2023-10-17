package Data_Structure;

public class MyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public int getSize() {
        return size;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTail(Node<T> tail) {
        this.tail = tail;
    }

    public MyLinkedList(){
        setHead(null);
        setTail(null);
        setSize(0);
    }

    public Node<T> searchByIndex(int index){
        if(index <0 || index >=size){
            throw new IndexOutOfBoundsException();
        }

        Node<T> iter = head;

        for(int i=0;i<index;i++){
            iter = head.getLink();
        }

        return iter;
    }

    public Node<T> addFirst(Node<T> node){
        if(getHead() == null){
            setHead(node);
            setTail(node);
            setSize(getSize() + 1);
        }
        else{
            node.setLink(getHead());
            setHead(node);
            setSize(getSize() + 1);
        }

        return node;
    }
    public Node<T> addLast(Node<T> node){
        if(getHead() ==null){
            setHead(node);
            setTail(node);
            setSize(getSize() + 1);
        }
        else{
            getTail().setLink(node);
            node.setLink(null);
            setTail(node);
            setSize(getSize() + 1);
        }

        return node;
    }
    public Node<T> addIndex(Node<T> node, int index){
        Node<T> pre = searchByIndex(index);
        node.setLink(pre.getLink());
        pre.setLink(node);
        setSize(getSize()+1);

        return node;
    }



    public class Node<T>
    {
        private T data;
        private Node<T> link;

        public void setLink(Node<T> link) {
            this.link = link;
        }

        public T getData() {
            return data;
        }

        public Node<T> getLink() {
            return link;
        }
    }
}
