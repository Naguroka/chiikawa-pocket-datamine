package com.bytedance.adsdk.ugeno.Kg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bg implements android.os.Parcelable {
    private final android.os.Parcelable IL;
    public static final com.bytedance.adsdk.ugeno.Kg.bg bg = new com.bytedance.adsdk.ugeno.Kg.bg() { // from class: com.bytedance.adsdk.ugeno.Kg.bg.1
    };
    public static final android.os.Parcelable.Creator<com.bytedance.adsdk.ugeno.Kg.bg> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.bytedance.adsdk.ugeno.Kg.bg>() { // from class: com.bytedance.adsdk.ugeno.Kg.bg.2
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.adsdk.ugeno.Kg.bg createFromParcel(android.os.Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.adsdk.ugeno.Kg.bg createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new java.lang.IllegalStateException("superState must be null");
            }
            return com.bytedance.adsdk.ugeno.Kg.bg.bg;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: bg, reason: merged with bridge method [inline-methods] */
        public com.bytedance.adsdk.ugeno.Kg.bg[] newArray(int i) {
            return new com.bytedance.adsdk.ugeno.Kg.bg[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private bg() {
        this.IL = null;
    }

    protected bg(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            throw new java.lang.IllegalArgumentException("superState must not be null");
        }
        this.IL = parcelable == bg ? null : parcelable;
    }

    protected bg(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable parcelable = parcel.readParcelable(classLoader);
        this.IL = parcelable == null ? bg : parcelable;
    }

    public final android.os.Parcelable bg() {
        return this.IL;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.IL, i);
    }
}
