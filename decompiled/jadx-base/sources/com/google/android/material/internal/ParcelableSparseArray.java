package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class ParcelableSparseArray extends android.util.SparseArray<android.os.Parcelable> implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.material.internal.ParcelableSparseArray> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.internal.ParcelableSparseArray>() { // from class: com.google.android.material.internal.ParcelableSparseArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public com.google.android.material.internal.ParcelableSparseArray createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            return new com.google.android.material.internal.ParcelableSparseArray(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.internal.ParcelableSparseArray createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.material.internal.ParcelableSparseArray(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.internal.ParcelableSparseArray[] newArray(int i) {
            return new com.google.android.material.internal.ParcelableSparseArray[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableSparseArray() {
    }

    public ParcelableSparseArray(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        android.os.Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int i2 = 0; i2 < i; i2++) {
            put(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        android.os.Parcelable[] parcelableArr = new android.os.Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
