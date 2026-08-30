package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzam extends com.google.android.gms.location.zzao {
    private final com.google.android.gms.location.zzan zza;

    public zzam(com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> taskCompletionSource, com.google.android.gms.location.zzan zzanVar) {
        super(taskCompletionSource);
        this.zza = zzanVar;
    }

    @Override // com.google.android.gms.location.zzao, com.google.android.gms.internal.location.zzai
    public final void zzc() {
        this.zza.zza();
    }
}
