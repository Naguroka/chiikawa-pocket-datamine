package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzp extends com.google.android.gms.games.zzq {
    zzp() {
    }

    @Override // com.google.android.gms.games.zzq, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.zzq
    /* JADX INFO: renamed from: zza */
    public final com.google.android.gms.games.PlayerEntity createFromParcel(android.os.Parcel parcel) {
        if (com.google.android.gms.games.PlayerEntity.zzo(com.google.android.gms.games.PlayerEntity.getUnparcelClientVersion()) || com.google.android.gms.games.PlayerEntity.canUnparcelSafely(com.google.android.gms.games.PlayerEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        java.lang.String string = parcel.readString();
        java.lang.String string2 = parcel.readString();
        java.lang.String string3 = parcel.readString();
        java.lang.String string4 = parcel.readString();
        return new com.google.android.gms.games.PlayerEntity(string, string2, string3 == null ? null : android.net.Uri.parse(string3), string4 == null ? null : android.net.Uri.parse(string4), parcel.readLong(), -1, -1L, null, null, null, null, null, true, false, parcel.readString(), parcel.readString(), null, null, null, null, -1L, null, null, false);
    }
}
