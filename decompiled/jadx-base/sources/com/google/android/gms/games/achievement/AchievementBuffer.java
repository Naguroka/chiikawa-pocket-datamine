package com.google.android.gms.games.achievement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class AchievementBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.achievement.Achievement> {
    public AchievementBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public com.google.android.gms.games.achievement.Achievement get(int i) {
        return new com.google.android.gms.games.achievement.AchievementRef(this.mDataHolder, i);
    }
}
