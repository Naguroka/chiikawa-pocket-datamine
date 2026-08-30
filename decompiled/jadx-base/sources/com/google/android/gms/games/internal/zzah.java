package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzah extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzah(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzk(com.google.android.gms.common.data.DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        if (statusCode != 0 && statusCode != 5) {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, statusCode);
            dataHolder.close();
        } else {
            try {
                this.zza.setResult(new com.google.android.gms.games.leaderboard.ScoreSubmissionData(dataHolder));
            } finally {
                dataHolder.close();
            }
        }
    }
}
