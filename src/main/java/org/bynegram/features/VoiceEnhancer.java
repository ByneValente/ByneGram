package org.bynegram.features;

public class VoiceEnhancer {
    private boolean magicSoundEnabled = false;

    public void setMagicSoundEnabled(boolean enabled) {
        this.magicSoundEnabled = enabled;
    }

    public boolean isMagicSoundEnabled() {
        return magicSoundEnabled;
    }
}