public class TestMediaPlayer {
    
    public static void main (String [] args){

        MediaPlayer player1 = new MediaPlayer();

        player1.setVolume(10);
        player1.setState("Playing");

        System.out.println(player1.getVolume());
        System.out.println(player1.getPlaybackState());

        player1.increaseVolume();
        
    }
}
