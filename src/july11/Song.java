package july11;

public class Song {
    private String title;
    private String auther;

    public Song(){
        title = "";
        auther = "";
    }
    public Song(String title, String auther) {
        this.title = title;
        this.auther = auther;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuther() {
        return auther;
    }
    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String toString(){
        return  "title= " + title  +
                "\nauther= " + auther;
    }
    public void play(){
        System.out.println("Currentlty playing " +title+ " by " +auther+ "...\n ..... Song ended");
    }
}
