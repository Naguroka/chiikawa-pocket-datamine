package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
final class AsynchronousMediaCodecAdapter implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter {
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_SHUT_DOWN = 2;
    private final androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer bufferEnqueuer;
    private final android.media.MediaCodec codec;
    private boolean codecReleased;
    private int state;

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    public static final class Factory implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory {
        private final com.google.common.base.Supplier<android.os.HandlerThread> callbackThreadSupplier;
        private boolean enableSynchronousBufferQueueingWithAsyncCryptoFlag;
        private final com.google.common.base.Supplier<android.os.HandlerThread> queueingThreadSupplier;

        public Factory(final int i) {
            this(new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda0
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory.lambda$new$0(i);
                }
            }, new com.google.common.base.Supplier() { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$Factory$$ExternalSyntheticLambda1
                @Override // com.google.common.base.Supplier
                public final java.lang.Object get() {
                    return androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.Factory.lambda$new$1(i);
                }
            });
        }

        static /* synthetic */ android.os.HandlerThread lambda$new$0(int i) {
            return new android.os.HandlerThread(androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.createCallbackThreadLabel(i));
        }

        static /* synthetic */ android.os.HandlerThread lambda$new$1(int i) {
            return new android.os.HandlerThread(androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter.createQueueingThreadLabel(i));
        }

        Factory(com.google.common.base.Supplier<android.os.HandlerThread> supplier, com.google.common.base.Supplier<android.os.HandlerThread> supplier2) {
            this.callbackThreadSupplier = supplier;
            this.queueingThreadSupplier = supplier2;
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = true;
        }

        public void experimentalSetAsyncCryptoFlagEnabled(boolean z) {
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r2v1, types: [androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v4 */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.lang.Exception {
            android.media.MediaCodec mediaCodecCreateByCodecName;
            androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer;
            java.lang.String str = configuration.codecInfo.name;
            ?? r2 = 0;
            r2 = 0;
            try {
                androidx.media3.common.util.TraceUtil.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
                try {
                    int i = configuration.flags;
                    if (this.enableSynchronousBufferQueueingWithAsyncCryptoFlag && useSynchronousBufferQueueingWithAsyncCryptoFlag(configuration.format)) {
                        asynchronousMediaCodecBufferEnqueuer = new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName);
                        i |= 4;
                    } else {
                        asynchronousMediaCodecBufferEnqueuer = new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName, this.queueingThreadSupplier.get());
                    }
                    androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, this.callbackThreadSupplier.get(), asynchronousMediaCodecBufferEnqueuer);
                    try {
                        androidx.media3.common.util.TraceUtil.endSection();
                        asynchronousMediaCodecAdapter.initialize(configuration.mediaFormat, configuration.surface, configuration.crypto, i);
                        return asynchronousMediaCodecAdapter;
                    } catch (java.lang.Exception e) {
                        e = e;
                        r2 = asynchronousMediaCodecAdapter;
                        if (r2 != 0) {
                            r2.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                mediaCodecCreateByCodecName = null;
            }
        }

        private static boolean useSynchronousBufferQueueingWithAsyncCryptoFlag(androidx.media3.common.Format format) {
            if (androidx.media3.common.util.Util.SDK_INT < 34) {
                return false;
            }
            return androidx.media3.common.util.Util.SDK_INT >= 35 || androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType);
        }
    }

    private AsynchronousMediaCodecAdapter(android.media.MediaCodec mediaCodec, android.os.HandlerThread handlerThread, androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = mediaCodecBufferEnqueuer;
        this.state = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i) {
        this.asynchronousMediaCodecCallback.initialize(this.codec);
        androidx.media3.common.util.TraceUtil.beginSection("configureCodec");
        this.codec.configure(mediaFormat, surface, mediaCrypto, i);
        androidx.media3.common.util.TraceUtil.endSection();
        this.bufferEnqueuer.start();
        androidx.media3.common.util.TraceUtil.beginSection("startCodec");
        this.codec.start();
        androidx.media3.common.util.TraceUtil.endSection();
        this.state = 1;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.bufferEnqueuer.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i, int i2, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i3) {
        this.bufferEnqueuer.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, boolean z) {
        this.codec.releaseOutputBuffer(i, z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i, long j) {
        this.codec.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueInputBufferIndex();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo) {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public android.media.MediaFormat getOutputFormat() {
        return this.asynchronousMediaCodecCallback.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getInputBuffer(int i) {
        return this.codec.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getOutputBuffer(int i) {
        return this.codec.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        this.asynchronousMediaCodecCallback.flush();
        this.codec.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        try {
            if (this.state == 1) {
                this.bufferEnqueuer.shutdown();
                this.asynchronousMediaCodecCallback.shutdown();
            }
            this.state = 2;
            if (this.codecReleased) {
                return;
            }
            try {
                if (androidx.media3.common.util.Util.SDK_INT >= 30 && androidx.media3.common.util.Util.SDK_INT < 33) {
                    this.codec.stop();
                }
            } finally {
                this.codec.release();
                this.codecReleased = true;
            }
        } catch (java.lang.Throwable th) {
            if (!this.codecReleased) {
                try {
                    if (androidx.media3.common.util.Util.SDK_INT >= 30 && androidx.media3.common.util.Util.SDK_INT < 33) {
                        this.codec.stop();
                    }
                } finally {
                    this.codec.release();
                    this.codecReleased = true;
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler) {
        this.codec.setOnFrameRenderedListener(new android.media.MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(android.media.MediaCodec mediaCodec, long j, long j2) {
                this.f$0.m170x4a2a5e4a(onFrameRenderedListener, mediaCodec, j, j2);
            }
        }, handler);
    }

    /* JADX INFO: renamed from: lambda$setOnFrameRenderedListener$0$androidx-media3-exoplayer-mediacodec-AsynchronousMediaCodecAdapter, reason: not valid java name */
    /* synthetic */ void m170x4a2a5e4a(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.media.MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean registerOnBufferAvailableListener(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        this.asynchronousMediaCodecCallback.setOnBufferAvailableListener(onBufferAvailableListener);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(android.view.Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(android.os.Bundle bundle) {
        this.bufferEnqueuer.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i) {
        this.codec.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public android.os.PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }

    void onError(android.media.MediaCodec.CodecException codecException) {
        this.asynchronousMediaCodecCallback.onError(this.codec, codecException);
    }

    void onOutputFormatChanged(android.media.MediaFormat mediaFormat) {
        this.asynchronousMediaCodecCallback.onOutputFormatChanged(this.codec, mediaFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String createCallbackThreadLabel(int i) {
        return createThreadLabel(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String createQueueingThreadLabel(int i) {
        return createThreadLabel(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static java.lang.String createThreadLabel(int i, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(").append(i).append(")");
        }
        return sb.toString();
    }
}
