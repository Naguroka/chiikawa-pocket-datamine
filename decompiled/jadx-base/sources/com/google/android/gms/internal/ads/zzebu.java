package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzebu extends java.util.TimerTask {
    final /* synthetic */ android.app.AlertDialog zza;
    final /* synthetic */ java.util.Timer zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zzc;

    zzebu(com.google.android.gms.internal.ads.zzebv zzebvVar, android.app.AlertDialog alertDialog, java.util.Timer timer, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza = alertDialog;
        this.zzb = timer;
        this.zzc = zzmVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.zza.dismiss();
        this.zzb.cancel();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzc;
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}
