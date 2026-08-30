package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerMessage {
    private final androidx.media3.common.util.Clock clock;
    private boolean isCanceled;
    private boolean isDelivered;
    private boolean isProcessed;
    private boolean isSent;
    private android.os.Looper looper;
    private int mediaItemIndex;
    private java.lang.Object payload;
    private final androidx.media3.exoplayer.PlayerMessage.Sender sender;
    private final androidx.media3.exoplayer.PlayerMessage.Target target;
    private final androidx.media3.common.Timeline timeline;
    private int type;
    private long positionMs = androidx.media3.common.C.TIME_UNSET;
    private boolean deleteAfterDelivery = true;

    public interface Sender {
        void sendMessage(androidx.media3.exoplayer.PlayerMessage playerMessage);
    }

    public interface Target {
        void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException;
    }

    public PlayerMessage(androidx.media3.exoplayer.PlayerMessage.Sender sender, androidx.media3.exoplayer.PlayerMessage.Target target, androidx.media3.common.Timeline timeline, int i, androidx.media3.common.util.Clock clock, android.os.Looper looper) {
        this.sender = sender;
        this.target = target;
        this.timeline = timeline;
        this.looper = looper;
        this.clock = clock;
        this.mediaItemIndex = i;
    }

    public androidx.media3.common.Timeline getTimeline() {
        return this.timeline;
    }

    public androidx.media3.exoplayer.PlayerMessage.Target getTarget() {
        return this.target;
    }

    public androidx.media3.exoplayer.PlayerMessage setType(int i) {
        androidx.media3.common.util.Assertions.checkState(!this.isSent);
        this.type = i;
        return this;
    }

    public int getType() {
        return this.type;
    }

    public androidx.media3.exoplayer.PlayerMessage setPayload(java.lang.Object obj) {
        androidx.media3.common.util.Assertions.checkState(!this.isSent);
        this.payload = obj;
        return this;
    }

    public java.lang.Object getPayload() {
        return this.payload;
    }

    public androidx.media3.exoplayer.PlayerMessage setLooper(android.os.Looper looper) {
        androidx.media3.common.util.Assertions.checkState(!this.isSent);
        this.looper = looper;
        return this;
    }

    public android.os.Looper getLooper() {
        return this.looper;
    }

    public long getPositionMs() {
        return this.positionMs;
    }

    public androidx.media3.exoplayer.PlayerMessage setPosition(long j) {
        androidx.media3.common.util.Assertions.checkState(!this.isSent);
        this.positionMs = j;
        return this;
    }

    public androidx.media3.exoplayer.PlayerMessage setPosition(int i, long j) {
        androidx.media3.common.util.Assertions.checkState(!this.isSent);
        androidx.media3.common.util.Assertions.checkArgument(j != androidx.media3.common.C.TIME_UNSET);
        if (i < 0 || (!this.timeline.isEmpty() && i >= this.timeline.getWindowCount())) {
            throw new androidx.media3.common.IllegalSeekPositionException(this.timeline, i, j);
        }
        this.mediaItemIndex = i;
        this.positionMs = j;
        return this;
    }

    public int getMediaItemIndex() {
        return this.mediaItemIndex;
    }

    public androidx.media3.exoplayer.PlayerMessage setDeleteAfterDelivery(boolean z) {
        androidx.media3.common.util.Assertions.checkState(!this.isSent);
        this.deleteAfterDelivery = z;
        return this;
    }

    public boolean getDeleteAfterDelivery() {
        return this.deleteAfterDelivery;
    }

    public androidx.media3.exoplayer.PlayerMessage send() {
        androidx.media3.common.util.Assertions.checkState(!this.isSent);
        if (this.positionMs == androidx.media3.common.C.TIME_UNSET) {
            androidx.media3.common.util.Assertions.checkArgument(this.deleteAfterDelivery);
        }
        this.isSent = true;
        this.sender.sendMessage(this);
        return this;
    }

    public synchronized androidx.media3.exoplayer.PlayerMessage cancel() {
        androidx.media3.common.util.Assertions.checkState(this.isSent);
        this.isCanceled = true;
        markAsProcessed(false);
        return this;
    }

    public synchronized boolean isCanceled() {
        return this.isCanceled;
    }

    public synchronized void markAsProcessed(boolean z) {
        this.isDelivered = z | this.isDelivered;
        this.isProcessed = true;
        notifyAll();
    }

    public synchronized boolean blockUntilDelivered() throws java.lang.InterruptedException {
        androidx.media3.common.util.Assertions.checkState(this.isSent);
        androidx.media3.common.util.Assertions.checkState(this.looper.getThread() != java.lang.Thread.currentThread());
        while (!this.isProcessed) {
            wait();
        }
        return this.isDelivered;
    }

    public synchronized boolean blockUntilDelivered(long j) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        boolean z;
        androidx.media3.common.util.Assertions.checkState(this.isSent);
        androidx.media3.common.util.Assertions.checkState(this.looper.getThread() != java.lang.Thread.currentThread());
        long jElapsedRealtime = this.clock.elapsedRealtime() + j;
        while (true) {
            z = this.isProcessed;
            if (z || j <= 0) {
                break;
            }
            this.clock.onThreadBlocked();
            wait(j);
            j = jElapsedRealtime - this.clock.elapsedRealtime();
        }
        if (!z) {
            throw new java.util.concurrent.TimeoutException("Message delivery timed out.");
        }
        return this.isDelivered;
    }
}
