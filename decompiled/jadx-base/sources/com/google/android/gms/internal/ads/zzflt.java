package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzflt extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzflu zza;

    zzflt(com.google.android.gms.internal.ads.zzflu zzfluVar) {
        this.zza = zzfluVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            com.google.android.gms.internal.ads.zzflu zzfluVar = this.zza;
            zzfluVar.zzd(true, zzfluVar.zzd);
            this.zza.zzc = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            com.google.android.gms.internal.ads.zzflu zzfluVar2 = this.zza;
            zzfluVar2.zzd(false, zzfluVar2.zzd);
            this.zza.zzc = false;
        }
    }
}
