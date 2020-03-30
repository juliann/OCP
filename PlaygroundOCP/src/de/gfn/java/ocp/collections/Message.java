package de.gfn.java.ocp.collections;

/**
 *
 * @author tlubowiecki
 */
class Message {

    private String msg;
    
    Message(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}
