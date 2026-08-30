package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzle extends com.google.android.gms.internal.measurement.zzlg {
    private int zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzle(byte[] bArr, int i, int i2, boolean z, com.google.android.gms.internal.measurement.zzlf zzlfVar) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i) throws com.google.android.gms.internal.measurement.zzmm {
        int i2 = this.zzd;
        this.zzd = 0;
        int i3 = this.zzb + this.zzc;
        this.zzb = i3;
        if (i3 > 0) {
            this.zzc = i3;
            this.zzb = i3 - i3;
        } else {
            this.zzc = 0;
        }
        return i2;
    }
}
