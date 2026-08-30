package com.google.android.gms.games.multiplayer.realtime;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzc extends com.google.android.gms.games.multiplayer.realtime.zzd {
    zzc() {
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.zzd, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.multiplayer.realtime.zzd
    /* JADX INFO: renamed from: zza */
    public final com.google.android.gms.games.multiplayer.realtime.RoomEntity createFromParcel(android.os.Parcel parcel) {
        return (com.google.android.gms.games.multiplayer.realtime.RoomEntity.zzo(com.google.android.gms.games.multiplayer.realtime.RoomEntity.getUnparcelClientVersion()) || com.google.android.gms.games.multiplayer.realtime.RoomEntity.canUnparcelSafely(com.google.android.gms.games.multiplayer.realtime.RoomEntity.class.getCanonicalName())) ? super.createFromParcel(parcel) : new com.google.android.gms.games.multiplayer.realtime.RoomEntity();
    }
}
