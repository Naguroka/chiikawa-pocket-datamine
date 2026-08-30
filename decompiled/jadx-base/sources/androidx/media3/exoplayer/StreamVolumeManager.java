package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class StreamVolumeManager {
    private static final java.lang.String TAG = "StreamVolumeManager";
    private static final java.lang.String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
    private final android.content.Context applicationContext;
    private final android.media.AudioManager audioManager;
    private final android.os.Handler eventHandler;
    private final androidx.media3.exoplayer.StreamVolumeManager.Listener listener;
    private boolean muted;
    private androidx.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver receiver;
    private int streamType;
    private int volume;

    public interface Listener {
        void onStreamTypeChanged(int i);

        void onStreamVolumeChanged(int i, boolean z);
    }

    public StreamVolumeManager(android.content.Context context, android.os.Handler handler, androidx.media3.exoplayer.StreamVolumeManager.Listener listener) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.applicationContext = applicationContext;
        this.eventHandler = handler;
        this.listener = listener;
        android.media.AudioManager audioManager = (android.media.AudioManager) androidx.media3.common.util.Assertions.checkStateNotNull((android.media.AudioManager) applicationContext.getSystemService("audio"));
        this.audioManager = audioManager;
        this.streamType = 3;
        this.volume = getVolumeFromManager(audioManager, 3);
        this.muted = getMutedFromManager(audioManager, this.streamType);
        androidx.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = new androidx.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver();
        try {
            applicationContext.registerReceiver(volumeChangeReceiver, new android.content.IntentFilter(VOLUME_CHANGED_ACTION));
            this.receiver = volumeChangeReceiver;
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Error registering stream volume receiver", e);
        }
    }

    public void setStreamType(int i) {
        if (this.streamType == i) {
            return;
        }
        this.streamType = i;
        updateVolumeAndNotifyIfChanged();
        this.listener.onStreamTypeChanged(i);
    }

    public int getMinVolume() {
        if (androidx.media3.common.util.Util.SDK_INT >= 28) {
            return this.audioManager.getStreamMinVolume(this.streamType);
        }
        return 0;
    }

    public int getMaxVolume() {
        return this.audioManager.getStreamMaxVolume(this.streamType);
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isMuted() {
        return this.muted;
    }

    public void setVolume(int i, int i2) {
        if (i < getMinVolume() || i > getMaxVolume()) {
            return;
        }
        this.audioManager.setStreamVolume(this.streamType, i, i2);
        updateVolumeAndNotifyIfChanged();
    }

    public void increaseVolume(int i) {
        if (this.volume >= getMaxVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, 1, i);
        updateVolumeAndNotifyIfChanged();
    }

    public void decreaseVolume(int i) {
        if (this.volume <= getMinVolume()) {
            return;
        }
        this.audioManager.adjustStreamVolume(this.streamType, -1, i);
        updateVolumeAndNotifyIfChanged();
    }

    public void setMuted(boolean z, int i) {
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
            this.audioManager.adjustStreamVolume(this.streamType, z ? -100 : 100, i);
        } else {
            this.audioManager.setStreamMute(this.streamType, z);
        }
        updateVolumeAndNotifyIfChanged();
    }

    public void release() {
        androidx.media3.exoplayer.StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = this.receiver;
        if (volumeChangeReceiver != null) {
            try {
                this.applicationContext.unregisterReceiver(volumeChangeReceiver);
            } catch (java.lang.RuntimeException e) {
                androidx.media3.common.util.Log.w(TAG, "Error unregistering stream volume receiver", e);
            }
            this.receiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateVolumeAndNotifyIfChanged() {
        int volumeFromManager = getVolumeFromManager(this.audioManager, this.streamType);
        boolean mutedFromManager = getMutedFromManager(this.audioManager, this.streamType);
        if (this.volume == volumeFromManager && this.muted == mutedFromManager) {
            return;
        }
        this.volume = volumeFromManager;
        this.muted = mutedFromManager;
        this.listener.onStreamVolumeChanged(volumeFromManager, mutedFromManager);
    }

    private static int getVolumeFromManager(android.media.AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.w(TAG, "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    private static boolean getMutedFromManager(android.media.AudioManager audioManager, int i) {
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
            return audioManager.isStreamMute(i);
        }
        return getVolumeFromManager(audioManager, i) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class VolumeChangeReceiver extends android.content.BroadcastReceiver {
        private VolumeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            android.os.Handler handler = androidx.media3.exoplayer.StreamVolumeManager.this.eventHandler;
            final androidx.media3.exoplayer.StreamVolumeManager streamVolumeManager = androidx.media3.exoplayer.StreamVolumeManager.this;
            handler.post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.StreamVolumeManager$VolumeChangeReceiver$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    streamVolumeManager.updateVolumeAndNotifyIfChanged();
                }
            });
        }
    }
}
