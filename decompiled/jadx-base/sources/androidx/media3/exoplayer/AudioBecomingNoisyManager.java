package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
final class AudioBecomingNoisyManager {
    private final android.content.Context context;
    private final androidx.media3.exoplayer.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver receiver;
    private boolean receiverRegistered;

    public interface EventListener {
        void onAudioBecomingNoisy();
    }

    public AudioBecomingNoisyManager(android.content.Context context, android.os.Handler handler, androidx.media3.exoplayer.AudioBecomingNoisyManager.EventListener eventListener) {
        this.context = context.getApplicationContext();
        this.receiver = new androidx.media3.exoplayer.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver(handler, eventListener);
    }

    public void setEnabled(boolean z) {
        if (z && !this.receiverRegistered) {
            this.context.registerReceiver(this.receiver, new android.content.IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.receiverRegistered = true;
        } else {
            if (z || !this.receiverRegistered) {
                return;
            }
            this.context.unregisterReceiver(this.receiver);
            this.receiverRegistered = false;
        }
    }

    private final class AudioBecomingNoisyReceiver extends android.content.BroadcastReceiver implements java.lang.Runnable {
        private final android.os.Handler eventHandler;
        private final androidx.media3.exoplayer.AudioBecomingNoisyManager.EventListener listener;

        public AudioBecomingNoisyReceiver(android.os.Handler handler, androidx.media3.exoplayer.AudioBecomingNoisyManager.EventListener eventListener) {
            this.eventHandler = handler;
            this.listener = eventListener;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.eventHandler.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (androidx.media3.exoplayer.AudioBecomingNoisyManager.this.receiverRegistered) {
                this.listener.onAudioBecomingNoisy();
            }
        }
    }
}
