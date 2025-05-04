package Homework20.Task2;

public class StoppedState implements State {
    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new PlayingState());
        System.out.println("Started playing track: " + mediaPlayer.getCurrentTrack());
    }

    @Override
    public void pause(MediaPlayer mediaPlayer) {
        System.out.println("Cannot pause. No track playing.");
    }

    @Override
    public void next(MediaPlayer mediaPlayer) {
        if (mediaPlayer.getCurrentTrackNum() < mediaPlayer.getTracks().size() - 1) {
            mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() + 1);
            System.out.println("Playing next track: " + mediaPlayer.getCurrentTrack());
            mediaPlayer.setState(new PlayingState());
        } else {
            System.out.println("Already playing the last track");
        }
    }

    @Override
    public void prev(MediaPlayer mediaPlayer) {
        if (mediaPlayer.getCurrentTrackNum() > 0) {
            mediaPlayer.setTrackNum(mediaPlayer.getCurrentTrackNum() - 1);
            System.out.println("Playing previous track: " + mediaPlayer.getCurrentTrack());
            mediaPlayer.setState(new PlayingState());
        } else {
            System.out.println("Already playing the first track");
        }
    }

    @Override
    public void stop(MediaPlayer mediaPlayer) {
        System.out.println("No track is currently playing");
    }
}
