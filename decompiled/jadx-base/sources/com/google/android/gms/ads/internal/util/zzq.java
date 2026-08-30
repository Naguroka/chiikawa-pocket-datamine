package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzq extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzs zza;

    /* synthetic */ zzq(com.google.android.gms.ads.internal.util.zzs zzsVar, com.google.android.gms.ads.internal.util.zzr zzrVar) {
        this.zza = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (java.util.Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.zza.zzf = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.zza.zzf = false;
        }
    }
}
