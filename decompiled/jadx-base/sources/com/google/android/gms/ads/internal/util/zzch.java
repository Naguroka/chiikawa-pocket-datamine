package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzch extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzci zza;

    zzch(com.google.android.gms.ads.internal.util.zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.zza.zze(context, intent);
    }
}
