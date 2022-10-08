public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean start=true;
        ListNode root=new ListNode();
        ListNode l3=root;
        int remainder=0;
        while(l1!=null||l2!=null||remainder!=0)
        {
            if(l1==null&&l2!=null)
            {
                l3.val=(l2.val+remainder)>9?(l2.val+remainder)%10:(l2.val+remainder);
                remainder=((l2.val+remainder)>9)?(l2.val+remainder)/10:0;
            }
             if(l2==null&&l1!=null)
             {
                l3.val=(l1.val+remainder)>9?(l1.val+remainder)%10:(l1.val+remainder);
                 remainder=((l1.val+remainder)>9)?(l1.val+remainder)/10:0;
             }
            if(l1!=null&&l2!=null)
            {
                l3.val=(l1.val+l2.val+remainder)>9?(l1.val+l2.val+remainder)%10:(l1.val+l2.val+remainder);
                remainder=(l1.val+l2.val+remainder)>9?(l1.val+l2.val+remainder)/10:0;
            }
            if(l1==null&&l2==null&&remainder>0)
            {
                l3.val=remainder;
                remainder=0;
            }
            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2=l2.next;
            if(l1!=null||l2!=null||remainder!=0)
                l3.next=new ListNode();
            l3=l3.next;
            start=false;
            
        }
        return root;
        
    }
