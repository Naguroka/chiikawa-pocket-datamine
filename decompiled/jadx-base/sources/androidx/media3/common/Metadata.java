package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public final class Metadata implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.media3.common.Metadata> CREATOR = new android.os.Parcelable.Creator<androidx.media3.common.Metadata>() { // from class: androidx.media3.common.Metadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.Metadata createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.common.Metadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.common.Metadata[] newArray(int i) {
            return new androidx.media3.common.Metadata[i];
        }
    };
    private final androidx.media3.common.Metadata.Entry[] entries;
    public final long presentationTimeUs;

    public interface Entry extends android.os.Parcelable {
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        default androidx.media3.common.Format getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(androidx.media3.common.MediaMetadata.Builder builder) {
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Metadata(androidx.media3.common.Metadata.Entry... entryArr) {
        this(androidx.media3.common.C.TIME_UNSET, entryArr);
    }

    public Metadata(long j, androidx.media3.common.Metadata.Entry... entryArr) {
        this.presentationTimeUs = j;
        this.entries = entryArr;
    }

    public Metadata(java.util.List<? extends androidx.media3.common.Metadata.Entry> list) {
        this((androidx.media3.common.Metadata.Entry[]) list.toArray(new androidx.media3.common.Metadata.Entry[0]));
    }

    public Metadata(long j, java.util.List<? extends androidx.media3.common.Metadata.Entry> list) {
        this(j, (androidx.media3.common.Metadata.Entry[]) list.toArray(new androidx.media3.common.Metadata.Entry[0]));
    }

    Metadata(android.os.Parcel parcel) {
        this.entries = new androidx.media3.common.Metadata.Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            androidx.media3.common.Metadata.Entry[] entryArr = this.entries;
            if (i < entryArr.length) {
                entryArr[i] = (androidx.media3.common.Metadata.Entry) parcel.readParcelable(androidx.media3.common.Metadata.Entry.class.getClassLoader());
                i++;
            } else {
                this.presentationTimeUs = parcel.readLong();
                return;
            }
        }
    }

    public int length() {
        return this.entries.length;
    }

    public androidx.media3.common.Metadata.Entry get(int i) {
        return this.entries[i];
    }

    public androidx.media3.common.Metadata copyWithAppendedEntriesFrom(androidx.media3.common.Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public androidx.media3.common.Metadata copyWithAppendedEntries(androidx.media3.common.Metadata.Entry... entryArr) {
        return entryArr.length == 0 ? this : new androidx.media3.common.Metadata(this.presentationTimeUs, (androidx.media3.common.Metadata.Entry[]) androidx.media3.common.util.Util.nullSafeArrayConcatenation(this.entries, entryArr));
    }

    public androidx.media3.common.Metadata copyWithPresentationTimeUs(long j) {
        return this.presentationTimeUs == j ? this : new androidx.media3.common.Metadata(j, this.entries);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.common.Metadata metadata = (androidx.media3.common.Metadata) obj;
        return java.util.Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs;
    }

    public int hashCode() {
        return (java.util.Arrays.hashCode(this.entries) * 31) + com.google.common.primitives.Longs.hashCode(this.presentationTimeUs);
    }

    public java.lang.String toString() {
        return "entries=" + java.util.Arrays.toString(this.entries) + (this.presentationTimeUs == androidx.media3.common.C.TIME_UNSET ? "" : ", presentationTimeUs=" + this.presentationTimeUs);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.entries.length);
        for (androidx.media3.common.Metadata.Entry entry : this.entries) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.presentationTimeUs);
    }
}
