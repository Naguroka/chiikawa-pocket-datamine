package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
class AsynchronousMediaCodecBufferEnqueuer implements androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer {
    private static final int MSG_OPEN_CV = 3;
    private static final int MSG_QUEUE_INPUT_BUFFER = 1;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 2;
    private static final int MSG_SET_PARAMETERS = 4;
    private final android.media.MediaCodec codec;
    private final androidx.media3.common.util.ConditionVariable conditionVariable;
    private android.os.Handler handler;
    private final android.os.HandlerThread handlerThread;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> pendingRuntimeException;
    private boolean started;
    private static final java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams> MESSAGE_PARAMS_INSTANCE_POOL = new java.util.ArrayDeque<>();
    private static final java.lang.Object QUEUE_SECURE_LOCK = new java.lang.Object();

    public AsynchronousMediaCodecBufferEnqueuer(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new androidx.media3.common.util.ConditionVariable());
    }

    AsynchronousMediaCodecBufferEnqueuer(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, androidx.media3.common.util.ConditionVariable conditionVariable) {
        this.codec = mediaCodec;
        this.handlerThread = handlerThread;
        this.conditionVariable = conditionVariable;
        this.pendingRuntimeException = new java.util.concurrent.atomic.AtomicReference<>();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void start() {
        if (this.started) {
            return;
        }
        this.handlerThread.start();
        this.handler = new android.os.Handler(this.handlerThread.getLooper()) { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
            @Override // android.os.Handler
            public void handleMessage(android.os.Message message) {
                androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.this.doHandleMessage(message);
            }
        };
        this.started = true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        maybeThrowException();
        androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i, i2, i3, j, i4);
        ((android.os.Handler) androidx.media3.common.util.Util.castNonNull(this.handler)).obtainMessage(1, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void queueSecureInputBuffer(int i, int i2, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i3) {
        maybeThrowException();
        androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i, i2, 0, j, i3);
        copy(cryptoInfo, messageParams.cryptoInfo);
        ((android.os.Handler) androidx.media3.common.util.Util.castNonNull(this.handler)).obtainMessage(2, messageParams).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void setParameters(android.os.Bundle bundle) {
        maybeThrowException();
        ((android.os.Handler) androidx.media3.common.util.Util.castNonNull(this.handler)).obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void flush() {
        if (this.started) {
            try {
                flushHandlerThread();
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void shutdown() {
        if (this.started) {
            flush();
            this.handlerThread.quit();
        }
        this.started = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void waitUntilQueueingComplete() throws java.lang.InterruptedException {
        blockUntilHandlerThreadIsIdle();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public void maybeThrowException() {
        java.lang.RuntimeException andSet = this.pendingRuntimeException.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private void flushHandlerThread() throws java.lang.InterruptedException {
        ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(this.handler)).removeCallbacksAndMessages(null);
        blockUntilHandlerThreadIsIdle();
    }

    private void blockUntilHandlerThreadIsIdle() throws java.lang.InterruptedException {
        this.conditionVariable.close();
        ((android.os.Handler) androidx.media3.common.util.Assertions.checkNotNull(this.handler)).obtainMessage(3).sendToTarget();
        this.conditionVariable.block();
    }

    void setPendingRuntimeException(java.lang.RuntimeException runtimeException) {
        this.pendingRuntimeException.set(runtimeException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doHandleMessage(android.os.Message message) {
        androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams;
        int i = message.what;
        if (i == 1) {
            messageParams = (androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) message.obj;
            doQueueInputBuffer(messageParams.index, messageParams.offset, messageParams.size, messageParams.presentationTimeUs, messageParams.flags);
        } else if (i != 2) {
            messageParams = null;
            if (i == 3) {
                this.conditionVariable.open();
            } else if (i == 4) {
                doSetParameters((android.os.Bundle) message.obj);
            } else {
                kotlin.UByte$$ExternalSyntheticBackport0.m(this.pendingRuntimeException, null, new java.lang.IllegalStateException(java.lang.String.valueOf(message.what)));
            }
        } else {
            messageParams = (androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) message.obj;
            doQueueSecureInputBuffer(messageParams.index, messageParams.offset, messageParams.cryptoInfo, messageParams.presentationTimeUs, messageParams.flags);
        }
        if (messageParams != null) {
            recycleMessageParams(messageParams);
        }
    }

    private void doQueueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.codec.queueInputBuffer(i, i2, i3, j, i4);
        } catch (java.lang.RuntimeException e) {
            kotlin.UByte$$ExternalSyntheticBackport0.m(this.pendingRuntimeException, null, e);
        }
    }

    private void doQueueSecureInputBuffer(int i, int i2, android.media.MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (QUEUE_SECURE_LOCK) {
                this.codec.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (java.lang.RuntimeException e) {
            kotlin.UByte$$ExternalSyntheticBackport0.m(this.pendingRuntimeException, null, e);
        }
    }

    private void doSetParameters(android.os.Bundle bundle) {
        try {
            this.codec.setParameters(bundle);
        } catch (java.lang.RuntimeException e) {
            kotlin.UByte$$ExternalSyntheticBackport0.m(this.pendingRuntimeException, null, e);
        }
    }

    private static androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams getMessageParams() {
        java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams();
            }
            return arrayDeque.removeFirst();
        }
    }

    private static void recycleMessageParams(androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams messageParams) {
        java.util.ArrayDeque<androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            arrayDeque.add(messageParams);
        }
    }

    private static class MessageParams {
        public final android.media.MediaCodec.CryptoInfo cryptoInfo = new android.media.MediaCodec.CryptoInfo();
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        MessageParams() {
        }

        public void setQueueParams(int i, int i2, int i3, long j, int i4) {
            this.index = i;
            this.offset = i2;
            this.size = i3;
            this.presentationTimeUs = j;
            this.flags = i4;
        }
    }

    private static void copy(androidx.media3.decoder.CryptoInfo cryptoInfo, android.media.MediaCodec.CryptoInfo cryptoInfo2) {
        cryptoInfo2.numSubSamples = cryptoInfo.numSubSamples;
        cryptoInfo2.numBytesOfClearData = copy(cryptoInfo.numBytesOfClearData, cryptoInfo2.numBytesOfClearData);
        cryptoInfo2.numBytesOfEncryptedData = copy(cryptoInfo.numBytesOfEncryptedData, cryptoInfo2.numBytesOfEncryptedData);
        cryptoInfo2.key = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(copy(cryptoInfo.key, cryptoInfo2.key));
        cryptoInfo2.iv = (byte[]) androidx.media3.common.util.Assertions.checkNotNull(copy(cryptoInfo.iv, cryptoInfo2.iv));
        cryptoInfo2.mode = cryptoInfo.mode;
        if (androidx.media3.common.util.Util.SDK_INT >= 24) {
            cryptoInfo2.setPattern(new android.media.MediaCodec.CryptoInfo.Pattern(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
        }
    }

    private static int[] copy(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return java.util.Arrays.copyOf(iArr, iArr.length);
        }
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    private static byte[] copy(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return java.util.Arrays.copyOf(bArr, bArr.length);
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
