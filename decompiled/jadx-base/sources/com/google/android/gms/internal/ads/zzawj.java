package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzawj extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzawk zza;

    zzawj(com.google.android.gms.internal.ads.zzawk zzawkVar) {
        this.zza = zzawkVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.zza.zzf();
    }
}
