package learning.springboot.domain;

public class Anime {
    private String name;

    public Anime(String name){
        this.name = name;
    }

    public Anime() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
