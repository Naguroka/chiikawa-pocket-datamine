package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class VideoFrameProcessingWrapper implements androidx.media3.transformer.GraphInput {
    private final long initialTimestampOffsetUs;
    private final java.util.concurrent.atomic.AtomicLong mediaItemOffsetUs = new java.util.concurrent.atomic.AtomicLong();
    final androidx.media3.effect.Presentation presentation;
    private final androidx.media3.common.VideoFrameProcessor videoFrameProcessor;

    public VideoFrameProcessingWrapper(androidx.media3.common.VideoFrameProcessor videoFrameProcessor, androidx.media3.effect.Presentation presentation, long j) {
        this.videoFrameProcessor = videoFrameProcessor;
        this.initialTimestampOffsetUs = j;
        this.presentation = presentation;
    }

    @Override // androidx.media3.transformer.OnMediaItemChangedListener
    public void onMediaItemChanged(androidx.media3.transformer.EditedMediaItem editedMediaItem, long j, androidx.media3.common.Format format, boolean z) {
        long durationAfterEffectsApplied = editedMediaItem.getDurationAfterEffectsApplied(j);
        if (format != null) {
            androidx.media3.common.util.Size decodedSize = getDecodedSize(format);
            this.videoFrameProcessor.registerInputStream(getInputType((java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType)), createEffectListWithPresentation(editedMediaItem.effects.videoEffects, this.presentation), new androidx.media3.common.FrameInfo.Builder((androidx.media3.common.ColorInfo) androidx.media3.common.util.Assertions.checkNotNull(format.colorInfo), decodedSize.getWidth(), decodedSize.getHeight()).setPixelWidthHeightRatio(format.pixelWidthHeightRatio).setOffsetToAddUs(this.initialTimestampOffsetUs + this.mediaItemOffsetUs.get()).build());
        }
        this.mediaItemOffsetUs.addAndGet(durationAfterEffectsApplied);
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public int queueInputBitmap(android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator) {
        return this.videoFrameProcessor.queueInputBitmap(bitmap, timestampIterator) ? 1 : 2;
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public void setOnInputFrameProcessedListener(androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener) {
        this.videoFrameProcessor.setOnInputFrameProcessedListener(onInputFrameProcessedListener);
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public int queueInputTexture(int i, long j) {
        return this.videoFrameProcessor.queueInputTexture(i, j) ? 1 : 2;
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public android.view.Surface getInputSurface() {
        return this.videoFrameProcessor.getInputSurface();
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public int getPendingVideoFrameCount() {
        return this.videoFrameProcessor.getPendingInputFrameCount();
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public boolean registerVideoFrame(long j) {
        return this.videoFrameProcessor.registerInputFrame();
    }

    @Override // androidx.media3.transformer.SampleConsumer
    public void signalEndOfVideoInput() {
        this.videoFrameProcessor.signalEndOfInput();
    }

    public void release() {
        this.videoFrameProcessor.release();
    }

    private static androidx.media3.common.util.Size getDecodedSize(androidx.media3.common.Format format) {
        return new androidx.media3.common.util.Size(format.rotationDegrees % org.objectweb.asm.Opcodes.GETFIELD == 0 ? format.width : format.height, format.rotationDegrees % org.objectweb.asm.Opcodes.GETFIELD == 0 ? format.height : format.width);
    }

    private static com.google.common.collect.ImmutableList<androidx.media3.common.Effect> createEffectListWithPresentation(java.util.List<androidx.media3.common.Effect> list, androidx.media3.effect.Presentation presentation) {
        if (presentation == null) {
            return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
        }
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        builder.addAll((java.lang.Iterable) list).add(presentation);
        return builder.build();
    }

    private static int getInputType(java.lang.String str) {
        if (androidx.media3.common.MimeTypes.isImage(str)) {
            return 2;
        }
        if (str.equals(androidx.media3.common.MimeTypes.VIDEO_RAW)) {
            return 3;
        }
        if (androidx.media3.common.MimeTypes.isVideo(str)) {
            return 1;
        }
        throw new java.lang.IllegalArgumentException("MIME type not supported " + str);
    }
}
