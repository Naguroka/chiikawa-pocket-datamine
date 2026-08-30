package com.google.android.gms.games.leaderboard;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class LeaderboardScoreBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.leaderboard.LeaderboardScore> {
    private final com.google.android.gms.games.leaderboard.zza zza;

    public LeaderboardScoreBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
        this.zza = new com.google.android.gms.games.leaderboard.zza(dataHolder.getMetadata());
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public com.google.android.gms.games.leaderboard.LeaderboardScore get(int i) {
        return new com.google.android.gms.games.leaderboard.LeaderboardScoreRef(this.mDataHolder, i);
    }

    public final com.google.android.gms.games.leaderboard.zza zza() {
        return this.zza;
    }
}
