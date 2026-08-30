package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
public final class Mp4Utils {
    public static final long UNSIGNED_INT_MAX_VALUE = 4294967295L;

    private Mp4Utils() {
    }

    public static boolean isMetadataSupported(androidx.media3.common.Metadata.Entry entry) {
        return (entry instanceof androidx.media3.container.Mp4OrientationData) || (entry instanceof androidx.media3.container.Mp4LocationData) || ((entry instanceof androidx.media3.container.Mp4TimestampData) && isMp4TimestampDataSupported((androidx.media3.container.Mp4TimestampData) entry)) || (((entry instanceof androidx.media3.container.MdtaMetadataEntry) && isMdtaMetadataEntrySupported((androidx.media3.container.MdtaMetadataEntry) entry)) || (entry instanceof androidx.media3.container.XmpData));
    }

    private static boolean isMdtaMetadataEntrySupported(androidx.media3.container.MdtaMetadataEntry mdtaMetadataEntry) {
        return mdtaMetadataEntry.typeIndicator == 1 || mdtaMetadataEntry.typeIndicator == 23;
    }

    private static boolean isMp4TimestampDataSupported(androidx.media3.container.Mp4TimestampData mp4TimestampData) {
        return mp4TimestampData.creationTimestampSeconds <= UNSIGNED_INT_MAX_VALUE && mp4TimestampData.modificationTimestampSeconds <= UNSIGNED_INT_MAX_VALUE;
    }
}
