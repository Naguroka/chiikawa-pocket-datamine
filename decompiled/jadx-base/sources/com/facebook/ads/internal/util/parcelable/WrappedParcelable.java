package com.facebook.ads.internal.util.parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class WrappedParcelable implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.util.parcelable.WrappedParcelable> CREATOR = new android.os.Parcelable.Creator<com.facebook.ads.internal.util.parcelable.WrappedParcelable>() { // from class: com.facebook.ads.internal.util.parcelable.WrappedParcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.ads.internal.util.parcelable.WrappedParcelable createFromParcel(android.os.Parcel parcel) {
            return new com.facebook.ads.internal.util.parcelable.WrappedParcelable(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.facebook.ads.internal.util.parcelable.WrappedParcelable[] newArray(int i) {
            return new com.facebook.ads.internal.util.parcelable.WrappedParcelable[i];
        }
    };
    private final byte[] mParcelableBytes;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected WrappedParcelable(android.os.Parcel parcel) {
        this.mParcelableBytes = parcel.createByteArray();
    }

    public WrappedParcelable(android.os.Parcelable parcelable) {
        this.mParcelableBytes = marshallParcelable(parcelable);
    }

    public WrappedParcelable(byte[] bArr) {
        this.mParcelableBytes = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeByteArray(this.mParcelableBytes);
    }

    public android.os.Parcelable unwrap(java.lang.ClassLoader classLoader) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        byte[] bArr = this.mParcelableBytes;
        if (bArr == null) {
            return null;
        }
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        android.os.Parcelable parcelable = parcelObtain.readParcelable(classLoader);
        parcelObtain.recycle();
        return parcelable;
    }

    public static byte[] marshallParcelable(android.os.Parcelable parcelable) {
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        parcelObtain.writeParcelable(parcelable, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
