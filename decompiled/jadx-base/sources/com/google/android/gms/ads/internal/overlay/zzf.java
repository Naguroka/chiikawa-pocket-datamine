package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzf implements android.view.View.OnClickListener {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zza;

    zzf(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zza;
        zzmVar.zzn = 2;
        zzmVar.zzb.finish();
    }
}
