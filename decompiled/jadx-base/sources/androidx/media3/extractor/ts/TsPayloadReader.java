package androidx.media3.extractor.ts;

/* JADX INFO: loaded from: classes.dex */
public interface TsPayloadReader {
    public static final int FLAG_DATA_ALIGNMENT_INDICATOR = 4;
    public static final int FLAG_PAYLOAD_UNIT_START_INDICATOR = 1;
    public static final int FLAG_RANDOM_ACCESS_INDICATOR = 2;

    public interface Factory {
        android.util.SparseArray<androidx.media3.extractor.ts.TsPayloadReader> createInitialPayloadReaders();

        androidx.media3.extractor.ts.TsPayloadReader createPayloadReader(int i, androidx.media3.extractor.ts.TsPayloadReader.EsInfo esInfo);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    void consume(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) throws androidx.media3.common.ParserException;

    void init(androidx.media3.common.util.TimestampAdjuster timestampAdjuster, androidx.media3.extractor.ExtractorOutput extractorOutput, androidx.media3.extractor.ts.TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void seek();

    public static final class EsInfo {
        public static final int AUDIO_TYPE_CLEAN_EFFECTS = 1;
        public static final int AUDIO_TYPE_HEARING_IMPAIRED = 2;
        public static final int AUDIO_TYPE_UNDEFINED = 0;
        public static final int AUDIO_TYPE_VISUAL_IMPAIRED_COMMENTARY = 3;
        public final int audioType;
        public final byte[] descriptorBytes;
        public final java.util.List<androidx.media3.extractor.ts.TsPayloadReader.DvbSubtitleInfo> dvbSubtitleInfos;
        public final java.lang.String language;
        public final int streamType;

        @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
        @java.lang.annotation.Documented
        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface AudioType {
        }

        public int getRoleFlags() {
            int i = this.audioType;
            if (i != 2) {
                return i != 3 ? 0 : 512;
            }
            return 2048;
        }

        public EsInfo(int i, java.lang.String str, int i2, java.util.List<androidx.media3.extractor.ts.TsPayloadReader.DvbSubtitleInfo> list, byte[] bArr) {
            java.util.List<androidx.media3.extractor.ts.TsPayloadReader.DvbSubtitleInfo> listUnmodifiableList;
            this.streamType = i;
            this.language = str;
            this.audioType = i2;
            if (list == null) {
                listUnmodifiableList = java.util.Collections.emptyList();
            } else {
                listUnmodifiableList = java.util.Collections.unmodifiableList(list);
            }
            this.dvbSubtitleInfos = listUnmodifiableList;
            this.descriptorBytes = bArr;
        }
    }

    public static final class DvbSubtitleInfo {
        public final byte[] initializationData;
        public final java.lang.String language;
        public final int type;

        public DvbSubtitleInfo(java.lang.String str, int i, byte[] bArr) {
            this.language = str;
            this.type = i;
            this.initializationData = bArr;
        }
    }

    public static final class TrackIdGenerator {
        private static final int ID_UNSET = Integer.MIN_VALUE;
        private final int firstTrackId;
        private java.lang.String formatId;
        private final java.lang.String formatIdPrefix;
        private int trackId;
        private final int trackIdIncrement;

        public TrackIdGenerator(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }

        public TrackIdGenerator(int i, int i2, int i3) {
            this.formatIdPrefix = i != Integer.MIN_VALUE ? i + "/" : "";
            this.firstTrackId = i2;
            this.trackIdIncrement = i3;
            this.trackId = Integer.MIN_VALUE;
            this.formatId = "";
        }

        public void generateNewId() {
            int i = this.trackId;
            this.trackId = i == Integer.MIN_VALUE ? this.firstTrackId : i + this.trackIdIncrement;
            this.formatId = this.formatIdPrefix + this.trackId;
        }

        public int getTrackId() {
            maybeThrowUninitializedError();
            return this.trackId;
        }

        public java.lang.String getFormatId() {
            maybeThrowUninitializedError();
            return this.formatId;
        }

        private void maybeThrowUninitializedError() {
            if (this.trackId == Integer.MIN_VALUE) {
                throw new java.lang.IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }
}
