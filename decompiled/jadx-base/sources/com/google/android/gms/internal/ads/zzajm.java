package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzajm {
    private final com.google.android.gms.internal.ads.zzajn zza = new com.google.android.gms.internal.ads.zzajn();
    private final com.google.android.gms.internal.ads.zzdy zzb = new com.google.android.gms.internal.ads.zzdy(new byte[androidx.media3.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzajm() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            com.google.android.gms.internal.ads.zzajn zzajnVar = this.zza;
            if (i5 >= zzajnVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzajnVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final com.google.android.gms.internal.ads.zzdy zza() {
        return this.zzb;
    }

    public final com.google.android.gms.internal.ads.zzajn zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzI(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzb;
        if (zzdyVar.zzN().length == 65025) {
            return;
        }
        zzdyVar.zzJ(java.util.Arrays.copyOf(zzdyVar.zzN(), java.lang.Math.max(androidx.media3.extractor.ogg.OggPageHeader.MAX_PAGE_PAYLOAD, zzdyVar.zze())), this.zzb.zze());
    }

    public final boolean zze(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzI(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzacoVar, -1L) || !this.zza.zzb(zzacoVar, true)) {
                    return false;
                }
                com.google.android.gms.internal.ads.zzajn zzajnVar = this.zza;
                int iZzf = zzajnVar.zzd;
                if ((zzajnVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    iZzf += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!com.google.android.gms.internal.ads.zzacr.zze(zzacoVar, iZzf)) {
                    return false;
                }
                this.zzc = i;
            }
            int iZzf2 = zzf(i);
            int i2 = this.zzc + this.zzd;
            if (iZzf2 > 0) {
                com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzb;
                zzdyVar.zzF(zzdyVar.zze() + iZzf2);
                com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzb;
                if (!com.google.android.gms.internal.ads.zzacr.zzd(zzacoVar, zzdyVar2.zzN(), zzdyVar2.zze(), iZzf2)) {
                    return false;
                }
                com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zzb;
                zzdyVar3.zzK(zzdyVar3.zze() + iZzf2);
                this.zze = this.zza.zzf[i2 + (-1)] != 255;
            }
            if (i2 == this.zza.zzc) {
                i2 = -1;
            }
            this.zzc = i2;
        }
    }
}
