package androidx.media3.extractor.metadata.id3;

/* JADX INFO: loaded from: classes.dex */
public abstract class Id3Frame implements androidx.media3.common.Metadata.Entry {
    public final java.lang.String id;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Id3Frame(java.lang.String str) {
        this.id = str;
    }

    public java.lang.String toString() {
        return this.id;
    }
}
