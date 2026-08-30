package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzbu implements com.google.android.gms.common.api.internal.RemoteCall {
    static final com.google.android.gms.common.api.internal.RemoteCall zza = new com.google.android.gms.internal.nearby.zzbu();

    private zzbu() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(true);
    }
}
