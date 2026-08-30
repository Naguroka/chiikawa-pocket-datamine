package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class Track {
    public static final int TRANSFORMATION_CEA608_CDAT = 1;
    public static final int TRANSFORMATION_NONE = 0;
    public final long durationUs;
    public final long[] editListDurations;
    public final long[] editListMediaTimes;
    public final androidx.media3.common.Format format;
    public final int id;
    public final long movieTimescale;
    public final int nalUnitLengthFieldLength;
    private final androidx.media3.extractor.mp4.TrackEncryptionBox[] sampleDescriptionEncryptionBoxes;
    public final int sampleTransformation;
    public final long timescale;
    public final int type;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i, int i2, long j, long j2, long j3, androidx.media3.common.Format format, int i3, androidx.media3.extractor.mp4.TrackEncryptionBox[] trackEncryptionBoxArr, int i4, long[] jArr, long[] jArr2) {
        this.id = i;
        this.type = i2;
        this.timescale = j;
        this.movieTimescale = j2;
        this.durationUs = j3;
        this.format = format;
        this.sampleTransformation = i3;
        this.sampleDescriptionEncryptionBoxes = trackEncryptionBoxArr;
        this.nalUnitLengthFieldLength = i4;
        this.editListDurations = jArr;
        this.editListMediaTimes = jArr2;
    }

    public androidx.media3.extractor.mp4.TrackEncryptionBox getSampleDescriptionEncryptionBox(int i) {
        androidx.media3.extractor.mp4.TrackEncryptionBox[] trackEncryptionBoxArr = this.sampleDescriptionEncryptionBoxes;
        if (trackEncryptionBoxArr == null) {
            return null;
        }
        return trackEncryptionBoxArr[i];
    }

    public androidx.media3.extractor.mp4.Track copyWithFormat(androidx.media3.common.Format format) {
        return new androidx.media3.extractor.mp4.Track(this.id, this.type, this.timescale, this.movieTimescale, this.durationUs, format, this.sampleTransformation, this.sampleDescriptionEncryptionBoxes, this.nalUnitLengthFieldLength, this.editListDurations, this.editListMediaTimes);
    }

    public androidx.media3.extractor.mp4.Track copyWithoutEditLists() {
        return new androidx.media3.extractor.mp4.Track(this.id, this.type, this.timescale, this.movieTimescale, this.durationUs, this.format, this.sampleTransformation, this.sampleDescriptionEncryptionBoxes, this.nalUnitLengthFieldLength, null, null);
    }
}
