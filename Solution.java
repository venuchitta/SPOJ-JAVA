//Please uncomment the comments that are enclosed by "/* */" to test the program in an IDE
package javaapplication12;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static class LinkedListNode{
	    int val;
	    LinkedListNode next;
	
	    LinkedListNode(int node_value) {
	        val = node_value;
	        next = null;
	    }
	}

static LinkedListNode reverse(LinkedListNode list, int k) {
        // YOUR CODE GOES HERE
     LinkedListNode head=reverse_list(list);
     int index = 1;
    if (k == 1)
        return head;
    while (head!=null) {
        while (head.next != null && index < k) {
            head = head.next;
            index++;
        }
        reverse_pointers(head, k);
    }


    return null;
        }

static LinkedListNode reverse_pointers(LinkedListNode list,int rotation) {
    LinkedListNode previous = null;
    int index =1;
    while (list.next!=null && index < rotation)
    {
        LinkedListNode next = list.next;
        list.next = previous;
        previous = list;
        list = next;
        index++;
    }
    return list;

}
static LinkedListNode reverse_list(LinkedListNode list){
    LinkedListNode head=list;
    while (head.next != null)
        head = head.next;

    return head;
}


/** @return {@link LinkedListNode} head of the linked list containing the given values */
static LinkedListNode createFromList(List<Integer> list) {
        LinkedListNode head = null;
        LinkedListNode node = null;
        for (int val : list) {
        LinkedListNode prev = node;
        node = new LinkedListNode(val);
        if (head == null)
        head = node;

        if (prev != null)
        prev.next = node;
        }

        return head;
        }

/** Asserts that two linked lists are equal */
static void assertLinkedListsEqual(LinkedListNode root1, LinkedListNode root2) {
        LinkedListNode node1 = root1;
        LinkedListNode node2 = root2;
        while (node1 != null && node2 != null) {
        if (node1.val != node2.val)
        throw new AssertionError("Expected " + printLinkedList(root1) + " but found " + printLinkedList(root2));
        node1 = node1.next;
        node2 = node2.next;
        }

        if (node1 == null ^ node2 == null)
        throw new AssertionError("Expected " + printLinkedList(root1) + " but found " + printLinkedList(root2));
        }

/** Prints the linked lists */
static String printLinkedList(LinkedListNode head) {
        StringBuilder sb = new StringBuilder();
        LinkedListNode node = head;
        while (node != null) {
        if (node != head)
        sb.append(',');
        sb.append(node.val);
        node = node.next;
        }
        return sb.toString();
        }

private static void basicTest() {
        LinkedListNode testLinkedList = createFromList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        LinkedListNode reversed = reverse(testLinkedList, 2);
        LinkedListNode expected = createFromList(Arrays.asList(8, 9, 6, 7, 4, 5, 2, 3, 1));
        assertLinkedListsEqual(expected, reversed);
        }

    public static void main(String[] args) {
        basicTest();
    }
}
