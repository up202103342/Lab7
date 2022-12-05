package pt.up.fe.ldts.example5;

public class Turtle {
    private int row;
    private int column;
    private TurtleState direction;

    public Turtle(int row, int column, TurtleState direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
        direction.setTurtle(this);
    }
    public char getStateChar() {
        return direction.getChar();
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public TurtleState getDirection() {
        return direction;
    }

    public void execute(char command) {
        if (command == 'L') { // ROTATE LEFT
            direction.rotateLeft();
        } else if (command == 'R') { // ROTATE RIGHT
            direction.rotateRight();
        } else if (command == 'F'){ // MOVE FORWARD
            direction.moveForward();
        }
    }

    public void setRow(int row) {
        this.row = row;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public void setDirection(TurtleState direction) {
        this.direction = direction;
    }
}
