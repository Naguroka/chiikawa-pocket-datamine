package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzbi implements com.google.android.gms.tasks.OnSuccessListener {
    private final com.google.android.gms.internal.nearby.zzcn zza;

    zzbi(com.google.android.gms.internal.nearby.zzcn zzcnVar) {
        this.zza = zzcnVar;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(java.lang.Object obj) {
        this.zza.zzb((java.lang.Void) obj);
    }
}
