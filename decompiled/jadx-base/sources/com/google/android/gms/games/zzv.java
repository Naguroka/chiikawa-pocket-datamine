package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzv extends com.google.android.gms.games.zzo implements com.google.android.gms.games.PlayerRelationshipInfo {
    private final com.google.android.gms.games.internal.player.zzd zza;

    public zzv(com.google.android.gms.common.data.DataHolder dataHolder, int i, com.google.android.gms.games.internal.player.zzd zzdVar) {
        super(dataHolder, i);
        this.zza = zzdVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(java.lang.Object obj) {
        return com.google.android.gms.games.zzt.zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ com.google.android.gms.games.PlayerRelationshipInfo freeze() {
        return new com.google.android.gms.games.zzt(this);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return zzp(this.zza.zzG, -1);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.zzt.zzd(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.zzt.zze(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.games.zzu.zza(new com.google.android.gms.games.zzt(this), parcel, i);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zza() {
        return zzq(this.zza.zzI, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzb() {
        return zzq(this.zza.zzH, null);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzc() {
        return zzq(this.zza.zzJ, null);
    }
}
