package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
final class AsynchronousMediaCodecCallback extends android.media.MediaCodec.Callback {
    private final android.os.HandlerThread callbackThread;
    private android.media.MediaFormat currentFormat;
    private android.os.Handler handler;
    private java.lang.IllegalStateException internalException;
    private android.media.MediaCodec.CryptoException mediaCodecCryptoException;
    private android.media.MediaCodec.CodecException mediaCodecException;
    private androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener;
    private long pendingFlushCount;
    private android.media.MediaFormat pendingOutputFormat;
    private boolean shutDown;
    private final java.lang.Object lock = new java.lang.Object();
    private final androidx.collection.CircularIntArray availableInputBuffers = new androidx.collection.CircularIntArray();
    private final androidx.collection.CircularIntArray availableOutputBuffers = new androidx.collection.CircularIntArray();
    private final java.util.ArrayDeque<android.media.MediaCodec.BufferInfo> bufferInfos = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<android.media.MediaFormat> formats = new java.util.ArrayDeque<>();

    AsynchronousMediaCodecCallback(android.os.HandlerThread handlerThread) {
        this.callbackThread = handlerThread;
    }

    public void initialize(android.media.MediaCodec mediaCodec) {
        androidx.media3.common.util.Assertions.checkState(this.handler == null);
        this.callbackThread.start();
        android.os.Handler handler = new android.os.Handler(this.callbackThread.getLooper());
        mediaCodec.setCallback(this, handler);
        this.handler = handler;
    }

    public void shutdown() {
        synchronized (this.lock) {
            this.shutDown = true;
            this.callbackThread.quit();
            flushInternal();
        }
    }

    public int dequeueInputBufferIndex() {
        synchronized (this.lock) {
            maybeThrowException();
            int iPopFirst = -1;
            if (isFlushingOrShutdown()) {
                return -1;
            }
            if (!this.availableInputBuffers.isEmpty()) {
                iPopFirst = this.availableInputBuffers.popFirst();
            }
            return iPopFirst;
        }
    }

    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            maybeThrowException();
            if (isFlushingOrShutdown()) {
                return -1;
            }
            if (this.availableOutputBuffers.isEmpty()) {
                return -1;
            }
            int iPopFirst = this.availableOutputBuffers.popFirst();
            if (iPopFirst >= 0) {
                androidx.media3.common.util.Assertions.checkStateNotNull(this.currentFormat);
                android.media.MediaCodec.BufferInfo bufferInfoRemove = this.bufferInfos.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (iPopFirst == -2) {
                this.currentFormat = this.formats.remove();
            }
            return iPopFirst;
        }
    }

    public android.media.MediaFormat getOutputFormat() {
        android.media.MediaFormat mediaFormat;
        synchronized (this.lock) {
            mediaFormat = this.currentFormat;
            if (mediaFormat == null) {
                throw new java.lang.IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void flush() {
        synchronized (this.lock) {
            this.pendingFlushCount++;
            ((android.os.Handler) androidx.media3.common.util.Util.castNonNull(this.handler)).post(new java.lang.Runnable() { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecCallback$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.onFlushCompleted();
                }
            });
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec mediaCodec, int i) {
        synchronized (this.lock) {
            this.availableInputBuffers.addLast(i);
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.onBufferAvailableListener;
            if (onBufferAvailableListener != null) {
                onBufferAvailableListener.onInputBufferAvailable();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec mediaCodec, int i, android.media.MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.lock) {
            android.media.MediaFormat mediaFormat = this.pendingOutputFormat;
            if (mediaFormat != null) {
                addOutputFormat(mediaFormat);
                this.pendingOutputFormat = null;
            }
            this.availableOutputBuffers.addLast(i);
            this.bufferInfos.add(bufferInfo);
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.onBufferAvailableListener;
            if (onBufferAvailableListener != null) {
                onBufferAvailableListener.onOutputBufferAvailable();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CodecException codecException) {
        synchronized (this.lock) {
            this.mediaCodecException = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onCryptoError(android.media.MediaCodec mediaCodec, android.media.MediaCodec.CryptoException cryptoException) {
        synchronized (this.lock) {
            this.mediaCodecCryptoException = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        synchronized (this.lock) {
            addOutputFormat(mediaFormat);
            this.pendingOutputFormat = null;
        }
    }

    public void setOnBufferAvailableListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        synchronized (this.lock) {
            this.onBufferAvailableListener = onBufferAvailableListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFlushCompleted() {
        synchronized (this.lock) {
            if (this.shutDown) {
                return;
            }
            long j = this.pendingFlushCount - 1;
            this.pendingFlushCount = j;
            if (j > 0) {
                return;
            }
            if (j < 0) {
                setInternalException(new java.lang.IllegalStateException());
            } else {
                flushInternal();
            }
        }
    }

    private void flushInternal() {
        if (!this.formats.isEmpty()) {
            this.pendingOutputFormat = this.formats.getLast();
        }
        this.availableInputBuffers.clear();
        this.availableOutputBuffers.clear();
        this.bufferInfos.clear();
        this.formats.clear();
    }

    private boolean isFlushingOrShutdown() {
        return this.pendingFlushCount > 0 || this.shutDown;
    }

    private void addOutputFormat(android.media.MediaFormat mediaFormat) {
        this.availableOutputBuffers.addLast(-2);
        this.formats.add(mediaFormat);
    }

    private void maybeThrowException() {
        maybeThrowInternalException();
        maybeThrowMediaCodecException();
        maybeThrowMediaCodecCryptoException();
    }

    private void maybeThrowInternalException() {
        java.lang.IllegalStateException illegalStateException = this.internalException;
        if (illegalStateException == null) {
            return;
        }
        this.internalException = null;
        throw illegalStateException;
    }

    private void maybeThrowMediaCodecException() {
        android.media.MediaCodec.CodecException codecException = this.mediaCodecException;
        if (codecException == null) {
            return;
        }
        this.mediaCodecException = null;
        throw codecException;
    }

    private void maybeThrowMediaCodecCryptoException() {
        android.media.MediaCodec.CryptoException cryptoException = this.mediaCodecCryptoException;
        if (cryptoException == null) {
            return;
        }
        this.mediaCodecCryptoException = null;
        throw cryptoException;
    }

    private void setInternalException(java.lang.IllegalStateException illegalStateException) {
        synchronized (this.lock) {
            this.internalException = illegalStateException;
        }
    }
}
