package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaf extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzaf(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzj(com.google.android.gms.common.data.DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode != 0 && statusCode != 3) {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, statusCode);
            dataHolder.close();
            return;
        }
        com.google.android.gms.games.PlayerBuffer playerBuffer = new com.google.android.gms.games.PlayerBuffer(dataHolder);
        try {
            com.google.android.gms.games.PlayerEntity playerEntity = playerBuffer.getCount() > 0 ? new com.google.android.gms.games.PlayerEntity(playerBuffer.get(0)) : null;
            playerBuffer.release();
            this.zza.setResult(new com.google.android.gms.games.AnnotatedData(playerEntity, statusCode == 3));
        } catch (java.lang.Throwable th) {
            playerBuffer.release();
            throw th;
        }
    }
}
