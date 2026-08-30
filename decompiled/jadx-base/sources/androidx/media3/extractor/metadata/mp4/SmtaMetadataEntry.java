package androidx.media3.extractor.metadata.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class SmtaMetadataEntry implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry>() { // from class: androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry[] newArray(int i) {
            return new androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry[i];
        }
    };
    public final float captureFrameRate;
    public final int svcTemporalLayerCount;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SmtaMetadataEntry(float f, int i) {
        this.captureFrameRate = f;
        this.svcTemporalLayerCount = i;
    }

    private SmtaMetadataEntry(android.os.Parcel parcel) {
        this.captureFrameRate = parcel.readFloat();
        this.svcTemporalLayerCount = parcel.readInt();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry smtaMetadataEntry = (androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry) obj;
        return this.captureFrameRate == smtaMetadataEntry.captureFrameRate && this.svcTemporalLayerCount == smtaMetadataEntry.svcTemporalLayerCount;
    }

    public int hashCode() {
        return ((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + com.google.common.primitives.Floats.hashCode(this.captureFrameRate)) * 31) + this.svcTemporalLayerCount;
    }

    public java.lang.String toString() {
        return "smta: captureFrameRate=" + this.captureFrameRate + ", svcTemporalLayerCount=" + this.svcTemporalLayerCount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.captureFrameRate);
        parcel.writeInt(this.svcTemporalLayerCount);
    }
}
