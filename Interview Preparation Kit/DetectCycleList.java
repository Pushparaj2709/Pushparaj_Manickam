
public class DetectCycleList {
}
/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/
/*
boolean hasCycle(Node head) {
    if(head==null || head.next==null)
    {
        return false;
    }
    HashSet<Node> Check = new HashSet<Node>();
        while(head!=null)
        {
            if(Check.contains(head))
            {
                return true;
            }
            else
            {
                Check.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
*/