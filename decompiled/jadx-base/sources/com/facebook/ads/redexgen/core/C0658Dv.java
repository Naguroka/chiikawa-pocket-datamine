package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0658Dv {
    public final int A00;
    public final long A01;
    public final long A02;

    public C0658Dv(int i, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A01 = j2;
    }

    public /* synthetic */ C0658Dv(int i, long j, long j2, com.facebook.ads.redexgen.core.C0657Du c0657Du) {
        this(i, j, j2);
    }

    public static com.facebook.ads.redexgen.core.C0658Dv A00(android.os.Parcel parcel) {
        return new com.facebook.ads.redexgen.core.C0658Dv(parcel.readInt(), parcel.readLong(), parcel.readLong());
    }

    public final void A01(android.os.Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
    }
}
