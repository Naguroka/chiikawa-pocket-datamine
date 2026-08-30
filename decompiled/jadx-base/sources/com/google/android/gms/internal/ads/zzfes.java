package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfes {
    private final com.google.android.gms.internal.ads.zzfdw zza;
    private final com.google.android.gms.internal.ads.zzfeq zzb;
    private final com.google.android.gms.internal.ads.zzfds zzc;
    private com.google.android.gms.internal.ads.zzfey zze;
    private int zzf = 1;
    private final java.util.ArrayDeque zzd = new java.util.ArrayDeque();

    public zzfes(com.google.android.gms.internal.ads.zzfdw zzfdwVar, com.google.android.gms.internal.ads.zzfds zzfdsVar, com.google.android.gms.internal.ads.zzfeq zzfeqVar) {
        this.zza = zzfdwVar;
        this.zzc = zzfdsVar;
        this.zzb = zzfeqVar;
        zzfdsVar.zzb(new com.google.android.gms.internal.ads.zzfen(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzh() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzge)).booleanValue() && !com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zzh()) {
            this.zzd.clear();
            return;
        }
        if (zzi()) {
            while (!this.zzd.isEmpty()) {
                com.google.android.gms.internal.ads.zzfer zzferVar = (com.google.android.gms.internal.ads.zzfer) this.zzd.pollFirst();
                if (zzferVar == null || (zzferVar.zza() != null && this.zza.zze(zzferVar.zza()))) {
                    com.google.android.gms.internal.ads.zzfey zzfeyVar = new com.google.android.gms.internal.ads.zzfey(this.zza, this.zzb, zzferVar);
                    this.zze = zzfeyVar;
                    zzfeyVar.zzd(new com.google.android.gms.internal.ads.zzfeo(this, zzferVar));
                    return;
                }
            }
        }
    }

    private final synchronized boolean zzi() {
        return this.zze == null;
    }

    public final synchronized com.google.common.util.concurrent.ListenableFuture zza(com.google.android.gms.internal.ads.zzfer zzferVar) {
        this.zzf = 2;
        if (zzi()) {
            return null;
        }
        return this.zze.zza(zzferVar);
    }

    public final synchronized void zze(com.google.android.gms.internal.ads.zzfer zzferVar) {
        this.zzd.add(zzferVar);
    }

    final /* synthetic */ void zzf() {
        synchronized (this) {
            this.zzf = 1;
            zzh();
        }
    }
}
