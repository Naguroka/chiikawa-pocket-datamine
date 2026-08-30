package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzm implements com.google.android.gms.tasks.OnFailureListener {
    final /* synthetic */ com.google.android.gms.common.api.GoogleApi zza;
    final /* synthetic */ com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zzb;
    final /* synthetic */ com.google.android.gms.internal.nearby.zzo zzc;

    zzm(com.google.android.gms.internal.nearby.zzo zzoVar, com.google.android.gms.common.api.GoogleApi googleApi, com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey listenerKey) {
        this.zzc = zzoVar;
        this.zza = googleApi;
        this.zzb = listenerKey;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        synchronized (this.zzc) {
            this.zzc.zzf(this.zza, this.zzb);
        }
    }
}
