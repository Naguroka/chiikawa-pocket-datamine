package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzbz implements com.google.android.gms.common.api.internal.RemoteCall {
    static final com.google.android.gms.common.api.internal.RemoteCall zza = new com.google.android.gms.internal.nearby.zzbz();

    private zzbz() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(java.lang.Object obj, java.lang.Object obj2) throws android.os.RemoteException {
        int i = com.google.android.gms.internal.nearby.zzcn.zza;
        ((com.google.android.gms.internal.nearby.zzbf) obj).zzu();
        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(true);
    }
}
