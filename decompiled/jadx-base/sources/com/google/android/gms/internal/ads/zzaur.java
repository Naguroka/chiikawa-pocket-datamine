package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaur implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzaus zza;

    zzaur(com.google.android.gms.internal.ads.zzaus zzausVar) {
        this.zza = zzausVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzo) {
            if (this.zza.zzp) {
                return;
            }
            this.zza.zzp = true;
            try {
                com.google.android.gms.internal.ads.zzaus.zzj(this.zza);
            } catch (java.lang.Exception e) {
                this.zza.zzh.zzc(com.json.mediationsdk.utils.IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, -1L, e);
            }
            synchronized (this.zza.zzo) {
                this.zza.zzp = false;
            }
        }
    }
}
