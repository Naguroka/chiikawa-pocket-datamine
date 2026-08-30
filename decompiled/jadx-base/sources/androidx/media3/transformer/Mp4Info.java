package androidx.media3.transformer;

/* JADX INFO: loaded from: classes3.dex */
final class Mp4Info {
    public final androidx.media3.common.Format audioFormat;
    public final long durationUs;
    public final long firstSyncSampleTimestampUsAfterTimeUs;
    public final long lastSyncSampleTimestampUs;
    public final androidx.media3.common.Format videoFormat;

    private Mp4Info(long j, long j2, long j3, androidx.media3.common.Format format, androidx.media3.common.Format format2) {
        this.durationUs = j;
        this.lastSyncSampleTimestampUs = j2;
        this.firstSyncSampleTimestampUsAfterTimeUs = j3;
        this.videoFormat = format;
        this.audioFormat = format2;
    }

    public static androidx.media3.transformer.Mp4Info create(android.content.Context context, java.lang.String str) throws java.io.IOException {
        return create(context, str, androidx.media3.common.C.TIME_UNSET);
    }

    public static androidx.media3.transformer.Mp4Info create(android.content.Context context, java.lang.String str, long j) throws java.io.IOException {
        androidx.media3.common.Format format;
        long j2;
        long j3;
        long j4;
        androidx.media3.extractor.PositionHolder positionHolder;
        androidx.media3.extractor.mp4.Mp4Extractor mp4Extractor = new androidx.media3.extractor.mp4.Mp4Extractor(androidx.media3.extractor.text.SubtitleParser.Factory.UNSUPPORTED, 16);
        androidx.media3.transformer.Mp4Info.ExtractorOutputImpl extractorOutputImpl = new androidx.media3.transformer.Mp4Info.ExtractorOutputImpl();
        androidx.media3.datasource.DefaultDataSource defaultDataSource = new androidx.media3.datasource.DefaultDataSource(context, false);
        try {
            long jOpen = defaultDataSource.open(new androidx.media3.datasource.DataSpec.Builder().setUri(str).build());
            androidx.media3.common.util.Assertions.checkState(jOpen != 0);
            androidx.media3.extractor.DefaultExtractorInput defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(defaultDataSource, 0L, jOpen);
            androidx.media3.common.util.Assertions.checkState(mp4Extractor.sniff(defaultExtractorInput), "The MP4 file is invalid");
            mp4Extractor.init(extractorOutputImpl);
            androidx.media3.extractor.PositionHolder positionHolder2 = new androidx.media3.extractor.PositionHolder();
            while (!extractorOutputImpl.seekMapInitialized) {
                int i = mp4Extractor.read(defaultExtractorInput, positionHolder2);
                if (i == 1) {
                    defaultDataSource.close();
                    long jOpen2 = defaultDataSource.open(new androidx.media3.datasource.DataSpec.Builder().setUri(str).setPosition(positionHolder2.position).build());
                    if (jOpen2 != -1) {
                        jOpen2 += positionHolder2.position;
                    }
                    positionHolder = positionHolder2;
                    defaultExtractorInput = new androidx.media3.extractor.DefaultExtractorInput(defaultDataSource, positionHolder2.position, jOpen2);
                } else {
                    positionHolder = positionHolder2;
                    if (i == -1 && !extractorOutputImpl.seekMapInitialized) {
                        throw new java.lang.IllegalStateException("The MP4 file is invalid");
                    }
                }
                positionHolder2 = positionHolder;
            }
            long durationUs = mp4Extractor.getDurationUs();
            if (extractorOutputImpl.videoTrackId != -1) {
                format = (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(((androidx.media3.transformer.Mp4Info.ExtractorOutputImpl.TrackOutputImpl) androidx.media3.common.util.Assertions.checkNotNull(extractorOutputImpl.trackTypeToTrackOutput.get(2))).format);
                androidx.media3.common.util.Assertions.checkState(durationUs != androidx.media3.common.C.TIME_UNSET);
                long j5 = mp4Extractor.getSeekPoints(durationUs, extractorOutputImpl.videoTrackId).first.timeUs;
                if (j != androidx.media3.common.C.TIME_UNSET) {
                    androidx.media3.extractor.SeekMap.SeekPoints seekPoints = mp4Extractor.getSeekPoints(j, extractorOutputImpl.videoTrackId);
                    if (j == seekPoints.first.timeUs) {
                        j4 = seekPoints.first.timeUs;
                    } else {
                        j4 = j <= seekPoints.second.timeUs ? seekPoints.second.timeUs : Long.MIN_VALUE;
                    }
                    j3 = j4;
                } else {
                    j3 = -9223372036854775807L;
                }
                j2 = j5;
            } else {
                format = null;
                j2 = -9223372036854775807L;
                j3 = -9223372036854775807L;
            }
            androidx.media3.transformer.Mp4Info mp4Info = new androidx.media3.transformer.Mp4Info(durationUs, j2, j3, format, extractorOutputImpl.audioTrackId != -1 ? (androidx.media3.common.Format) androidx.media3.common.util.Assertions.checkNotNull(((androidx.media3.transformer.Mp4Info.ExtractorOutputImpl.TrackOutputImpl) androidx.media3.common.util.Assertions.checkNotNull(extractorOutputImpl.trackTypeToTrackOutput.get(1))).format) : null);
            androidx.media3.datasource.DataSourceUtil.closeQuietly(defaultDataSource);
            mp4Extractor.release();
            return mp4Info;
        } catch (java.lang.Throwable th) {
            androidx.media3.datasource.DataSourceUtil.closeQuietly(defaultDataSource);
            mp4Extractor.release();
            throw th;
        }
    }

    private static final class ExtractorOutputImpl implements androidx.media3.extractor.ExtractorOutput {
        public boolean seekMapInitialized;
        public int videoTrackId = -1;
        public int audioTrackId = -1;
        final java.util.Map<java.lang.Integer, androidx.media3.transformer.Mp4Info.ExtractorOutputImpl.TrackOutputImpl> trackTypeToTrackOutput = new java.util.HashMap();

        @Override // androidx.media3.extractor.ExtractorOutput
        public void endTracks() {
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public androidx.media3.extractor.TrackOutput track(int i, int i2) {
            if (i2 == 2) {
                this.videoTrackId = i;
            } else if (i2 == 1) {
                this.audioTrackId = i;
            }
            androidx.media3.transformer.Mp4Info.ExtractorOutputImpl.TrackOutputImpl trackOutputImpl = this.trackTypeToTrackOutput.get(java.lang.Integer.valueOf(i2));
            if (trackOutputImpl != null) {
                return trackOutputImpl;
            }
            androidx.media3.transformer.Mp4Info.ExtractorOutputImpl.TrackOutputImpl trackOutputImpl2 = new androidx.media3.transformer.Mp4Info.ExtractorOutputImpl.TrackOutputImpl();
            this.trackTypeToTrackOutput.put(java.lang.Integer.valueOf(i2), trackOutputImpl2);
            return trackOutputImpl2;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public void seekMap(androidx.media3.extractor.SeekMap seekMap) {
            this.seekMapInitialized = true;
        }

        private static final class TrackOutputImpl implements androidx.media3.extractor.TrackOutput {
            private static final int FIXED_BYTE_ARRAY_SIZE = 16000;
            private final byte[] byteArray = new byte[16000];
            public androidx.media3.common.Format format;

            @Override // androidx.media3.extractor.TrackOutput
            public void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
            }

            @Override // androidx.media3.extractor.TrackOutput
            public void format(androidx.media3.common.Format format) {
                this.format = format;
            }

            @Override // androidx.media3.extractor.TrackOutput
            public int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
                int i3 = i;
                while (i3 > 0) {
                    boolean z2 = false;
                    int i4 = dataReader.read(this.byteArray, 0, java.lang.Math.min(i3, this.byteArray.length));
                    if (i4 != -1) {
                        z2 = true;
                    }
                    androidx.media3.common.util.Assertions.checkState(z2);
                    i3 -= i4;
                }
                return i;
            }

            @Override // androidx.media3.extractor.TrackOutput
            public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
                while (i > 0) {
                    int iMin = java.lang.Math.min(i, this.byteArray.length);
                    parsableByteArray.readBytes(this.byteArray, 0, iMin);
                    i -= iMin;
                }
            }
        }
    }
}
