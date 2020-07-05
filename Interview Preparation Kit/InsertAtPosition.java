import java.io.*;


public class InsertAtPosition {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head,int data,int position)
{
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data); 
        SinglyLinkedListNode temp = head;

            for(int i=0;i<position-1; i++)
            {
                temp = temp.next;           //to go previous node of position!!! 
            }
            SinglyLinkedListNode nxtNode = temp.next;   //copy next node address!!!
            temp.next = newNode;
            newNode.next = nxtNode;
       
        return head;
} 
}