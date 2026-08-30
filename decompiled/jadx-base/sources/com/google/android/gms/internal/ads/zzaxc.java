package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaxc extends com.google.android.gms.internal.ads.zzaxr {
    private final com.google.android.gms.internal.ads.zzavg zzh;
    private final long zzi;
    private final long zzj;

    public zzaxc(com.google.android.gms.internal.ads.zzawd zzawdVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzasc zzascVar, int i, int i2, com.google.android.gms.internal.ads.zzavg zzavgVar, long j, long j2) {
        super(zzawdVar, "zUKUGG1J4yK7pnB9K1G7a+rMPaRfdLvCWmWciVr52bCNv8jFIuRDvr12EhyQDayB", "c80TveimhHTg47yq+ca1w6vXt+JXULmGO8Nz62+yMN8=", zzascVar, i, 11);
        this.zzh = zzavgVar;
        this.zzi = j;
        this.zzj = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzavg zzavgVar = this.zzh;
        if (zzavgVar != null) {
            com.google.android.gms.internal.ads.zzave zzaveVar = new com.google.android.gms.internal.ads.zzave((java.lang.String) this.zze.invoke(null, zzavgVar.zzb(), java.lang.Long.valueOf(this.zzi), java.lang.Long.valueOf(this.zzj)));
            synchronized (this.zzd) {
                this.zzd.zzz(zzaveVar.zza.longValue());
                if (zzaveVar.zzb.longValue() >= 0) {
                    this.zzd.zzQ(zzaveVar.zzb.longValue());
                }
                if (zzaveVar.zzc.longValue() >= 0) {
                    this.zzd.zzf(zzaveVar.zzc.longValue());
                }
            }
        }
    }
}
