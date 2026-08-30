package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class LeaderboardScoreEntity implements com.google.android.gms.games.leaderboard.LeaderboardScore {
    private final long zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final long zzd;
    private final long zze;
    private final java.lang.String zzf;
    private final android.net.Uri zzg;
    private final android.net.Uri zzh;
    private final com.google.android.gms.games.PlayerEntity zzi;
    private final java.lang.String zzj;
    private final java.lang.String zzk;
    private final java.lang.String zzl;

    public LeaderboardScoreEntity(com.google.android.gms.games.leaderboard.LeaderboardScore leaderboardScore) {
        this.zza = leaderboardScore.getRank();
        this.zzb = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(leaderboardScore.getDisplayRank());
        this.zzc = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(leaderboardScore.getDisplayScore());
        this.zzd = leaderboardScore.getRawScore();
        this.zze = leaderboardScore.getTimestampMillis();
        this.zzf = leaderboardScore.getScoreHolderDisplayName();
        this.zzg = leaderboardScore.getScoreHolderIconImageUri();
        this.zzh = leaderboardScore.getScoreHolderHiResImageUri();
        com.google.android.gms.games.Player scoreHolder = leaderboardScore.getScoreHolder();
        this.zzi = scoreHolder == null ? null : new com.google.android.gms.games.PlayerEntity(scoreHolder);
        this.zzj = leaderboardScore.getScoreTag();
        this.zzk = leaderboardScore.getScoreHolderIconImageUrl();
        this.zzl = leaderboardScore.getScoreHolderHiResImageUrl();
    }

    static int zza(com.google.android.gms.games.leaderboard.LeaderboardScore leaderboardScore) {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(leaderboardScore.getRank()), leaderboardScore.getDisplayRank(), java.lang.Long.valueOf(leaderboardScore.getRawScore()), leaderboardScore.getDisplayScore(), java.lang.Long.valueOf(leaderboardScore.getTimestampMillis()), leaderboardScore.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolder());
    }

    static java.lang.String zzb(com.google.android.gms.games.leaderboard.LeaderboardScore leaderboardScore) {
        return com.google.android.gms.common.internal.Objects.toStringHelper(leaderboardScore).add("Rank", java.lang.Long.valueOf(leaderboardScore.getRank())).add("DisplayRank", leaderboardScore.getDisplayRank()).add("Score", java.lang.Long.valueOf(leaderboardScore.getRawScore())).add("DisplayScore", leaderboardScore.getDisplayScore()).add("Timestamp", java.lang.Long.valueOf(leaderboardScore.getTimestampMillis())).add("DisplayName", leaderboardScore.getScoreHolderDisplayName()).add("IconImageUri", leaderboardScore.getScoreHolderIconImageUri()).add("IconImageUrl", leaderboardScore.getScoreHolderIconImageUrl()).add("HiResImageUri", leaderboardScore.getScoreHolderHiResImageUri()).add("HiResImageUrl", leaderboardScore.getScoreHolderHiResImageUrl()).add("Player", leaderboardScore.getScoreHolder() == null ? null : leaderboardScore.getScoreHolder()).add("ScoreTag", leaderboardScore.getScoreTag()).toString();
    }

    static boolean zzc(com.google.android.gms.games.leaderboard.LeaderboardScore leaderboardScore, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.leaderboard.LeaderboardScore)) {
            return false;
        }
        if (leaderboardScore == obj) {
            return true;
        }
        com.google.android.gms.games.leaderboard.LeaderboardScore leaderboardScore2 = (com.google.android.gms.games.leaderboard.LeaderboardScore) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(leaderboardScore2.getRank()), java.lang.Long.valueOf(leaderboardScore.getRank())) && com.google.android.gms.common.internal.Objects.equal(leaderboardScore2.getDisplayRank(), leaderboardScore.getDisplayRank()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(leaderboardScore2.getRawScore()), java.lang.Long.valueOf(leaderboardScore.getRawScore())) && com.google.android.gms.common.internal.Objects.equal(leaderboardScore2.getDisplayScore(), leaderboardScore.getDisplayScore()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(leaderboardScore2.getTimestampMillis()), java.lang.Long.valueOf(leaderboardScore.getTimestampMillis())) && com.google.android.gms.common.internal.Objects.equal(leaderboardScore2.getScoreHolderDisplayName(), leaderboardScore.getScoreHolderDisplayName()) && com.google.android.gms.common.internal.Objects.equal(leaderboardScore2.getScoreHolderIconImageUri(), leaderboardScore.getScoreHolderIconImageUri()) && com.google.android.gms.common.internal.Objects.equal(leaderboardScore2.getScoreHolderHiResImageUri(), leaderboardScore.getScoreHolderHiResImageUri()) && com.google.android.gms.common.internal.Objects.equal(leaderboardScore2.getScoreHolder(), leaderboardScore.getScoreHolder()) && com.google.android.gms.common.internal.Objects.equal(leaderboardScore2.getScoreTag(), leaderboardScore.getScoreTag());
    }

    public final boolean equals(java.lang.Object obj) {
        return zzc(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.leaderboard.LeaderboardScore freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getDisplayRank() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayRank(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getDisplayScore() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getDisplayScore(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzc, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRank() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getRawScore() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final com.google.android.gms.games.Player getScoreHolder() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getScoreHolderDisplayName() {
        com.google.android.gms.games.PlayerEntity playerEntity = this.zzi;
        return playerEntity == null ? this.zzf : playerEntity.getDisplayName();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final void getScoreHolderDisplayName(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.games.PlayerEntity playerEntity = this.zzi;
        if (playerEntity == null) {
            com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzf, charArrayBuffer);
        } else {
            playerEntity.getDisplayName(charArrayBuffer);
        }
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final android.net.Uri getScoreHolderHiResImageUri() {
        com.google.android.gms.games.PlayerEntity playerEntity = this.zzi;
        return playerEntity == null ? this.zzh : playerEntity.getHiResImageUri();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public java.lang.String getScoreHolderHiResImageUrl() {
        com.google.android.gms.games.PlayerEntity playerEntity = this.zzi;
        return playerEntity == null ? this.zzl : playerEntity.getHiResImageUrl();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final android.net.Uri getScoreHolderIconImageUri() {
        com.google.android.gms.games.PlayerEntity playerEntity = this.zzi;
        return playerEntity == null ? this.zzg : playerEntity.getIconImageUri();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public java.lang.String getScoreHolderIconImageUrl() {
        com.google.android.gms.games.PlayerEntity playerEntity = this.zzi;
        return playerEntity == null ? this.zzk : playerEntity.getIconImageUrl();
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final java.lang.String getScoreTag() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardScore
    public final long getTimestampMillis() {
        return this.zze;
    }

    public final int hashCode() {
        return zza(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return zzb(this);
    }
}
