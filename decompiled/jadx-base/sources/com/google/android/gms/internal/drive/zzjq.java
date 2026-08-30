package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzjq extends com.google.android.gms.internal.drive.zzjo {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzoc;
    private int zzod;
    private int zzoe;
    private int zzof;

    private zzjq(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzof = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzoe = i;
        this.zzoc = z;
    }

    @Override // com.google.android.gms.internal.drive.zzjo
    public final int zzv(int i) throws com.google.android.gms.internal.drive.zzkq {
        if (i < 0) {
            throw com.google.android.gms.internal.drive.zzkq.zzdj();
        }
        int iZzbz = i + zzbz();
        int i2 = this.zzof;
        if (iZzbz > i2) {
            throw com.google.android.gms.internal.drive.zzkq.zzdi();
        }
        this.zzof = iZzbz;
        int i3 = this.limit + this.zzod;
        this.limit = i3;
        int i4 = i3 - this.zzoe;
        if (i4 > iZzbz) {
            int i5 = i4 - iZzbz;
            this.zzod = i5;
            this.limit = i3 - i5;
        } else {
            this.zzod = 0;
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.drive.zzjo
    public final int zzbz() {
        return this.pos - this.zzoe;
    }
}
