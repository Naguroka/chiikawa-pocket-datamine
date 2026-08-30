package androidx.media3.exoplayer.video;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecVideoRenderer extends androidx.media3.exoplayer.mediacodec.MediaCodecRenderer implements androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator {
    private static final int HEVC_MAX_INPUT_SIZE_THRESHOLD = 2097152;
    private static final float INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR = 1.5f;
    private static final java.lang.String KEY_CROP_BOTTOM = "crop-bottom";
    private static final java.lang.String KEY_CROP_LEFT = "crop-left";
    private static final java.lang.String KEY_CROP_RIGHT = "crop-right";
    private static final java.lang.String KEY_CROP_TOP = "crop-top";
    private static final long MIN_EARLY_US_LATE_THRESHOLD = -30000;
    private static final long MIN_EARLY_US_VERY_LATE_THRESHOLD = -500000;
    private static final int[] STANDARD_LONG_EDGE_VIDEO_PX = {1920, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1440, 1280, 960, 854, 640, 540, 480};
    private static final java.lang.String TAG = "MediaCodecVideoRenderer";
    private static final long TUNNELING_EOS_PRESENTATION_TIME_US = Long.MAX_VALUE;
    private static boolean deviceNeedsSetOutputSurfaceWorkaround;
    private static boolean evaluatedDeviceNeedsSetOutputSurfaceWorkaround;
    private int buffersInCodecCount;
    private boolean codecHandlesHdr10PlusOutOfBandMetadata;
    private androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues;
    private boolean codecNeedsSetOutputSurfaceWorkaround;
    private int consecutiveDroppedFrameCount;
    private final android.content.Context context;
    private androidx.media3.common.VideoSize decodedVideoSize;
    private final boolean deviceNeedsNoPostProcessWorkaround;
    private android.view.Surface displaySurface;
    private long droppedFrameAccumulationStartTimeMs;
    private int droppedFrames;
    private final androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher eventDispatcher;
    private androidx.media3.exoplayer.video.VideoFrameMetadataListener frameMetadataListener;
    private boolean hasSetVideoSink;
    private boolean haveReportedFirstFrameRenderedForCurrentSurface;
    private long lastFrameReleaseTimeNs;
    private final int maxDroppedFramesToNotify;
    private androidx.media3.common.util.Size outputResolution;
    private final boolean ownsVideoSink;
    private androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface;
    private int rendererPriority;
    private androidx.media3.common.VideoSize reportedVideoSize;
    private int scalingMode;
    private long totalVideoFrameProcessingOffsetUs;
    private boolean tunneling;
    private int tunnelingAudioSessionId;
    androidx.media3.exoplayer.video.MediaCodecVideoRenderer.OnFrameRenderedListenerV23 tunnelingOnFrameRenderedListener;
    private java.util.List<androidx.media3.common.Effect> videoEffects;
    private int videoFrameProcessingOffsetCount;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseControl videoFrameReleaseControl;
    private final androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameReleaseInfo videoFrameReleaseInfo;
    private androidx.media3.exoplayer.video.VideoSink videoSink;
    private final androidx.media3.exoplayer.video.VideoSinkProvider videoSinkProvider;

    protected long getBufferTimestampAdjustmentUs() {
        return 0L;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public java.lang.String getName() {
        return TAG;
    }

    protected void onReadyToRegisterVideoSinkInputStream() {
    }

    protected boolean shouldDropBuffersToKeyframe(long j, long j2, boolean z) {
        return j < MIN_EARLY_US_VERY_LATE_THRESHOLD && !z;
    }

    protected boolean shouldDropOutputBuffer(long j, long j2, boolean z) {
        return j < MIN_EARLY_US_LATE_THRESHOLD && !z;
    }

    protected boolean shouldForceRenderOutputBuffer(long j, long j2) {
        return j < MIN_EARLY_US_LATE_THRESHOLD && j2 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    protected boolean shouldSkipBuffersWithIdenticalReleaseTime() {
        return true;
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector) {
        this(context, mediaCodecSelector, 0L);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j) {
        this(context, mediaCodecSelector, j, null, null, 0);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, j, false, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory.getDefault(context), mediaCodecSelector, j, z, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory factory, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i) {
        this(context, factory, mediaCodecSelector, j, z, handler, videoRendererEventListener, i, 30.0f);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory factory, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i, float f) {
        this(context, factory, mediaCodecSelector, j, z, handler, videoRendererEventListener, i, f, null);
    }

    public MediaCodecVideoRenderer(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory factory, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, long j, boolean z, android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, int i, float f, androidx.media3.exoplayer.video.VideoSinkProvider videoSinkProvider) {
        super(2, factory, mediaCodecSelector, z, f);
        android.content.Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        this.maxDroppedFramesToNotify = i;
        this.videoSinkProvider = videoSinkProvider;
        this.eventDispatcher = new androidx.media3.exoplayer.video.VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        this.ownsVideoSink = videoSinkProvider == null;
        if (videoSinkProvider == null) {
            this.videoFrameReleaseControl = new androidx.media3.exoplayer.video.VideoFrameReleaseControl(applicationContext, this, j);
        } else {
            this.videoFrameReleaseControl = videoSinkProvider.getVideoFrameReleaseControl();
        }
        this.videoFrameReleaseInfo = new androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameReleaseInfo();
        this.deviceNeedsNoPostProcessWorkaround = deviceNeedsNoPostProcessWorkaround();
        this.outputResolution = androidx.media3.common.util.Size.UNKNOWN;
        this.scalingMode = 1;
        this.decodedVideoSize = androidx.media3.common.VideoSize.UNKNOWN;
        this.tunnelingAudioSessionId = 0;
        this.reportedVideoSize = null;
        this.rendererPriority = -1000;
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldForceReleaseFrame(long j, long j2) {
        return shouldForceRenderOutputBuffer(j, j2);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldDropFrame(long j, long j2, boolean z) {
        return shouldDropOutputBuffer(j, j2, z);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameReleaseControl.FrameTimingEvaluator
    public boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        return shouldDropBuffersToKeyframe(j, j3, z) && maybeDropBuffersToKeyframe(j2, z2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int supportsFormat(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        boolean z;
        int i = 0;
        if (!androidx.media3.common.MimeTypes.isVideo(format.sampleMimeType)) {
            return androidx.media3.exoplayer.RendererCapabilities.create(0);
        }
        boolean z2 = format.drmInitData != null;
        java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos = getDecoderInfos(this.context, mediaCodecSelector, format, z2, false);
        if (z2 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(this.context, mediaCodecSelector, format, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return androidx.media3.exoplayer.RendererCapabilities.create(1);
        }
        if (!supportsFormatDrm(format)) {
            return androidx.media3.exoplayer.RendererCapabilities.create(2);
        }
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = decoderInfos.get(0);
        boolean zIsFormatSupported = mediaCodecInfo.isFormatSupported(format);
        if (!zIsFormatSupported) {
            int i2 = 1;
            while (true) {
                if (i2 >= decoderInfos.size()) {
                    z = true;
                    break;
                }
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo2 = decoderInfos.get(i2);
                if (mediaCodecInfo2.isFormatSupported(format)) {
                    z = false;
                    zIsFormatSupported = true;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = zIsFormatSupported ? 4 : 3;
        int i4 = mediaCodecInfo.isSeamlessAdaptationSupported(format) ? 16 : 8;
        int i5 = mediaCodecInfo.hardwareAccelerated ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (androidx.media3.common.util.Util.SDK_INT >= 26 && androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && !androidx.media3.exoplayer.video.MediaCodecVideoRenderer.Api26.doesDisplaySupportDolbyVision(this.context)) {
            i6 = 256;
        }
        if (zIsFormatSupported) {
            java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> decoderInfos2 = getDecoderInfos(this.context, mediaCodecSelector, format, z2, true);
            if (!decoderInfos2.isEmpty()) {
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo3 = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(decoderInfos2, format).get(0);
                if (mediaCodecInfo3.isFormatSupported(format) && mediaCodecInfo3.isSeamlessAdaptationSupported(format)) {
                    i = 32;
                }
            }
        }
        return androidx.media3.exoplayer.RendererCapabilities.create(i3, i4, i, i5, i6);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSortedByFormatSupport(getDecoderInfos(this.context, mediaCodecSelector, format, z, this.tunneling), format);
    }

    private static java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> getDecoderInfos(android.content.Context context, androidx.media3.exoplayer.mediacodec.MediaCodecSelector mediaCodecSelector, androidx.media3.common.Format format, boolean z, boolean z2) throws androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException {
        if (format.sampleMimeType == null) {
            return com.google.common.collect.ImmutableList.of();
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 26 && androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && !androidx.media3.exoplayer.video.MediaCodecVideoRenderer.Api26.doesDisplaySupportDolbyVision(context)) {
            java.util.List<androidx.media3.exoplayer.mediacodec.MediaCodecInfo> alternativeDecoderInfos = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getAlternativeDecoderInfos(mediaCodecSelector, format, z, z2);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getDecoderInfosSoftMatch(mediaCodecSelector, format, z, z2);
    }

    private static final class Api26 {
        private Api26() {
        }

        public static boolean doesDisplaySupportDolbyVision(android.content.Context context) {
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
            android.view.Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onInit() {
        super.onInit();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onEnabled(boolean z, boolean z2) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.onEnabled(z, z2);
        boolean z3 = getConfiguration().tunneling;
        androidx.media3.common.util.Assertions.checkState((z3 && this.tunnelingAudioSessionId == 0) ? false : true);
        if (this.tunneling != z3) {
            this.tunneling = z3;
            releaseCodec();
        }
        this.eventDispatcher.enabled(this.decoderCounters);
        if (!this.hasSetVideoSink) {
            if ((this.videoEffects != null || !this.ownsVideoSink) && this.videoSink == null) {
                androidx.media3.exoplayer.video.VideoSinkProvider videoSinkProviderBuild = this.videoSinkProvider;
                if (videoSinkProviderBuild == null) {
                    videoSinkProviderBuild = new androidx.media3.exoplayer.video.CompositingVideoSinkProvider.Builder(this.context, this.videoFrameReleaseControl).setClock(getClock()).build();
                }
                this.videoSink = videoSinkProviderBuild.getSink();
            }
            this.hasSetVideoSink = true;
        }
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setListener(new androidx.media3.exoplayer.video.VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onVideoSizeChanged(androidx.media3.exoplayer.video.VideoSink videoSink2, androidx.media3.common.VideoSize videoSize) {
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onFirstFrameRendered(androidx.media3.exoplayer.video.VideoSink videoSink2) {
                    androidx.media3.common.util.Assertions.checkStateNotNull(androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.displaySurface);
                    androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.notifyRenderedFirstFrame();
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onFrameDropped(androidx.media3.exoplayer.video.VideoSink videoSink2) {
                    androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.updateDroppedBufferCounters(0, 1);
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.Listener
                public void onError(androidx.media3.exoplayer.video.VideoSink videoSink2, androidx.media3.exoplayer.video.VideoSink.VideoSinkException videoSinkException) {
                    androidx.media3.exoplayer.video.MediaCodecVideoRenderer mediaCodecVideoRenderer = androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this;
                    mediaCodecVideoRenderer.setPendingPlaybackException(mediaCodecVideoRenderer.createRendererException(videoSinkException, videoSinkException.format, 7001));
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
            androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
            if (videoFrameMetadataListener != null) {
                this.videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
            }
            if (this.displaySurface != null && !this.outputResolution.equals(androidx.media3.common.util.Size.UNKNOWN)) {
                this.videoSink.setOutputSurfaceInfo(this.displaySurface, this.outputResolution);
            }
            this.videoSink.setPlaybackSpeed(getPlaybackSpeed());
            java.util.List<androidx.media3.common.Effect> list = this.videoEffects;
            if (list != null) {
                this.videoSink.setVideoEffects(list);
            }
            this.videoSink.onRendererEnabled(z2);
            return;
        }
        this.videoFrameReleaseControl.setClock(getClock());
        this.videoFrameReleaseControl.onEnabled(z2);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void enableMayRenderStartOfStream() {
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.enableMayRenderStartOfStream();
        } else {
            this.videoFrameReleaseControl.allowReleaseFirstFrameBeforeStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onPositionReset(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(true);
            this.videoSink.setStreamOffsetAndAdjustmentUs(getOutputStreamOffsetUs(), getBufferTimestampAdjustmentUs());
        }
        super.onPositionReset(j, z);
        if (this.videoSink == null) {
            this.videoFrameReleaseControl.reset();
        }
        if (z) {
            this.videoFrameReleaseControl.join(false);
        }
        maybeSetupTunnelingForFirstFrame();
        this.consecutiveDroppedFrameCount = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isEnded() {
        androidx.media3.exoplayer.video.VideoSink videoSink;
        return super.isEnded() && ((videoSink = this.videoSink) == null || videoSink.isEnded());
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface;
        androidx.media3.exoplayer.video.VideoSink videoSink;
        boolean z = super.isReady() && ((videoSink = this.videoSink) == null || videoSink.isReady());
        if (z && (((placeholderSurface = this.placeholderSurface) != null && this.displaySurface == placeholderSurface) || getCodec() == null || this.tunneling)) {
            return true;
        }
        return this.videoFrameReleaseControl.isReady(z);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStarted() {
        super.onStarted();
        this.droppedFrames = 0;
        this.droppedFrameAccumulationStartTimeMs = getClock().elapsedRealtime();
        this.totalVideoFrameProcessingOffsetUs = 0L;
        this.videoFrameProcessingOffsetCount = 0;
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStarted();
        } else {
            this.videoFrameReleaseControl.onStarted();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onStopped() {
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererStopped();
        } else {
            this.videoFrameReleaseControl.onStopped();
        }
        super.onStopped();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onDisabled() {
        this.reportedVideoSize = null;
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.onRendererDisabled();
        } else {
            this.videoFrameReleaseControl.onDisabled();
        }
        maybeSetupTunnelingForFirstFrame();
        this.haveReportedFirstFrameRenderedForCurrentSurface = false;
        this.tunnelingOnFrameRenderedListener = null;
        try {
            super.onDisabled();
        } finally {
            this.eventDispatcher.disabled(this.decoderCounters);
            this.eventDispatcher.videoSizeChanged(androidx.media3.common.VideoSize.UNKNOWN);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    protected void onReset() {
        try {
            super.onReset();
        } finally {
            this.hasSetVideoSink = false;
            if (this.placeholderSurface != null) {
                releasePlaceholderSurface();
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    protected void onRelease() {
        super.onRelease();
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink == null || !this.ownsVideoSink) {
            return;
        }
        videoSink.release();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void handleMessage(int i, java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (i == 1) {
            setOutput(obj);
            return;
        }
        if (i == 7) {
            androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = (androidx.media3.exoplayer.video.VideoFrameMetadataListener) androidx.media3.common.util.Assertions.checkNotNull(obj);
            this.frameMetadataListener = videoFrameMetadataListener;
            androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
            if (videoSink != null) {
                videoSink.setVideoFrameMetadataListener(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i == 10) {
            int iIntValue = ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue();
            if (this.tunnelingAudioSessionId != iIntValue) {
                this.tunnelingAudioSessionId = iIntValue;
                if (this.tunneling) {
                    releaseCodec();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 16) {
            this.rendererPriority = ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue();
            updateCodecImportance();
            return;
        }
        if (i == 4) {
            this.scalingMode = ((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue();
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec = getCodec();
            if (codec != null) {
                codec.setVideoScalingMode(this.scalingMode);
                return;
            }
            return;
        }
        if (i == 5) {
            this.videoFrameReleaseControl.setChangeFrameRateStrategy(((java.lang.Integer) androidx.media3.common.util.Assertions.checkNotNull(obj)).intValue());
            return;
        }
        if (i == 13) {
            setVideoEffects((java.util.List) androidx.media3.common.util.Assertions.checkNotNull(obj));
            return;
        }
        if (i == 14) {
            androidx.media3.common.util.Size size = (androidx.media3.common.util.Size) androidx.media3.common.util.Assertions.checkNotNull(obj);
            if (size.getWidth() == 0 || size.getHeight() == 0) {
                return;
            }
            this.outputResolution = size;
            androidx.media3.exoplayer.video.VideoSink videoSink2 = this.videoSink;
            if (videoSink2 != null) {
                videoSink2.setOutputSurfaceInfo((android.view.Surface) androidx.media3.common.util.Assertions.checkStateNotNull(this.displaySurface), size);
                return;
            }
            return;
        }
        super.handleMessage(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.media3.exoplayer.video.VideoFrameReleaseControl] */
    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.media3.exoplayer.video.MediaCodecVideoRenderer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.media3.exoplayer.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void setOutput(java.lang.Object obj) throws androidx.media3.exoplayer.ExoPlaybackException {
        ?? NewInstance;
        android.view.Surface surface;
        if (obj instanceof android.view.Surface) {
            surface = (android.view.Surface) obj;
        } else {
            NewInstance = 0;
        }
        if (NewInstance == 0) {
            androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface = this.placeholderSurface;
            if (placeholderSurface != null) {
                NewInstance = surface;
                NewInstance = placeholderSurface;
            } else {
                androidx.media3.exoplayer.mediacodec.MediaCodecInfo codecInfo = getCodecInfo();
                if (codecInfo != null && shouldUsePlaceholderSurface(codecInfo)) {
                    NewInstance = surface;
                    NewInstance = androidx.media3.exoplayer.video.PlaceholderSurface.newInstance(this.context, codecInfo.secure);
                    this.placeholderSurface = NewInstance;
                }
            }
        }
        NewInstance = surface;
        NewInstance = surface;
        NewInstance = surface;
        if (this.displaySurface != NewInstance) {
            this.displaySurface = NewInstance;
            if (this.videoSink == null) {
                this.videoFrameReleaseControl.setOutputSurface(NewInstance);
            }
            this.haveReportedFirstFrameRenderedForCurrentSurface = false;
            int state = getState();
            androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec = getCodec();
            if (codec != null && this.videoSink == null) {
                if (androidx.media3.common.util.Util.SDK_INT >= 23 && NewInstance != 0 && !this.codecNeedsSetOutputSurfaceWorkaround) {
                    setOutputSurfaceV23(codec, NewInstance);
                } else {
                    releaseCodec();
                    maybeInitCodecOrBypass();
                }
            }
            if (NewInstance != 0 && NewInstance != this.placeholderSurface) {
                maybeRenotifyVideoSizeChanged();
                if (state == 2) {
                    this.videoFrameReleaseControl.join(true);
                }
            } else {
                this.reportedVideoSize = null;
                androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
                if (videoSink != null) {
                    videoSink.clearOutputSurfaceInfo();
                }
            }
            maybeSetupTunnelingForFirstFrame();
            return;
        }
        if (NewInstance == 0 || NewInstance == this.placeholderSurface) {
            return;
        }
        maybeRenotifyVideoSizeChanged();
        maybeRenotifyRenderedFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean shouldInitCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return this.displaySurface != null || shouldUsePlaceholderSurface(mediaCodecInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean getCodecNeedsEosPropagation() {
        return this.tunneling && androidx.media3.common.util.Util.SDK_INT < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration getMediaCodecConfiguration(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, android.media.MediaCrypto mediaCrypto, float f) {
        androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (placeholderSurface != null && placeholderSurface.secure != mediaCodecInfo.secure) {
            releasePlaceholderSurface();
        }
        java.lang.String str = mediaCodecInfo.codecMimeType;
        androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues = getCodecMaxValues(mediaCodecInfo, format, getStreamFormats());
        this.codecMaxValues = codecMaxValues;
        android.media.MediaFormat mediaFormat = getMediaFormat(format, str, codecMaxValues, f, this.deviceNeedsNoPostProcessWorkaround, this.tunneling ? this.tunnelingAudioSessionId : 0);
        if (this.displaySurface == null) {
            if (!shouldUsePlaceholderSurface(mediaCodecInfo)) {
                throw new java.lang.IllegalStateException();
            }
            if (this.placeholderSurface == null) {
                this.placeholderSurface = androidx.media3.exoplayer.video.PlaceholderSurface.newInstance(this.context, mediaCodecInfo.secure);
            }
            this.displaySurface = this.placeholderSurface;
        }
        maybeSetKeyAllowFrameDrop(mediaFormat);
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        return androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration.createForVideoDecoding(mediaCodecInfo, mediaFormat, format, videoSink != null ? videoSink.getInputSurface() : this.displaySurface, mediaCrypto);
    }

    private void maybeSetKeyAllowFrameDrop(android.media.MediaFormat mediaFormat) {
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isFrameDropAllowedOnInput()) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.DecoderReuseEvaluation canReuseCodec(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluationCanReuseCodec = mediaCodecInfo.canReuseCodec(format, format2);
        int i = decoderReuseEvaluationCanReuseCodec.discardReasons;
        androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues = (androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues) androidx.media3.common.util.Assertions.checkNotNull(this.codecMaxValues);
        if (format2.width > codecMaxValues.width || format2.height > codecMaxValues.height) {
            i |= 256;
        }
        if (getMaxInputSize(mediaCodecInfo, format2) > codecMaxValues.inputSize) {
            i |= 64;
        }
        int i2 = i;
        return new androidx.media3.exoplayer.DecoderReuseEvaluation(mediaCodecInfo.name, format, format2, i2 != 0 ? 0 : decoderReuseEvaluationCanReuseCodec.result, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public void render(long j, long j2) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.render(j, j2);
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
            } catch (androidx.media3.exoplayer.video.VideoSink.VideoSinkException e) {
                throw createRendererException(e, e.format, 7001);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void resetCodecStateForFlush() {
        super.resetCodecStateForFlush();
        this.buffersInCodecCount = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public void setPlaybackSpeed(float f, float f2) throws androidx.media3.exoplayer.ExoPlaybackException {
        super.setPlaybackSpeed(f, f2);
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setPlaybackSpeed(f);
        } else {
            this.videoFrameReleaseControl.setPlaybackSpeed(f);
        }
    }

    public static int getCodecMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format) {
        int iIntValue;
        int i = format.width;
        int i2 = format.height;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
            android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format);
            str = (codecProfileAndLevel == null || !((iIntValue = ((java.lang.Integer) codecProfileAndLevel.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.hashCode();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return getMaxSampleSize(i * i2, 2);
            case "video/hevc":
                return java.lang.Math.max(2097152, getMaxSampleSize(i * i2, 2));
            case "video/avc":
                if ("BRAVIA 4K 2015".equals(androidx.media3.common.util.Util.MODEL) || ("Amazon".equals(androidx.media3.common.util.Util.MANUFACTURER) && ("KFSOWI".equals(androidx.media3.common.util.Util.MODEL) || ("AFTS".equals(androidx.media3.common.util.Util.MODEL) && mediaCodecInfo.secure)))) {
                    return -1;
                }
                return getMaxSampleSize(androidx.media3.common.util.Util.ceilDivide(i, 16) * androidx.media3.common.util.Util.ceilDivide(i2, 16) * 16 * 16, 2);
            case "video/x-vnd.on2.vp9":
                return getMaxSampleSize(i * i2, 4);
            default:
                return -1;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected float getCodecOperatingRateV23(float f, androidx.media3.common.Format format, androidx.media3.common.Format[] formatArr) {
        float fMax = -1.0f;
        for (androidx.media3.common.Format format2 : formatArr) {
            float f2 = format2.frameRate;
            if (f2 != -1.0f) {
                fMax = java.lang.Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onReadyToInitializeCodec(androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink == null || videoSink.isInitialized()) {
            return;
        }
        try {
            this.videoSink.initialize(format);
        } catch (androidx.media3.exoplayer.video.VideoSink.VideoSinkException e) {
            throw createRendererException(e, format, 7000);
        }
    }

    public void setVideoEffects(java.util.List<androidx.media3.common.Effect> list) {
        this.videoEffects = list;
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setVideoEffects(list);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecInitialized(java.lang.String str, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration configuration, long j, long j2) {
        this.eventDispatcher.decoderInitialized(str, j, j2);
        this.codecNeedsSetOutputSurfaceWorkaround = codecNeedsSetOutputSurfaceWorkaround(str);
        this.codecHandlesHdr10PlusOutOfBandMetadata = ((androidx.media3.exoplayer.mediacodec.MediaCodecInfo) androidx.media3.common.util.Assertions.checkNotNull(getCodecInfo())).isHdr10PlusOutOfBandMetadataSupported();
        maybeSetupTunnelingForFirstFrame();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecReleased(java.lang.String str) {
        this.eventDispatcher.decoderReleased(str);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onCodecError(java.lang.Exception exc) {
        androidx.media3.common.util.Log.e(TAG, "Video codec error", exc);
        this.eventDispatcher.videoCodecError(exc);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.DecoderReuseEvaluation onInputFormatChanged(androidx.media3.exoplayer.FormatHolder formatHolder) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.exoplayer.DecoderReuseEvaluation decoderReuseEvaluationOnInputFormatChanged = super.onInputFormatChanged(formatHolder);
        this.eventDispatcher.inputFormatChanged((androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(formatHolder.format), decoderReuseEvaluationOnInputFormatChanged);
        return decoderReuseEvaluationOnInputFormatChanged;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onQueueInputBuffer(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (!this.tunneling) {
            this.buffersInCodecCount++;
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 23 || !this.tunneling) {
            return;
        }
        onProcessedTunneledBuffer(decoderInputBuffer.timeUs);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected int getCodecBufferFlags(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) {
        return (androidx.media3.common.util.Util.SDK_INT < 34 || !this.tunneling || decoderInputBuffer.timeUs >= getLastResetPositionUs()) ? 0 : 32;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onOutputFormatChanged(androidx.media3.common.Format format, android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        int i;
        int i2;
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec = getCodec();
        if (codec != null) {
            codec.setVideoScalingMode(this.scalingMode);
        }
        int i3 = 0;
        if (this.tunneling) {
            i2 = format.width;
            i = format.height;
        } else {
            androidx.media3.common.util.Assertions.checkNotNull(mediaFormat);
            boolean z = mediaFormat.containsKey(KEY_CROP_RIGHT) && mediaFormat.containsKey(KEY_CROP_LEFT) && mediaFormat.containsKey(KEY_CROP_BOTTOM) && mediaFormat.containsKey(KEY_CROP_TOP);
            if (z) {
                integer = (mediaFormat.getInteger(KEY_CROP_RIGHT) - mediaFormat.getInteger(KEY_CROP_LEFT)) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            if (z) {
                integer2 = (mediaFormat.getInteger(KEY_CROP_BOTTOM) - mediaFormat.getInteger(KEY_CROP_TOP)) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            int i4 = integer;
            i = integer2;
            i2 = i4;
        }
        float f = format.pixelWidthHeightRatio;
        if (codecAppliesRotation()) {
            if (format.rotationDegrees == 90 || format.rotationDegrees == 270) {
                f = 1.0f / f;
                int i5 = i;
                i = i2;
                i2 = i5;
            }
        } else if (this.videoSink == null) {
            i3 = format.rotationDegrees;
        }
        this.decodedVideoSize = new androidx.media3.common.VideoSize(i2, i, i3, f);
        if (this.videoSink != null) {
            onReadyToRegisterVideoSinkInputStream();
            this.videoSink.registerInputStream(1, format.buildUpon().setWidth(i2).setHeight(i).setRotationDegrees(i3).setPixelWidthHeightRatio(f).build());
        } else {
            this.videoFrameReleaseControl.setFrameRate(format.frameRate);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void handleInputBufferSupplementalData(androidx.media3.decoder.DecoderInputBuffer decoderInputBuffer) throws androidx.media3.exoplayer.ExoPlaybackException {
        if (this.codecHandlesHdr10PlusOutOfBandMetadata) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(decoderInputBuffer.supplementalData);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        setHdr10PlusInfoV29((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkNotNull(getCodec()), bArr);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected boolean processOutputBuffer(long j, long j2, androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, androidx.media3.common.Format format) throws androidx.media3.exoplayer.ExoPlaybackException {
        androidx.media3.common.util.Assertions.checkNotNull(mediaCodecAdapter);
        long outputStreamOffsetUs = j3 - getOutputStreamOffsetUs();
        int frameReleaseAction = this.videoFrameReleaseControl.getFrameReleaseAction(j3, j, j2, getOutputStreamStartPositionUs(), z2, this.videoFrameReleaseInfo);
        if (frameReleaseAction == 4) {
            return false;
        }
        if (z && !z2) {
            skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            return true;
        }
        if (this.displaySurface == this.placeholderSurface && this.videoSink == null) {
            if (this.videoFrameReleaseInfo.getEarlyUs() >= 30000) {
                return false;
            }
            skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            try {
                videoSink.render(j, j2);
                long jRegisterInputFrame = this.videoSink.registerInputFrame(j3 + getBufferTimestampAdjustmentUs(), z2);
                if (jRegisterInputFrame == androidx.media3.common.C.TIME_UNSET) {
                    return false;
                }
                renderOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs, jRegisterInputFrame);
                return true;
            } catch (androidx.media3.exoplayer.video.VideoSink.VideoSinkException e) {
                throw createRendererException(e, e.format, 7001);
            }
        }
        if (frameReleaseAction == 0) {
            long jNanoTime = getClock().nanoTime();
            notifyFrameMetadataListener(outputStreamOffsetUs, jNanoTime, format);
            renderOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs, jNanoTime);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 1) {
            return maybeReleaseFrame((androidx.media3.exoplayer.mediacodec.MediaCodecAdapter) androidx.media3.common.util.Assertions.checkStateNotNull(mediaCodecAdapter), i, outputStreamOffsetUs, format);
        }
        if (frameReleaseAction == 2) {
            dropOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
            updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
            return true;
        }
        if (frameReleaseAction != 3) {
            if (frameReleaseAction == 5) {
                return false;
            }
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(frameReleaseAction));
        }
        skipOutputBuffer(mediaCodecAdapter, i, outputStreamOffsetUs);
        updateVideoFrameProcessingOffsetCounters(this.videoFrameReleaseInfo.getEarlyUs());
        return true;
    }

    private boolean maybeReleaseFrame(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j, androidx.media3.common.Format format) {
        long releaseTimeNs = this.videoFrameReleaseInfo.getReleaseTimeNs();
        long earlyUs = this.videoFrameReleaseInfo.getEarlyUs();
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            if (shouldSkipBuffersWithIdenticalReleaseTime() && releaseTimeNs == this.lastFrameReleaseTimeNs) {
                skipOutputBuffer(mediaCodecAdapter, i, j);
            } else {
                notifyFrameMetadataListener(j, releaseTimeNs, format);
                renderOutputBufferV21(mediaCodecAdapter, i, j, releaseTimeNs);
            }
            updateVideoFrameProcessingOffsetCounters(earlyUs);
            this.lastFrameReleaseTimeNs = releaseTimeNs;
            return true;
        }
        if (earlyUs >= 30000) {
            return false;
        }
        if (earlyUs > 11000) {
            try {
                java.lang.Thread.sleep((earlyUs - 10000) / 1000);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return false;
            }
        }
        notifyFrameMetadataListener(j, releaseTimeNs, format);
        renderOutputBuffer(mediaCodecAdapter, i, j);
        updateVideoFrameProcessingOffsetCounters(earlyUs);
        return true;
    }

    private void notifyFrameMetadataListener(long j, long j2, androidx.media3.common.Format format) {
        androidx.media3.exoplayer.video.VideoFrameMetadataListener videoFrameMetadataListener = this.frameMetadataListener;
        if (videoFrameMetadataListener != null) {
            videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j, j2, format, getCodecOutputMediaFormat());
        }
    }

    protected void onProcessedTunneledBuffer(long j) throws androidx.media3.exoplayer.ExoPlaybackException {
        updateOutputFormatForTime(j);
        maybeNotifyVideoSizeChanged(this.decodedVideoSize);
        this.decoderCounters.renderedOutputBufferCount++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        setPendingOutputEndOfStream();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onProcessedOutputBuffer(long j) {
        super.onProcessedOutputBuffer(j);
        if (this.tunneling) {
            return;
        }
        this.buffersInCodecCount--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected void onProcessedStreamChange() {
        super.onProcessedStreamChange();
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.setStreamOffsetAndAdjustmentUs(getOutputStreamOffsetUs(), getBufferTimestampAdjustmentUs());
        } else {
            this.videoFrameReleaseControl.onProcessedStreamChange();
        }
        maybeSetupTunnelingForFirstFrame();
    }

    protected void skipOutputBuffer(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        androidx.media3.common.util.TraceUtil.beginSection("skipVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        androidx.media3.common.util.TraceUtil.endSection();
        this.decoderCounters.skippedOutputBufferCount++;
    }

    protected void dropOutputBuffer(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        androidx.media3.common.util.TraceUtil.beginSection("dropVideoBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, false);
        androidx.media3.common.util.TraceUtil.endSection();
        updateDroppedBufferCounters(0, 1);
    }

    protected boolean maybeDropBuffersToKeyframe(long j, boolean z) throws androidx.media3.exoplayer.ExoPlaybackException {
        int iSkipSource = skipSource(j);
        if (iSkipSource == 0) {
            return false;
        }
        if (z) {
            this.decoderCounters.skippedInputBufferCount += iSkipSource;
            this.decoderCounters.skippedOutputBufferCount += this.buffersInCodecCount;
        } else {
            this.decoderCounters.droppedToKeyframeCount++;
            updateDroppedBufferCounters(iSkipSource, this.buffersInCodecCount);
        }
        flushOrReinitializeCodec();
        androidx.media3.exoplayer.video.VideoSink videoSink = this.videoSink;
        if (videoSink != null) {
            videoSink.flush(false);
        }
        return true;
    }

    protected void updateDroppedBufferCounters(int i, int i2) {
        this.decoderCounters.droppedInputBufferCount += i;
        int i3 = i + i2;
        this.decoderCounters.droppedBufferCount += i3;
        this.droppedFrames += i3;
        this.consecutiveDroppedFrameCount += i3;
        this.decoderCounters.maxConsecutiveDroppedBufferCount = java.lang.Math.max(this.consecutiveDroppedFrameCount, this.decoderCounters.maxConsecutiveDroppedBufferCount);
        int i4 = this.maxDroppedFramesToNotify;
        if (i4 <= 0 || this.droppedFrames < i4) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    protected void updateVideoFrameProcessingOffsetCounters(long j) {
        this.decoderCounters.addVideoFrameProcessingOffset(j);
        this.totalVideoFrameProcessingOffsetUs += j;
        this.videoFrameProcessingOffsetCount++;
    }

    private void renderOutputBuffer(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j, long j2) {
        if (androidx.media3.common.util.Util.SDK_INT >= 21) {
            renderOutputBufferV21(mediaCodecAdapter, i, j, j2);
        } else {
            renderOutputBuffer(mediaCodecAdapter, i, j);
        }
    }

    protected void renderOutputBuffer(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        androidx.media3.common.util.TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, true);
        androidx.media3.common.util.TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    protected void renderOutputBufferV21(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, int i, long j, long j2) {
        androidx.media3.common.util.TraceUtil.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.releaseOutputBuffer(i, j2);
        androidx.media3.common.util.TraceUtil.endSection();
        this.decoderCounters.renderedOutputBufferCount++;
        this.consecutiveDroppedFrameCount = 0;
        if (this.videoSink == null) {
            maybeNotifyVideoSizeChanged(this.decodedVideoSize);
            maybeNotifyRenderedFirstFrame();
        }
    }

    private boolean shouldUsePlaceholderSurface(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return androidx.media3.common.util.Util.SDK_INT >= 23 && !this.tunneling && !codecNeedsSetOutputSurfaceWorkaround(mediaCodecInfo.name) && (!mediaCodecInfo.secure || androidx.media3.exoplayer.video.PlaceholderSurface.isSecureSupported(this.context));
    }

    private void releasePlaceholderSurface() {
        android.view.Surface surface = this.displaySurface;
        androidx.media3.exoplayer.video.PlaceholderSurface placeholderSurface = this.placeholderSurface;
        if (surface == placeholderSurface) {
            this.displaySurface = null;
        }
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.placeholderSurface = null;
        }
    }

    private void maybeSetupTunnelingForFirstFrame() {
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec;
        if (!this.tunneling || androidx.media3.common.util.Util.SDK_INT < 23 || (codec = getCodec()) == null) {
            return;
        }
        this.tunnelingOnFrameRenderedListener = new androidx.media3.exoplayer.video.MediaCodecVideoRenderer.OnFrameRenderedListenerV23(codec);
        if (androidx.media3.common.util.Util.SDK_INT >= 33) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("tunnel-peek", 1);
            codec.setParameters(bundle);
        }
    }

    private void updateCodecImportance() {
        androidx.media3.exoplayer.mediacodec.MediaCodecAdapter codec = getCodec();
        if (codec != null && androidx.media3.common.util.Util.SDK_INT >= 35) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("importance", java.lang.Math.max(0, -this.rendererPriority));
            codec.setParameters(bundle);
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (!this.videoFrameReleaseControl.onFrameReleasedIsFirstFrame() || this.displaySurface == null) {
            return;
        }
        notifyRenderedFirstFrame();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"displaySurface"})
    public void notifyRenderedFirstFrame() {
        this.eventDispatcher.renderedFirstFrame(this.displaySurface);
        this.haveReportedFirstFrameRenderedForCurrentSurface = true;
    }

    private void maybeRenotifyRenderedFirstFrame() {
        android.view.Surface surface = this.displaySurface;
        if (surface == null || !this.haveReportedFirstFrameRenderedForCurrentSurface) {
            return;
        }
        this.eventDispatcher.renderedFirstFrame(surface);
    }

    private void maybeNotifyVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
        if (videoSize.equals(androidx.media3.common.VideoSize.UNKNOWN) || videoSize.equals(this.reportedVideoSize)) {
            return;
        }
        this.reportedVideoSize = videoSize;
        this.eventDispatcher.videoSizeChanged(videoSize);
    }

    private void maybeRenotifyVideoSizeChanged() {
        androidx.media3.common.VideoSize videoSize = this.reportedVideoSize;
        if (videoSize != null) {
            this.eventDispatcher.videoSizeChanged(videoSize);
        }
    }

    private void maybeNotifyDroppedFrames() {
        if (this.droppedFrames > 0) {
            long jElapsedRealtime = getClock().elapsedRealtime();
            this.eventDispatcher.droppedFrames(this.droppedFrames, jElapsedRealtime - this.droppedFrameAccumulationStartTimeMs);
            this.droppedFrames = 0;
            this.droppedFrameAccumulationStartTimeMs = jElapsedRealtime;
        }
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i = this.videoFrameProcessingOffsetCount;
        if (i != 0) {
            this.eventDispatcher.reportVideoFrameProcessingOffset(this.totalVideoFrameProcessingOffsetUs, i);
            this.totalVideoFrameProcessingOffsetUs = 0L;
            this.videoFrameProcessingOffsetCount = 0;
        }
    }

    private static void setHdr10PlusInfoV29(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, byte[] bArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        mediaCodecAdapter.setParameters(bundle);
    }

    protected void setOutputSurfaceV23(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, android.view.Surface surface) {
        mediaCodecAdapter.setOutputSurface(surface);
    }

    private static void configureTunnelingV21(android.media.MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    protected android.media.MediaFormat getMediaFormat(androidx.media3.common.Format format, java.lang.String str, androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues codecMaxValues, float f, boolean z, int i) {
        android.util.Pair<java.lang.Integer, java.lang.Integer> codecProfileAndLevel;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", format.width);
        mediaFormat.setInteger("height", format.height);
        androidx.media3.common.util.MediaFormatUtil.setCsdBuffers(mediaFormat, format.initializationData);
        androidx.media3.common.util.MediaFormatUtil.maybeSetFloat(mediaFormat, "frame-rate", format.frameRate);
        androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormat, "rotation-degrees", format.rotationDegrees);
        androidx.media3.common.util.MediaFormatUtil.maybeSetColorInfo(mediaFormat, format.colorInfo);
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(format.sampleMimeType) && (codecProfileAndLevel = androidx.media3.exoplayer.mediacodec.MediaCodecUtil.getCodecProfileAndLevel(format)) != null) {
            androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormat, com.google.android.gms.common.Scopes.PROFILE, ((java.lang.Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", codecMaxValues.width);
        mediaFormat.setInteger("max-height", codecMaxValues.height);
        androidx.media3.common.util.MediaFormatUtil.maybeSetInteger(mediaFormat, "max-input-size", codecMaxValues.inputSize);
        if (androidx.media3.common.util.Util.SDK_INT >= 23) {
            mediaFormat.setInteger(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            configureTunnelingV21(mediaFormat, i);
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(0, -this.rendererPriority));
        }
        return mediaFormat;
    }

    protected androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues getCodecMaxValues(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format, androidx.media3.common.Format[] formatArr) {
        int codecMaxInputSize;
        int iMax = format.width;
        int iMax2 = format.height;
        int maxInputSize = getMaxInputSize(mediaCodecInfo, format);
        if (formatArr.length == 1) {
            if (maxInputSize != -1 && (codecMaxInputSize = getCodecMaxInputSize(mediaCodecInfo, format)) != -1) {
                maxInputSize = java.lang.Math.min((int) (maxInputSize * INITIAL_FORMAT_MAX_INPUT_SIZE_SCALE_FACTOR), codecMaxInputSize);
            }
            return new androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues(iMax, iMax2, maxInputSize);
        }
        int length = formatArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            androidx.media3.common.Format formatBuild = formatArr[i];
            if (format.colorInfo != null && formatBuild.colorInfo == null) {
                formatBuild = formatBuild.buildUpon().setColorInfo(format.colorInfo).build();
            }
            if (mediaCodecInfo.canReuseCodec(format, formatBuild).result != 0) {
                z |= formatBuild.width == -1 || formatBuild.height == -1;
                iMax = java.lang.Math.max(iMax, formatBuild.width);
                iMax2 = java.lang.Math.max(iMax2, formatBuild.height);
                maxInputSize = java.lang.Math.max(maxInputSize, getMaxInputSize(mediaCodecInfo, formatBuild));
            }
        }
        if (z) {
            androidx.media3.common.util.Log.w(TAG, "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            android.graphics.Point codecMaxSize = getCodecMaxSize(mediaCodecInfo, format);
            if (codecMaxSize != null) {
                iMax = java.lang.Math.max(iMax, codecMaxSize.x);
                iMax2 = java.lang.Math.max(iMax2, codecMaxSize.y);
                maxInputSize = java.lang.Math.max(maxInputSize, getCodecMaxInputSize(mediaCodecInfo, format.buildUpon().setWidth(iMax).setHeight(iMax2).build()));
                androidx.media3.common.util.Log.w(TAG, "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new androidx.media3.exoplayer.video.MediaCodecVideoRenderer.CodecMaxValues(iMax, iMax2, maxInputSize);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    protected androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException createDecoderException(java.lang.Throwable th, androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo) {
        return new androidx.media3.exoplayer.video.MediaCodecVideoDecoderException(th, mediaCodecInfo, this.displaySurface);
    }

    private static android.graphics.Point getCodecMaxSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format) {
        boolean z = format.height > format.width;
        int i = z ? format.height : format.width;
        int i2 = z ? format.width : format.height;
        float f = i2 / i;
        for (int i3 : STANDARD_LONG_EDGE_VIDEO_PX) {
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                break;
            }
            if (androidx.media3.common.util.Util.SDK_INT >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                android.graphics.Point pointAlignVideoSizeV21 = mediaCodecInfo.alignVideoSizeV21(i5, i3);
                float f2 = format.frameRate;
                if (pointAlignVideoSizeV21 != null && mediaCodecInfo.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, f2)) {
                    return pointAlignVideoSizeV21;
                }
            } else {
                try {
                    int iCeilDivide = androidx.media3.common.util.Util.ceilDivide(i3, 16) * 16;
                    int iCeilDivide2 = androidx.media3.common.util.Util.ceilDivide(i4, 16) * 16;
                    if (iCeilDivide * iCeilDivide2 <= androidx.media3.exoplayer.mediacodec.MediaCodecUtil.maxH264DecodableFrameSize()) {
                        int i6 = z ? iCeilDivide2 : iCeilDivide;
                        if (!z) {
                            iCeilDivide = iCeilDivide2;
                        }
                        return new android.graphics.Point(i6, iCeilDivide);
                    }
                } catch (androidx.media3.exoplayer.mediacodec.MediaCodecUtil.DecoderQueryException unused) {
                }
            }
        }
        return null;
    }

    protected static int getMaxInputSize(androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo, androidx.media3.common.Format format) {
        if (format.maxInputSize != -1) {
            int size = format.initializationData.size();
            int length = 0;
            for (int i = 0; i < size; i++) {
                length += format.initializationData.get(i).length;
            }
            return format.maxInputSize + length;
        }
        return getCodecMaxInputSize(mediaCodecInfo, format);
    }

    private static boolean codecAppliesRotation() {
        return androidx.media3.common.util.Util.SDK_INT >= 21;
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(androidx.media3.common.util.Util.MANUFACTURER);
    }

    protected boolean codecNeedsSetOutputSurfaceWorkaround(java.lang.String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (androidx.media3.exoplayer.video.MediaCodecVideoRenderer.class) {
            if (!evaluatedDeviceNeedsSetOutputSurfaceWorkaround) {
                deviceNeedsSetOutputSurfaceWorkaround = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                evaluatedDeviceNeedsSetOutputSurfaceWorkaround = true;
            }
        }
        return deviceNeedsSetOutputSurfaceWorkaround;
    }

    protected android.view.Surface getSurface() {
        return this.displaySurface;
    }

    protected static final class CodecMaxValues {
        public final int height;
        public final int inputSize;
        public final int width;

        public CodecMaxValues(int i, int i2, int i3) {
            this.width = i;
            this.height = i2;
            this.inputSize = i3;
        }
    }

    private static int getMaxSampleSize(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        byte b = 7;
        if (androidx.media3.common.util.Util.SDK_INT <= 28) {
            java.lang.String str = androidx.media3.common.util.Util.DEVICE;
            str.hashCode();
            switch (str) {
                case "dangal":
                case "dangalFHD":
                case "dangalUHD":
                case "oneday":
                case "aquaman":
                case "magnolia":
                case "once":
                case "machuca":
                    return true;
            }
        }
        if (androidx.media3.common.util.Util.SDK_INT <= 27 && "HWEML".equals(androidx.media3.common.util.Util.DEVICE)) {
            return true;
        }
        java.lang.String str2 = androidx.media3.common.util.Util.MODEL;
        str2.hashCode();
        switch (str2) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                return true;
            default:
                if (androidx.media3.common.util.Util.SDK_INT <= 26) {
                    java.lang.String str3 = androidx.media3.common.util.Util.DEVICE;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            if (!str3.equals("PGN528")) {
                                b = -1;
                            }
                            break;
                        case -1936688066:
                            b = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            b = !str3.equals("A10-70L") ? (byte) -1 : (byte) 26;
                            break;
                        case -965403638:
                            b = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b = !str3.equals("whyred") ? (byte) -1 : (byte) 34;
                            break;
                        case -782144577:
                            b = !str3.equals("OnePlus5T") ? (byte) -1 : (byte) 35;
                            break;
                        case -575125681:
                            b = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b = !str3.equals("Z80") ? (byte) -1 : (byte) 57;
                            break;
                        case 98846:
                            b = !str3.equals("cv1") ? (byte) -1 : (byte) 58;
                            break;
                        case 98848:
                            b = !str3.equals("cv3") ? (byte) -1 : (byte) 59;
                            break;
                        case 99329:
                            b = !str3.equals("deb") ? (byte) -1 : (byte) 60;
                            break;
                        case 101481:
                            b = !str3.equals("flo") ? (byte) -1 : kotlin.io.encoding.Base64.padSymbol;
                            break;
                        case 1513190:
                            b = !str3.equals("1601") ? (byte) -1 : (byte) 62;
                            break;
                        case 1514184:
                            b = !str3.equals("1713") ? (byte) -1 : okio.Utf8.REPLACEMENT_BYTE;
                            break;
                        case 1514185:
                            b = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b = !str3.equals("F01H") ? (byte) -1 : (byte) 65;
                            break;
                        case 2133091:
                            b = !str3.equals("F01J") ? (byte) -1 : (byte) 66;
                            break;
                        case 2133120:
                            b = !str3.equals("F02H") ? (byte) -1 : (byte) 67;
                            break;
                        case 2133151:
                            b = !str3.equals("F03H") ? (byte) -1 : (byte) 68;
                            break;
                        case 2133182:
                            b = !str3.equals("F04H") ? (byte) -1 : (byte) 69;
                            break;
                        case 2133184:
                            b = !str3.equals("F04J") ? (byte) -1 : (byte) 70;
                            break;
                        case 2436959:
                            b = !str3.equals("P681") ? (byte) -1 : (byte) 71;
                            break;
                        case 2463773:
                            b = !str3.equals("Q350") ? (byte) -1 : (byte) 72;
                            break;
                        case 2464648:
                            b = !str3.equals("Q427") ? (byte) -1 : (byte) 73;
                            break;
                        case 2689555:
                            b = !str3.equals("XE2X") ? (byte) -1 : (byte) 74;
                            break;
                        case 3154429:
                            b = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b = !str3.equals("p212") ? (byte) -1 : (byte) 78;
                            break;
                        case 41325051:
                            b = !str3.equals("MEIZU_M5") ? (byte) -1 : (byte) 79;
                            break;
                        case 51349633:
                            b = !str3.equals("601LV") ? (byte) -1 : (byte) 80;
                            break;
                        case 51350594:
                            b = !str3.equals("602LV") ? (byte) -1 : (byte) 81;
                            break;
                        case 55178625:
                            b = !str3.equals("Aura_Note_2") ? (byte) -1 : (byte) 82;
                            break;
                        case 61542055:
                            b = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b = !str3.equals("E5643") ? (byte) -1 : (byte) 84;
                            break;
                        case 66214468:
                            b = !str3.equals("F3111") ? (byte) -1 : (byte) 85;
                            break;
                        case 66214470:
                            b = !str3.equals("F3113") ? (byte) -1 : (byte) 86;
                            break;
                        case 66214473:
                            b = !str3.equals("F3116") ? (byte) -1 : (byte) 87;
                            break;
                        case 66215429:
                            b = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b = !str3.equals("F3213") ? (byte) -1 : (byte) 89;
                            break;
                        case 66215433:
                            b = !str3.equals("F3215") ? (byte) -1 : (byte) 90;
                            break;
                        case 66216390:
                            b = !str3.equals("F3311") ? (byte) -1 : (byte) 91;
                            break;
                        case 76402249:
                            b = !str3.equals("PRO7S") ? (byte) -1 : (byte) 92;
                            break;
                        case 76404105:
                            b = !str3.equals("Q4260") ? (byte) -1 : (byte) 93;
                            break;
                        case 76404911:
                            b = !str3.equals("Q4310") ? (byte) -1 : (byte) 94;
                            break;
                        case 80963634:
                            b = !str3.equals("V23GB") ? (byte) -1 : (byte) 95;
                            break;
                        case 82882791:
                            b = !str3.equals("X3_HK") ? (byte) -1 : (byte) 96;
                            break;
                        case 98715550:
                            b = !str3.equals("i9031") ? (byte) -1 : (byte) 97;
                            break;
                        case 101370885:
                            b = !str3.equals("l5460") ? (byte) -1 : (byte) 98;
                            break;
                        case 102844228:
                            b = !str3.equals("le_x6") ? (byte) -1 : (byte) 99;
                            break;
                        case 165221241:
                            b = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b = !str3.equals("CPY83_I00") ? (byte) -1 : (byte) 101;
                            break;
                        case 245388979:
                            b = !str3.equals("marino_f") ? (byte) -1 : (byte) 102;
                            break;
                        case 287431619:
                            b = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b = !str3.equals("A7010a48") ? (byte) -1 : (byte) 104;
                            break;
                        case 308517133:
                            b = !str3.equals("A7020a48") ? (byte) -1 : (byte) 105;
                            break;
                        case 316215098:
                            b = !str3.equals("TB3-730F") ? (byte) -1 : (byte) 106;
                            break;
                        case 316215116:
                            b = !str3.equals("TB3-730X") ? (byte) -1 : (byte) 107;
                            break;
                        case 316246811:
                            b = !str3.equals("TB3-850F") ? (byte) -1 : (byte) 108;
                            break;
                        case 316246818:
                            b = !str3.equals("TB3-850M") ? (byte) -1 : (byte) 109;
                            break;
                        case 407160593:
                            b = !str3.equals("Pixi5-10_4G") ? (byte) -1 : (byte) 110;
                            break;
                        case 507412548:
                            b = !str3.equals("QM16XE_U") ? (byte) -1 : (byte) 111;
                            break;
                        case 793982701:
                            b = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : (byte) 112;
                            break;
                        case 794038622:
                            b = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : (byte) 114;
                            break;
                        case 835649806:
                            b = !str3.equals("manning") ? (byte) -1 : (byte) 115;
                            break;
                        case 917340916:
                            b = !str3.equals("A7000plus") ? (byte) -1 : (byte) 116;
                            break;
                        case 958008161:
                            b = !str3.equals("j2xlteins") ? (byte) -1 : (byte) 117;
                            break;
                        case 1060579533:
                            b = !str3.equals("panell_d") ? (byte) -1 : (byte) 118;
                            break;
                        case 1150207623:
                            b = !str3.equals("LS-5017") ? (byte) -1 : (byte) 119;
                            break;
                        case 1176899427:
                            b = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b = !str3.equals("hwALE-H") ? (byte) -1 : (byte) 121;
                            break;
                        case 1306947716:
                            b = !str3.equals("EverStar_S") ? (byte) -1 : (byte) 122;
                            break;
                        case 1349174697:
                            b = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : (byte) 123;
                            break;
                        case 1522194893:
                            b = !str3.equals("woods_f") ? (byte) -1 : (byte) 124;
                            break;
                        case 1691543273:
                            b = !str3.equals("CPH1609") ? (byte) -1 : (byte) 125;
                            break;
                        case 1691544261:
                            b = !str3.equals("CPH1715") ? (byte) -1 : (byte) 126;
                            break;
                        case 1709443163:
                            b = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            java.lang.String str4 = androidx.media3.common.util.Util.MODEL;
                            str4.hashCode();
                            if (!str4.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                        case org.objectweb.asm.Opcodes.IINC /* 132 */:
                        case org.objectweb.asm.Opcodes.I2L /* 133 */:
                        case 134:
                        case 135:
                        case 136:
                        case org.objectweb.asm.Opcodes.L2F /* 137 */:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                return false;
        }
    }

    private final class OnFrameRenderedListenerV23 implements androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener, android.os.Handler.Callback {
        private static final int HANDLE_FRAME_RENDERED = 0;
        private final android.os.Handler handler;

        public OnFrameRenderedListenerV23(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter) {
            android.os.Handler handlerCreateHandlerForCurrentLooper = androidx.media3.common.util.Util.createHandlerForCurrentLooper(this);
            this.handler = handlerCreateHandlerForCurrentLooper;
            mediaCodecAdapter.setOnFrameRenderedListener(this, handlerCreateHandlerForCurrentLooper);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public void onFrameRendered(androidx.media3.exoplayer.mediacodec.MediaCodecAdapter mediaCodecAdapter, long j, long j2) {
            if (androidx.media3.common.util.Util.SDK_INT < 30) {
                this.handler.sendMessageAtFrontOfQueue(android.os.Message.obtain(this.handler, 0, (int) (j >> 32), (int) j));
            } else {
                handleFrameRendered(j);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(androidx.media3.common.util.Util.toLong(message.arg1, message.arg2));
            return true;
        }

        private void handleFrameRendered(long j) {
            if (this != androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.tunnelingOnFrameRenderedListener || androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.getCodec() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.onProcessedTunneledBuffer(j);
            } catch (androidx.media3.exoplayer.ExoPlaybackException e) {
                androidx.media3.exoplayer.video.MediaCodecVideoRenderer.this.setPendingPlaybackException(e);
            }
        }
    }
}
