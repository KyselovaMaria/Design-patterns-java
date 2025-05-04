package Homework11.Task1;

public class Facade {
    public VideoFile convert(VideoFile file, Codec codec) {
        Buffer buffer = BitrateReader.read(file, CodecFactory.extract(file));
        VideoFile newVideoFile = BitrateReader.convert(buffer, file.getName(), codec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(newVideoFile, file.getAudioBuffer());
        return newVideoFile;
    }
}
