package androidx.media3.exoplayer.video.spherical;

/* JADX INFO: loaded from: classes.dex */
final class SceneRenderer implements androidx.media3.exoplayer.video.VideoFrameMetadataListener, androidx.media3.exoplayer.video.spherical.CameraMotionListener {
    private static final java.lang.String TAG = "SceneRenderer";
    private byte[] lastProjectionData;
    private android.graphics.SurfaceTexture surfaceTexture;
    private int textureId;
    private final java.util.concurrent.atomic.AtomicBoolean frameAvailable = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.util.concurrent.atomic.AtomicBoolean resetRotationAtNextFrame = new java.util.concurrent.atomic.AtomicBoolean(true);
    private final androidx.media3.exoplayer.video.spherical.ProjectionRenderer projectionRenderer = new androidx.media3.exoplayer.video.spherical.ProjectionRenderer();
    private final androidx.media3.exoplayer.video.spherical.FrameRotationQueue frameRotationQueue = new androidx.media3.exoplayer.video.spherical.FrameRotationQueue();
    private final androidx.media3.common.util.TimedValueQueue<java.lang.Long> sampleTimestampQueue = new androidx.media3.common.util.TimedValueQueue<>();
    private final androidx.media3.common.util.TimedValueQueue<androidx.media3.exoplayer.video.spherical.Projection> projectionQueue = new androidx.media3.common.util.TimedValueQueue<>();
    private final float[] rotationMatrix = new float[16];
    private final float[] tempMatrix = new float[16];
    private volatile int defaultStereoMode = 0;
    private int lastStereoMode = -1;

    public void setDefaultStereoMode(int i) {
        this.defaultStereoMode = i;
    }

    public android.graphics.SurfaceTexture init() {
        try {
            android.opengl.GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            androidx.media3.common.util.GlUtil.checkGlError();
            this.projectionRenderer.init();
            androidx.media3.common.util.GlUtil.checkGlError();
            this.textureId = androidx.media3.common.util.GlUtil.createExternalTexture();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            androidx.media3.common.util.Log.e(TAG, "Failed to initialize the renderer", e);
        }
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.textureId);
        this.surfaceTexture = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.SceneRenderer$$ExternalSyntheticLambda0
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture2) {
                this.f$0.m220x200ab998(surfaceTexture2);
            }
        });
        return this.surfaceTexture;
    }

    /* JADX INFO: renamed from: lambda$init$0$androidx-media3-exoplayer-video-spherical-SceneRenderer, reason: not valid java name */
    /* synthetic */ void m220x200ab998(android.graphics.SurfaceTexture surfaceTexture) {
        this.frameAvailable.set(true);
    }

    public void drawFrame(float[] fArr, boolean z) {
        android.opengl.GLES20.glClear(16384);
        try {
            androidx.media3.common.util.GlUtil.checkGlError();
        } catch (androidx.media3.common.util.GlUtil.GlException e) {
            androidx.media3.common.util.Log.e(TAG, "Failed to draw a frame", e);
        }
        if (this.frameAvailable.compareAndSet(true, false)) {
            ((android.graphics.SurfaceTexture) androidx.media3.common.util.Assertions.checkNotNull(this.surfaceTexture)).updateTexImage();
            try {
                androidx.media3.common.util.GlUtil.checkGlError();
            } catch (androidx.media3.common.util.GlUtil.GlException e2) {
                androidx.media3.common.util.Log.e(TAG, "Failed to draw a frame", e2);
            }
            if (this.resetRotationAtNextFrame.compareAndSet(true, false)) {
                androidx.media3.common.util.GlUtil.setToIdentity(this.rotationMatrix);
            }
            long timestamp = this.surfaceTexture.getTimestamp();
            java.lang.Long lPoll = this.sampleTimestampQueue.poll(timestamp);
            if (lPoll != null) {
                this.frameRotationQueue.pollRotationMatrix(this.rotationMatrix, lPoll.longValue());
            }
            androidx.media3.exoplayer.video.spherical.Projection projectionPollFloor = this.projectionQueue.pollFloor(timestamp);
            if (projectionPollFloor != null) {
                this.projectionRenderer.setProjection(projectionPollFloor);
            }
        }
        android.opengl.Matrix.multiplyMM(this.tempMatrix, 0, fArr, 0, this.rotationMatrix, 0);
        this.projectionRenderer.draw(this.textureId, this.tempMatrix, z);
    }

    public void shutdown() {
        this.projectionRenderer.shutdown();
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public void onVideoFrameAboutToBeRendered(long j, long j2, androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
        this.sampleTimestampQueue.add(j2, java.lang.Long.valueOf(j));
        setProjection(format.projectionData, format.stereoMode, j2);
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotion(long j, float[] fArr) {
        this.frameRotationQueue.setRotation(j, fArr);
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public void onCameraMotionReset() {
        this.sampleTimestampQueue.clear();
        this.frameRotationQueue.reset();
        this.resetRotationAtNextFrame.set(true);
    }

    private void setProjection(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.lastProjectionData;
        int i2 = this.lastStereoMode;
        this.lastProjectionData = bArr;
        if (i == -1) {
            i = this.defaultStereoMode;
        }
        this.lastStereoMode = i;
        if (i2 == i && java.util.Arrays.equals(bArr2, this.lastProjectionData)) {
            return;
        }
        byte[] bArr3 = this.lastProjectionData;
        androidx.media3.exoplayer.video.spherical.Projection projectionDecode = bArr3 != null ? androidx.media3.exoplayer.video.spherical.ProjectionDecoder.decode(bArr3, this.lastStereoMode) : null;
        if (projectionDecode == null || !androidx.media3.exoplayer.video.spherical.ProjectionRenderer.isSupported(projectionDecode)) {
            projectionDecode = androidx.media3.exoplayer.video.spherical.Projection.createEquirectangular(this.lastStereoMode);
        }
        this.projectionQueue.add(j, projectionDecode);
    }
}
