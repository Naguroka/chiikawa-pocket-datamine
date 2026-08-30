package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc extends com.google.android.gms.games.zzo implements com.google.android.gms.games.CurrentPlayerInfo {
    private final com.google.android.gms.games.internal.player.zzd zza;

    public zzc(com.google.android.gms.common.data.DataHolder dataHolder, int i, com.google.android.gms.games.internal.player.zzd zzdVar) {
        super(dataHolder, i);
        this.zza = zzdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.zza.zzc(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.CurrentPlayerInfo freeze() {
        return new com.google.android.gms.games.zza(this);
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int getFriendsListVisibilityStatus() {
        return zzp(this.zza.zzK, 0);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.zza.zza(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.zza.zzb(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.games.zzb.zza(new com.google.android.gms.games.zza(this), parcel, i);
    }

    public final boolean zza() {
        return hasColumn(this.zza.zzK) && !hasNull(this.zza.zzK);
    }
}
