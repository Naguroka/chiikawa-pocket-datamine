package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface LeaderboardsClient {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    public static class LeaderboardScores implements com.google.android.gms.common.api.Releasable {
        private final com.google.android.gms.games.leaderboard.Leaderboard zza;
        private final com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer zzb;

        public LeaderboardScores(com.google.android.gms.games.leaderboard.Leaderboard leaderboard, com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer leaderboardScoreBuffer) {
            this.zza = leaderboard;
            this.zzb = leaderboardScoreBuffer;
        }

        public com.google.android.gms.games.leaderboard.Leaderboard getLeaderboard() {
            return this.zza;
        }

        public com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer getScores() {
            return this.zzb;
        }

        @Override // com.google.android.gms.common.api.Releasable
        public void release() {
            this.zzb.release();
        }
    }

    com.google.android.gms.tasks.Task<android.content.Intent> getAllLeaderboardsIntent();

    com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String str);

    com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String str, int i);

    com.google.android.gms.tasks.Task<android.content.Intent> getLeaderboardIntent(java.lang.String str, int i, int i2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.LeaderboardScore>> loadCurrentPlayerLeaderboardScore(java.lang.String str, int i, int i2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.Leaderboard>> loadLeaderboardMetadata(java.lang.String str, boolean z);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.leaderboard.LeaderboardBuffer>> loadLeaderboardMetadata(boolean z);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadMoreScores(com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer leaderboardScoreBuffer, int i, int i2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(java.lang.String str, int i, int i2, int i3);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadPlayerCenteredScores(java.lang.String str, int i, int i2, int i3, boolean z);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadTopScores(java.lang.String str, int i, int i2, int i3);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.LeaderboardsClient.LeaderboardScores>> loadTopScores(java.lang.String str, int i, int i2, int i3, boolean z);

    void submitScore(java.lang.String str, long j);

    void submitScore(java.lang.String str, long j, java.lang.String str2);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.leaderboard.ScoreSubmissionData> submitScoreImmediate(java.lang.String str, long j);

    com.google.android.gms.tasks.Task<com.google.android.gms.games.leaderboard.ScoreSubmissionData> submitScoreImmediate(java.lang.String str, long j, java.lang.String str2);
}
