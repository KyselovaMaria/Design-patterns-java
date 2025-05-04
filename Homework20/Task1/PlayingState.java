package Homework20.Task1;

public class PlayingState implements State {
    private MediaPlayer mediaPlayer;

    public PlayingState(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    @Override
    public void play() {
        // Do nothing
    }

    @Override
    public void pause() {
        mediaPlayer.setState(new PausedState(mediaPlayer));
        mediaPlayer.setIcon("play button");
        System.out.println("Video paused, icon set to " + mediaPlayer.getIcon());
    }
}
