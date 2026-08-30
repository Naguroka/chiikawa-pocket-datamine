package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaj extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzaj(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzo(com.google.android.gms.common.data.DataHolder dataHolder, java.lang.String str, com.google.android.gms.drive.Contents contents, com.google.android.gms.drive.Contents contents2, com.google.android.gms.drive.Contents contents3) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.games.snapshot.SnapshotMetadataBuffer snapshotMetadataBuffer = new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer(dataHolder);
        try {
            if (snapshotMetadataBuffer.getCount() >= 2 && str != null && contents3 != null) {
                com.google.android.gms.games.snapshot.SnapshotEntity snapshotEntity = new com.google.android.gms.games.snapshot.SnapshotEntity(new com.google.android.gms.games.snapshot.SnapshotMetadataEntity(snapshotMetadataBuffer.get(0)), new com.google.android.gms.games.snapshot.SnapshotContentsEntity(contents));
                com.google.android.gms.games.snapshot.SnapshotEntity snapshotEntity2 = new com.google.android.gms.games.snapshot.SnapshotEntity(new com.google.android.gms.games.snapshot.SnapshotMetadataEntity(snapshotMetadataBuffer.get(1)), new com.google.android.gms.games.snapshot.SnapshotContentsEntity(contents2));
                snapshotMetadataBuffer.close();
                this.zza.setResult(new com.google.android.gms.games.SnapshotsClient.DataOrConflict(null, new com.google.android.gms.games.SnapshotsClient.SnapshotConflict(snapshotEntity, str, snapshotEntity2, new com.google.android.gms.games.snapshot.SnapshotContentsEntity(contents3))));
                return;
            }
            this.zza.setResult(null);
            snapshotMetadataBuffer.close();
        } catch (java.lang.Throwable th) {
            try {
                snapshotMetadataBuffer.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzq(com.google.android.gms.common.data.DataHolder dataHolder, com.google.android.gms.drive.Contents contents) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        int statusCode = dataHolder.getStatusCode();
        com.google.android.gms.games.snapshot.SnapshotMetadataBuffer snapshotMetadataBuffer = new com.google.android.gms.games.snapshot.SnapshotMetadataBuffer(dataHolder);
        try {
            com.google.android.gms.games.snapshot.SnapshotEntity snapshotEntity = snapshotMetadataBuffer.getCount() > 0 ? new com.google.android.gms.games.snapshot.SnapshotEntity(new com.google.android.gms.games.snapshot.SnapshotMetadataEntity(snapshotMetadataBuffer.get(0)), new com.google.android.gms.games.snapshot.SnapshotContentsEntity(contents)) : null;
            snapshotMetadataBuffer.close();
            if (statusCode == 0) {
                this.zza.setResult(new com.google.android.gms.games.SnapshotsClient.DataOrConflict(snapshotEntity, null));
                return;
            }
            if (statusCode == 4002) {
                if (snapshotEntity != null && snapshotEntity.getMetadata() != null) {
                    this.zza.setException(new com.google.android.gms.games.SnapshotsClient.SnapshotContentUnavailableApiException(com.google.android.gms.games.GamesStatusCodes.zza(4002), snapshotEntity.getMetadata()));
                    return;
                }
                statusCode = 4002;
            }
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, statusCode);
        } catch (java.lang.Throwable th) {
            try {
                snapshotMetadataBuffer.close();
            } catch (java.lang.Throwable th2) {
                java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }
}
