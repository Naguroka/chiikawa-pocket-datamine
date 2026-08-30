package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzol extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzon zza;

    /* synthetic */ zzol(com.google.android.gms.internal.ads.zzon zzonVar, com.google.android.gms.internal.ads.zzom zzomVar) {
        this.zza = zzonVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        com.google.android.gms.internal.ads.zzon zzonVar = this.zza;
        zzonVar.zzj(com.google.android.gms.internal.ads.zzoi.zzd(context, intent, zzonVar.zzh, zzonVar.zzg));
    }
}
