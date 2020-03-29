/**
 * @author HimelSaha
 *
 */

public class Queue {

    listNode front = null;                        // front holds the reference to the listNode object at the front of the queue
    listNode rear = null;                         // rear holds the reference to the listNode object at the back of the queue

    /**
     * This method pushes a string at the back of the queue.
     *
     * @param arg, the string to be pushed into the queue.
     */
    void enqueue(String arg) {
        listNode node = new listNode();           // creates a new listNode object
        node.data = arg;                          // new data being assigned in the listNode field data
        node.next = null;                         // listNode object added at the back of the queue has no listNode objects after it, so its next field is assigned to null
        if (rear != null) {                       // if the queue is not empty, the second last listNode object's next field refers to the
            rear.next = node;                     //  newly created node, which happens to tbe the last object in the queue
        } else {
            front = node;                         // if the queue is empty, the front refers to the new node object
        }
        rear = node;                              // the rear refers to the last listNode object in the queue
    }

    /**
     * This method pops a string out from the front of the queue.
     *
     * @return the string that has been popped out and printing it at the same
     * time.
     */
    String dequeue() {
        if (front != null) {
            if (front == rear) {
                rear = null;                      // if there is only one listNode object in the queue, the rear is set to null
            }
            String j = front.data;                // the data in the listNode object at the front of the queue is stored in a variable
            front = front.next;                   // the front now refers to the next listNode object from the start of the queue
            return j;                             // the data in the listNode object at the front of the queue is returned
        } else {
            return null;                          // if the queue is empty, null is returned
        }
    }

    class listNode {

        String data;            // data in the listNode object is of type String
        listNode next;          // reference to the next listNode object
    }

}
