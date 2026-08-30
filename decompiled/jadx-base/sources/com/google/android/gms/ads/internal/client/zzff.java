package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzff implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzfg zza;

    zzff(com.google.android.gms.ads.internal.client.zzfg zzfgVar) {
        this.zza = zzfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.client.zzfi zzfiVar = this.zza.zza;
        if (zzfiVar.zza != null) {
            try {
                zzfiVar.zza.zze(1);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onAdFailedToLoad event.", e);
            }
        }
    }
}
