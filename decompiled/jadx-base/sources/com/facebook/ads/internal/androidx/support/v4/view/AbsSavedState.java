package com.facebook.ads.internal.androidx.support.v4.view;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbsSavedState implements android.os.Parcelable {
    public static byte[] A01;
    public static final com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState A02;
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState> CREATOR;
    public final android.os.Parcelable A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 106);
        }
        return new java.lang.String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{85, 83, 86, 67, 84, 117, 82, 71, 82, 67, 6, 75, 83, 85, 82, 6, 72, 73, 82, 6, 68, 67, 6, 72, 83, 74, 74};
    }

    static {
        A01();
        A02 = new com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState() { // from class: com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState.1
        };
        CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState>() { // from class: com.facebook.ads.redexgen.X.32
            public static byte[] A00;

            static {
                A03();
            }

            public static java.lang.String A02(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 78);
                }
                return new java.lang.String(bArrCopyOfRange);
            }

            public static void A03() {
                A00 = new byte[]{23, 25, 20, 9, 22, -9, 24, 5, 24, 9, -60, 17, 25, 23, 24, -60, 6, 9, -60, 18, 25, 16, 16};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState createFromParcel(android.os.Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
                android.os.Parcelable superState = parcel.readParcelable(classLoader);
                if (superState == null) {
                    return com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState.A02;
                }
                throw new java.lang.IllegalStateException(A02(0, 23, 86));
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
            public final com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState[] newArray(int i) {
                return new com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState[i];
            }
        };
    }

    public AbsSavedState() {
        this.A00 = null;
    }

    public AbsSavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable superState = parcel.readParcelable(classLoader);
        this.A00 = superState == null ? A02 : superState;
    }

    public AbsSavedState(android.os.Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A02 ? null : parcelable;
            return;
        }
        throw new java.lang.IllegalArgumentException(A00(0, 27, 76));
    }

    public final android.os.Parcelable A02() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
