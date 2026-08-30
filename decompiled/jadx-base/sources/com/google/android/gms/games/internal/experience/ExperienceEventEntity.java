package com.google.android.gms.games.internal.experience;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ExperienceEventEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.internal.experience.ExperienceEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.experience.ExperienceEventEntity> CREATOR = new com.google.android.gms.games.internal.experience.zza();
    private final java.lang.String zza;
    private final com.google.android.gms.games.GameEntity zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final android.net.Uri zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final int zzj;
    private final int zzk;

    ExperienceEventEntity(java.lang.String str, com.google.android.gms.games.GameEntity gameEntity, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, long j, long j2, long j3, int i, int i2) {
        this.zza = str;
        this.zzb = gameEntity;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = uri;
        this.zzg = j;
        this.zzh = j2;
        this.zzi = j3;
        this.zzj = i;
        this.zzk = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.internal.experience.ExperienceEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.games.internal.experience.ExperienceEvent experienceEvent = (com.google.android.gms.games.internal.experience.ExperienceEvent) obj;
        return com.google.android.gms.common.internal.Objects.equal(experienceEvent.zzj(), this.zza) && com.google.android.gms.common.internal.Objects.equal(experienceEvent.zzg(), this.zzb) && com.google.android.gms.common.internal.Objects.equal(experienceEvent.zzi(), this.zzc) && com.google.android.gms.common.internal.Objects.equal(experienceEvent.zzh(), this.zzd) && com.google.android.gms.common.internal.Objects.equal(experienceEvent.getIconImageUrl(), getIconImageUrl()) && com.google.android.gms.common.internal.Objects.equal(experienceEvent.zzf(), this.zzf) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(experienceEvent.zzc()), java.lang.Long.valueOf(this.zzg)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(experienceEvent.zze()), java.lang.Long.valueOf(this.zzh)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(experienceEvent.zzd()), java.lang.Long.valueOf(this.zzi)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(experienceEvent.zzb()), java.lang.Integer.valueOf(this.zzj)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(experienceEvent.zza()), java.lang.Integer.valueOf(this.zzk));
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.internal.experience.ExperienceEvent freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public java.lang.String getIconImageUrl() {
        return this.zze;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, getIconImageUrl(), this.zzf, java.lang.Long.valueOf(this.zzg), java.lang.Long.valueOf(this.zzh), java.lang.Long.valueOf(this.zzi), java.lang.Integer.valueOf(this.zzj), java.lang.Integer.valueOf(this.zzk));
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("ExperienceId", this.zza).add("Game", this.zzb).add("DisplayTitle", this.zzc).add("DisplayDescription", this.zzd).add("IconImageUrl", getIconImageUrl()).add("IconImageUri", this.zzf).add("CreatedTimestamp", java.lang.Long.valueOf(this.zzg)).add("XpEarned", java.lang.Long.valueOf(this.zzh)).add("CurrentXp", java.lang.Long.valueOf(this.zzi)).add("Type", java.lang.Integer.valueOf(this.zzj)).add("NewLevel", java.lang.Integer.valueOf(this.zzk)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getIconImageUrl(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zza() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zzb() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzc() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final android.net.Uri zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final com.google.android.gms.games.Game zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final java.lang.String zzh() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final java.lang.String zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final java.lang.String zzj() {
        return this.zza;
    }
}
