package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzalt {
    public java.lang.CharSequence zzc;
    public long zza = 0;
    public long zzb = 0;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    public final com.google.android.gms.internal.ads.zzcm zza() {
        android.text.Layout.Alignment alignment;
        float f = this.zzh;
        float f2 = -3.4028235E38f;
        if (f == -3.4028235E38f) {
            int i = this.zzd;
            if (i != 4) {
                f = i != 5 ? 0.5f : 1.0f;
            } else {
                f = 0.0f;
            }
        }
        int i2 = this.zzi;
        if (i2 == Integer.MIN_VALUE) {
            int i3 = this.zzd;
            if (i3 == 1) {
                i2 = 0;
            } else if (i3 == 3) {
                i2 = 2;
            } else if (i3 == 4) {
                i2 = 0;
            } else if (i3 != 5) {
                i2 = 1;
            } else {
                i2 = 2;
            }
        }
        com.google.android.gms.internal.ads.zzcm zzcmVar = new com.google.android.gms.internal.ads.zzcm();
        int i4 = this.zzd;
        if (i4 == 1) {
            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 == 2) {
            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        } else if (i4 == 3) {
            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i4 == 4) {
            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
        } else if (i4 != 5) {
            com.google.android.gms.internal.ads.zzdo.zzf("WebvttCueParser", "Unknown textAlignment: " + i4);
            alignment = null;
        } else {
            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
        zzcmVar.zzm(alignment);
        float f3 = this.zze;
        int i5 = this.zzf;
        if (f3 != -3.4028235E38f && i5 == 0 && (f3 < 0.0f || f3 > 1.0f)) {
            f2 = 1.0f;
        } else if (f3 != -3.4028235E38f) {
            f2 = f3;
        } else if (i5 == 0) {
            f2 = 1.0f;
        }
        zzcmVar.zze(f2, i5);
        zzcmVar.zzf(this.zzg);
        zzcmVar.zzh(f);
        zzcmVar.zzi(i2);
        float f4 = this.zzj;
        if (i2 == 0) {
            f = 1.0f - f;
        } else if (i2 != 1) {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(i2));
            }
        } else if (f <= 0.5f) {
            f += f;
        } else {
            float f5 = 1.0f - f;
            f = f5 + f5;
        }
        zzcmVar.zzk(java.lang.Math.min(f4, f));
        zzcmVar.zzo(this.zzk);
        java.lang.CharSequence charSequence = this.zzc;
        if (charSequence != null) {
            zzcmVar.zzl(charSequence);
        }
        return zzcmVar;
    }
}
