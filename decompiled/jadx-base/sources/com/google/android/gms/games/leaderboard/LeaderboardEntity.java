package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class LeaderboardEntity implements com.google.android.gms.games.leaderboard.Leaderboard {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.net.Uri zzc;
    private final int zzd;
    private final java.util.ArrayList zze;
    private final com.google.android.gms.games.Game zzf;
    private final java.lang.String zzg;

    public LeaderboardEntity(com.google.android.gms.games.leaderboard.Leaderboard leaderboard) {
        this.zza = leaderboard.getLeaderboardId();
        this.zzb = leaderboard.getDisplayName();
        this.zzc = leaderboard.getIconImageUri();
        this.zzg = leaderboard.getIconImageUrl();
        this.zzd = leaderboard.getScoreOrder();
        com.google.android.gms.games.Game gameZza = leaderboard.zza();
        this.zzf = gameZza == null ? null : new com.google.android.gms.games.GameEntity(gameZza);
        java.util.ArrayList<com.google.android.gms.games.leaderboard.LeaderboardVariant> variants = leaderboard.getVariants();
        int size = variants.size();
        this.zze = new java.util.ArrayList(size);
        for (int i = 0; i < size; i++) {
            this.zze.add(variants.get(i).freeze());
        }
    }

    static int zzb(com.google.android.gms.games.leaderboard.Leaderboard leaderboard) {
        return com.google.android.gms.common.internal.Objects.hashCode(leaderboard.getLeaderboardId(), leaderboard.getDisplayName(), leaderboard.getIconImageUri(), java.lang.Integer.valueOf(leaderboard.getScoreOrder()), leaderboard.getVariants());
    }

    static java.lang.String zzc(com.google.android.gms.games.leaderboard.Leaderboard leaderboard) {
        return com.google.android.gms.common.internal.Objects.toStringHelper(leaderboard).add("LeaderboardId", leaderboard.getLeaderboardId()).add("DisplayName", leaderboard.getDisplayName()).add("IconImageUri", leaderboard.getIconImageUri()).add("IconImageUrl", leaderboard.getIconImageUrl()).add("ScoreOrder", java.lang.Integer.valueOf(leaderboard.getScoreOrder())).add("Variants", leaderboard.getVariants()).toString();
    }

    static boolean zzd(com.google.android.gms.games.leaderboard.Leaderboard leaderboard, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.leaderboard.Leaderboard)) {
            return false;
        }
        if (leaderboard == obj) {
            return true;
        }
        com.google.android.gms.games.leaderboard.Leaderboard leaderboard2 = (com.google.android.gms.games.leaderboard.Leaderboard) obj;
        return com.google.android.gms.common.internal.Objects.equal(leaderboard2.getLeaderboardId(), leaderboard.getLeaderboardId()) && com.google.android.gms.common.internal.Objects.equal(leaderboard2.getDisplayName(), leaderboard.getDisplayName()) && com.google.android.gms.common.internal.Objects.equal(leaderboard2.getIconImageUri(), leaderboard.getIconImageUri()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(leaderboard2.getScoreOrder()), java.lang.Integer.valueOf(leaderboard.getScoreOrder())) && com.google.android.gms.common.internal.Objects.equal(leaderboard2.getVariants(), leaderboard.getVariants());
    }

    public final boolean equals(java.lang.Object obj) {
        return zzd(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.leaderboard.Leaderboard freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.lang.String getDisplayName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final void getDisplayName(android.database.CharArrayBuffer charArrayBuffer) {
        com.google.android.gms.common.util.DataUtils.copyStringToBuffer(this.zzb, charArrayBuffer);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final android.net.Uri getIconImageUri() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public java.lang.String getIconImageUrl() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.lang.String getLeaderboardId() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final int getScoreOrder() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.util.ArrayList<com.google.android.gms.games.leaderboard.LeaderboardVariant> getVariants() {
        return new java.util.ArrayList<>(this.zze);
    }

    public final int hashCode() {
        return zzb(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return zzc(this);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final com.google.android.gms.games.Game zza() {
        throw null;
    }
}
