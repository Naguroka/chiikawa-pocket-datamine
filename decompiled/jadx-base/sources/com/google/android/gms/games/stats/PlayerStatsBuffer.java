package com.google.android.gms.games.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlayerStatsBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.stats.PlayerStats> {
    public PlayerStatsBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.games.stats.PlayerStats get(int i) {
        return new com.google.android.gms.games.stats.zzb(this.mDataHolder, i);
    }
}
