public class Singlylinkedlist {
    Node head;
    Node tail;
    
    public void TambahDepan(Buku data){
        Node newNode = new Node(data);

        if (head == null && tail == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void TambahBelakang(Buku data){
        Node newNode = new Node(data);
        if (head == null && tail == null){
            head = tail = newNode;
        head = tail = newNode;
    }else{
        tail.next = newNode;
        tail = newNode;
    }
}
    public void HapusDepan(){
        head = head.next;
    }
    public void HapusBelakang(){
        if (head == tail){
            head = tail = null;
        }else{
            Node iterator = head;
            while (iterator.next != tail){
                iterator = iterator.next;
            }
            tail = iterator;
            iterator.next =  null;
        }
    }

    public void print(){
        Node iterator = head;

        while (iterator != null) {
            System.out.println(iterator.data.getJudul());
            iterator = iterator.next;
        }
    }
}