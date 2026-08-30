package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaw implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.content.Context zza;

    zzaw(com.google.android.gms.ads.internal.util.zzax zzaxVar, android.content.Context context) {
        this.zza = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzs.zzU(this.zza, android.net.Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
