package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzawl implements android.app.AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzawm zza;

    zzawl(com.google.android.gms.internal.ads.zzawm zzawmVar) {
        this.zza = zzawmVar;
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(java.lang.String str, int i, java.lang.String str2, boolean z) {
        if (z) {
            this.zza.zzb = java.lang.System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        com.google.android.gms.internal.ads.zzawm zzawmVar = this.zza;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (zzawmVar.zzc > 0) {
            com.google.android.gms.internal.ads.zzawm zzawmVar2 = this.zza;
            if (jCurrentTimeMillis >= zzawmVar2.zzc) {
                zzawmVar2.zzd = jCurrentTimeMillis - zzawmVar2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
