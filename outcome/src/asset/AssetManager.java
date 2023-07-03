package asset;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import gfx.ImageResource;
import sfx.SoundResource;

public abstract class AssetManager {

    public static final Map<String, ImageResource> images = new HashMap<String, ImageResource>() {
    };
    public static final Map<String, SoundResource> sounds = new HashMap<String, SoundResource>() {
    };

    /**
     * Load all uninitialized declared {@link ImageResource}s and
     * {@link SoundResource}s
     * 
     * @throws IOException
     * @throws UnsupportedAudioFileException
     * @throws LineUnavailableException
     */
    public static void loadAssets() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        sounds.put("audio1", new SoundResource("audio.mp3"));
        images.put("image1", new ImageResource("image.png"));

    }

}
