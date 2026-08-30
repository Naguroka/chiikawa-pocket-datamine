package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbrx implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbrz zza;

    zzbrx(com.google.android.gms.internal.ads.zzbrz zzbrzVar) {
        this.zza = zzbrzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        com.google.android.gms.internal.ads.zzbrz zzbrzVar = this.zza;
        android.content.Intent intentZzb = zzbrzVar.zzb();
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzs.zzT(zzbrzVar.zzb, intentZzb);
    }
}
