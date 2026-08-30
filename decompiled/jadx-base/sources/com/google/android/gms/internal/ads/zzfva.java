package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzfva extends com.google.android.gms.internal.ads.zzfts {
    final java.lang.CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    protected zzfva(com.google.android.gms.internal.ads.zzfvc zzfvcVar, java.lang.CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfts
    @javax.annotation.CheckForNull
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        int iZzc;
        int i = this.zzc;
        while (true) {
            int i2 = this.zzc;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i2);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zzc = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zzc = iZzc;
            }
            if (iZzc != i) {
                if (i < iZzd) {
                    this.zzb.charAt(i);
                }
                if (i < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                int i3 = this.zzd;
                if (i3 == 1) {
                    iZzd = this.zzb.length();
                    this.zzc = -1;
                    if (iZzd > i) {
                        this.zzb.charAt(iZzd - 1);
                    }
                } else {
                    this.zzd = i3 - 1;
                }
                return this.zzb.subSequence(i, iZzd).toString();
            }
            int i4 = iZzc + 1;
            this.zzc = i4;
            if (i4 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}
