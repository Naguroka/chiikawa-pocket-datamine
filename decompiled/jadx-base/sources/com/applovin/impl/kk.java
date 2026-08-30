package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class kk implements com.applovin.impl.af.b {
    public static final android.os.Parcelable.Creator<com.applovin.impl.kk> CREATOR = new com.applovin.impl.kk.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f964a;
    public final int b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "smta: captureFrameRate=" + this.f964a + ", svcTemporalLayerCount=" + this.b;
    }

    public kk(float f, int i) {
        this.f964a = f;
        this.b = i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.kk.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.kk kkVar = (com.applovin.impl.kk) obj;
        return this.f964a == kkVar.f964a && this.b == kkVar.b;
    }

    public int hashCode() {
        return ((com.applovin.impl.c9.a(this.f964a) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeFloat(this.f964a);
        parcel.writeInt(this.b);
    }

    private kk(android.os.Parcel parcel) {
        this.f964a = parcel.readFloat();
        this.b = parcel.readInt();
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.kk[] newArray(int i) {
            return new com.applovin.impl.kk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.kk createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.kk(parcel, (com.applovin.impl.kk.a) null);
        }
    }

    /* synthetic */ kk(android.os.Parcel parcel, com.applovin.impl.kk.a aVar) {
        this(parcel);
    }
}
