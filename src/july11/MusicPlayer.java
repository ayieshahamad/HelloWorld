package july11;

public class MusicPlayer {
    private Song[] playList;
    private int index ;
    MusicPlayer(){
        index = 0;
        playList = new Song[10];
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void add(String title, String auther){
        playList[index] = new Song(title,auther);
        index ++;
    }
    public void play(int songIndex){
        playList[songIndex-1].play();
    }
    public  void showPlayList(){

        for(int i =0 ; i < index; i++){
            System.out.println((i+1) +" "+ playList[i].getTitle() +" by "+ playList[i].getAuther());
        }


    }
}
