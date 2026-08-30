package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbbf {
    private com.google.android.gms.internal.ads.zzbau zza;
    private boolean zzb;
    private final android.content.Context zzc;
    private final java.lang.Object zzd = new java.lang.Object();

    zzbbf(android.content.Context context) {
        this.zzc = context;
    }

    final java.util.concurrent.Future zzc(com.google.android.gms.internal.ads.zzbav zzbavVar) {
        com.google.android.gms.internal.ads.zzbaz zzbazVar = new com.google.android.gms.internal.ads.zzbaz(this);
        com.google.android.gms.internal.ads.zzbbd zzbbdVar = new com.google.android.gms.internal.ads.zzbbd(this, zzbavVar, zzbazVar);
        com.google.android.gms.internal.ads.zzbbe zzbbeVar = new com.google.android.gms.internal.ads.zzbbe(this, zzbazVar);
        synchronized (this.zzd) {
            com.google.android.gms.internal.ads.zzbau zzbauVar = new com.google.android.gms.internal.ads.zzbau(this.zzc, com.google.android.gms.ads.internal.zzv.zzu().zzb(), zzbbdVar, zzbbeVar);
            this.zza = zzbauVar;
            zzbauVar.checkAvailabilityAndConnect();
        }
        return zzbazVar;
    }

    static /* bridge */ /* synthetic */ void zze(com.google.android.gms.internal.ads.zzbbf zzbbfVar) {
        synchronized (zzbbfVar.zzd) {
            com.google.android.gms.internal.ads.zzbau zzbauVar = zzbbfVar.zza;
            if (zzbauVar == null) {
                return;
            }
            zzbauVar.disconnect();
            zzbbfVar.zza = null;
            android.os.Binder.flushPendingCommands();
        }
    }
}
