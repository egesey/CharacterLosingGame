package Comp2112.FirstPart;

class DoubleNode {

    String name;
    DoubleNode next;
    DoubleNode previous;
    private final String originalName;

    public DoubleNode(String name) {
        this.name = name;
        this.next = null;
        this.previous = null;
        this.originalName = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalName() {
        return originalName;
    }
}
