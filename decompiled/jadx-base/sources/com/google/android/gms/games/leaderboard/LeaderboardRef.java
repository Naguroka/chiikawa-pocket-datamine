package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class LeaderboardRef extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.leaderboard.Leaderboard {
    private final int zza;
    private final com.google.android.gms.games.Game zzb;

    LeaderboardRef(com.google.android.gms.common.data.DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.zza = i2;
        this.zzb = new com.google.android.gms.games.GameRef(dataHolder, i);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.leaderboard.LeaderboardEntity.zzd(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.leaderboard.Leaderboard freeze() {
        return new com.google.android.gms.games.leaderboard.LeaderboardEntity(this);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.lang.String getDisplayName() {
        return getString("name");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final android.net.Uri getIconImageUri() {
        return parseUri("board_icon_image_uri");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public java.lang.String getIconImageUrl() {
        return getString("board_icon_image_url");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.lang.String getLeaderboardId() {
        return getString("external_leaderboard_id");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final int getScoreOrder() {
        return getInteger("score_order");
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final java.util.ArrayList<com.google.android.gms.games.leaderboard.LeaderboardVariant> getVariants() {
        java.util.ArrayList<com.google.android.gms.games.leaderboard.LeaderboardVariant> arrayList = new java.util.ArrayList<>(this.zza);
        for (int i = 0; i < this.zza; i++) {
            arrayList.add(new com.google.android.gms.games.leaderboard.zzb(this.mDataHolder, this.mDataRow + i));
        }
        return arrayList;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.leaderboard.LeaderboardEntity.zzb(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.leaderboard.LeaderboardEntity.zzc(this);
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final com.google.android.gms.games.Game zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.leaderboard.Leaderboard
    public final void getDisplayName(android.database.CharArrayBuffer charArrayBuffer) {
        copyToBuffer("name", charArrayBuffer);
    }
}
