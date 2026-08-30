package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzax implements java.lang.Runnable {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzax(com.google.android.gms.ads.internal.util.zzay zzayVar, android.content.Context context, java.lang.String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzq();
        android.app.AlertDialog.Builder builderZzL = com.google.android.gms.ads.internal.util.zzs.zzL(this.zza);
        builderZzL.setMessage(this.zzb);
        if (this.zzc) {
            builderZzL.setTitle("Error");
        } else {
            builderZzL.setTitle("Info");
        }
        if (this.zzd) {
            builderZzL.setNeutralButton("Dismiss", (android.content.DialogInterface.OnClickListener) null);
        } else {
            builderZzL.setPositiveButton("Learn More", new com.google.android.gms.ads.internal.util.zzaw(this, this.zza));
            builderZzL.setNegativeButton("Dismiss", (android.content.DialogInterface.OnClickListener) null);
        }
        builderZzL.create().show();
    }
}
