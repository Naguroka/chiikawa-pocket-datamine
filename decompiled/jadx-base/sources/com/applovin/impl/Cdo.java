package com.applovin.impl;

/* JADX INFO: renamed from: com.applovin.impl.do, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class Cdo extends com.applovin.impl.sk {
    public static final android.os.Parcelable.Creator<com.applovin.impl.Cdo> CREATOR = new com.applovin.impl.Cdo.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f735a;
    public final long b;

    private Cdo(long j, long j2) {
        this.f735a = j;
        this.b = j2;
    }

    static com.applovin.impl.Cdo a(com.applovin.impl.ah ahVar, long j, com.applovin.impl.ho hoVar) {
        long jA = a(ahVar, j);
        return new com.applovin.impl.Cdo(jA, hoVar.b(jA));
    }

    /* synthetic */ Cdo(long j, long j2, com.applovin.impl.Cdo.a aVar) {
        this(j, j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.f735a);
        parcel.writeLong(this.b);
    }

    /* JADX INFO: renamed from: com.applovin.impl.do$a */
    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.Cdo[] newArray(int i) {
            return new com.applovin.impl.Cdo[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.Cdo createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.Cdo(parcel.readLong(), parcel.readLong(), null);
        }
    }

    static long a(com.applovin.impl.ah ahVar, long j) {
        long jW = ahVar.w();
        return (128 & jW) != 0 ? 8589934591L & ((((jW & 1) << 32) | ahVar.y()) + j) : androidx.media3.common.C.TIME_UNSET;
    }
}
