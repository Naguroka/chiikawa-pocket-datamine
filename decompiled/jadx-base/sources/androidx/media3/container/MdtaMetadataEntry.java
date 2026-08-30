package androidx.media3.container;

/* JADX INFO: loaded from: classes.dex */
public final class MdtaMetadataEntry implements androidx.media3.common.Metadata.Entry {
    public static final android.os.Parcelable.Creator<androidx.media3.container.MdtaMetadataEntry> CREATOR = new android.os.Parcelable.Creator<androidx.media3.container.MdtaMetadataEntry>() { // from class: androidx.media3.container.MdtaMetadataEntry.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.MdtaMetadataEntry createFromParcel(android.os.Parcel parcel) {
            return new androidx.media3.container.MdtaMetadataEntry(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.media3.container.MdtaMetadataEntry[] newArray(int i) {
            return new androidx.media3.container.MdtaMetadataEntry[i];
        }
    };
    public static final int DEFAULT_LOCALE_INDICATOR = 0;
    public static final java.lang.String KEY_ANDROID_CAPTURE_FPS = "com.android.capture.fps";
    public static final int TYPE_INDICATOR_FLOAT32 = 23;
    public static final int TYPE_INDICATOR_INT32 = 67;
    public static final int TYPE_INDICATOR_STRING = 1;
    public final java.lang.String key;
    public final int localeIndicator;
    public final int typeIndicator;
    public final byte[] value;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MdtaMetadataEntry(java.lang.String str, byte[] bArr, int i) {
        this(str, bArr, 0, i);
    }

    public MdtaMetadataEntry(java.lang.String str, byte[] bArr, int i, int i2) {
        this.key = str;
        this.value = bArr;
        this.localeIndicator = i;
        this.typeIndicator = i2;
    }

    private MdtaMetadataEntry(android.os.Parcel parcel) {
        this.key = (java.lang.String) androidx.media3.common.util.Util.castNonNull(parcel.readString());
        this.value = (byte[]) androidx.media3.common.util.Util.castNonNull(parcel.createByteArray());
        this.localeIndicator = parcel.readInt();
        this.typeIndicator = parcel.readInt();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        androidx.media3.container.MdtaMetadataEntry mdtaMetadataEntry = (androidx.media3.container.MdtaMetadataEntry) obj;
        return this.key.equals(mdtaMetadataEntry.key) && java.util.Arrays.equals(this.value, mdtaMetadataEntry.value) && this.localeIndicator == mdtaMetadataEntry.localeIndicator && this.typeIndicator == mdtaMetadataEntry.typeIndicator;
    }

    public int hashCode() {
        return ((((((com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.key.hashCode()) * 31) + java.util.Arrays.hashCode(this.value)) * 31) + this.localeIndicator) * 31) + this.typeIndicator;
    }

    public java.lang.String toString() {
        java.lang.String strFromUtf8Bytes;
        int i = this.typeIndicator;
        if (i == 1) {
            strFromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(this.value);
        } else if (i == 23) {
            strFromUtf8Bytes = java.lang.String.valueOf(java.lang.Float.intBitsToFloat(com.google.common.primitives.Ints.fromByteArray(this.value)));
        } else if (i == 67) {
            strFromUtf8Bytes = java.lang.String.valueOf(com.google.common.primitives.Ints.fromByteArray(this.value));
        } else {
            strFromUtf8Bytes = androidx.media3.common.util.Util.toHexString(this.value);
        }
        return "mdta: key=" + this.key + ", value=" + strFromUtf8Bytes;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeByteArray(this.value);
        parcel.writeInt(this.localeIndicator);
        parcel.writeInt(this.typeIndicator);
    }
}
