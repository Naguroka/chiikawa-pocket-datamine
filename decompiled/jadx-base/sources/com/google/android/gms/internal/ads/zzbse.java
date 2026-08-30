package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbse implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbsf zza;

    zzbse(com.google.android.gms.internal.ads.zzbsf zzbsfVar) {
        this.zza = zzbsfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.zzh("User canceled the download.");
    }
}
