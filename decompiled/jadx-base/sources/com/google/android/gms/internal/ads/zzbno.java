package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbno implements com.google.android.gms.internal.ads.zzcad {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbnm zza;

    zzbno(com.google.android.gms.internal.ads.zzbnr zzbnrVar, com.google.android.gms.internal.ads.zzbnm zzbnmVar) {
        this.zza = zzbnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcad
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzhB)).booleanValue()) {
            this.zza.zzh(new java.lang.IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
