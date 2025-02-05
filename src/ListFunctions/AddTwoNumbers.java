
class AddTwoNumbers {

    public static void main(String[] args) {
        // Example usage (replace with your test cases)

        ListNode l1 = new ListNode(0);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers sol = new AddTwoNumbers();
        ListNode result = sol.addTwoNumbers(l1, l2);

        // Print the result (for testing)
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        System.out.println();
    }

    static ListNode head = null;
    public static void insertHead(char data){
        if(head==null){
            ListNode temp = new ListNode();
            temp.val = data - '0'; // Convert char to int
            head=temp;
        }
        else{
            ListNode temp = new ListNode();
            temp.val=data - '0'; // Convert char to int
            temp.next=head;
            head=temp;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode temp1 = l1;
        String list1 = "";
        while(temp1!=null){
            list1+=temp1.val;
            temp1=temp1.next;
        }
        StringBuilder sb1 = new StringBuilder(list1);
        sb1.reverse();
        String list2 = "";
        ListNode temp2 = l2;
        while(temp2!=null){
            list2+=temp2.val;
            temp2=temp2.next;
        }
        StringBuilder sb2 = new StringBuilder(list2);
        sb2.reverse();

        try {
            int val1 = Integer.parseInt(sb1.toString());
            int val2 = Integer.parseInt(sb2.toString());
            int finalOne  = val1+val2;
            String length = String.valueOf(finalOne);
            int index = 0;
            while(index<length.length()){
                char m = length.charAt(index);
                insertHead(m);
                index++; // Added index increment
            }
        } catch (NumberFormatException e) {
            // Handle potential overflow, e.g., using BigInteger
            System.err.println("Number too large for integer. Consider using BigInteger.");
            return null; // Or another appropriate handling
        }

        return head;


    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


}
