package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzad extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzad(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzi(com.google.android.gms.common.data.DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode != 0 && statusCode != 3) {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, statusCode);
            dataHolder.close();
            return;
        }
        com.google.android.gms.games.stats.PlayerStatsBuffer playerStatsBuffer = new com.google.android.gms.games.stats.PlayerStatsBuffer(dataHolder);
        try {
            com.google.android.gms.games.stats.PlayerStatsEntity playerStatsEntity = playerStatsBuffer.getCount() > 0 ? new com.google.android.gms.games.stats.PlayerStatsEntity(playerStatsBuffer.get(0)) : null;
            playerStatsBuffer.close();
            this.zza.setResult(new com.google.android.gms.games.AnnotatedData(playerStatsEntity, statusCode == 3));
        } catch (java.lang.Throwable th) {
            try {
                playerStatsBuffer.close();
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
