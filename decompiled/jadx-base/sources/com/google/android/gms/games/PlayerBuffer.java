package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class PlayerBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.Player> {
    public PlayerBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public com.google.android.gms.games.Player get(int i) {
        return new com.google.android.gms.games.PlayerRef(this.mDataHolder, i, null);
    }
}
