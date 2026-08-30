package androidx.media;

/* JADX INFO: loaded from: classes.dex */
public final class AudioManagerCompat {
    public static final int AUDIOFOCUS_GAIN = 1;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    public static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final java.lang.String TAG = "AudioManCompat";

    public static int requestAudioFocus(android.media.AudioManager audioManager, androidx.media.AudioFocusRequestCompat audioFocusRequestCompat) {
        if (audioManager == null) {
            throw new java.lang.IllegalArgumentException("AudioManager must not be null");
        }
        if (audioFocusRequestCompat == null) {
            throw new java.lang.IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.media.AudioManagerCompat.Api26Impl.requestAudioFocus(audioManager, audioFocusRequestCompat.getAudioFocusRequest());
        }
        return audioManager.requestAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener(), audioFocusRequestCompat.getAudioAttributesCompat().getLegacyStreamType(), audioFocusRequestCompat.getFocusGain());
    }

    public static int abandonAudioFocusRequest(android.media.AudioManager audioManager, androidx.media.AudioFocusRequestCompat audioFocusRequestCompat) {
        if (audioManager == null) {
            throw new java.lang.IllegalArgumentException("AudioManager must not be null");
        }
        if (audioFocusRequestCompat == null) {
            throw new java.lang.IllegalArgumentException("AudioFocusRequestCompat must not be null");
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.media.AudioManagerCompat.Api26Impl.abandonAudioFocusRequest(audioManager, audioFocusRequestCompat.getAudioFocusRequest());
        }
        return audioManager.abandonAudioFocus(audioFocusRequestCompat.getOnAudioFocusChangeListener());
    }

    public static int getStreamMaxVolume(android.media.AudioManager audioManager, int i) {
        return audioManager.getStreamMaxVolume(i);
    }

    public static int getStreamMinVolume(android.media.AudioManager audioManager, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.media.AudioManagerCompat.Api28Impl.getStreamMinVolume(audioManager, i);
        }
        return 0;
    }

    public static boolean isVolumeFixed(android.media.AudioManager audioManager) {
        return androidx.media.AudioManagerCompat.Api21Impl.isVolumeFixed(audioManager);
    }

    private AudioManagerCompat() {
    }

    private static class Api21Impl {
        static boolean isVolumeFixed(android.media.AudioManager audioManager) {
            return audioManager.isVolumeFixed();
        }

        private Api21Impl() {
        }
    }

    private static class Api26Impl {
        static int abandonAudioFocusRequest(android.media.AudioManager audioManager, android.media.AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        static int requestAudioFocus(android.media.AudioManager audioManager, android.media.AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }

        private Api26Impl() {
        }
    }

    private static class Api28Impl {
        static int getStreamMinVolume(android.media.AudioManager audioManager, int i) {
            return audioManager.getStreamMinVolume(i);
        }

        private Api28Impl() {
        }
    }
}
