package androidx.media3.muxer;

/* JADX INFO: loaded from: classes.dex */
final class MetadataCollector {
    public androidx.media3.container.Mp4LocationData locationData;
    public androidx.media3.container.Mp4TimestampData timestampData;
    public androidx.media3.container.XmpData xmpData;
    public androidx.media3.container.Mp4OrientationData orientationData = new androidx.media3.container.Mp4OrientationData(0);
    public java.util.List<androidx.media3.container.MdtaMetadataEntry> metadataEntries = new java.util.ArrayList();

    public MetadataCollector() {
        long jUnixTimeToMp4TimeSeconds = androidx.media3.container.Mp4TimestampData.unixTimeToMp4TimeSeconds(java.lang.System.currentTimeMillis());
        this.timestampData = new androidx.media3.container.Mp4TimestampData(jUnixTimeToMp4TimeSeconds, jUnixTimeToMp4TimeSeconds);
    }

    public void addMetadata(androidx.media3.common.Metadata.Entry entry) {
        if (entry instanceof androidx.media3.container.Mp4OrientationData) {
            this.orientationData = (androidx.media3.container.Mp4OrientationData) entry;
            return;
        }
        if (entry instanceof androidx.media3.container.Mp4LocationData) {
            this.locationData = (androidx.media3.container.Mp4LocationData) entry;
            return;
        }
        if (entry instanceof androidx.media3.container.Mp4TimestampData) {
            this.timestampData = (androidx.media3.container.Mp4TimestampData) entry;
        } else if (entry instanceof androidx.media3.container.MdtaMetadataEntry) {
            this.metadataEntries.add((androidx.media3.container.MdtaMetadataEntry) entry);
        } else {
            if (entry instanceof androidx.media3.container.XmpData) {
                this.xmpData = (androidx.media3.container.XmpData) entry;
                return;
            }
            throw new java.lang.IllegalArgumentException("Unsupported metadata");
        }
    }
}
