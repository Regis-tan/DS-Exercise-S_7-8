package DataStructures_Projects;

public class S7_NodeList {
    // Node Class
    private static class Node<E>{
        // Attributes
        private E element;
        private Node<E> next;

        // Constructors
        private Node(E assign_element){
            element = assign_element;
            next = null;
        }

        private Node(E assign_element, Node<E> next_node){
            element = assign_element;
            next = next_node;
        }
    }

    // Linked List class
    public class SingleLinkedList<E> {
        // Attributes
        private Node<E> head = null;
        private int size = 0;

        public void addFirst(E item){
            head = new Node<>(item, head);
            size++;
        }

        private void addAfter(Node<E> node, E item){
            node.next = new Node<>(item, node.next);
            size++;
            System.out.println("A Node has been added");
        }
        
        private E removeAfter(Node<E> node){
            Node<E> current_next = node.next;
            
            if (current_next != null) {
                node.next = current_next.next;
                size --;
                System.out.println("A Node has been removed");
                return current_next.element;
            } else{
                return null;
            }
        }

        private E removeFirst() {
            Node<E> current_first = head;
            if (head != null){
                head = head.next;
            }
            if (current_first != null){
                size --;
                System.out.println("The first Node have been removed");
                return current_first.element;
            } else{
                return null;
            }
        }

    }
    
    // Executor
    public static void main(String[] args) {
        S7_NodeList nodeList = new S7_NodeList();
        SingleLinkedList<String> people = nodeList.new SingleLinkedList<>();
        
        people.addFirst("Sam");
        people.addFirst("Harry");
        people.addFirst("Mark");
        people.addFirst("Tom");
        people.addAfter(people.head.next, "Bob");
        people.removeAfter(people.head);
        people.removeFirst();

        Node<String> current = people.head;
        while (current != null) {
            System.out.println(current.element);
            current = current.next;
        }
    }
}
