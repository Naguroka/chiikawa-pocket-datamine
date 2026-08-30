package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzjk {
    private final byte[] buffer;
    private final com.google.android.gms.internal.drive.zzjr zznx;

    private zzjk(int i) {
        byte[] bArr = new byte[i];
        this.buffer = bArr;
        this.zznx = com.google.android.gms.internal.drive.zzjr.zzb(bArr);
    }

    public final com.google.android.gms.internal.drive.zzjc zzbx() {
        this.zznx.zzcb();
        return new com.google.android.gms.internal.drive.zzjm(this.buffer);
    }

    public final com.google.android.gms.internal.drive.zzjr zzby() {
        return this.zznx;
    }

    /* synthetic */ zzjk(int i, com.google.android.gms.internal.drive.zzjd zzjdVar) {
        this(i);
    }
}
