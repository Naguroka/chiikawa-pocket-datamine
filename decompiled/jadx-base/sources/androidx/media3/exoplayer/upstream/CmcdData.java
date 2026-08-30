package androidx.media3.exoplayer.upstream;

/* JADX INFO: loaded from: classes.dex */
public final class CmcdData {
    private static final com.google.common.base.Joiner COMMA_JOINER = com.google.common.base.Joiner.on(",");
    private final androidx.media3.exoplayer.upstream.CmcdData.CmcdObject cmcdObject;
    private final androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest cmcdRequest;
    private final androidx.media3.exoplayer.upstream.CmcdData.CmcdSession cmcdSession;
    private final androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus cmcdStatus;
    private final int dataTransmissionMode;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ObjectType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StreamingFormat {
    }

    public static final class Factory {
        private static final java.util.regex.Pattern CUSTOM_KEY_NAME_PATTERN = java.util.regex.Pattern.compile(".*-.*");
        public static final java.lang.String OBJECT_TYPE_AUDIO_ONLY = "a";
        public static final java.lang.String OBJECT_TYPE_INIT_SEGMENT = "i";
        public static final java.lang.String OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO = "av";
        public static final java.lang.String OBJECT_TYPE_VIDEO_ONLY = "v";
        public static final java.lang.String STREAMING_FORMAT_DASH = "d";
        public static final java.lang.String STREAMING_FORMAT_HLS = "h";
        public static final java.lang.String STREAMING_FORMAT_SS = "s";
        public static final java.lang.String STREAM_TYPE_LIVE = "l";
        public static final java.lang.String STREAM_TYPE_VOD = "v";
        private final long bufferedDurationUs;
        private long chunkDurationUs;
        private final androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration;
        private final boolean didRebuffer;
        private final boolean isBufferEmpty;
        private final boolean isLive;
        private java.lang.String nextObjectRequest;
        private java.lang.String nextRangeRequest;
        private java.lang.String objectType;
        private final float playbackRate;
        private final java.lang.String streamingFormat;
        private final androidx.media3.exoplayer.trackselection.ExoTrackSelection trackSelection;

        public Factory(androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration, androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection, long j, float f, java.lang.String str, boolean z, boolean z2, boolean z3) {
            boolean z4 = true;
            androidx.media3.common.util.Assertions.checkArgument(j >= 0);
            if (f != -3.4028235E38f && f <= 0.0f) {
                z4 = false;
            }
            androidx.media3.common.util.Assertions.checkArgument(z4);
            this.cmcdConfiguration = cmcdConfiguration;
            this.trackSelection = exoTrackSelection;
            this.bufferedDurationUs = j;
            this.playbackRate = f;
            this.streamingFormat = str;
            this.isLive = z;
            this.didRebuffer = z2;
            this.isBufferEmpty = z3;
            this.chunkDurationUs = androidx.media3.common.C.TIME_UNSET;
        }

        public static java.lang.String getObjectType(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection) {
            androidx.media3.common.util.Assertions.checkArgument(exoTrackSelection != null);
            int trackType = androidx.media3.common.MimeTypes.getTrackType(exoTrackSelection.getSelectedFormat().sampleMimeType);
            if (trackType == -1) {
                trackType = androidx.media3.common.MimeTypes.getTrackType(exoTrackSelection.getSelectedFormat().containerMimeType);
            }
            if (trackType == 1) {
                return OBJECT_TYPE_AUDIO_ONLY;
            }
            if (trackType == 2) {
                return "v";
            }
            return null;
        }

        public androidx.media3.exoplayer.upstream.CmcdData.Factory setChunkDurationUs(long j) {
            androidx.media3.common.util.Assertions.checkArgument(j >= 0);
            this.chunkDurationUs = j;
            return this;
        }

        public androidx.media3.exoplayer.upstream.CmcdData.Factory setObjectType(java.lang.String str) {
            this.objectType = str;
            return this;
        }

