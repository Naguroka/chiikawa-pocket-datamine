package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzani {
    private final com.google.android.gms.internal.ads.zzamj zza;
    private final com.google.android.gms.internal.ads.zzef zzb;
    private final com.google.android.gms.internal.ads.zzdx zzc = new com.google.android.gms.internal.ads.zzdx(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzani(com.google.android.gms.internal.ads.zzamj zzamjVar, com.google.android.gms.internal.ads.zzef zzefVar) {
        this.zza = zzamjVar;
        this.zzb = zzefVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzbc {
        long jZzb;
        zzdyVar.zzH(this.zzc.zza, 0, 3);
        this.zzc.zzl(0);
        this.zzc.zzn(8);
        this.zzd = this.zzc.zzp();
        this.zze = this.zzc.zzp();
        this.zzc.zzn(6);
        com.google.android.gms.internal.ads.zzdx zzdxVar = this.zzc;
        zzdyVar.zzH(zzdxVar.zza, 0, zzdxVar.zzd(8));
        this.zzc.zzl(0);
        if (this.zzd) {
            this.zzc.zzn(4);
            long jZzd = this.zzc.zzd(3);
            this.zzc.zzn(1);
            int iZzd = this.zzc.zzd(15) << 15;
            this.zzc.zzn(1);
            long jZzd2 = this.zzc.zzd(15);
            this.zzc.zzn(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzn(4);
                long jZzd3 = ((long) this.zzc.zzd(3)) << 30;
                this.zzc.zzn(1);
                int iZzd2 = this.zzc.zzd(15) << 15;
                this.zzc.zzn(1);
                long jZzd4 = this.zzc.zzd(15);
                this.zzc.zzn(1);
                this.zzb.zzb(((long) iZzd2) | jZzd3 | jZzd4);
                this.zzf = true;
            }
            jZzb = this.zzb.zzb((jZzd << 30) | ((long) iZzd) | jZzd2);
        } else {
            jZzb = 0;
        }
        this.zza.zzd(jZzb, 4);
        this.zza.zza(zzdyVar);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
