package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zze extends com.google.android.gms.games.zzf {
    zze() {
    }

    @Override // com.google.android.gms.games.zzf, android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel);
    }

    @Override // com.google.android.gms.games.zzf
    /* JADX INFO: renamed from: zza */
    public final com.google.android.gms.games.GameEntity createFromParcel(android.os.Parcel parcel) {
        if (com.google.android.gms.games.GameEntity.zzo(com.google.android.gms.games.GameEntity.getUnparcelClientVersion()) || com.google.android.gms.games.GameEntity.canUnparcelSafely(com.google.android.gms.games.GameEntity.class.getCanonicalName())) {
            return super.createFromParcel(parcel);
        }
        java.lang.String string = parcel.readString();
        java.lang.String string2 = parcel.readString();
        java.lang.String string3 = parcel.readString();
        java.lang.String string4 = parcel.readString();
        java.lang.String string5 = parcel.readString();
        java.lang.String string6 = parcel.readString();
        java.lang.String string7 = parcel.readString();
        android.net.Uri uri = string7 == null ? null : android.net.Uri.parse(string7);
        java.lang.String string8 = parcel.readString();
        android.net.Uri uri2 = string8 == null ? null : android.net.Uri.parse(string8);
        java.lang.String string9 = parcel.readString();
        return new com.google.android.gms.games.GameEntity(string, string2, string3, string4, string5, string6, uri, uri2, string9 == null ? null : android.net.Uri.parse(string9), parcel.readInt() > 0, parcel.readInt() > 0, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), false, false, null, null, null, false, false, false, null, false);
    }
}
