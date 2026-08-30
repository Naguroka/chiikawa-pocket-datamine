package com.google.android.gms.games.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzy extends com.google.android.gms.games.internal.zza {
    private final com.google.android.gms.tasks.TaskCompletionSource zza;

    zzy(com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.games.internal.zza, com.google.android.gms.games.internal.zzam
    public final void zzg(com.google.android.gms.common.data.DataHolder dataHolder) {
        int statusCode = dataHolder.getStatusCode();
        boolean z = statusCode == 3;
        if (statusCode != 0 && !z) {
            com.google.android.gms.games.GamesStatusUtils.zza(this.zza, statusCode);
            dataHolder.close();
            return;
        }
        com.google.android.gms.games.leaderboard.LeaderboardBuffer leaderboardBuffer = new com.google.android.gms.games.leaderboard.LeaderboardBuffer(dataHolder);
        try {
            com.google.android.gms.games.leaderboard.Leaderboard leaderboardFreeze = leaderboardBuffer.getCount() > 0 ? leaderboardBuffer.get(0).freeze() : null;
            leaderboardBuffer.close();
            this.zza.setResult(new com.google.android.gms.games.AnnotatedData(leaderboardFreeze, z));
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
