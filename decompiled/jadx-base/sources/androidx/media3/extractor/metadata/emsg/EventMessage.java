package androidx.media3.extractor.metadata.emsg;

/* JADX INFO: loaded from: classes.dex */
public final class EventMessage implements androidx.media3.common.Metadata.Entry {
    public static final java.lang.String ID3_SCHEME_ID_AOM = "https://aomedia.org/emsg/ID3";
    private static final java.lang.String ID3_SCHEME_ID_APPLE = "https://developer.apple.com/streaming/emsg-id3";
    public static final java.lang.String SCTE35_SCHEME_ID = "urn:scte:scte35:2014:bin";
    public final long durationMs;
    private int hashCode;
    public final long id;
    public final byte[] messageData;
    public final java.lang.String schemeIdUri;
    public final java.lang.String value;
    private static final androidx.media3.common.Format ID3_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_ID3).build();
    private static final androidx.media3.common.Format SCTE35_FORMAT = new androidx.media3.common.Format.Builder().setSampleMimeType(androidx.media3.common.MimeTypes.APPLICATION_SCTE35).build();
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.emsg.EventMessage> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.emsg.EventMessage>() { // from class: androidx.media3.extractor.metadata.emsg.EventMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.emsg.EventMessage createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.emsg.EventMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.emsg.EventMessage[] newArray(int i) {
            return new androidx.media3.extractor.metadata.emsg.EventMessage[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public EventMessage(java.lang.String str, java.lang.String str2, long j, long j2, byte[] bArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j;
        this.id = j2;
        this.messageData = bArr;
    }

    EventMessage(android.os.Parcel parcel) {
        this.schemeIdUri = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.value = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.durationMs = parcel.readLong();
        this.id = parcel.readLong();
        this.messageData = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
    }

    @Override // androidx.media3.common.Metadata.Entry
    public androidx.media3.common.Format getWrappedMetadataFormat() {
        java.lang.String str = this.schemeIdUri;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return SCTE35_FORMAT;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return ID3_FORMAT;
            default:
                return null;
        }
    }

    @Override // androidx.media3.common.Metadata.Entry
    public byte[] getWrappedMetadataBytes() {
        if (getWrappedMetadataFormat() != null) {
            return this.messageData;
        }
        return null;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            java.lang.String str = this.schemeIdUri;
            int iHashCode = (com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (str != null ? str.hashCode() : 0)) * 31;
            java.lang.String str2 = this.value;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.durationMs;
            int i = (((iHashCode + iHashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.id;
            this.hashCode = ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + java.util.Arrays.hashCode(this.messageData);
        }
        return this.hashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.extractor.metadata.emsg.EventMessage eventMessage = (androidx.media3.extractor.metadata.emsg.EventMessage) obj;
        return this.durationMs == eventMessage.durationMs && this.id == eventMessage.id && androidx.media3.common.util.Util.areEqual(this.schemeIdUri, eventMessage.schemeIdUri) && androidx.media3.common.util.Util.areEqual(this.value, eventMessage.value) && java.util.Arrays.equals(this.messageData, eventMessage.messageData);
    }

    public java.lang.String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.id + ", durationMs=" + this.durationMs + ", value=" + this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.schemeIdUri);
        parcel.writeString(this.value);
        parcel.writeLong(this.durationMs);
        parcel.writeLong(this.id);
        parcel.writeByteArray(this.messageData);
    }
}
