package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class ParcelableSparseIntArray extends android.util.SparseIntArray implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.internal.ParcelableSparseIntArray> CREATOR = new android.os.Parcelable.Creator<com.google.android.material.internal.ParcelableSparseIntArray>() { // from class: com.google.android.material.internal.ParcelableSparseIntArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.internal.ParcelableSparseIntArray createFromParcel(android.os.Parcel parcel) {
            int i = parcel.readInt();
            com.google.android.material.internal.ParcelableSparseIntArray parcelableSparseIntArray = new com.google.android.material.internal.ParcelableSparseIntArray(i);
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            parcel.readIntArray(iArr);
            parcel.readIntArray(iArr2);
            for (int i2 = 0; i2 < i; i2++) {
                parcelableSparseIntArray.put(iArr[i2], iArr2[i2]);
            }
            return parcelableSparseIntArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.internal.ParcelableSparseIntArray[] newArray(int i) {
            return new com.google.android.material.internal.ParcelableSparseIntArray[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableSparseIntArray() {
    }

    public ParcelableSparseIntArray(int i) {
        super(i);
    }

    public ParcelableSparseIntArray(android.util.SparseIntArray sparseIntArray) {
        for (int i = 0; i < sparseIntArray.size(); i++) {
            put(sparseIntArray.keyAt(i), sparseIntArray.valueAt(i));
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int[] iArr = new int[size()];
        int[] iArr2 = new int[size()];
        for (int i2 = 0; i2 < size(); i2++) {
            iArr[i2] = keyAt(i2);
            iArr2[i2] = valueAt(i2);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(iArr);
        parcel.writeIntArray(iArr2);
    }
}
