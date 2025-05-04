package Homework20.Task1;

public class MediaPlayer {
    private State state;
    private String icon;

    public MediaPlayer() {
        state = new PausedState(this);
        icon = "play button";
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void play() {
        state.play();
    }

    public void pause() {
        state.pause();
    }
}
