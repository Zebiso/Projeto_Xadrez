package boardgame;

public class Position {
    
    private int row; 
    private int collum;
    
    public Position(int row, int collum) {
        this.row = row;
        this.collum = collum;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCollum() {
        return collum;
    }

    public void setCollum(int collum) {
        this.collum = collum;
    }

    public void setValues(int row, int collumn){
        this.row= row;
        this.collum= collumn;
    }

    @Override
    public String toString (){
        return row + " , " + collum;
    }
    
}