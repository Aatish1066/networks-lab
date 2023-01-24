package ll_impl;

import javax.management.remote.SubjectDelegationPermission;

public class ll_bus{
    class node{
        int data;
        String address;
        node next;
        node prev;

        public node(int data,String address){
            this.data=data;
            this.address=address;
            this.next=null;
            this.prev=null;
        }
    }
    public node head=null;
    public node tail=null;
    public void addNode(int data, String address){
        node newNode = new node(data,address);
        if(head==null){
            head=tail=newNode;
            head.prev=null;
            tail.next=null;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;

        }
    }
    public void display(){

        node current= head;
        if(head==null){
            System.out.println("empty network");
            return ;
        }
        System.out.println("Nodes of a bus network are: ");
        while(current !=null){
            System.out.println(current.data+"  as address : "+current.address);
            current=current.next;
        }

    }
    public void comm(String address1,String address2,String message){
        int flag=0;
        node current=head;
        while(flag==0 && current !=null){
            if(current.address==address1){
                System.out.println("the message for "+address2);
            }
            else if (current.address == address2){
                System.out.println("the message from "+address1+" is :"+message);
                flag=1;

            }
            else{
                System.out.println("no such address");
            }
            current=current.next;

        }
    }
}