public class PalindromeMain
{
    public static boolean isPalindrome(LinkedListNode head) {
        LinkedListNode reversed = reverseAndClone(head);
        return isEqual(head, reversed);
    }

    public static LinkedListNode reverseAndClone(LinkedListNode node) {
        LinkedListNode head = null;
        while (node != null) {
            LinkedListNode n = new LinkedListNode(node.data); // Clone
            n.next = head;
            head = n;
            node = node.next;
        }
	// TODO What should it return? You will need to add this code
        return node;   // THis is not what you want, but it will compile
    }

    public static boolean isEqual(LinkedListNode one, LinkedListNode two) {
        while (one != null && two != null) {
            if (one.data == two.data)
        }
	// TODO YOU WILL NEED TO WRITE THIS CODE. It will compare the Two LinkedLists
	return true;  // This will change

    }

    public static void main(String[] args) {
        int length = 9;
        LinkedListNode[] nodes = new LinkedListNode[length];
        for (int i = 0; i < length; i++) {
            nodes[i] = new LinkedListNode(i >= length / 2 ? length - i - 1 : i, null, null);
        }

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                nodes[i].setNext(nodes[i + 1]);
            }
            if (i > 0) {
                nodes[i].setPrevious(nodes[i - 1]);
            }
        }
        // nodes[length - 2].data = 9; // Uncomment to ruin palindrome

        LinkedListNode head = nodes[0];


        // Write code to print out the potential Palindrone
        System.out.println(head.printForward());

        // Write code to verify that it works
        System.out.println(isPalindrome(head));
    }


}
