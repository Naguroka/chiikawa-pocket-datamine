package androidx.media3.exoplayer.mediacodec;

/* JADX INFO: loaded from: classes.dex */
public final class SynchronousMediaCodecAdapter implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter {
    private final android.media.MediaCodec codec;
    private java.nio.ByteBuffer[] inputByteBuffers;
    private java.nio.ByteBuffer[] outputByteBuffers;

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    public static class Factory implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public androidx.media3.exoplayer.mediacodec.MediaCodecAdapter createAdapter(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.lang.Throwable {
            android.media.MediaCodec mediaCodec = 0;
            mediaCodec = 0;
            try {
                android.media.MediaCodec mediaCodecCreateCodec = createCodec(configuration);
                try {
                    androidx.media3.common.util.TraceUtil.beginSection("configureCodec");
                    mediaCodecCreateCodec.configure(configuration.mediaFormat, configuration.surface, configuration.crypto, configuration.flags);
                    androidx.media3.common.util.TraceUtil.endSection();
                    androidx.media3.common.util.TraceUtil.beginSection("startCodec");
                    mediaCodecCreateCodec.start();
                    androidx.media3.common.util.TraceUtil.endSection();
                    return new androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter(mediaCodecCreateCodec);
                } catch (java.io.IOException | java.lang.RuntimeException e) {
                    e = e;
                    mediaCodec = mediaCodecCreateCodec;
                    if (mediaCodec != 0) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (java.io.IOException e2) {
                e = e2;
            } catch (java.lang.RuntimeException e3) {
                e = e3;
            }
        }

        protected android.media.MediaCodec createCodec(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration) throws java.io.IOException {
            androidx.media3.common.util.Assertions.checkNotNull(configuration.codecInfo);
            java.lang.String str = configuration.codecInfo.name;
            androidx.media3.common.util.TraceUtil.beginSection("createCodec:" + str);
            android.media.MediaCodec mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(str);
            androidx.media3.common.util.TraceUtil.endSection();
            return mediaCodecCreateByCodecName;
        }
    }

    private SynchronousMediaCodecAdapter(android.media.MediaCodec mediaCodec) {
        this.codec = mediaCodec;
        if (androidx.media3.common.util.Util.SDK_INT < 21) {
            this.inputByteBuffers = mediaCodec.getInputBuffers();
            this.outputByteBuffers = mediaCodec.getOutputBuffers();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        return this.codec.dequeueInputBuffer(0L);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(android.media.MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && androidx.media3.common.util.Util.SDK_INT < 21) {
                this.outputByteBuffers = this.codec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public android.media.MediaFormat getOutputFormat() {
        return this.codec.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getInputBuffer(int i) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            return this.codec.getInputBuffer(i);
        }
        return ((java.nio.ByteBuffer[]) androidx.media3.common.util.Util.castNonNull(this.inputByteBuffers))[i];
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public java.nio.ByteBuffer getOutputBuffer(int i) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            return this.codec.getOutputBuffer(i);
        }
        return ((java.nio.ByteBuffer[]) androidx.media3.common.util.Util.castNonNull(this.outputByteBuffers))[i];
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.codec.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i, int i2, androidx.media3.decoder.CryptoInfo cryptoInfo, long j, int i3) {
        this.codec.queueSecureInputBuffer(i, i2, cryptoInfo.getFrameworkCryptoInfo(), j, i3);
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
    public void flush() {
        this.codec.flush();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void release() {
        this.inputByteBuffers = null;
        this.outputByteBuffers = null;
        try {
            if (androidx.media3.common.util.Util.SDK_INT >= 30 && androidx.media3.common.util.Util.SDK_INT < 33) {
                this.codec.stop();
            }
        } finally {
            this.codec.release();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.os.Handler handler) {
        this.codec.setOnFrameRenderedListener(new android.media.MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.SynchronousMediaCodecAdapter$$ExternalSyntheticLambda0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(android.media.MediaCodec mediaCodec, long j, long j2) {
                this.f$0.m172xe3d0a01f(onFrameRenderedListener, mediaCodec, j, j2);
            }
        }, handler);
    }

    /* JADX INFO: renamed from: lambda$setOnFrameRenderedListener$0$androidx-media3-exoplayer-mediacodec-SynchronousMediaCodecAdapter, reason: not valid java name */
    /* synthetic */ void m172xe3d0a01f(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, android.media.MediaCodec mediaCodec, long j, long j2) {
        onFrameRenderedListener.onFrameRendered(this, j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(android.view.Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(android.os.Bundle bundle) {
        this.codec.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i) {
        this.codec.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public android.os.PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }
}
