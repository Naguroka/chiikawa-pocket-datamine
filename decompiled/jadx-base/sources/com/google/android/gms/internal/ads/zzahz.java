package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzahz {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final com.google.android.gms.internal.ads.zzdy zzf;
    private final com.google.android.gms.internal.ads.zzdy zzg;
    private int zzh;
    private int zzi;

    public zzahz(com.google.android.gms.internal.ads.zzdy zzdyVar, com.google.android.gms.internal.ads.zzdy zzdyVar2, boolean z) throws com.google.android.gms.internal.ads.zzbc {
        this.zzg = zzdyVar;
        this.zzf = zzdyVar2;
        this.zze = z;
        zzdyVar2.zzL(12);
        this.zza = zzdyVar2.zzp();
        zzdyVar.zzL(12);
        this.zzi = zzdyVar.zzp();
        com.google.android.gms.internal.ads.zzacr.zzb(zzdyVar.zzg() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzw() : this.zzf.zzu();
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzp();
            this.zzg.zzM(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + this.zzg.zzp() : -1;
        }
        return true;
    }
}
