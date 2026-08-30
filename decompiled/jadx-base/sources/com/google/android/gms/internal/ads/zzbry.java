package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbry implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrz zza;

    zzbry(com.google.android.gms.internal.ads.zzbrz zzbrzVar) {
        this.zza = zzbrzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.zzh("Operation denied by user.");
    }
}
