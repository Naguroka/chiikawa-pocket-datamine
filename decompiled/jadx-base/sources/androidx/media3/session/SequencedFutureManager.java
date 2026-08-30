package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
final class SequencedFutureManager {
    private static final java.lang.String TAG = "SequencedFutureManager";
    private boolean isReleased;
    private int nextSequenceNumber;
    private java.lang.Runnable pendingLazyReleaseCallback;
    private android.os.Handler releaseCallbackHandler;
    private final java.lang.Object lock = new java.lang.Object();
    private final androidx.collection.ArrayMap<java.lang.Integer, androidx.media3.session.SequencedFutureManager.SequencedFuture<?>> seqToFutureMap = new androidx.collection.ArrayMap<>();

    public int obtainNextSequenceNumber() {
        int i;
        synchronized (this.lock) {
            i = this.nextSequenceNumber;
            this.nextSequenceNumber = i + 1;
        }
        return i;
    }

    public <T> androidx.media3.session.SequencedFutureManager.SequencedFuture<T> createSequencedFuture(T t) {
        androidx.media3.session.SequencedFutureManager.SequencedFuture<T> sequencedFutureCreate;
        synchronized (this.lock) {
            int iObtainNextSequenceNumber = obtainNextSequenceNumber();
            sequencedFutureCreate = androidx.media3.session.SequencedFutureManager.SequencedFuture.create(iObtainNextSequenceNumber, t);
            if (this.isReleased) {
                sequencedFutureCreate.setWithTheValueOfResultWhenClosed();
            } else {
                this.seqToFutureMap.put(java.lang.Integer.valueOf(iObtainNextSequenceNumber), sequencedFutureCreate);
            }
        }
        return sequencedFutureCreate;
    }

    public <T> void setFutureResult(int i, T t) {
        synchronized (this.lock) {
            androidx.media3.session.SequencedFutureManager.SequencedFuture<?> sequencedFutureRemove = this.seqToFutureMap.remove(java.lang.Integer.valueOf(i));
            if (sequencedFutureRemove != null) {
                if (sequencedFutureRemove.getResultWhenClosed().getClass() == t.getClass()) {
                    sequencedFutureRemove.set(t);
                } else {
                    androidx.media3.common.util.Log.w(TAG, "Type mismatch, expected " + sequencedFutureRemove.getResultWhenClosed().getClass() + ", but was " + t.getClass());
                }
            }
            if (this.pendingLazyReleaseCallback != null && this.seqToFutureMap.isEmpty()) {
                release();
            }
        }
    }

    public void release() {
        java.util.ArrayList arrayList;
        synchronized (this.lock) {
            this.isReleased = true;
            arrayList = new java.util.ArrayList(this.seqToFutureMap.values());
            this.seqToFutureMap.clear();
            if (this.pendingLazyReleaseCallback != null) {
                ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(this.releaseCallbackHandler)).post(this.pendingLazyReleaseCallback);
                this.pendingLazyReleaseCallback = null;
                this.releaseCallbackHandler = null;
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((androidx.media3.session.SequencedFutureManager.SequencedFuture) it.next()).setWithTheValueOfResultWhenClosed();
        }
    }

    public void lazyRelease(long j, java.lang.Runnable runnable) {
        synchronized (this.lock) {
            android.os.Handler handlerCreateHandlerForCurrentLooper = androidx.media3.common.util.Util.createHandlerForCurrentLooper();
            this.releaseCallbackHandler = handlerCreateHandlerForCurrentLooper;
            this.pendingLazyReleaseCallback = runnable;
            if (this.seqToFutureMap.isEmpty()) {
                release();
            } else {
                handlerCreateHandlerForCurrentLooper.postDelayed(new java.lang.Runnable() { // from class: androidx.media3.session.SequencedFutureManager$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.release();
                    }
                }, j);
            }
        }
    }

    public static final class SequencedFuture<T> extends com.google.common.util.concurrent.AbstractFuture<T> {
        private final T resultWhenClosed;
        private final int sequenceNumber;

        private SequencedFuture(int i, T t) {
            this.sequenceNumber = i;
            this.resultWhenClosed = t;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public boolean set(T t) {
            return super.set(t);
        }

        public void setWithTheValueOfResultWhenClosed() {
            set(this.resultWhenClosed);
        }

        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        public T getResultWhenClosed() {
            return this.resultWhenClosed;
        }

        public static <T> androidx.media3.session.SequencedFutureManager.SequencedFuture<T> create(int i, T t) {
            return new androidx.media3.session.SequencedFutureManager.SequencedFuture<>(i, t);
        }
    }
}
