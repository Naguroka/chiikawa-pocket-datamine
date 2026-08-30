package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzt extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzt(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzn(com.google.android.gms.common.data.DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode != 0) {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, statusCode);
            dataHolder.close();
            return;
        }
        com.google.android.gms.games.snapshot.SnapshotMetadataBuffer snapshotMetadataBuffer = new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer(dataHolder);
        try {
            com.google.android.gms.games.snapshot.SnapshotMetadataEntity snapshotMetadataEntity = snapshotMetadataBuffer.getCount() > 0 ? new com.google.android.gms.games.snapshot.SnapshotMetadataEntity(snapshotMetadataBuffer.get(0)) : null;
            snapshotMetadataBuffer.close();
            this.zza.setResult(snapshotMetadataEntity);
        } catch (java.lang.Throwable th) {
            try {
                snapshotMetadataBuffer.close();
            } catch (java.lang.Throwable th2) {
                try {
                    java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                } catch (java.lang.Exception unused) {
                }
            }
            throw th;
        }
    }
}
