package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0661Dy {
    public final int A00;
    public final long A01;

    public C0661Dy(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public /* synthetic */ C0661Dy(int i, long j, com.facebook.ads.redexgen.core.C0660Dx c0660Dx) {
        this(i, j);
    }

    public static com.facebook.ads.redexgen.core.C0661Dy A00(android.os.Parcel parcel) {
        return new com.facebook.ads.redexgen.core.C0661Dy(parcel.readInt(), parcel.readLong());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02(android.os.Parcel parcel) {
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }
}
