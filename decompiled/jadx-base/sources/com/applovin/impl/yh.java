package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class yh extends com.applovin.impl.sk {
    public static final android.os.Parcelable.Creator<com.applovin.impl.yh> CREATOR = new com.applovin.impl.yh.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1543a;
    public final long b;
    public final byte[] c;

    private yh(long j, byte[] bArr, long j2) {
        this.f1543a = j2;
        this.b = j;
        this.c = bArr;
    }

    static com.applovin.impl.yh a(com.applovin.impl.ah ahVar, int i, long j) {
        long jY = ahVar.y();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        ahVar.a(bArr, 0, i2);
        return new com.applovin.impl.yh(jY, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeLong(this.f1543a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    class a implements android.os.Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.yh[] newArray(int i) {
            return new com.applovin.impl.yh[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.applovin.impl.yh createFromParcel(android.os.Parcel parcel) {
            return new com.applovin.impl.yh(parcel, null);
        }
    }

    private yh(android.os.Parcel parcel) {
        this.f1543a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = (byte[]) com.applovin.impl.xp.a((java.lang.Object) parcel.createByteArray());
    }

    /* synthetic */ yh(android.os.Parcel parcel, com.applovin.impl.yh.a aVar) {
        this(parcel);
    }
}