        public androidx.media3.exoplayer.upstream.CmcdData.Factory setNextObjectRequest(java.lang.String str) {
            this.nextObjectRequest = str;
            return this;
        }

        public androidx.media3.exoplayer.upstream.CmcdData.Factory setNextRangeRequest(java.lang.String str) {
            this.nextRangeRequest = str;
            return this;
        }

        public androidx.media3.exoplayer.upstream.CmcdData createCmcdData() {
            com.google.common.collect.ImmutableListMultimap<java.lang.String, java.lang.String> customData = this.cmcdConfiguration.requestConfig.getCustomData();
            com.google.common.collect.UnmodifiableIterator<java.lang.String> it = customData.keySet().iterator();
            while (it.hasNext()) {
                validateCustomDataListFormat(customData.get(it.next()));
            }
            int iCeilDivide = androidx.media3.common.util.Util.ceilDivide(this.trackSelection.getSelectedFormat().bitrate, 1000);
            androidx.media3.exoplayer.upstream.CmcdData.CmcdObject.Builder builder = new androidx.media3.exoplayer.upstream.CmcdData.CmcdObject.Builder();
            if (!getIsInitSegment()) {
                if (this.cmcdConfiguration.isBitrateLoggingAllowed()) {
                    builder.setBitrateKbps(iCeilDivide);
                }
                if (this.cmcdConfiguration.isTopBitrateLoggingAllowed()) {
                    androidx.media3.common.TrackGroup trackGroup = this.trackSelection.getTrackGroup();
                    int iMax = this.trackSelection.getSelectedFormat().bitrate;
                    for (int i = 0; i < trackGroup.length; i++) {
                        iMax = java.lang.Math.max(iMax, trackGroup.getFormat(i).bitrate);
                    }
                    builder.setTopBitrateKbps(androidx.media3.common.util.Util.ceilDivide(iMax, 1000));
                }
                if (this.cmcdConfiguration.isObjectDurationLoggingAllowed()) {
                    builder.setObjectDurationMs(androidx.media3.common.util.Util.usToMs(this.chunkDurationUs));
                }
            }
            if (this.cmcdConfiguration.isObjectTypeLoggingAllowed()) {
                builder.setObjectType(this.objectType);
            }
            if (customData.containsKey(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_OBJECT)) {
                builder.setCustomDataList(customData.get(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_OBJECT));
            }
            androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder builder2 = new androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder();
            if (!getIsInitSegment() && this.cmcdConfiguration.isBufferLengthLoggingAllowed()) {
                builder2.setBufferLengthMs(androidx.media3.common.util.Util.usToMs(this.bufferedDurationUs));
            }
            if (this.cmcdConfiguration.isMeasuredThroughputLoggingAllowed() && this.trackSelection.getLatestBitrateEstimate() != -2147483647L) {
                builder2.setMeasuredThroughputInKbps(androidx.media3.common.util.Util.ceilDivide(this.trackSelection.getLatestBitrateEstimate(), 1000L));
            }
            if (this.cmcdConfiguration.isDeadlineLoggingAllowed()) {
                builder2.setDeadlineMs(androidx.media3.common.util.Util.usToMs((long) (this.bufferedDurationUs / this.playbackRate)));
            }
            if (this.cmcdConfiguration.isStartupLoggingAllowed()) {
                builder2.setStartup(this.didRebuffer || this.isBufferEmpty);
            }
            if (this.cmcdConfiguration.isNextObjectRequestLoggingAllowed()) {
                builder2.setNextObjectRequest(this.nextObjectRequest);
            }
            if (this.cmcdConfiguration.isNextRangeRequestLoggingAllowed()) {
                builder2.setNextRangeRequest(this.nextRangeRequest);
            }
            if (customData.containsKey(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_REQUEST)) {
                builder2.setCustomDataList(customData.get(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_REQUEST));
            }
            androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder builder3 = new androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder();
            if (this.cmcdConfiguration.isContentIdLoggingAllowed()) {
                builder3.setContentId(this.cmcdConfiguration.contentId);
            }
            if (this.cmcdConfiguration.isSessionIdLoggingAllowed()) {
                builder3.setSessionId(this.cmcdConfiguration.sessionId);
            }
            if (this.cmcdConfiguration.isStreamingFormatLoggingAllowed()) {
                builder3.setStreamingFormat(this.streamingFormat);
            }
            if (this.cmcdConfiguration.isStreamTypeLoggingAllowed()) {
                builder3.setStreamType(this.isLive ? STREAM_TYPE_LIVE : "v");
            }
            if (this.cmcdConfiguration.isPlaybackRateLoggingAllowed()) {
                builder3.setPlaybackRate(this.playbackRate);
            }
            if (customData.containsKey(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_SESSION)) {
                builder3.setCustomDataList(customData.get(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_SESSION));
            }
            androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder builder4 = new androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder();
            if (this.cmcdConfiguration.isMaximumRequestThroughputLoggingAllowed()) {
                builder4.setMaximumRequestedThroughputKbps(this.cmcdConfiguration.requestConfig.getRequestedMaximumThroughputKbps(iCeilDivide));
            }
            if (this.cmcdConfiguration.isBufferStarvationLoggingAllowed()) {
                builder4.setBufferStarvation(this.didRebuffer);
            }
            if (customData.containsKey(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_STATUS)) {
                builder4.setCustomDataList(customData.get(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_STATUS));
            }
            return new androidx.media3.exoplayer.upstream.CmcdData(builder.build(), builder2.build(), builder3.build(), builder4.build(), this.cmcdConfiguration.dataTransmissionMode);
        }

