package com.google.android.gms.games.multiplayer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class ParticipantEntity extends com.google.android.gms.games.internal.GamesDowngradeableSafeParcel {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.multiplayer.ParticipantEntity> CREATOR = new com.google.android.gms.games.multiplayer.zza();

    ParticipantEntity() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (!shouldDowngrade()) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel));
            return;
        }
        parcel.writeString("unsupported");
        parcel.writeString("unsupported");
        parcel.writeString(null);
        parcel.writeString(null);
        parcel.writeInt(0);
        parcel.writeString("unsupported");
        parcel.writeInt(0);
        parcel.writeInt(0);
    }
}
