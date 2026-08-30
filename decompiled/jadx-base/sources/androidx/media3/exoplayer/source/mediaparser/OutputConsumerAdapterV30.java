package androidx.media3.exoplayer.source.mediaparser;

/* JADX INFO: loaded from: classes.dex */
public final class OutputConsumerAdapterV30 implements android.media.MediaParser.OutputConsumer {
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final java.lang.String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final java.lang.String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final java.lang.String TAG = "OConsumerAdapterV30";
    private java.lang.String containerMimeType;
    private android.media.MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private androidx.media3.extractor.ExtractorOutput extractorOutput;
    private androidx.media3.extractor.ChunkIndex lastChunkIndex;
    private final java.util.ArrayList<androidx.media3.extractor.TrackOutput.CryptoData> lastOutputCryptoDatas;
    private final java.util.ArrayList<android.media.MediaCodec.CryptoInfo> lastReceivedCryptoInfos;
    private android.media.MediaParser.SeekMap lastSeekMap;
    private java.util.List<androidx.media3.common.Format> muxedCaptionFormats;
    private int primaryTrackIndex;
    private final androidx.media3.common.Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30.DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;
    private androidx.media3.common.util.TimestampAdjuster timestampAdjuster;
    private final java.util.ArrayList<androidx.media3.common.Format> trackFormats;
    private final java.util.ArrayList<androidx.media3.extractor.TrackOutput> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;
    private static final android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> SEEK_POINT_PAIR_START = android.util.Pair.create(android.media.MediaParser.SeekPoint.START, android.media.MediaParser.SeekPoint.START);
    private static final java.util.regex.Pattern REGEX_CRYPTO_INFO_PATTERN = java.util.regex.Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }

    public OutputConsumerAdapterV30(androidx.media3.common.Format format, int i, boolean z) {
        this.expectDummySeekMap = z;
        this.primaryTrackManifestFormat = format;
        this.primaryTrackType = i;
        this.trackOutputs = new java.util.ArrayList<>();
        this.trackFormats = new java.util.ArrayList<>();
        this.lastReceivedCryptoInfos = new java.util.ArrayList<>();
        this.lastOutputCryptoDatas = new java.util.ArrayList<>();
        this.scratchDataReaderAdapter = new androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30.DataReaderAdapter();
        this.extractorOutput = new androidx.media3.extractor.NoOpExtractorOutput();
        this.sampleTimestampUpperLimitFilterUs = androidx.media3.common.C.TIME_UNSET;
        this.muxedCaptionFormats = com.google.common.collect.ImmutableList.of();
    }

    public void setSampleTimestampUpperLimitFilterUs(long j) {
        this.sampleTimestampUpperLimitFilterUs = j;
    }

    public void setTimestampAdjuster(androidx.media3.common.util.TimestampAdjuster timestampAdjuster) {
        this.timestampAdjuster = timestampAdjuster;
    }

    public void setExtractorOutput(androidx.media3.extractor.ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    public void setMuxedCaptionFormats(java.util.List<androidx.media3.common.Format> list) {
        this.muxedCaptionFormats = list;
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    public android.media.MediaParser.SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    public androidx.media3.extractor.ChunkIndex getChunkIndex() {
        return this.lastChunkIndex;
    }

    public android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> getSeekPoints(long j) {
        android.media.MediaParser.SeekMap seekMap = this.lastSeekMap;
        return seekMap != null ? seekMap.getSeekPoints(j) : SEEK_POINT_PAIR_START;
    }

    public void setSelectedParserName(java.lang.String str) {
        this.containerMimeType = getMimeType(str);
    }

    public androidx.media3.common.Format[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        androidx.media3.common.Format[] formatArr = new androidx.media3.common.Format[this.trackFormats.size()];
        for (int i = 0; i < this.trackFormats.size(); i++) {
            formatArr[i] = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(this.trackFormats.get(i));
        }
        return formatArr;
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackCountFound(int i) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSeekMapFound(android.media.MediaParser.SeekMap seekMap) {
        androidx.media3.extractor.SeekMap seekMapAdapter;
        if (this.expectDummySeekMap && this.dummySeekMap == null) {
            this.dummySeekMap = seekMap;
            return;
        }
        this.lastSeekMap = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        androidx.media3.extractor.ExtractorOutput extractorOutput = this.extractorOutput;
        if (this.seekingDisabled) {
            if (durationMicros == -2147483648L) {
                durationMicros = androidx.media3.common.C.TIME_UNSET;
            }
            seekMapAdapter = new androidx.media3.extractor.SeekMap.Unseekable(durationMicros);
        } else {
            seekMapAdapter = new androidx.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30.SeekMapAdapter(seekMap);
        }
        extractorOutput.seekMap(seekMapAdapter);
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onTrackDataFound(int i, android.media.MediaParser.TrackData trackData) {
        if (maybeObtainChunkIndex(trackData.mediaFormat)) {
            return;
        }
        ensureSpaceForTrackIndex(i);
        androidx.media3.extractor.TrackOutput trackOutput = this.trackOutputs.get(i);
        if (trackOutput == null) {
            java.lang.String string = trackData.mediaFormat.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
            int trackTypeConstant = toTrackTypeConstant(string != null ? string : trackData.mediaFormat.getString("mime"));
            if (trackTypeConstant == this.primaryTrackType) {
                this.primaryTrackIndex = i;
            }
            androidx.media3.extractor.TrackOutput trackOutputTrack = this.extractorOutput.track(i, trackTypeConstant);
            this.trackOutputs.set(i, trackOutputTrack);
            if (string != null) {
                return;
            } else {
                trackOutput = trackOutputTrack;
            }
        }
        androidx.media3.common.Format exoPlayerFormat = toExoPlayerFormat(trackData);
        androidx.media3.common.Format format = this.primaryTrackManifestFormat;
        trackOutput.format((format == null || i != this.primaryTrackIndex) ? exoPlayerFormat : exoPlayerFormat.withManifestFormatInfo(format));
        this.trackFormats.set(i, exoPlayerFormat);
        maybeEndTracks();
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleDataFound(int i, android.media.MediaParser.InputReader inputReader) throws java.io.IOException {
        ensureSpaceForTrackIndex(i);
        this.scratchDataReaderAdapter.input = inputReader;
        androidx.media3.extractor.TrackOutput trackOutputTrack = this.trackOutputs.get(i);
        if (trackOutputTrack == null) {
            trackOutputTrack = this.extractorOutput.track(i, -1);
            this.trackOutputs.set(i, trackOutputTrack);
        }
        trackOutputTrack.sampleData((androidx.media3.common.DataReader) this.scratchDataReaderAdapter, (int) inputReader.getLength(), true);
    }

    @Override // android.media.MediaParser.OutputConsumer
    public void onSampleCompleted(int i, long j, int i2, int i3, int i4, android.media.MediaCodec.CryptoInfo cryptoInfo) {
        long j2 = this.sampleTimestampUpperLimitFilterUs;
        if (j2 == androidx.media3.common.C.TIME_UNSET || j < j2) {
            androidx.media3.common.util.TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                j = timestampAdjuster.adjustSampleTimestamp(j);
            }
            ((androidx.media3.extractor.TrackOutput) androidx.media3.common.util.Assertions.checkNotNull(this.trackOutputs.get(i))).sampleMetadata(j, i2, i3, i4, toExoPlayerCryptoData(i, cryptoInfo));
        }
    }

    private boolean maybeObtainChunkIndex(android.media.MediaFormat mediaFormat) {
        java.nio.ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        java.nio.IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        java.nio.LongBuffer longBufferAsLongBuffer = ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS))).asLongBuffer();
        java.nio.LongBuffer longBufferAsLongBuffer2 = ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS))).asLongBuffer();
        java.nio.LongBuffer longBufferAsLongBuffer3 = ((java.nio.ByteBuffer) androidx.media3.common.util.Assertions.checkNotNull(mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES))).asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        androidx.media3.extractor.ChunkIndex chunkIndex = new androidx.media3.extractor.ChunkIndex(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = chunkIndex;
        this.extractorOutput.seekMap(chunkIndex);
        return true;
    }

    private void ensureSpaceForTrackIndex(int i) {
        for (int size = this.trackOutputs.size(); size <= i; size++) {
            this.trackOutputs.add(null);
            this.trackFormats.add(null);
            this.lastReceivedCryptoInfos.add(null);
            this.lastOutputCryptoDatas.add(null);
        }
    }

    private androidx.media3.extractor.TrackOutput.CryptoData toExoPlayerCryptoData(int i, android.media.MediaCodec.CryptoInfo cryptoInfo) {
        int i2;
        int i3;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i) == cryptoInfo) {
            return (androidx.media3.extractor.TrackOutput.CryptoData) androidx.media3.common.util.Assertions.checkNotNull(this.lastOutputCryptoDatas.get(i));
        }
        try {
            java.util.regex.Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            i2 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(1)));
            i3 = java.lang.Integer.parseInt((java.lang.String) androidx.media3.common.util.Util.castNonNull(matcher.group(2)));
        } catch (java.lang.RuntimeException e) {
            androidx.media3.common.util.Log.e(TAG, "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e);
            i2 = 0;
            i3 = 0;
        }
        androidx.media3.extractor.TrackOutput.CryptoData cryptoData = new androidx.media3.extractor.TrackOutput.CryptoData(cryptoInfo.mode, cryptoInfo.key, i2, i3);
        this.lastReceivedCryptoInfos.set(i, cryptoInfo);
        this.lastOutputCryptoDatas.set(i, cryptoData);
        return cryptoData;
    }

    private void maybeEndTracks() {
        if (!this.tracksFoundCalled || this.tracksEnded) {
            return;
        }
        int size = this.trackOutputs.size();
        for (int i = 0; i < size; i++) {
            if (this.trackOutputs.get(i) == null) {
                return;
            }
        }
        this.extractorOutput.endTracks();
        this.tracksEnded = true;
    }

    private static int toTrackTypeConstant(java.lang.String str) {
        if (str == null) {
            return -1;
        }
        str.hashCode();
        switch (str) {
            case "metadata":
                return 5;
            case "unknown":
                return -1;
            case "text":
                return 3;
            case "audio":
                return 1;
            case "video":
                return 2;
            default:
                return androidx.media3.common.MimeTypes.getTrackType(str);
        }
    }

    private androidx.media3.common.Format toExoPlayerFormat(android.media.MediaParser.TrackData trackData) {
        android.media.MediaFormat mediaFormat = trackData.mediaFormat;
        java.lang.String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        androidx.media3.common.Format.Builder accessibilityChannel = new androidx.media3.common.Format.Builder().setDrmInitData(toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData)).setContainerMimeType(this.containerMimeType).setPeakBitrate(mediaFormat.getInteger("bitrate", -1)).setChannelCount(mediaFormat.getInteger("channel-count", -1)).setColorInfo(androidx.media3.common.util.MediaFormatUtil.getColorInfo(mediaFormat)).setSampleMimeType(string).setCodecs(mediaFormat.getString("codecs-string")).setFrameRate(mediaFormat.getFloat("frame-rate", -1.0f)).setWidth(mediaFormat.getInteger("width", -1)).setHeight(mediaFormat.getInteger("height", -1)).setInitializationData(getInitializationData(mediaFormat)).setLanguage(mediaFormat.getString("language")).setMaxInputSize(mediaFormat.getInteger("max-input-size", -1)).setPcmEncoding(mediaFormat.getInteger("exo-pcm-encoding", -1)).setRotationDegrees(mediaFormat.getInteger("rotation-degrees", 0)).setSampleRate(mediaFormat.getInteger("sample-rate", -1)).setSelectionFlags(getSelectionFlags(mediaFormat)).setEncoderDelay(mediaFormat.getInteger("encoder-delay", 0)).setEncoderPadding(mediaFormat.getInteger("encoder-padding", 0)).setPixelWidthHeightRatio(mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f)).setSubsampleOffsetUs(mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE)).setAccessibilityChannel(integer);
        for (int i = 0; i < this.muxedCaptionFormats.size(); i++) {
            androidx.media3.common.Format format = this.muxedCaptionFormats.get(i);
            if (androidx.media3.common.util.Util.areEqual(format.sampleMimeType, string) && format.accessibilityChannel == integer) {
                accessibilityChannel.setLanguage(format.language).setRoleFlags(format.roleFlags).setSelectionFlags(format.selectionFlags).setLabel(format.label).setLabels(format.labels).setMetadata(format.metadata);
                break;
            }
        }
        return accessibilityChannel.build();
    }

    private static androidx.media3.common.DrmInitData toExoPlayerDrmInitData(java.lang.String str, android.media.DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        androidx.media3.common.DrmInitData.SchemeData[] schemeDataArr = new androidx.media3.common.DrmInitData.SchemeData[schemeInitDataCount];
        for (int i = 0; i < schemeInitDataCount; i++) {
            android.media.DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i);
            schemeDataArr[i] = new androidx.media3.common.DrmInitData.SchemeData(schemeInitDataAt.uuid, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new androidx.media3.common.DrmInitData(str, schemeDataArr);
    }

    private static int getSelectionFlags(android.media.MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | 0 | getFlag(mediaFormat, "is-default", 1);
    }

    private static int getFlag(android.media.MediaFormat mediaFormat, java.lang.String str, int i) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i;
        }
        return 0;
    }

    private static java.util.List<byte[]> getInitializationData(android.media.MediaFormat mediaFormat) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            java.nio.ByteBuffer byteBuffer = mediaFormat.getByteBuffer("csd-" + i);
            if (byteBuffer == null) {
                return arrayList;
            }
            arrayList.add(androidx.media3.common.util.MediaFormatUtil.getArray(byteBuffer));
            i = i2;
        }
    }

    private static java.lang.String getMimeType(java.lang.String str) {
        str.hashCode();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                return androidx.media3.common.MimeTypes.VIDEO_MP4;
            case "android.media.mediaparser.OggParser":
                return androidx.media3.common.MimeTypes.AUDIO_OGG;
            case "android.media.mediaparser.TsParser":
                return androidx.media3.common.MimeTypes.VIDEO_MP2T;
            case "android.media.mediaparser.AdtsParser":
                return androidx.media3.common.MimeTypes.AUDIO_AAC;
            case "android.media.mediaparser.WavParser":
                return androidx.media3.common.MimeTypes.AUDIO_RAW;
            case "android.media.mediaparser.PsParser":
                return androidx.media3.common.MimeTypes.VIDEO_PS;
            case "android.media.mediaparser.Ac3Parser":
                return androidx.media3.common.MimeTypes.AUDIO_AC3;
            case "android.media.mediaparser.AmrParser":
                return androidx.media3.common.MimeTypes.AUDIO_AMR;
            case "android.media.mediaparser.FlacParser":
                return androidx.media3.common.MimeTypes.AUDIO_FLAC;
            case "android.media.mediaparser.MatroskaParser":
                return "video/webm";
            case "android.media.mediaparser.Ac4Parser":
                return androidx.media3.common.MimeTypes.AUDIO_AC4;
            case "android.media.mediaparser.Mp3Parser":
                return androidx.media3.common.MimeTypes.AUDIO_MPEG;
            case "android.media.mediaparser.FlvParser":
                return androidx.media3.common.MimeTypes.VIDEO_FLV;
            default:
                throw new java.lang.IllegalArgumentException("Illegal parser name: " + str);
        }
    }

    private static final class SeekMapAdapter implements androidx.media3.extractor.SeekMap {
        private final android.media.MediaParser.SeekMap adaptedSeekMap;

        public SeekMapAdapter(android.media.MediaParser.SeekMap seekMap) {
            this.adaptedSeekMap = seekMap;
        }

        @Override // androidx.media3.extractor.SeekMap
        public boolean isSeekable() {
            return this.adaptedSeekMap.isSeekable();
        }

        @Override // androidx.media3.extractor.SeekMap
        public long getDurationUs() {
            long durationMicros = this.adaptedSeekMap.getDurationMicros();
            return durationMicros != -2147483648L ? durationMicros : androidx.media3.common.C.TIME_UNSET;
        }

        @Override // androidx.media3.extractor.SeekMap
        public androidx.media3.extractor.SeekMap.SeekPoints getSeekPoints(long j) {
            android.util.Pair<android.media.MediaParser.SeekPoint, android.media.MediaParser.SeekPoint> seekPoints = this.adaptedSeekMap.getSeekPoints(j);
            if (seekPoints.first == seekPoints.second) {
                return new androidx.media3.extractor.SeekMap.SeekPoints(asExoPlayerSeekPoint((android.media.MediaParser.SeekPoint) seekPoints.first));
            }
            return new androidx.media3.extractor.SeekMap.SeekPoints(asExoPlayerSeekPoint((android.media.MediaParser.SeekPoint) seekPoints.first), asExoPlayerSeekPoint((android.media.MediaParser.SeekPoint) seekPoints.second));
        }

        private static androidx.media3.extractor.SeekPoint asExoPlayerSeekPoint(android.media.MediaParser.SeekPoint seekPoint) {
            return new androidx.media3.extractor.SeekPoint(seekPoint.timeMicros, seekPoint.position);
        }
    }

    private static final class DataReaderAdapter implements androidx.media3.common.DataReader {
        public android.media.MediaParser.InputReader input;

        private DataReaderAdapter() {
        }

        @Override // androidx.media3.common.DataReader
        public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
            return ((android.media.MediaParser.InputReader) androidx.media3.common.util.Util.castNonNull(this.input)).read(bArr, i, i2);
        }
    }
}
