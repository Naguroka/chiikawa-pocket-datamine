package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class FrameworkMuxer implements androidx.media3.muxer.Muxer {
    public static final java.lang.String MUXER_STOPPING_FAILED_ERROR_MESSAGE = "Failed to stop the MediaMuxer";
    private boolean isReleased;
    private boolean isStarted;
    private final android.media.MediaMuxer mediaMuxer;
    private final java.util.Map<androidx.media3.muxer.Muxer.TrackToken, java.lang.Long> trackTokenToLastPresentationTimeUs;
    private final java.util.Map<androidx.media3.muxer.Muxer.TrackToken, java.lang.Long> trackTokenToPresentationTimeOffsetUs;
    private final long videoDurationUs;
    private androidx.media3.muxer.Muxer.TrackToken videoTrackToken;
    private static final com.google.common.collect.ImmutableList<java.lang.String> SUPPORTED_VIDEO_SAMPLE_MIME_TYPES = getSupportedVideoSampleMimeTypes();
    private static final com.google.common.collect.ImmutableList<java.lang.String> SUPPORTED_AUDIO_SAMPLE_MIME_TYPES = com.google.common.collect.ImmutableList.of(androidx.media3.common.MimeTypes.AUDIO_AAC, androidx.media3.common.MimeTypes.AUDIO_AMR_NB, androidx.media3.common.MimeTypes.AUDIO_AMR_WB);

    public static final class Factory implements androidx.media3.muxer.Muxer.Factory {
        private final long videoDurationMs;

        public Factory(long j) {
            this.videoDurationMs = j;
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public androidx.media3.transformer.FrameworkMuxer create(java.lang.String str) throws androidx.media3.muxer.Muxer.MuxerException {
            try {
                return new androidx.media3.transformer.FrameworkMuxer(new android.media.MediaMuxer(str, 0), this.videoDurationMs);
            } catch (java.io.IOException e) {
                throw new androidx.media3.muxer.Muxer.MuxerException("Error creating muxer", e);
            }
        }

        @Override // androidx.media3.muxer.Muxer.Factory
        public com.google.common.collect.ImmutableList<java.lang.String> getSupportedSampleMimeTypes(int i) {
            if (i == 2) {
                return androidx.media3.transformer.FrameworkMuxer.SUPPORTED_VIDEO_SAMPLE_MIME_TYPES;
            }
            if (i == 1) {
                return androidx.media3.transformer.FrameworkMuxer.SUPPORTED_AUDIO_SAMPLE_MIME_TYPES;
            }
            return com.google.common.collect.ImmutableList.of();
        }
    }

    private FrameworkMuxer(android.media.MediaMuxer mediaMuxer, long j) {
        this.mediaMuxer = mediaMuxer;
        this.videoDurationUs = androidx.media3.common.util.Util.msToUs(j);
        this.trackTokenToLastPresentationTimeUs = new java.util.HashMap();
        this.trackTokenToPresentationTimeOffsetUs = new java.util.HashMap();
    }

    @Override // androidx.media3.muxer.Muxer
    public androidx.media3.muxer.Muxer.TrackToken addTrack(androidx.media3.common.Format format) throws androidx.media3.muxer.Muxer.MuxerException {
        android.media.MediaFormat mediaFormatCreateAudioFormat;
        java.lang.String str = (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(format.sampleMimeType);
        boolean zIsVideo = androidx.media3.common.MimeTypes.isVideo(str);
        if (zIsVideo) {
            mediaFormatCreateAudioFormat = android.media.MediaFormat.createVideoFormat(str, format.width, format.height);
            androidx.media3.common.util.MediaFormatUtil.maybeSetColorInfo(mediaFormatCreateAudioFormat, format.colorInfo);
            try {
                this.mediaMuxer.setOrientationHint(format.rotationDegrees);
            } catch (java.lang.RuntimeException e) {
                throw new androidx.media3.muxer.Muxer.MuxerException("Failed to set orientation hint with rotationDegrees=" + format.rotationDegrees, e);
            }
        } else {
            mediaFormatCreateAudioFormat = android.media.MediaFormat.createAudioFormat(str, format.sampleRate, format.channelCount);
            androidx.media3.common.util.MediaFormatUtil.maybeSetString(mediaFormatCreateAudioFormat, "language", format.language);
        }
        androidx.media3.common.util.MediaFormatUtil.setCsdBuffers(mediaFormatCreateAudioFormat, format.initializationData);
        try {
            androidx.media3.transformer.FrameworkMuxer.TrackTokenImpl trackTokenImpl = new androidx.media3.transformer.FrameworkMuxer.TrackTokenImpl(this.mediaMuxer.addTrack(mediaFormatCreateAudioFormat));
            if (zIsVideo) {
                this.videoTrackToken = trackTokenImpl;
            }
            return trackTokenImpl;
        } catch (java.lang.RuntimeException e2) {
            throw new androidx.media3.muxer.Muxer.MuxerException("Failed to add track with format=" + format, e2);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void writeSampleData(androidx.media3.muxer.Muxer.TrackToken trackToken, java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo) throws androidx.media3.muxer.Muxer.MuxerException {
        long j = bufferInfo.presentationTimeUs;
        long j2 = this.videoDurationUs;
        if (j2 == androidx.media3.common.C.TIME_UNSET || trackToken != this.videoTrackToken || j <= j2) {
            if (!this.isStarted) {
                if (androidx.media3.common.util.Util.SDK_INT < 30 && j < 0) {
                    this.trackTokenToPresentationTimeOffsetUs.put(trackToken, java.lang.Long.valueOf(-j));
                }
                startMuxer();
            }
            long jLongValue = this.trackTokenToPresentationTimeOffsetUs.containsKey(trackToken) ? this.trackTokenToPresentationTimeOffsetUs.get(trackToken).longValue() : 0L;
            long j3 = j + jLongValue;
            long jLongValue2 = this.trackTokenToLastPresentationTimeUs.containsKey(trackToken) ? this.trackTokenToLastPresentationTimeUs.get(trackToken).longValue() : 0L;
            androidx.media3.common.util.Assertions.checkState(androidx.media3.common.util.Util.SDK_INT > 24 || j3 >= jLongValue2, "Samples not in presentation order (" + j3 + " < " + jLongValue2 + ") unsupported on this API version");
            this.trackTokenToLastPresentationTimeUs.put(trackToken, java.lang.Long.valueOf(j3));
            androidx.media3.common.util.Assertions.checkState(jLongValue == 0 || j3 >= jLongValue2, "Samples not in presentation order (" + j3 + " < " + jLongValue2 + ") unsupported when using negative PTS workaround");
            bufferInfo.set(bufferInfo.offset, bufferInfo.size, j3, bufferInfo.flags);
            try {
                androidx.media3.common.util.Assertions.checkState(trackToken instanceof androidx.media3.transformer.FrameworkMuxer.TrackTokenImpl);
                this.mediaMuxer.writeSampleData(((androidx.media3.transformer.FrameworkMuxer.TrackTokenImpl) trackToken).trackIndex, byteBuffer, bufferInfo);
            } catch (java.lang.RuntimeException e) {
                throw new androidx.media3.muxer.Muxer.MuxerException("Failed to write sample for presentationTimeUs=" + j3 + ", size=" + bufferInfo.size, e);
            }
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void addMetadataEntry(androidx.media3.common.Metadata.Entry entry) {
        if (entry instanceof androidx.media3.container.Mp4LocationData) {
            androidx.media3.container.Mp4LocationData mp4LocationData = (androidx.media3.container.Mp4LocationData) entry;
            this.mediaMuxer.setLocation(mp4LocationData.latitude, mp4LocationData.longitude);
        }
    }

    @Override // androidx.media3.muxer.Muxer
    public void close() throws androidx.media3.muxer.Muxer.MuxerException {
        if (this.isReleased) {
            return;
        }
        if (!this.isStarted) {
            startMuxer();
        }
        if (this.videoDurationUs != androidx.media3.common.C.TIME_UNSET && this.videoTrackToken != null) {
            android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
            bufferInfo.set(0, 0, this.videoDurationUs, androidx.media3.transformer.TransformerUtil.getMediaCodecFlags(4));
            writeSampleData((androidx.media3.muxer.Muxer.TrackToken) androidx.media3.common.util.Assertions.checkNotNull(this.videoTrackToken), java.nio.ByteBuffer.allocateDirect(0), bufferInfo);
        }
        this.isStarted = false;
        try {
            try {
                stopMuxer(this.mediaMuxer);
                this.mediaMuxer.release();
                this.isReleased = true;
            } catch (java.lang.RuntimeException e) {
                throw new androidx.media3.muxer.Muxer.MuxerException(MUXER_STOPPING_FAILED_ERROR_MESSAGE, e);
            }
        } catch (java.lang.Throwable th) {
            this.mediaMuxer.release();
            this.isReleased = true;
            throw th;
        }
    }

    private void startMuxer() throws androidx.media3.muxer.Muxer.MuxerException {
        try {
            this.mediaMuxer.start();
            this.isStarted = true;
        } catch (java.lang.RuntimeException e) {
            throw new androidx.media3.muxer.Muxer.MuxerException("Failed to start the muxer", e);
        }
    }

    private static void stopMuxer(android.media.MediaMuxer mediaMuxer) {
        try {
            mediaMuxer.stop();
        } catch (java.lang.RuntimeException e) {
            if (androidx.media3.common.util.Util.SDK_INT < 30) {
                try {
                    java.lang.reflect.Field declaredField = android.media.MediaMuxer.class.getDeclaredField("MUXER_STATE_STOPPED");
                    declaredField.setAccessible(true);
                    int iIntValue = ((java.lang.Integer) androidx.media3.common.util.Util.castNonNull((java.lang.Integer) declaredField.get(mediaMuxer))).intValue();
                    java.lang.reflect.Field declaredField2 = android.media.MediaMuxer.class.getDeclaredField("mState");
                    declaredField2.setAccessible(true);
                    declaredField2.set(mediaMuxer, java.lang.Integer.valueOf(iIntValue));
                } catch (java.lang.Exception unused) {
                }
            }
            throw e;
        }
    }

    private static com.google.common.collect.ImmutableList<java.lang.String> getSupportedVideoSampleMimeTypes() {
        com.google.common.collect.ImmutableList.Builder builderAdd = new com.google.common.collect.ImmutableList.Builder().add((java.lang.Object[]) new java.lang.String[]{"video/avc", androidx.media3.common.MimeTypes.VIDEO_H263, androidx.media3.common.MimeTypes.VIDEO_MP4V});
        if (androidx.media3.common.util.Util.SDK_INT >= 24) {
            builderAdd.add("video/hevc");
        }
        if (androidx.media3.common.util.Util.SDK_INT >= 34) {
            builderAdd.add("video/av01");
        }
        return builderAdd.build();
    }

    private static class TrackTokenImpl implements androidx.media3.muxer.Muxer.TrackToken {
        public final int trackIndex;

        public TrackTokenImpl(int i) {
            this.trackIndex = i;
        }
    }
}
