package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class mf implements com.applovin.impl.af.b {
    public static final android.os.Parcelable.Creator<com.applovin.impl.mf> CREATOR = new com.applovin.impl.mf.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1069a;
    public final long b;
    public final long c;
    public final long d;
    public final long f;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f1069a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.f;
    }

    public mf(long j, long j2, long j3, long j4, long j5) {
        this.f1069a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.f = j5;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.mf.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.mf mfVar = (com.applovin.impl.mf) obj;
        return this.f1069a == mfVar.f1069a && this.b == mfVar.b && this.c == mfVar.c && this.d == mfVar.d && this.f == mfVar.f;
    }

    public int hashCode() {
        return ((((((((com.applovin.impl.rc.a(this.f1069a) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + com.applovin.impl.rc.a(this.b)) * 31) + com.applovin.impl.rc.a(this.c)) * 31) + com.applovin.impl.rc.a(this.d)) * 31) + com.applovin.impl.rc.a(this.f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.f1069a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.f);
    }

    private mf(android.os.Parcel parcel) {
        this.f1069a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.f = parcel.readLong();
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.mf[] newArray(int i) {
            return new com.applovin.impl.mf[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.mf createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.mf(parcel, null);
        }
    }

    /* synthetic */ mf(android.os.Parcel parcel, com.applovin.impl.mf.a aVar) {
        this(parcel);
    }
}
