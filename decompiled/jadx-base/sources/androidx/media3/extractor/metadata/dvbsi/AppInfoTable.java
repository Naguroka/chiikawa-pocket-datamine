package androidx.media3.extractor.metadata.dvbsi;

/* JADX INFO: loaded from: classes.dex */
public final class AppInfoTable implements androidx.media3.common.Metadata.Entry {
    public static final int CONTROL_CODE_AUTOSTART = 1;
    public static final int CONTROL_CODE_PRESENT = 2;
    public static final android.os.Parcelable.Creator<androidx.media3.extractor.metadata.dvbsi.AppInfoTable> CREATOR = new android.os.Parcelable.Creator<androidx.media3.extractor.metadata.dvbsi.AppInfoTable>() { // from class: androidx.media3.extractor.metadata.dvbsi.AppInfoTable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.dvbsi.AppInfoTable createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.extractor.metadata.dvbsi.AppInfoTable(parcel.readInt(), (java.lang.String) androidx.media3.common.util.Assertions.checkNotNull(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.extractor.metadata.dvbsi.AppInfoTable[] newArray(int i) {
            return new androidx.media3.extractor.metadata.dvbsi.AppInfoTable[i];
        }
    };
    public final int controlCode;
    public final java.lang.String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppInfoTable(int i, java.lang.String str) {
        this.controlCode = i;
        this.url = str;
    }

    public java.lang.String toString() {
        return "Ait(controlCode=" + this.controlCode + ",url=" + this.url + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.url);
        parcel.writeInt(this.controlCode);
    }
}
