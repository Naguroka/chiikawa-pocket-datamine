package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
public final class CameraMotionRenderer extends androidx.media3.exoplayer.BaseRenderer {
    private static final int SAMPLE_WINDOW_DURATION_US = 100000;
    private static final java.lang.String TAG = "CameraMotionRenderer";
    private final androidx.media3.decoder.DecoderInputBuffer buffer;
    private long lastTimestampUs;
    private androidx.media3.exoplayer.video.spherical.CameraMotionListener listener;
    private long offsetUs;
    private final androidx.media3.common.util.ParsableByteArray scratch;

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        return true;
    }

    public CameraMotionRenderer() {
        super(6);
        this.buffer = new androidx.media3.decoder.DecoderInputBuffer(1);
        this.scratch = new androidx.media3.common.util.ParsableByteArray();
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public int supportsFormat(androidx.media3.common.Format format) {
        if (androidx.media3.common.MimeTypes.APPLICATION_CAMERA_MOTION.equals(format.sampleMimeType)) {
            return androidx.media3.exoplayer.RendererCapabilities.create(4);
        }
        return androidx.media3.exoplayer.RendererCapabilities.create(0);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (i == 8) {
            this.listener = (androidx.media3.exoplayer.video.spherical.CameraMotionListener) obj;
        } else {
            super.handleMessage(i, obj);
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onStreamChanged(androidx.media3.common.Format[] formatArr, long j, long j2, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId) {
        this.offsetUs = j2;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) {
        this.lastTimestampUs = Long.MIN_VALUE;
        resetListener();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        resetListener();
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) {
        while (!hasReadStreamToEnd() && this.lastTimestampUs < androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US + j) {
            this.buffer.clear();
            if (readSource(getFormatHolder(), this.buffer, 0) != -4 || this.buffer.isEndOfStream()) {
                return;
            }
            long j3 = this.buffer.timeUs;
            this.lastTimestampUs = j3;
            boolean z = j3 < getLastResetPositionUs();
            if (this.listener != null && !z) {
                this.buffer.flip();
                float[] metadata = parseMetadata((java.nio.ByteBuffer) androidx.media3.common.util.Util.castNonNull(this.buffer.data));
                if (metadata != null) {
                    ((androidx.media3.exoplayer.video.spherical.CameraMotionListener) androidx.media3.common.util.Util.castNonNull(this.listener)).onCameraMotion(this.lastTimestampUs - this.offsetUs, metadata);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        return hasReadStreamToEnd();
    }

    private float[] parseMetadata(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.scratch.reset(byteBuffer.array(), byteBuffer.limit());
        this.scratch.setPosition(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = java.lang.Float.intBitsToFloat(this.scratch.readLittleEndianInt());
        }
        return fArr;
    }

    private void resetListener() {
        androidx.media3.exoplayer.video.spherical.CameraMotionListener cameraMotionListener = this.listener;
        if (cameraMotionListener != null) {
            cameraMotionListener.onCameraMotionReset();
        }
    }
}
