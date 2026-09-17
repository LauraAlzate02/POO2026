public class MediaPlayer {

    private int volume = 0;
    private String playback_state = "";


    public void setVolume(int newVolume){
        if(volume >= 0 || volume <= 100){
            this.volume = newVolume;
        }
        else  {
            System.out.println("Volume not valid");
            volume = 0;
        }
        
    }

    public void setState(String newPlayback_state){
        if(newPlayback_state.equals("Playing") || (newPlayback_state.equals("Stopped"))){
            this.playback_state = newPlayback_state;
        }
        else {
            System.out.println("It is not a playback state");
            playback_state = "";
        }
    }

    public int getVolume(){
        return volume;
    }

    public String getPlaybackState(){
        return playback_state;
    }

    public void increaseVolume(){
        if(volume + 5 <= 100){
             volume = volume + 5;
        }
       
        System.out.println("The volume increased to " + volume);
    }

    public void  decreaseVolume(){
        if(volume - 5 >=  0){
            volume = volume - 5;
        }

        System.out.println("The volume decreased to: " + volume);   
    }

    public void stopPlaying(){
        playback_state = "Playing";
        System.out.println("The player is: " + playback_state);

    }

    public void startPlaying(){
        playback_state = "Stopped";
        System.out.println("The player is: " + playback_state);
    }

}
