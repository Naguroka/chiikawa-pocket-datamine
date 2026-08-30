package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class AudioFocusManager {
    private static final int AUDIOFOCUS_GAIN = 1;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT = 2;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE = 4;
    private static final int AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK = 3;
    private static final int AUDIOFOCUS_NONE = 0;
    private static final int AUDIO_FOCUS_STATE_HAVE_FOCUS = 2;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT = 3;
    private static final int AUDIO_FOCUS_STATE_LOSS_TRANSIENT_DUCK = 4;
    private static final int AUDIO_FOCUS_STATE_NOT_REQUESTED = 0;
    private static final int AUDIO_FOCUS_STATE_NO_FOCUS = 1;
    public static final int PLAYER_COMMAND_DO_NOT_PLAY = -1;
    public static final int PLAYER_COMMAND_PLAY_WHEN_READY = 1;
    public static final int PLAYER_COMMAND_WAIT_FOR_CALLBACK = 0;
    private static final java.lang.String TAG = "AudioFocusManager";
    private static final float VOLUME_MULTIPLIER_DEFAULT = 1.0f;
    private static final float VOLUME_MULTIPLIER_DUCK = 0.2f;
    private androidx.media3.common.AudioAttributes audioAttributes;
    private android.media.AudioFocusRequest audioFocusRequest;
    private final android.media.AudioManager audioManager;
    private int focusGainToRequest;
    private final androidx.media3.exoplayer.AudioFocusManager.AudioFocusListener focusListener;
    private androidx.media3.exoplayer.AudioFocusManager.PlayerControl playerControl;
    private boolean rebuildAudioFocusRequest;
    private float volumeMultiplier = 1.0f;
    private int audioFocusState = 0;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlayerCommand {
    }

    public interface PlayerControl {
        void executePlayerCommand(int i);

        void setVolumeMultiplier(float f);
    }

    public AudioFocusManager(android.content.Context context, android.os.Handler handler, androidx.media3.exoplayer.AudioFocusManager.PlayerControl playerControl) {
        this.audioManager = (android.media.AudioManager) androidx.media3.common.util.Assertions.checkNotNull((android.media.AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.playerControl = playerControl;
        this.focusListener = new androidx.media3.exoplayer.AudioFocusManager.AudioFocusListener(handler);
    }

    public float getVolumeMultiplier() {
        return this.volumeMultiplier;
    }

    public void setAudioAttributes(androidx.media3.common.AudioAttributes audioAttributes) {
        if (androidx.media3.common.util.Util.areEqual(this.audioAttributes, audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        int iConvertAudioAttributesToFocusGain = convertAudioAttributesToFocusGain(audioAttributes);
        this.focusGainToRequest = iConvertAudioAttributesToFocusGain;
        boolean z = true;
        if (iConvertAudioAttributesToFocusGain != 1 && iConvertAudioAttributesToFocusGain != 0) {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkArgument(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public int updateAudioFocus(boolean z, int i) {
        if (!shouldHandleAudioFocus(i)) {
            abandonAudioFocusIfHeld();
            setAudioFocusState(0);
            return 1;
        }
        if (z) {
            return requestAudioFocus();
        }
        int i2 = this.audioFocusState;
        if (i2 != 1) {
            return i2 != 3 ? 1 : 0;
        }
        return -1;
    }

    public void release() {
        this.playerControl = null;
        abandonAudioFocusIfHeld();
        setAudioFocusState(0);
    }

    android.media.AudioManager.OnAudioFocusChangeListener getFocusListener() {
        return this.focusListener;
    }

    private boolean shouldHandleAudioFocus(int i) {
        return i != 1 && this.focusGainToRequest == 1;
    }

    private int requestAudioFocus() {
        if (this.audioFocusState == 2) {
            return 1;
        }
        if ((androidx.media3.common.util.Util.SDK_INT >= 26 ? requestAudioFocusV26() : requestAudioFocusDefault()) == 1) {
            setAudioFocusState(2);
            return 1;
        }
        setAudioFocusState(1);
        return -1;
    }

    private void abandonAudioFocusIfHeld() {
        int i = this.audioFocusState;
        if (i == 1 || i == 0) {
            return;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 26) {
            abandonAudioFocusV26();
        } else {
            abandonAudioFocusDefault();
        }
    }

    private int requestAudioFocusDefault() {
        return this.audioManager.requestAudioFocus(this.focusListener, androidx.media3.common.util.Util.getStreamTypeForAudioUsage(((androidx.media3.common.AudioAttributes) androidx.media3.common.util.Assertions.checkNotNull(this.audioAttributes)).usage), this.focusGainToRequest);
    }

    private int requestAudioFocusV26() {
        android.media.AudioFocusRequest.Builder builder;
        android.media.AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest == null || this.rebuildAudioFocusRequest) {
            if (audioFocusRequest == null) {
                builder = new android.media.AudioFocusRequest.Builder(this.focusGainToRequest);
            } else {
                builder = new android.media.AudioFocusRequest.Builder(this.audioFocusRequest);
            }
            this.audioFocusRequest = builder.setAudioAttributes(((androidx.media3.common.AudioAttributes) androidx.media3.common.util.Assertions.checkNotNull(this.audioAttributes)).getAudioAttributesV21().audioAttributes).setWillPauseWhenDucked(willPauseWhenDucked()).setOnAudioFocusChangeListener(this.focusListener).build();
            this.rebuildAudioFocusRequest = false;
        }
        return this.audioManager.requestAudioFocus(this.audioFocusRequest);
    }

    private void abandonAudioFocusDefault() {
        this.audioManager.abandonAudioFocus(this.focusListener);
    }

    private void abandonAudioFocusV26() {
        android.media.AudioFocusRequest audioFocusRequest = this.audioFocusRequest;
        if (audioFocusRequest != null) {
            this.audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    private boolean willPauseWhenDucked() {
        androidx.media3.common.AudioAttributes audioAttributes = this.audioAttributes;
        return audioAttributes != null && audioAttributes.contentType == 1;
    }

    private static int convertAudioAttributesToFocusGain(androidx.media3.common.AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        switch (audioAttributes.usage) {
            case 0:
                androidx.media3.common.util.Log.w(TAG, "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (audioAttributes.contentType == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                androidx.media3.common.util.Log.w(TAG, "Unidentified audio usage: " + audioAttributes.usage);
                return 0;
            case 16:
                return 4;
        }
    }

    private void setAudioFocusState(int i) {
        if (this.audioFocusState == i) {
            return;
        }
        this.audioFocusState = i;
        float f = i == 4 ? 0.2f : 1.0f;
        if (this.volumeMultiplier == f) {
            return;
        }
        this.volumeMultiplier = f;
        androidx.media3.exoplayer.AudioFocusManager.PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.setVolumeMultiplier(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handlePlatformAudioFocusChange(int i) {
        if (i == -3 || i == -2) {
            if (i == -2 || willPauseWhenDucked()) {
                executePlayerCommand(0);
                setAudioFocusState(3);
                return;
            } else {
                setAudioFocusState(4);
                return;
            }
        }
        if (i == -1) {
            executePlayerCommand(-1);
            abandonAudioFocusIfHeld();
            setAudioFocusState(1);
        } else if (i == 1) {
            setAudioFocusState(2);
            executePlayerCommand(1);
        } else {
            androidx.media3.common.util.Log.w(TAG, "Unknown focus change type: " + i);
        }
    }

    private void executePlayerCommand(int i) {
        androidx.media3.exoplayer.AudioFocusManager.PlayerControl playerControl = this.playerControl;
        if (playerControl != null) {
            playerControl.executePlayerCommand(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class AudioFocusListener implements android.media.AudioManager.OnAudioFocusChangeListener {
        private final android.os.Handler eventHandler;

        public AudioFocusListener(android.os.Handler handler) {
            this.eventHandler = handler;
        }

        /* JADX INFO: renamed from: lambda$onAudioFocusChange$0$androidx-media3-exoplayer-AudioFocusManager$AudioFocusListener, reason: not valid java name */
        /* synthetic */ void m113x93d291e3(int i) {
            androidx.media3.exoplayer.AudioFocusManager.this.handlePlatformAudioFocusChange(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.eventHandler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.AudioFocusManager$AudioFocusListener$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m113x93d291e3(i);
                }
            });
        }
    }
}
