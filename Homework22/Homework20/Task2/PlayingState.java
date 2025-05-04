package Homework20.Task2;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        System.out.println("Already playing track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PausedState());
        System.out.println("Paused track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        if (mediaPlayer.getCurrentTrackNum() < mediaPlayer.getTracks().size() - 1) {
            mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);
            System.out.println("Playing next track: " + mediaPlayer.getCurrentTrack());
        } else {
            System.out.println("Already playing the last track");
        }
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        if (mediaPlayer.getCurrentTrackNum() > 0) {
            mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);
            System.out.println("Playing previous track: " + mediaPlayer.getCurrentTrack());
        } else {
            System.out.println("Already playing the first track");
        }
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StoppedState());
        System.out.println("Stopped track: " + mediaPlayer.getCurrentTrack());
    }
}