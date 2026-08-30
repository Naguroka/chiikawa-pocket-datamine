package com.google.android.gms.games.internal.game;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzb extends com.google.android.gms.games.internal.game.zzc {
    zzb() {
    }

    @Override // com.google.android.gms.games.internal.game.zzc, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.internal.game.zzc
    /* JADX INFO: renamed from: zza */
    public final com.google.android.gms.games.internal.game.GameBadgeEntity createFromParcel(android.os.Parcel parcel) {
        if (com.google.android.gms.games.internal.game.GameBadgeEntity.zzo(com.google.android.gms.games.internal.game.GameBadgeEntity.getUnparcelClientVersion()) || com.google.android.gms.games.internal.game.GameBadgeEntity.canUnparcelSafely(com.google.android.gms.games.internal.game.GameBadgeEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        int i = parcel.readInt();
        java.lang.String string = parcel.readString();
        java.lang.String string2 = parcel.readString();
        java.lang.String string3 = parcel.readString();
        return new com.google.android.gms.games.internal.game.GameBadgeEntity(i, string, string2, string3 == null ? null : android.net.Uri.parse(string3));
    }
}