        private boolean getIsInitSegment() {
            java.lang.String str = this.objectType;
            return str != null && str.equals(OBJECT_TYPE_INIT_SEGMENT);
        }

        private void validateCustomDataListFormat(java.util.List<java.lang.String> list) {
            java.util.Iterator<java.lang.String> it = list.iterator();
            while (it.hasNext()) {
                androidx.media3.common.util.Assertions.checkState(CUSTOM_KEY_NAME_PATTERN.matcher(androidx.media3.common.util.Util.split(it.next(), com.ironsource.y8.i.b)[0]).matches());
            }
        }
    }

    private CmcdData(androidx.media3.exoplayer.upstream.CmcdData.CmcdObject cmcdObject, androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest cmcdRequest, androidx.media3.exoplayer.upstream.CmcdData.CmcdSession cmcdSession, androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus cmcdStatus, int i) {
        this.cmcdObject = cmcdObject;
        this.cmcdRequest = cmcdRequest;
        this.cmcdSession = cmcdSession;
        this.cmcdStatus = cmcdStatus;
        this.dataTransmissionMode = i;
    }

    public androidx.media3.datasource.DataSpec addToDataSpec(androidx.media3.datasource.DataSpec dataSpec) {
        com.google.common.collect.ArrayListMultimap<java.lang.String, java.lang.String> arrayListMultimapCreate = com.google.common.collect.ArrayListMultimap.create();
        this.cmcdObject.populateCmcdDataMap(arrayListMultimapCreate);
        this.cmcdRequest.populateCmcdDataMap(arrayListMultimapCreate);
        this.cmcdSession.populateCmcdDataMap(arrayListMultimapCreate);
        this.cmcdStatus.populateCmcdDataMap(arrayListMultimapCreate);
        if (this.dataTransmissionMode == 0) {
            com.google.common.collect.ImmutableMap.Builder builder = com.google.common.collect.ImmutableMap.builder();
            for (java.lang.String str : arrayListMultimapCreate.keySet()) {
                java.util.List list = arrayListMultimapCreate.get((java.lang.Object) str);
                java.util.Collections.sort(list);
                builder.put(str, COMMA_JOINER.join(list));
            }
            return dataSpec.withAdditionalHeaders(builder.buildOrThrow());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = arrayListMultimapCreate.asMap().values().iterator();
        while (it.hasNext()) {
            arrayList.addAll((java.util.Collection) it.next());
        }
        java.util.Collections.sort(arrayList);
        return dataSpec.buildUpon().setUri(dataSpec.uri.buildUpon().appendQueryParameter(androidx.media3.exoplayer.upstream.CmcdConfiguration.CMCD_QUERY_PARAMETER_KEY, COMMA_JOINER.join(arrayList)).build()).build();
    }

    private static final class CmcdObject {
        public final int bitrateKbps;
        public final com.google.common.collect.ImmutableList<java.lang.String> customDataList;
        public final long objectDurationMs;
        public final java.lang.String objectType;
        public final int topBitrateKbps;

        public static final class Builder {
            private java.lang.String objectType;
            private int bitrateKbps = androidx.media3.common.C.RATE_UNSET_INT;
            private int topBitrateKbps = androidx.media3.common.C.RATE_UNSET_INT;
            private long objectDurationMs = androidx.media3.common.C.TIME_UNSET;
            private com.google.common.collect.ImmutableList<java.lang.String> customDataList = com.google.common.collect.ImmutableList.of();

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdObject.Builder setBitrateKbps(int i) {
                androidx.media3.common.util.Assertions.checkArgument(i >= 0 || i == -2147483647);
                this.bitrateKbps = i;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdObject.Builder setTopBitrateKbps(int i) {
                androidx.media3.common.util.Assertions.checkArgument(i >= 0 || i == -2147483647);
                this.topBitrateKbps = i;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdObject.Builder setObjectDurationMs(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j >= 0 || j == androidx.media3.common.C.TIME_UNSET);
                this.objectDurationMs = j;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdObject.Builder setObjectType(java.lang.String str) {
                this.objectType = str;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdObject.Builder setCustomDataList(java.util.List<java.lang.String> list) {
                this.customDataList = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdObject build() {
                return new androidx.media3.exoplayer.upstream.CmcdData.CmcdObject(this);
            }
        }

        private CmcdObject(androidx.media3.exoplayer.upstream.CmcdData.CmcdObject.Builder builder) {
            this.bitrateKbps = builder.bitrateKbps;
            this.topBitrateKbps = builder.topBitrateKbps;
            this.objectDurationMs = builder.objectDurationMs;
            this.objectType = builder.objectType;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(com.google.common.collect.ArrayListMultimap<java.lang.String, java.lang.String> arrayListMultimap) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (this.bitrateKbps != -2147483647) {
                arrayList.add("br=" + this.bitrateKbps);
            }
            if (this.topBitrateKbps != -2147483647) {
                arrayList.add("tb=" + this.topBitrateKbps);
            }
            if (this.objectDurationMs != androidx.media3.common.C.TIME_UNSET) {
                arrayList.add("d=" + this.objectDurationMs);
            }
            if (!android.text.TextUtils.isEmpty(this.objectType)) {
                arrayList.add("ot=" + this.objectType);
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_OBJECT, arrayList);
        }
    }

    private static final class CmcdRequest {
        public final long bufferLengthMs;
        public final com.google.common.collect.ImmutableList<java.lang.String> customDataList;
        public final long deadlineMs;
        public final long measuredThroughputInKbps;
        public final java.lang.String nextObjectRequest;
        public final java.lang.String nextRangeRequest;
        public final boolean startup;

        public static final class Builder {
            private java.lang.String nextObjectRequest;
            private java.lang.String nextRangeRequest;
            private boolean startup;
            private long bufferLengthMs = androidx.media3.common.C.TIME_UNSET;
            private long measuredThroughputInKbps = -2147483647L;
            private long deadlineMs = androidx.media3.common.C.TIME_UNSET;
            private com.google.common.collect.ImmutableList<java.lang.String> customDataList = com.google.common.collect.ImmutableList.of();

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder setBufferLengthMs(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j >= 0 || j == androidx.media3.common.C.TIME_UNSET);
                this.bufferLengthMs = ((j + 50) / 100) * 100;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder setMeasuredThroughputInKbps(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j >= 0 || j == -2147483647L);
                this.measuredThroughputInKbps = ((j + 50) / 100) * 100;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder setDeadlineMs(long j) {
                androidx.media3.common.util.Assertions.checkArgument(j >= 0 || j == androidx.media3.common.C.TIME_UNSET);
                this.deadlineMs = ((j + 50) / 100) * 100;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder setStartup(boolean z) {
                this.startup = z;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder setNextObjectRequest(java.lang.String str) {
                this.nextObjectRequest = str == null ? null : android.net.Uri.encode(str);
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder setNextRangeRequest(java.lang.String str) {
                this.nextRangeRequest = str;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder setCustomDataList(java.util.List<java.lang.String> list) {
                this.customDataList = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest build() {
                return new androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest(this);
            }
        }

        private CmcdRequest(androidx.media3.exoplayer.upstream.CmcdData.CmcdRequest.Builder builder) {
            this.bufferLengthMs = builder.bufferLengthMs;
            this.measuredThroughputInKbps = builder.measuredThroughputInKbps;
            this.deadlineMs = builder.deadlineMs;
            this.startup = builder.startup;
            this.nextObjectRequest = builder.nextObjectRequest;
            this.nextRangeRequest = builder.nextRangeRequest;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(com.google.common.collect.ArrayListMultimap<java.lang.String, java.lang.String> arrayListMultimap) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (this.bufferLengthMs != androidx.media3.common.C.TIME_UNSET) {
                arrayList.add("bl=" + this.bufferLengthMs);
            }
            if (this.measuredThroughputInKbps != -2147483647L) {
                arrayList.add("mtp=" + this.measuredThroughputInKbps);
            }
            if (this.deadlineMs != androidx.media3.common.C.TIME_UNSET) {
                arrayList.add("dl=" + this.deadlineMs);
            }
            if (this.startup) {
                arrayList.add("su");
            }
            if (!android.text.TextUtils.isEmpty(this.nextObjectRequest)) {
                arrayList.add(androidx.media3.common.util.Util.formatInvariant("%s=\"%s\"", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_NEXT_OBJECT_REQUEST, this.nextObjectRequest));
            }
            if (!android.text.TextUtils.isEmpty(this.nextRangeRequest)) {
                arrayList.add(androidx.media3.common.util.Util.formatInvariant("%s=\"%s\"", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_NEXT_RANGE_REQUEST, this.nextRangeRequest));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_REQUEST, arrayList);
        }
    }

    private static final class CmcdSession {
        public static final int VERSION = 1;
        public final java.lang.String contentId;
        public final com.google.common.collect.ImmutableList<java.lang.String> customDataList;
        public final float playbackRate;
        public final java.lang.String sessionId;
        public final java.lang.String streamType;
        public final java.lang.String streamingFormat;

        public static final class Builder {
            private java.lang.String contentId;
            private com.google.common.collect.ImmutableList<java.lang.String> customDataList = com.google.common.collect.ImmutableList.of();
            private float playbackRate;
            private java.lang.String sessionId;
            private java.lang.String streamType;
            private java.lang.String streamingFormat;

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder setContentId(java.lang.String str) {
                androidx.media3.common.util.Assertions.checkArgument(str == null || str.length() <= 64);
                this.contentId = str;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder setSessionId(java.lang.String str) {
                androidx.media3.common.util.Assertions.checkArgument(str == null || str.length() <= 64);
                this.sessionId = str;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder setStreamingFormat(java.lang.String str) {
                this.streamingFormat = str;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder setStreamType(java.lang.String str) {
                this.streamType = str;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder setPlaybackRate(float f) {
                androidx.media3.common.util.Assertions.checkArgument(f > 0.0f || f == -3.4028235E38f);
                this.playbackRate = f;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder setCustomDataList(java.util.List<java.lang.String> list) {
                this.customDataList = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdSession build() {
                return new androidx.media3.exoplayer.upstream.CmcdData.CmcdSession(this);
            }
        }

        private CmcdSession(androidx.media3.exoplayer.upstream.CmcdData.CmcdSession.Builder builder) {
            this.contentId = builder.contentId;
            this.sessionId = builder.sessionId;
            this.streamingFormat = builder.streamingFormat;
            this.streamType = builder.streamType;
            this.playbackRate = builder.playbackRate;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(com.google.common.collect.ArrayListMultimap<java.lang.String, java.lang.String> arrayListMultimap) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (!android.text.TextUtils.isEmpty(this.contentId)) {
                arrayList.add(androidx.media3.common.util.Util.formatInvariant("%s=\"%s\"", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CONTENT_ID, this.contentId));
            }
            if (!android.text.TextUtils.isEmpty(this.sessionId)) {
                arrayList.add(androidx.media3.common.util.Util.formatInvariant("%s=\"%s\"", "sid", this.sessionId));
            }
            if (!android.text.TextUtils.isEmpty(this.streamingFormat)) {
                arrayList.add("sf=" + this.streamingFormat);
            }
            if (!android.text.TextUtils.isEmpty(this.streamType)) {
                arrayList.add("st=" + this.streamType);
            }
            float f = this.playbackRate;
            if (f != -3.4028235E38f && f != 1.0f) {
                arrayList.add(androidx.media3.common.util.Util.formatInvariant("%s=%.2f", androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_PLAYBACK_RATE, java.lang.Float.valueOf(f)));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_SESSION, arrayList);
        }
    }

    private static final class CmcdStatus {
        public final boolean bufferStarvation;
        public final com.google.common.collect.ImmutableList<java.lang.String> customDataList;
        public final int maximumRequestedThroughputKbps;

        public static final class Builder {
            private boolean bufferStarvation;
            private int maximumRequestedThroughputKbps = androidx.media3.common.C.RATE_UNSET_INT;
            private com.google.common.collect.ImmutableList<java.lang.String> customDataList = com.google.common.collect.ImmutableList.of();

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder setMaximumRequestedThroughputKbps(int i) {
                androidx.media3.common.util.Assertions.checkArgument(i >= 0 || i == -2147483647);
                if (i != -2147483647) {
                    i = ((i + 50) / 100) * 100;
                }
                this.maximumRequestedThroughputKbps = i;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder setBufferStarvation(boolean z) {
                this.bufferStarvation = z;
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder setCustomDataList(java.util.List<java.lang.String> list) {
                this.customDataList = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
                return this;
            }

            public androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus build() {
                return new androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus(this);
            }
        }

        private CmcdStatus(androidx.media3.exoplayer.upstream.CmcdData.CmcdStatus.Builder builder) {
            this.maximumRequestedThroughputKbps = builder.maximumRequestedThroughputKbps;
            this.bufferStarvation = builder.bufferStarvation;
            this.customDataList = builder.customDataList;
        }

        public void populateCmcdDataMap(com.google.common.collect.ArrayListMultimap<java.lang.String, java.lang.String> arrayListMultimap) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (this.maximumRequestedThroughputKbps != -2147483647) {
                arrayList.add("rtp=" + this.maximumRequestedThroughputKbps);
            }
            if (this.bufferStarvation) {
                arrayList.add(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_BUFFER_STARVATION);
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(androidx.media3.exoplayer.upstream.CmcdConfiguration.KEY_CMCD_STATUS, arrayList);
        }
    }
}
