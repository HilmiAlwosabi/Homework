package HW5;

public class tallyCounter {
    private int number;
    private int count;
    private int max;

    public tallyCounter() {
        this.number = 0;
        this.count = 0;
        this.max=0;
    }

    public int getNumber() {
        return number;
    }
    
    public void setNumber() {
        if(this.getMax() > this.number)
        this.number++;
        else 
            this.number+=0;
    }
    
    public void resate() {
        this.number = 0;
    }
    
    public void undo() {
        if(this.count == 0) {
           this.number--;
           this.count++;
        } 
        else 
            this.number -= 0;
    }  

    public int getMax() {
        return max;
    }
    
    
    public void setmax(int leight){
        this.max = leight;
    }
}
