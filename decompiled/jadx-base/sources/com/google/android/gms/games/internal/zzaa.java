package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaa extends com.google.android.gms.games.internal.zza {
    final /* synthetic */ com.google.android.gms.games.internal.zzak zza;
    private final com.google.android.gms.tasks.TaskCompletionSource zzb;

    zzaa(com.google.android.gms.games.internal.zzak zzakVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = zzakVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzf(com.google.android.gms.common.data.DataHolder dataHolder, com.google.android.gms.common.data.DataHolder dataHolder2) {
        int statusCode = dataHolder2.getStatusCode();
        boolean z = statusCode == 3;
        if (statusCode == 10003) {
            com.google.android.gms.games.internal.zzak.zzq(this.zza, this.zzb);
            dataHolder.close();
            dataHolder2.close();
            return;
        }
        if (statusCode != 0 && !z) {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zzb, statusCode);
            dataHolder.close();
            dataHolder2.close();
            return;
        }
        com.google.android.gms.games.leaderboard.LeaderboardBuffer leaderboardBuffer = new com.google.android.gms.games.leaderboard.LeaderboardBuffer(dataHolder);
        try {
            com.google.android.gms.games.leaderboard.Leaderboard leaderboardFreeze = leaderboardBuffer.getCount() > 0 ? leaderboardBuffer.get(0).freeze() : null;
            leaderboardBuffer.close();
            this.zzb.setResult(new com.google.android.gms.games.AnnotatedData(new com.google.android.gms.games.LeaderboardsClient.LeaderboardScores(leaderboardFreeze, new com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer(dataHolder2)), z));
        } catch (java.lang.Throwable th) {
            try {
                leaderboardBuffer.close();
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
