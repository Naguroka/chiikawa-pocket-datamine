package com.google.android.gms.games.internal.player;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class MostRecentGameInfoEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.internal.player.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.player.MostRecentGameInfoEntity> CREATOR = new com.google.android.gms.games.internal.player.zzb();
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final long zzc;
    private final android.net.Uri zzd;
    private final android.net.Uri zze;
    private final android.net.Uri zzf;

    public MostRecentGameInfoEntity(com.google.android.gms.games.internal.player.zza zzaVar) {
        this.zza = zzaVar.zze();
        this.zzb = zzaVar.zzf();
        this.zzc = zzaVar.zza();
        this.zzd = zzaVar.zzd();
        this.zze = zzaVar.zzc();
        this.zzf = zzaVar.zzb();
    }

    static int zzg(com.google.android.gms.games.internal.player.zza zzaVar) {
        return com.google.android.gms.common.internal.Objects.hashCode(zzaVar.zze(), zzaVar.zzf(), java.lang.Long.valueOf(zzaVar.zza()), zzaVar.zzd(), zzaVar.zzc(), zzaVar.zzb());
    }

    static java.lang.String zzh(com.google.android.gms.games.internal.player.zza zzaVar) {
        return com.google.android.gms.common.internal.Objects.toStringHelper(zzaVar).add("GameId", zzaVar.zze()).add("GameName", zzaVar.zzf()).add("ActivityTimestampMillis", java.lang.Long.valueOf(zzaVar.zza())).add("GameIconUri", zzaVar.zzd()).add("GameHiResUri", zzaVar.zzc()).add("GameFeaturedUri", zzaVar.zzb()).toString();
    }

    static boolean zzi(com.google.android.gms.games.internal.player.zza zzaVar, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.internal.player.zza)) {
            return false;
        }
        if (zzaVar == obj) {
            return true;
        }
        com.google.android.gms.games.internal.player.zza zzaVar2 = (com.google.android.gms.games.internal.player.zza) obj;
        return com.google.android.gms.common.internal.Objects.equal(zzaVar2.zze(), zzaVar.zze()) && com.google.android.gms.common.internal.Objects.equal(zzaVar2.zzf(), zzaVar.zzf()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(zzaVar2.zza()), java.lang.Long.valueOf(zzaVar.zza())) && com.google.android.gms.common.internal.Objects.equal(zzaVar2.zzd(), zzaVar.zzd()) && com.google.android.gms.common.internal.Objects.equal(zzaVar2.zzc(), zzaVar.zzc()) && com.google.android.gms.common.internal.Objects.equal(zzaVar2.zzb(), zzaVar.zzb());
    }

    public final boolean equals(java.lang.Object obj) {
        return zzi(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ java.lang.Object freeze() {
        return this;
    }

    public final int hashCode() {
        return zzg(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return zzh(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.games.internal.player.zzb.zza(this, parcel, i);
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final android.net.Uri zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final java.lang.String zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.games.internal.player.zza
    public final java.lang.String zzf() {
        return this.zzb;
    }

    MostRecentGameInfoEntity(java.lang.String str, java.lang.String str2, long j, android.net.Uri uri, android.net.Uri uri2, android.net.Uri uri3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j;
        this.zzd = uri;
        this.zze = uri2;
        this.zzf = uri3;
    }
}
