package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcg implements com.google.android.gms.tasks.OnFailureListener {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.nearby.zzcn zzb;

    zzcg(com.google.android.gms.internal.nearby.zzcn zzcnVar, java.lang.String str) {
        this.zzb = zzcnVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        if ((exc instanceof com.google.android.gms.common.api.ApiException) && ((com.google.android.gms.common.api.ApiException) exc).getStatusCode() == 8003) {
            return;
        }
        this.zzb.zzg(this.zza);
    }
}
