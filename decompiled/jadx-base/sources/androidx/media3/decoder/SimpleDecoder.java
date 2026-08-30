package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public abstract class SimpleDecoder<I extends androidx.media3.decoder.DecoderInputBuffer, O extends androidx.media3.decoder.DecoderOutputBuffer, E extends androidx.media3.decoder.DecoderException> implements androidx.media3.decoder.Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final java.lang.Thread decodeThread;
    private I dequeuedInputBuffer;
    private E exception;
    private boolean flushed;
    private final java.lang.Object lock = new java.lang.Object();
    private long outputStartTimeUs = androidx.media3.common.C.TIME_UNSET;
    private final java.util.ArrayDeque<I> queuedInputBuffers = new java.util.ArrayDeque<>();
    private final java.util.ArrayDeque<O> queuedOutputBuffers = new java.util.ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    protected abstract I createInputBuffer();

    protected abstract O createOutputBuffer();

    protected abstract E createUnexpectedDecodeException(java.lang.Throwable th);

    protected abstract E decode(I i, O o, boolean z);

    protected SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i = 0; i < this.availableInputBufferCount; i++) {
            ((I[]) this.availableInputBuffers)[i] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i2 = 0; i2 < this.availableOutputBufferCount; i2++) {
            ((O[]) this.availableOutputBuffers)[i2] = createOutputBuffer();
        }
        java.lang.Thread thread = new java.lang.Thread("ExoPlayer:SimpleDecoder") { // from class: androidx.media3.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                androidx.media3.decoder.SimpleDecoder.this.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    protected final void setInitialInputBufferSize(int i) {
        androidx.media3.common.util.Assertions.checkState(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (I i2 : this.availableInputBuffers) {
            i2.ensureSpaceForWrite(i);
        }
    }

    protected final boolean isAtLeastOutputStartTimeUs(long j) {
        boolean z;
        synchronized (this.lock) {
            long j2 = this.outputStartTimeUs;
            z = j2 == androidx.media3.common.C.TIME_UNSET || j >= j2;
        }
        return z;
    }

    @Override // androidx.media3.decoder.Decoder
    public final void setOutputStartTimeUs(long j) {
        synchronized (this.lock) {
            androidx.media3.common.util.Assertions.checkState(this.availableInputBufferCount == this.availableInputBuffers.length || this.flushed);
            this.outputStartTimeUs = j;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final I dequeueInputBuffer() throws androidx.media3.decoder.DecoderException {
        I i;
        synchronized (this.lock) {
            maybeThrowException();
            androidx.media3.common.util.Assertions.checkState(this.dequeuedInputBuffer == null);
            int i2 = this.availableInputBufferCount;
            if (i2 == 0) {
                i = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i3 = i2 - 1;
                this.availableInputBufferCount = i3;
                i = iArr[i3];
            }
            this.dequeuedInputBuffer = i;
        }
        return i;
    }

    @Override // androidx.media3.decoder.Decoder
    public final void queueInputBuffer(I i) throws androidx.media3.decoder.DecoderException {
        synchronized (this.lock) {
            maybeThrowException();
            androidx.media3.common.util.Assertions.checkArgument(i == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final O dequeueOutputBuffer() throws androidx.media3.decoder.DecoderException {
        synchronized (this.lock) {
            maybeThrowException();
            if (this.queuedOutputBuffers.isEmpty()) {
                return null;
            }
            return this.queuedOutputBuffers.removeFirst();
        }
    }

    protected void releaseOutputBuffer(O o) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o);
            maybeNotifyDecodeLoop();
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            this.flushed = true;
            this.skippedOutputBufferCount = 0;
            I i = this.dequeuedInputBuffer;
            if (i != null) {
                releaseInputBufferInternal(i);
                this.dequeuedInputBuffer = null;
            }
            while (!this.queuedInputBuffers.isEmpty()) {
                releaseInputBufferInternal(this.queuedInputBuffers.removeFirst());
            }
            while (!this.queuedOutputBuffers.isEmpty()) {
                this.queuedOutputBuffers.removeFirst().release();
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends androidx.media3.decoder.DecoderException */
    private void maybeThrowException() throws E, androidx.media3.decoder.DecoderException {
        E e = this.exception;
        if (e != null) {
            throw e;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (java.lang.InterruptedException e) {
                throw new java.lang.IllegalStateException(e);
            }
        } while (decode());
    }

    private boolean decode() throws java.lang.InterruptedException {
        E e;
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                this.lock.wait();
            }
            if (this.released) {
                return false;
            }
            I iRemoveFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i;
            O o = oArr[i];
            boolean z = this.flushed;
            this.flushed = false;
            if (iRemoveFirst.isEndOfStream()) {
                o.addFlag(4);
            } else {
                o.timeUs = iRemoveFirst.timeUs;
                if (iRemoveFirst.isFirstSample()) {
                    o.addFlag(androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
                }
                if (!isAtLeastOutputStartTimeUs(iRemoveFirst.timeUs)) {
                    o.shouldBeSkipped = true;
                }
                try {
                    e = (E) decode(iRemoveFirst, o, z);
                } catch (java.lang.OutOfMemoryError e2) {
                    e = (E) createUnexpectedDecodeException(e2);
                } catch (java.lang.RuntimeException e3) {
                    e = (E) createUnexpectedDecodeException(e3);
                }
                if (e != null) {
                    synchronized (this.lock) {
                        this.exception = e;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                if (this.flushed) {
                    o.release();
                } else if (o.shouldBeSkipped) {
                    this.skippedOutputBufferCount++;
                    o.release();
                } else {
                    o.skippedOutputBufferCount = this.skippedOutputBufferCount;
                    this.skippedOutputBufferCount = 0;
                    this.queuedOutputBuffers.addLast(o);
                }
                releaseInputBufferInternal(iRemoveFirst);
            }
            return true;
        }
    }

    private boolean canDecodeBuffer() {
        return !this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0;
    }

    private void releaseInputBufferInternal(I i) {
        i.clear();
        I[] iArr = this.availableInputBuffers;
        int i2 = this.availableInputBufferCount;
        this.availableInputBufferCount = i2 + 1;
        iArr[i2] = i;
    }

    private void releaseOutputBufferInternal(O o) {
        o.clear();
        O[] oArr = this.availableOutputBuffers;
        int i = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i + 1;
        oArr[i] = o;
    }
}
