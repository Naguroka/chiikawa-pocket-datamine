package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzac extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzac(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzr(com.google.android.gms.common.data.DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        boolean z = statusCode == 3;
        if (statusCode == 0 || z) {
            this.zza.setResult(new com.google.android.gms.games.AnnotatedData(new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer(dataHolder), z));
        } else {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, statusCode);
            dataHolder.close();
        }
    }
}
