package com.google.android.gms.games.internal.player;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzc extends com.google.android.gms.common.data.DataBufferRef implements com.google.android.gms.games.internal.player.zza {
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
        return com.google.android.gms.games.internal.player.MostRecentGameInfoEntity.zzi(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* synthetic */ java.lang.Object freeze() {
        return new com.google.android.gms.games.internal.player.MostRecentGameInfoEntity(this);
    }

    @Override // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return com.google.android.gms.games.internal.player.MostRecentGameInfoEntity.zzg(this);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.games.internal.player.MostRecentGameInfoEntity.zzh(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.games.internal.player.zzb.zza(new com.google.android.gms.games.internal.player.MostRecentGameInfoEntity(this), parcel, i);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zza() {
        return getLong(this.zza.zzu);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzb() {
        return parseUri(this.zza.zzx);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzc() {
        return parseUri(this.zza.zzw);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzd() {
        return parseUri(this.zza.zzv);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final java.lang.String zze() {
        return getString(this.zza.zzs);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final java.lang.String zzf() {
        return getString(this.zza.zzt);
    }
}
