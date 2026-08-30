package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzz extends com.google.android.gms.internal.common.zzm {
    final java.lang.CharSequence zzb;
    final com.google.android.gms.internal.common.zzr zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    protected zzz(com.google.android.gms.internal.common.zzaa zzaaVar, java.lang.CharSequence charSequence) {
        this.zzc = zzaaVar.zza;
        this.zzd = zzaaVar.zzb;
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzm
    protected final /* bridge */ /* synthetic */ java.lang.Object zza() {
        int iZzc;
        int i = this.zze;
        while (true) {
            int i2 = this.zze;
            if (i2 == -1) {
                zzb();
                return null;
            }
            int iZzd = zzd(i2);
            if (iZzd == -1) {
                iZzd = this.zzb.length();
                this.zze = -1;
                iZzc = -1;
            } else {
                iZzc = zzc(iZzd);
                this.zze = iZzc;
            }
            if (iZzc == i) {
                int i3 = iZzc + 1;
                this.zze = i3;
                if (i3 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i < iZzd) {
                    this.zzb.charAt(i);
                }
                if (i < iZzd) {
                    this.zzb.charAt(iZzd - 1);
                }
                if (!this.zzd || i != iZzd) {
                    int i4 = this.zzf;
                    if (i4 == 1) {
                        iZzd = this.zzb.length();
                        this.zze = -1;
                        if (iZzd > i) {
                            this.zzb.charAt(iZzd - 1);
                        }
                    } else {
                        this.zzf = i4 - 1;
                    }
                    return this.zzb.subSequence(i, iZzd).toString();
                }
                i = this.zze;
            }
        }
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}
