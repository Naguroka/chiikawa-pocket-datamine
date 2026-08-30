package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzazb implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzazc zza;

    zzazb(com.google.android.gms.internal.ads.zzazc zzazcVar) {
        this.zza = zzazcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza.zzc) {
            com.google.android.gms.internal.ads.zzazc zzazcVar = this.zza;
            if (zzazcVar.zzd && zzazcVar.zze) {
                zzazcVar.zzd = false;
                com.google.android.gms.ads.internal.util.client.zzo.zze("App went background");
                java.util.Iterator it = this.zza.zzf.iterator();
                while (it.hasNext()) {
                    try {
                        ((com.google.android.gms.internal.ads.zzazd) it.next()).zza(false);
                    } catch (java.lang.Exception e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
                    }
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zze("App is still foreground");
            }
        }
    }
}
