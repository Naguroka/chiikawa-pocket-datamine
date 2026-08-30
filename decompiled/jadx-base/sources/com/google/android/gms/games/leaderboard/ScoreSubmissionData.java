package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ScoreSubmissionData {
    private static final java.lang.String[] zza = {"leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"};
    private java.lang.String zzb;
    private java.lang.String zzc;
    private int zzd;
    private android.util.SparseArray zze = new android.util.SparseArray();

    /* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
    public static final class Result {
        public final java.lang.String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final java.lang.String scoreTag;

        public Result(long j, java.lang.String str, java.lang.String str2, boolean z) {
            this.rawScore = j;
            this.formattedScore = str;
            this.scoreTag = str2;
            this.newBest = z;
        }

        public java.lang.String toString() {
            return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("RawScore", java.lang.Long.valueOf(this.rawScore)).add("FormattedScore", this.formattedScore).add("ScoreTag", this.scoreTag).add("NewBest", java.lang.Boolean.valueOf(this.newBest)).toString();
        }
    }

    public ScoreSubmissionData(com.google.android.gms.common.data.DataHolder dataHolder) {
        this.zzd = dataHolder.getStatusCode();
        int count = dataHolder.getCount();
        com.google.android.gms.common.internal.Preconditions.checkArgument(count == 3);
        int i = 0;
        while (i < count) {
            int windowIndex = dataHolder.getWindowIndex(i);
            if (i == 0) {
                this.zzb = dataHolder.getString("leaderboardId", 0, windowIndex);
                this.zzc = dataHolder.getString("playerId", 0, windowIndex);
                i = 0;
            }
            if (dataHolder.getBoolean("hasResult", i, windowIndex)) {
                this.zze.put(dataHolder.getInteger("timeSpan", i, windowIndex), new com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result(dataHolder.getLong("rawScore", i, windowIndex), dataHolder.getString("formattedScore", i, windowIndex), dataHolder.getString("scoreTag", i, windowIndex), dataHolder.getBoolean("newBest", i, windowIndex)));
            }
            i++;
        }
    }

    public java.lang.String getLeaderboardId() {
        return this.zzb;
    }

    public java.lang.String getPlayerId() {
        return this.zzc;
    }

    public com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result getScoreResult(int i) {
        return (com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result) this.zze.get(i);
    }

    public java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("PlayerId", this.zzc).add("StatusCode", java.lang.Integer.valueOf(this.zzd));
        for (int i = 0; i < 3; i++) {
            com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result result = (com.google.android.gms.games.leaderboard.ScoreSubmissionData.Result) this.zze.get(i);
            toStringHelperAdd.add("TimesSpan", com.google.android.gms.internal.games_v2.zzah.zza(i));
            toStringHelperAdd.add("Result", result == null ? "null" : result.toString());
        }
        return toStringHelperAdd.toString();
    }
}
