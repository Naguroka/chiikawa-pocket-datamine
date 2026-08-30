package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzz extends com.google.android.gms.games.internal.zza {
    final /* synthetic */ com.google.android.gms.games.internal.zzak zza;
    private final com.google.android.gms.tasks.TaskCompletionSource zzb;

    zzz(com.google.android.gms.games.internal.zzak zzakVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = zzakVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzh(com.google.android.gms.common.data.DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        boolean z = statusCode == 3;
        if (statusCode == 10003) {
            com.google.android.gms.games.internal.zzak.zzq(this.zza, this.zzb);
            dataHolder.close();
            return;
        }
        if (statusCode != 0 && !z) {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zzb, statusCode);
            dataHolder.close();
            return;
        }
        com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer leaderboardScoreBuffer = new com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer(dataHolder);
        try {
            com.google.android.gms.games.leaderboard.LeaderboardScoreEntity leaderboardScoreEntity = leaderboardScoreBuffer.getCount() > 0 ? new com.google.android.gms.games.leaderboard.LeaderboardScoreEntity(leaderboardScoreBuffer.get(0)) : null;
            leaderboardScoreBuffer.close();
            this.zzb.setResult(new com.google.android.gms.games.AnnotatedData(leaderboardScoreEntity, z));
        } catch (java.lang.Throwable th) {
            try {
                leaderboardScoreBuffer.close();
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
