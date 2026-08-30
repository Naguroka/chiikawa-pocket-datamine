package com.google.android.gms.internal.appset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzo extends com.google.android.gms.internal.appset.zze {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzo(com.google.android.gms.internal.appset.zzp zzpVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(com.google.android.gms.common.api.Status status, com.google.android.gms.appset.zzc zzcVar) {
        com.google.android.gms.common.api.internal.TaskUtil.setResultOrApiException(status, zzcVar != null ? new com.google.android.gms.appset.AppSetIdInfo(zzcVar.zzb(), zzcVar.zza()) : null, this.zza);
    }
}
