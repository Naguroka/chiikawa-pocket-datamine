package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class LeaderboardBuffer extends com.google.android.gms.common.data.EntityBuffer<com.google.android.gms.games.leaderboard.Leaderboard> {
    public LeaderboardBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    protected final /* bridge */ /* synthetic */ com.google.android.gms.games.leaderboard.Leaderboard getEntry(int i, int i2) {
        return new com.google.android.gms.games.leaderboard.LeaderboardRef(this.mDataHolder, i, i2);
    }

    @Override // com.google.android.gms.common.data.EntityBuffer
    protected final java.lang.String getPrimaryDataMarkerColumn() {
        return "external_leaderboard_id";
    }
}
