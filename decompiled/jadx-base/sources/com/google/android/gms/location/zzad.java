package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class zzad implements com.google.android.gms.common.api.internal.RemoteCall {
    static final com.google.android.gms.common.api.internal.RemoteCall zza = new com.google.android.gms.location.zzad();

    private zzad() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = com.google.android.gms.location.FusedLocationProviderClient.KEY_MOCK_LOCATION;
        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.internal.location.zzaz) obj).zzA());
    }
}
