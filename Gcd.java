public class Gcd {


    static int findGcd(int a,int b){
        int max=Math.max(a,b);
        int min=Math.min(a, b);
        if(max%min==0){
           
            return min;
        }
        int gcd=1;
        for(int i=1;i<min;i++){
            if(min%i==0&&max%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        ListNode prev=head;
        ListNode curr=head.next;

        if(head.next==null){
            return head;
        }

        while(curr!=null){

            int a=prev.val;
            int b=curr.val;

            int gcd=findGcd(a,b);

            ListNode newNode=new ListNode(gcd);

            // assinnging values=====
            prev.next=newNode;
            newNode.next=curr;
            
            //shifting pointers====
            prev=curr;
            curr=curr.next;
    }

    System.out.println(head);
    
}
