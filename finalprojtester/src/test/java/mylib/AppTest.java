
package mylib;
import mylib.datastructures.Linear.SLL;
import mylib.datastructures.Linear.DLL;
import mylib.datastructures.Linear.CDLL;
import mylib.datastructures.Linear.CSLL;
import mylib.datastructures.Linear.QueueLL;
import mylib.datastructures.Linear.StackLL;
import mylib.datastructures.nodes.DNode;
import mylib.datastructures.nodes.TNode;
import mylib.datastructures.Trees.AVL;
import mylib.datastructures.Trees.BST;








public class AppTest {








    public static void main(String[] args){
        System.out.println("\n======  Singly LINKED LIST ======= \n");
        SLL testerSLL = new SLL();
        SLL overloadSLL = new SLL(new DNode(14));
        System.out.println("____________OVERLOADED CONSTRUCTOR TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents after call to overloaded constructor:\nList length: 1\nSorted: true\nList content: 14");
        System.out.println("The actual results:");
        overloadSLL.print();
        testerSLL.insert(new DNode(18), 0);
        testerSLL.insert(new DNode(1), 1);
        System.out.println("____________REGULAR INSERTION TESTS___________");
        System.out.print("\n");
        System.out.println("The expected contents after inserting 18 and 1 at indexes 0 and 1 respectively:\nList length: 2\nSorted: false\nList content: 18 1");
        System.out.println("The actual results:");
        testerSLL.print();
        testerSLL.insertHead(new DNode(33));
        System.out.println("____________INSERTION HEAD TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents after inserting 33 at head:\nList length: 3\nSorted: false\nList content: 33 18 1");
        System.out.println("The actual results:");
        testerSLL.print();
        System.out.println("____________INSERTION TAIL TEST___________");
        System.out.print("\n");
        testerSLL.insertTail(new DNode(24));
        System.out.println("The expected contents after inserting 24 at tail:\nList length: 4\nSorted: false\nList content: 33 18 1 24");
        System.out.println("The actual results:");
        testerSLL.print();
        testerSLL.sort();
        testerSLL.sortedInsert(new DNode(0));
        testerSLL.sortedInsert(new DNode(11));
        testerSLL.sortedInsert(new DNode(27));
        testerSLL.insertHead(new DNode(39));
        testerSLL.sort();
        testerSLL.sortedInsert(new DNode(4));
        System.out.println("____________SORT and SORTED INSERTION TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents after calling sort method and various insert calls:\nList length: 9\nSorted: true\nList content:  0 1 4 11 18 24 27 33 39 ");
        System.out.println("The actual results:");
        testerSLL.print();
        testerSLL.delete(new DNode(24));
        System.out.println("____________DELETE Node TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents after deleting 24:\nList length: 8\nSorted: true\nList content: 0 1 4 11 18 27 33 39");
        System.out.println("The actual results:");
        testerSLL.print();
        testerSLL.deleteHead();
        System.out.println("____________DELETE HEAD TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents after deleting head:\nList length: 7\nSorted: true\nList content:  1 4 11 18 27 33 39");
        System.out.println("The actual results:");
        testerSLL.print();
        testerSLL.deleteTail();
        System.out.println("____________DELETE TAIL TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents after deleting tail:\nList length: 6\nSorted: true\nList content:  1 4 11 18 27 33");
        System.out.println("The actual results:");
        testerSLL.print();
        testerSLL.delete(new DNode(13));
        System.out.println("____________DELETE NOT IN LIST TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents when trying to delete 13:\nvalue not found");
        System.out.println("The actual results:");
        testerSLL.delete(new DNode(13));
        System.out.println("____________SEARCH  TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents when Searching for 4:\n4");
        System.out.println("The actual results:");
        System.out.println(testerSLL.search(new DNode(4)));
        System.out.println("____________SEARCH NOT IN TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents when Searching for 123:\nnull");
        System.out.println("The actual results:");
        System.out.println(testerSLL.search(new DNode(123)));
        System.out.println("____________CLEAR TEST___________");
        System.out.print("\n");
        System.out.println("The expected contents:\nList length: 0\nSorted: true\nList content:");
        System.out.println("The actual results:");
        testerSLL.clear();
        testerSLL.print();
        System.out.println("____________TESTS COMPLETE___________");
      
    

        System.out.println("\n======  DOUBLY LINKED LIST ======= \n");
   
   
            
    // Constructors

    SLL testerDLL = new DLL();
    SLL overloadDLL = new DLL(new DNode(14));
    System.out.println("____________OVERLOADED CONSTRUCTOR TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents after call to overloaded constructor:\nList length: 1\nSorted: true\nList content: 14");
    System.out.println("The actual results:");
    overloadDLL.print();


    // Insertion methods tests
    testerDLL.insert(new DNode(18), 0);
    testerDLL.insert(new DNode(1), 1);
    System.out.println("____________REGULAR INSERTION TESTS___________");
    System.out.print("\n");
    System.out.println("The expected contents after inserting 18 and 1 at indexes 0 and 1 respectively:\nList length: 2\nSorted: false\nList content: 18 1");
    System.out.println("The actual results:");
    testerDLL.print();




    testerDLL.insertHead(new DNode(33));
    

    System.out.println("____________INSERTION HEAD TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents after inserting 33 at head:\nList length: 3\nSorted: false\nList content: 33 18 1");
    System.out.println("The actual results:");
    testerDLL.print();
    

    System.out.println("____________INSERTION TAIL TEST___________");
    System.out.print("\n");


 
  
    testerDLL.insertTail(new DNode(24));
    System.out.println("The expected contents after inserting 24 at tail:\nList length: 4\nSorted: false\nList content: 33 18 1 24");
    System.out.println("The actual results:");
    testerDLL.print();





    testerDLL.sort();
    testerDLL.sortedInsert(new DNode(0));
    testerDLL.sortedInsert(new DNode(11));
    testerDLL.sortedInsert(new DNode(27));
    testerDLL.insertHead(new DNode(39));
    testerDLL.sort();
    testerDLL.sortedInsert(new DNode(4));
    System.out.println("____________SORT and SORTED INSERTION TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents after calling sort method and various insert calls:\nList length: 9\nSorted: true\nList content:  0 1 4 11 18 24 27 33 39 ");
    System.out.println("The actual results:");
    testerDLL.print();




    testerDLL.delete(new DNode(24));


    System.out.println("____________DELETE Node TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents after deleting 24:\nList length: 8\nSorted: true\nList content: 0 1 4 11 18 27 33 39");
    System.out.println("The actual results:");
    testerDLL.print();



    testerDLL.deleteHead();

    System.out.println("____________DELETE HEAD TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents after deleting head:\nList length: 7\nSorted: true\nList content:  1 4 11 18 27 33 39");
    System.out.println("The actual results:");
    testerDLL.print();


    testerDLL.deleteTail();

    System.out.println("____________DELETE TAIL TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents after deleting tail:\nList length: 6\nSorted: true\nList content:  1 4 11 18 27 33");
    System.out.println("The actual results:");
    testerDLL.print();

    testerDLL.delete(new DNode(13));
    System.out.println("____________DELETE NOT IN LIST TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents when trying to delete 13:\nvalue not found");
    System.out.println("The actual results:");
    testerDLL.delete(new DNode(13));




  
   
    System.out.println("____________SEARCH  TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents when Searching for 4:\n4");
    System.out.println("The actual results:");
    System.out.println(testerDLL.search(new DNode(4)));

    System.out.println("____________SEARCH NOT IN TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents when Searching for 123:\nnull");
    System.out.println("The actual results:");
    System.out.println(testerDLL.search(new DNode(123)));
  
    System.out.println("____________CLEAR TEST___________");
    System.out.print("\n");
    System.out.println("The expected contents:\nList length: 0\nSorted: true\nList content:");
    System.out.println("The actual results:");
    testerDLL.clear();
    testerDLL.print();
    System.out.println("____________TESTS COMPLETE___________");



    System.out.println("\n====== CIRCULARLY DOUBLY LINKED LIST ======= \n");

        
            SLL testerCDLL = new CDLL();
            SLL overloadCDLL = new CDLL(new DNode(14));
            System.out.println("____________OVERLOADED CONSTRUCTOR TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents after call to overloaded constructor:\nList length: 1\nSorted: true\nList content: 14");
            System.out.println("The actual results:");
            overloadCDLL.print();
        
        
            // Insertion methods tests
            testerCDLL.insert(new DNode(18), 0);
            testerCDLL.insert(new DNode(1), 1);
            System.out.println("____________REGULAR INSERTION TESTS___________");
            System.out.print("\n");
            System.out.println("The expected contents after inserting 18 and 1 at indexes 0 and 1 respectively:\nList length: 2\nSorted: false\nList content: 18 1");
            System.out.println("The actual results:");
            testerCDLL.print();
        
        
        
            
            testerCDLL.insertHead(new DNode(33));
            
    
            System.out.println("____________INSERTION HEAD TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents after inserting 33 at head:\nList length: 3\nSorted: false\nList content: 33 18 1");
            System.out.println("The actual results:");
            testerCDLL.print();
                
        
            System.out.println("____________INSERTION TAIL TEST___________");
            System.out.print("\n");
        
        
            
            
            testerCDLL.insertTail(new DNode(24));
            System.out.println("The expected contents after inserting 24 at tail:\nList length: 4\nSorted: false\nList content: 33 18 1 24");
            System.out.println("The actual results:");
            testerCDLL.print();
        
        
        
        
        
            testerCDLL.sort();
            testerCDLL.sortedInsert(new DNode(0));
            testerCDLL.sortedInsert(new DNode(11));
            testerCDLL.sortedInsert(new DNode(27));
            testerCDLL.insertHead(new DNode(39));
            testerCDLL.sort();
            testerCDLL.sortedInsert(new DNode(4));
            System.out.println("____________SORT and SORTED INSERTION TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents after calling sort method and various insert calls:\nList length: 9\nSorted: true\nList content:  0 1 4 11 18 24 27 33 39 ");
            System.out.println("The actual results:");
            testerCDLL.print();
        
        
        
        
            testerCDLL.delete(new DNode(24));
        
        
            System.out.println("____________DELETE Node TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents after deleting 24:\nList length: 8\nSorted: true\nList content: 0 1 4 11 18 27 33 39");
            System.out.println("The actual results:");
            testerCDLL.print();
        
        
        
            testerCDLL.deleteHead();
        
            System.out.println("____________DELETE HEAD TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents after deleting head:\nList length: 7\nSorted: true\nList content:  1 4 11 18 27 33 39");
            System.out.println("The actual results:");
            testerCDLL.print();
        
        
            testerCDLL.deleteTail();
        
            System.out.println("____________DELETE TAIL TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents after deleting tail:\nList length: 6\nSorted: true\nList content:  1 4 11 18 27 33");
            System.out.println("The actual results:");
            testerCDLL.print();
        
            testerCDLL.delete(new DNode(13));
            System.out.println("____________DELETE NOT IN LIST TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents when trying to delete 13:\nvalue not found");
            System.out.println("The actual results:");
            testerCDLL.delete(new DNode(13));
        
        
        
        
            
            
            System.out.println("____________SEARCH  TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents when Searching for 4:\n4");
            System.out.println("The actual results:");
            System.out.println(testerCDLL.search(new DNode(4)));
        
            System.out.println("____________SEARCH NOT IN TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents when Searching for 123:\nnull");
            System.out.println("The actual results:");
            System.out.println(testerCDLL.search(new DNode(123)));
            
            System.out.println("____________CLEAR TEST___________");
            System.out.print("\n");
            System.out.println("The expected contents:\nList length: 0\nSorted: true\nList content:");
            System.out.println("The actual results:");
            testerCDLL.clear();
            testerCDLL.print();
            System.out.println("____________TESTS COMPLETE___________");
            


            System.out.println("\n====== CIRCULAR SINGLY LINKED LIST ======n");
            CSLL circular = new CSLL();
            System.out.println("____________OVERLOADCONSTRUCTOR TEST___________");
            CSLL circularItem = new CSLL(new DNode(14));
            System.out.println("The expected contents:\nList length: 1\nSorted: true\nList content: 14");
            System.out.println("The actual results:");
            circularItem.print();
            
            System.out.println("____________INSERTTAIL TEST___________");
            circular.insertTail(new DNode(16));
            circular.insertTail(new DNode(55));
            circular.insertTail(new DNode(15));
            System.out.println("The expected contents:\nList length: 3\nSorted: false\nList content: 16 55 15");
            System.out.println("The actual results:");
            circular.print();
        
        
            System.out.println("____________INSERT TEST___________");
            circular.insert(new DNode(17), 2);
            circular.insert(new DNode(22), 0);
            System.out.println("The expected contents:\nList length: 5\nSorted: false\nList content: 22 16 17 55 15");
            System.out.println("The actual results:");
            circular.print();
        
        
            System.out.println("____________INSERTHEAD TEST___________");
            circular.insertHead(new DNode(87));
            circular.insertHead(new DNode(63));
            System.out.println("The expected contents:\nList length: 7\nSorted: false\nList content: 63 87 22 16 17 55 15");
            System.out.println("The actual results:");
            circular.print();
        
        
            System.out.println("____________SORTEDINSERT TEST___________");
            circular.sortedInsert(new DNode(6));
            System.out.println("The expected contents:\nList length: 8\nSorted: true\nList content: 6 15 16 17 22 55 63 87");
            System.out.println("The actual results:");
            circular.print();
        
        
            System.out.println("____________DELETETAIL TEST___________");
            circular.deleteTail();
            System.out.println("The expected contents:\nList length: 7\nSorted: true\nList content: 6 15 16 17 22 55 63");
            System.out.println("The actual results:");
            circular.print();
        
        
            System.out.println("____________DELETEHEAD TEST___________");
            circular.deleteHead();
            System.out.println("The expected contents:\nList length: 6\nSorted: true\nList content: 15 16 17 22 55 63");
            System.out.println("The actual results:");
            circular.print();
        
        
            System.out.println("____________SEARCH TEST___________");
            System.out.println("Search for 17: ");
            System.out.println("Expected result: 17");
            System.out.println("Actual result: "+circular.search(new DNode(17)));
            System.out.println("Search for 1234: ");
            System.out.println("Expected result: null");
            System.out.println("Actual result: "+circular.search(new DNode(1234)));
        
        
            System.out.println("____________DELETE TEST___________");
            circular.delete(new DNode(55));
            System.out.println("The expected contents:\nList length: 5\nSorted: true\nList content: 15 16 17 22 63");
            System.out.println("The actual results:");
            circular.print();
        
        
            System.out.println("____________SORT TEST___________");
            System.out.println("Adding items to unsort list again:");
            circular.insert(new DNode(98), 2);
            System.out.println("The expected contents:\nList length: 6\nSorted: false\nList content: 15 16 98 17 22 63");
            circular.print();
            System.out.println("The actual results:");
            System.out.println("Now sorting: ");
            circular.sort();
            System.out.println("The expected contents:\nList length: 6\nSorted: true\nList content: 15 16 17 22 63 98");
            System.out.println("The actual results:");
            circular.print();
        
        
            System.out.println("____________ISEMPTY TEST BEFORE CLEAR___________");
            System.out.println("The expected value for search: false");
            System.out.println("Checking if CSLL is empty: " + circular.isEmpty());
        
        
            System.out.println("____________CLEAR TEST___________");
            circular.clear();
            circular.print();
        
        
            System.out.println("____________ISEMPTY TEST AFTER CLEAR___________");
            System.out.println("The expected value for search: true");
            System.out.println("Checking if CSLL is empty: " + circular.isEmpty());





       System.out.println("\n====== TESTS FOR QUEUELL ======\n");
       QueueLL newQueue = new QueueLL();
       QueueLL queueItem = new QueueLL(new DNode(11));


       System.out.println("____________OVERLOADEDCONSTRUCTOR TEST___________");
       System.out.println("The expected contents:\nList length: 1\nSorted: true\nList content: 11");
       System.out.println("The actual results:");
       queueItem.print();
       System.out.println();


       System.out.println("____________ENQUEUE TEST___________");
       newQueue.enqueue(new DNode(22));
       newQueue.enqueue(new DNode(9));
       newQueue.enqueue(new DNode(12));
       newQueue.enqueue(new DNode(51));
       newQueue.enqueue(new DNode(61));
       System.out.println("The expected contents:\nList length: 5\nSorted: false\nList content: 22 9 12 51 61");
       System.out.println("The actual results:");
       newQueue.print();
       System.out.println();


       System.out.println("____________DEQUEUE TEST___________");
       DNode poppedValue = newQueue.dequeue();
       System.out.println("The expected value when dequeuing: 22");
       System.out.println("Dequeued value: " + poppedValue);
       System.out.println("\tChecking the queue print:");
       newQueue.print();


       System.out.println();
       DNode poppedValue2 = newQueue.dequeue();
       System.out.println("The expected value when dequeuing: 9");
       System.out.println("Dequeued value: " + poppedValue2);
       System.out.println("\tChecking the queue print:");
       newQueue.print();


       System.out.println();
       System.out.println("____________PEEK TEST___________");
       System.out.println("The expected value when peeking: 12");
       System.out.println("Peeked value: " + newQueue.peek());
       System.out.println();


       System.out.println("____________SEARCH TEST___________");
       System.out.println("Search for value: 7");
       System.out.println("The expected value for search: null");
       DNode nodeToFind = new DNode(7);
       DNode found = newQueue.search(nodeToFind);
       System.out.println("The actual results: "+found);


       System.out.println("\nSearch for value: 61");
       System.out.println("The expected value for search: 61");
       DNode nodeToFind2 = new DNode(61);
       DNode found2 = newQueue.search(nodeToFind2);
       System.out.println("The actual results: "+found2);


       System.out.println("____________ISEMPTY TEST BEFORE CLEAR___________");
       System.out.println("The expected value for search: false");
       System.out.println("The actual results: " + newQueue.isEmpty());


       System.out.println("____________CLEAR TEST___________");
       newQueue.clear();
       System.out.println("Checking queue status:");
       newQueue.print();


       System.out.println("____________ISEMPTY TEST AFTER CLEAR___________");
       System.out.println("The expected value for search: true");
       System.out.println("\nCheck if queue is empty after clear: "+ newQueue.isEmpty());


       System.out.println("\n====== TESTS FOR STACKLL ======\n");
       StackLL newStack = new StackLL();
       StackLL stackItem = new StackLL(new DNode(8));


       System.out.println("____________OVERLOADEDCONSTRUCTOR TEST___________");
       System.out.println("The expected contents:\nList length: 1\nSorted: true\nList content: 8");
       System.out.println("The actual results:");
       stackItem.print();
       System.out.println();


       System.out.println("____________PUSH TEST___________");
       newStack.push(new DNode(46));
       newStack.push(new DNode(17));
       newStack.push(new DNode(15));
       newStack.push(new DNode(9));
       newStack.push(new DNode(2));
       newStack.push(new DNode(122));
       System.out.println("pushed values 46, 17, 15, 9, 2, 122");
       System.out.println("The expected contents:\nList length: 6\nSorted: false\nList content: 122 2 9 15 17 46");
       newStack.print();


       System.out.println("____________POP TEST___________");
       DNode poppedValuestack = newStack.pop();
       System.out.println("Expected popped value: 122");
       System.out.println("Popped value: " + poppedValuestack);
       System.out.println("\tChecking the stack print:");
       newStack.print();


       System.out.println();
       DNode poppedValuestack2 = newStack.pop();
       System.out.println("Expected popped value: 2");
       System.out.println("Popped value: " + poppedValuestack2);
       System.out.println("\tChecking the stack print:");
       newStack.print();


       System.out.println("____________PEEK TEST___________");
       System.out.println("The expected value when peeking: 9");
       System.out.println("Peeked value: " + newStack.peek());
       System.out.println();


       System.out.println("____________SEARCH TEST___________");
       System.out.println("Search for value: 5");
       System.out.println("The expected value for search: null");
       DNode nodeToFindstack = new DNode(5);
       DNode foundstack = newStack.search(nodeToFindstack);
       System.out.println("The actual results: "+foundstack);


       System.out.println("Search for value: 17");
       System.out.println("The expected value for search: 17");
       DNode nodeToFindstack2 = new DNode(17);
       DNode foundstack2 = newStack.search(nodeToFindstack2);
       System.out.println("The actual results: "+foundstack2);
      
       System.out.println("____________ISEMPTY TEST BEFORE CLEAR___________");
       System.out.println("The expected value: False");
       System.out.println("The actual results: " + newStack.isEmpty());


       System.out.println("____________CLEAR TEST___________");
       newStack.clear();
       System.out.println("Checking queue status:");
       newStack.print();


       System.out.println("____________ISEMPTY TEST AFTER CLEAR___________");
       System.out.println("The expected value for search: true");
       System.out.println("\nCheck if queue is empty after clear: "+ newStack.isEmpty());





       TNode nodeTest = new TNode(13, 0, null, null, null);
       int[] treeData = { 124, 359, 126, 18, 16, 55, 2 };
       BST newAVL = new AVL();
        for (int x = 0; x < treeData.length; x++) {
           newAVL.insert(treeData[x]);
       }


       System.out.println("====== BST TESTS======\n");


       System.out.println("____________OVERLOADCONSTRUCTOR TESTS___________");
       System.out.println("Testing AVL integer constructor...");
       BST avlOverload1 = new AVL(5);
       System.out.println("expected to print: 5");
       avlOverload1.printBF();
       System.out.println("Testing AVL TNode constructor...");
       BST avlOverload2 = new AVL(nodeTest);
       System.out.println("expected to print: 13");
       avlOverload2.printBF();


       System.out.println();
      
       System.out.println("____________SEARCH TESTS___________");
       System.out.println("Searching for 126...\nexpected value: 126");
       TNode searchTest1 = newAVL.search(126);
       if(searchTest1 != null) {
            System.out.println("Actual value returned: " + searchTest1.getData());
       }


       System.out.println("Searching for 15...\nexpected value: Value not found");
       TNode searchtest2 = newAVL.search(15);
       if(searchtest2 != null) {
            System.out.println("Actual value returned: " + searchtest2.getData());
       }


       System.out.println("____________PRINTINORDER TESTS___________");
       newAVL.printInOrder();
       System.out.println();


       System.out.println("____________PRINTNODESBALANCE TESTS___________");
       System.out.println("Print the balance at each node:\n");
       newAVL.printNodesBalance();
       System.out.println();
       System.out.println("____________PRINTBREADTHFIRST TESTS___________");
       newAVL.printBF();


       System.out.println("____________INSERT TESTS___________");
       System.out.println("After inserting 69 into tree:");
       newAVL.insert(69);
       newAVL.printBF();
       System.out.println();
       newAVL.printNodesBalance();


       System.out.println("\nInserting node through TNode constructor:");
       newAVL.insert(nodeTest);
       newAVL.printBF();
       System.out.println();
       newAVL.printNodesBalance();


       System.out.println("____________DELETE TESTS___________");
       System.out.println("After deleting 16 from tree:");
       newAVL.delete(16);
       newAVL.printBF();

       System.out.println("Try to delete value not in tree:");
       newAVL.delete(123456);


       System.out.println("\nChecking the balance at each node...\n");
       newAVL.printNodesBalance();
       System.out.println();
       System.out.println("After deleting 359 from tree:");
       newAVL.delete(359);
       newAVL.printBF();


       System.out.println("\nChecking the balance at each node...\n");
       newAVL.printNodesBalance();


       TNode nodeTestBST = new TNode(13, 0, null, null, null);
       int[] treeDataBST = { 1, 8, 0, 6, 5, 12, 123, 87, 89, 39 };
       BST newBST = new BST();
        for (int x = 0; x < treeDataBST.length; x++) {
           newBST.insert(treeDataBST[x]);
       }


       System.out.println("====== BST TESTS======\n");


       System.out.println("____________OVERLOADCONSTRUCTOR TESTS___________");
       BST bstOverload1 = new BST(5);
       System.out.println("expected to print: 5");
       bstOverload1.printBF();
       BST bstOverload2 = new BST(nodeTestBST);
       System.out.println("expected to print: 13");
       bstOverload2.printBF();


       System.out.println();


       System.out.println("____________SEARCH TESTS___________");
       System.out.println("expected value: 12");
       TNode searchTestBST1 = newBST.search(12);
       if(searchTestBST1 != null) {
            System.out.println("Actual value returned: " + searchTestBST1.getData());
       }


       System.out.println("expected value: Value not found");
       TNode searchtestBST2 = newBST.search(15);
       if(searchtestBST2 != null) {
            System.out.println("Actual value returned: " + searchtestBST2.getData());
       }
     
       System.out.println("____________PRINTINORDER TESTS___________");
       newBST.printInOrder();


       System.out.println();


       System.out.println("____________PRINTNODESBALANCE TESTS___________");
       System.out.println("Print the balance at each node:\n");
       newBST.printNodesBalance();




       System.out.println("____________PRINTBREADTHFIRST TESTS___________");
       newBST.printBF();


       System.out.println("____________INSERT TESTS___________");
       System.out.println("After inserting 69 into tree:");
       newBST.insert(69);
       newBST.printBF();


       System.out.println("\nInserting node through TNode constructor:");
       newBST.insert(nodeTestBST);
       newBST.printBF();


       System.out.println("____________DELETE TESTS___________");
       System.out.println("After deleting 8 from tree:");
       newBST.delete(8);
       newBST.printBF();

       System.out.println("Delete value that doesn't exist:");
       newBST.delete(123456);






    
      
    
    }













}



        