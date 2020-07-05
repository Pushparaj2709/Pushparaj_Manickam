import java.io.*;
public class MergePoint {

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
   static int length(SinglyLinkedListNode head)
    {
        int len = 0;
        while(head!=null)
        {
            len++;
            head = head.next;
        }
        return len;
    }
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int FirstLength = length(head1);
        int SecondLength = length(head2);
        int Distance = FirstLength - SecondLength;
        if(SecondLength>FirstLength)
        {
            SinglyLinkedListNode temp = head2;
            head2 = head1;
            head1 = temp;
            Distance = SecondLength - FirstLength;
        }
           for(int i=0;i<Distance;i++)
        {
            head1 = head1.next; 
        }
        while(head1!=null && head2!=null)
        {
            if(head1==head2)
            {
                return head1.data;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return 0;
    }

}