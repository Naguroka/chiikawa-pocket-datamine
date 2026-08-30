package com.google.android.gms.games.multiplayer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zza extends com.google.android.gms.games.multiplayer.zzb {
    zza() {
    }

    @Override // com.google.android.gms.games.multiplayer.zzb, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.multiplayer.zzb
    /* JADX INFO: renamed from: zza */
    public final com.google.android.gms.games.multiplayer.ParticipantEntity createFromParcel(android.os.Parcel parcel) {
        return (com.google.android.gms.games.multiplayer.ParticipantEntity.zzo(com.google.android.gms.games.multiplayer.ParticipantEntity.getUnparcelClientVersion()) || com.google.android.gms.games.multiplayer.ParticipantEntity.canUnparcelSafely(com.google.android.gms.games.multiplayer.ParticipantEntity.class.getCanonicalName())) ? super.createFromParcel(parcel) : new com.google.android.gms.games.multiplayer.ParticipantEntity();
    }
}
