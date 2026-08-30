package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class LeaderboardVariantEntity implements com.google.android.gms.games.leaderboard.LeaderboardVariant {
    private final int zza;
    private final int zzb;
    private final boolean zzc;
    private final long zzd;
    private final java.lang.String zze;
    private final long zzf;
    private final java.lang.String zzg;
    private final java.lang.String zzh;
    private final long zzi;
    private final java.lang.String zzj;
    private final java.lang.String zzk;
    private final java.lang.String zzl;

    public LeaderboardVariantEntity(com.google.android.gms.games.leaderboard.LeaderboardVariant leaderboardVariant) {
        this.zza = leaderboardVariant.getTimeSpan();
        this.zzb = leaderboardVariant.getCollection();
        this.zzc = leaderboardVariant.hasPlayerInfo();
        this.zzd = leaderboardVariant.getRawPlayerScore();
        this.zze = leaderboardVariant.getDisplayPlayerScore();
        this.zzf = leaderboardVariant.getPlayerRank();
        this.zzg = leaderboardVariant.getDisplayPlayerRank();
        this.zzh = leaderboardVariant.getPlayerScoreTag();
        this.zzi = leaderboardVariant.getNumScores();
        this.zzj = leaderboardVariant.zza();
        this.zzk = leaderboardVariant.zzc();
        this.zzl = leaderboardVariant.zzb();
    }

    static int zzd(com.google.android.gms.games.leaderboard.LeaderboardVariant leaderboardVariant) {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(leaderboardVariant.getTimeSpan()), java.lang.Integer.valueOf(leaderboardVariant.getCollection()), java.lang.Boolean.valueOf(leaderboardVariant.hasPlayerInfo()), java.lang.Long.valueOf(leaderboardVariant.getRawPlayerScore()), leaderboardVariant.getDisplayPlayerScore(), java.lang.Long.valueOf(leaderboardVariant.getPlayerRank()), leaderboardVariant.getDisplayPlayerRank(), java.lang.Long.valueOf(leaderboardVariant.getNumScores()), leaderboardVariant.zza(), leaderboardVariant.zzb(), leaderboardVariant.zzc());
    }

    static java.lang.String zze(com.google.android.gms.games.leaderboard.LeaderboardVariant leaderboardVariant) {
        java.lang.String str;
        com.google.android.gms.common.internal.Objects.ToStringHelper toStringHelperAdd = com.google.android.gms.common.internal.Objects.toStringHelper(leaderboardVariant).add("TimeSpan", com.google.android.gms.internal.games_v2.zzah.zza(leaderboardVariant.getTimeSpan()));
        int collection = leaderboardVariant.getCollection();
        if (collection == -1) {
            str = "UNKNOWN";
        } else if (collection == 0) {
            str = "PUBLIC";
        } else if (collection != 1) {
            str = "SOCIAL_1P";
            if (collection != 2) {
                if (collection == 3) {
                    str = "FRIENDS";
                } else if (collection != 4) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(43);
                    sb.append("Unknown leaderboard collection: ");
                    sb.append(collection);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
        } else {
            str = "SOCIAL";
        }
        return toStringHelperAdd.add("Collection", str).add("RawPlayerScore", leaderboardVariant.hasPlayerInfo() ? java.lang.Long.valueOf(leaderboardVariant.getRawPlayerScore()) : "none").add("DisplayPlayerScore", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerScore() : "none").add("PlayerRank", leaderboardVariant.hasPlayerInfo() ? java.lang.Long.valueOf(leaderboardVariant.getPlayerRank()) : "none").add("DisplayPlayerRank", leaderboardVariant.hasPlayerInfo() ? leaderboardVariant.getDisplayPlayerRank() : "none").add("NumScores", java.lang.Long.valueOf(leaderboardVariant.getNumScores())).add("TopPageNextToken", leaderboardVariant.zza()).add("WindowPageNextToken", leaderboardVariant.zzb()).add("WindowPagePrevToken", leaderboardVariant.zzc()).toString();
    }

    static boolean zzf(com.google.android.gms.games.leaderboard.LeaderboardVariant leaderboardVariant, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.leaderboard.LeaderboardVariant)) {
            return false;
        }
        if (leaderboardVariant == obj) {
            return true;
        }
        com.google.android.gms.games.leaderboard.LeaderboardVariant leaderboardVariant2 = (com.google.android.gms.games.leaderboard.LeaderboardVariant) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(leaderboardVariant2.getTimeSpan()), java.lang.Integer.valueOf(leaderboardVariant.getTimeSpan())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(leaderboardVariant2.getCollection()), java.lang.Integer.valueOf(leaderboardVariant.getCollection())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(leaderboardVariant2.hasPlayerInfo()), java.lang.Boolean.valueOf(leaderboardVariant.hasPlayerInfo())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(leaderboardVariant2.getRawPlayerScore()), java.lang.Long.valueOf(leaderboardVariant.getRawPlayerScore())) && com.google.android.gms.common.internal.Objects.equal(leaderboardVariant2.getDisplayPlayerScore(), leaderboardVariant.getDisplayPlayerScore()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(leaderboardVariant2.getPlayerRank()), java.lang.Long.valueOf(leaderboardVariant.getPlayerRank())) && com.google.android.gms.common.internal.Objects.equal(leaderboardVariant2.getDisplayPlayerRank(), leaderboardVariant.getDisplayPlayerRank()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(leaderboardVariant2.getNumScores()), java.lang.Long.valueOf(leaderboardVariant.getNumScores())) && com.google.android.gms.common.internal.Objects.equal(leaderboardVariant2.zza(), leaderboardVariant.zza()) && com.google.android.gms.common.internal.Objects.equal(leaderboardVariant2.zzb(), leaderboardVariant.zzb()) && com.google.android.gms.common.internal.Objects.equal(leaderboardVariant2.zzc(), leaderboardVariant.zzc());
    }

    public final boolean equals(java.lang.Object obj) {
        return zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.leaderboard.LeaderboardVariant freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getCollection() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getDisplayPlayerRank() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getDisplayPlayerScore() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getNumScores() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getPlayerRank() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String getPlayerScoreTag() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final long getRawPlayerScore() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final int getTimeSpan() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final boolean hasPlayerInfo() {
        return this.zzc;
    }

    public final int hashCode() {
        return zzd(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return zze(this);
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zza() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zzb() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.leaderboard.LeaderboardVariant
    public final java.lang.String zzc() {
        return this.zzk;
    }
}
