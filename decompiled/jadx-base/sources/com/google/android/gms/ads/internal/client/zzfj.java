package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfk zza;

    zzfj(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        this.zza = zzfkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.client.zzfk zzfkVar = this.zza;
        if (zzfkVar.zza != null) {
            try {
                zzfkVar.zza.zze(1);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
