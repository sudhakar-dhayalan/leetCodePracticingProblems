package data_structures.structural.adapter_pattern;

// third-party AudioPlayer that only plays MP3 files
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
