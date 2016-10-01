package tk.lucassalinas.tanglebrain;

/**
 * Created by lucas on 22/05/2016.
 */
public class Score {
    private int id;
    private int score;

    public Score(){}
    public Score(int id, int score){
        super();
        this.id = id;
        this.score = score;
    }

    public Score(int score){
        super();
        this.score = score;
    }

    //getters & setters

    public String toString(){
        return "Scr [id=" + id + ", scoreUser=" + score + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setStringScore(String score){
        this.score = Integer.parseInt(score);
    }

    public String getString(){return Integer.toString(this.score);}
}
