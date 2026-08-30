package com.google.android.gms.games.internal.player;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class ProfileSettingsEntity extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.zzw {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.internal.player.ProfileSettingsEntity> CREATOR = new com.google.android.gms.games.internal.player.zze();
    private final com.google.android.gms.common.api.Status zza;
    private final java.lang.String zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;
    private final com.google.android.gms.games.internal.player.StockProfileImageEntity zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public ProfileSettingsEntity(com.google.android.gms.common.api.Status status, java.lang.String str, boolean z, boolean z2, boolean z3, com.google.android.gms.games.internal.player.StockProfileImageEntity stockProfileImageEntity, boolean z4, boolean z5, int i, boolean z6, boolean z7, int i2, int i3, boolean z8) {
        this.zza = status;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        this.zze = z3;
        this.zzf = stockProfileImageEntity;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = i;
        this.zzj = z6;
        this.zzk = z7;
        this.zzl = i2;
        this.zzm = i3;
        this.zzn = z8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.zzw)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.games.zzw zzwVar = (com.google.android.gms.games.zzw) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zzb, zzwVar.zze()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(zzwVar.zzi())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(zzwVar.zzk())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zze), java.lang.Boolean.valueOf(zzwVar.zzm())) && com.google.android.gms.common.internal.Objects.equal(this.zza, zzwVar.getStatus()) && com.google.android.gms.common.internal.Objects.equal(this.zzf, zzwVar.zzd()) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzg), java.lang.Boolean.valueOf(zzwVar.zzj())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Boolean.valueOf(this.zzh), java.lang.Boolean.valueOf(zzwVar.zzh())) && this.zzi == zzwVar.zzb() && this.zzj == zzwVar.zzl() && this.zzk == zzwVar.zzf() && this.zzl == zzwVar.zzc() && this.zzm == zzwVar.zza() && this.zzn == zzwVar.zzg();
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzb, java.lang.Boolean.valueOf(this.zzc), java.lang.Boolean.valueOf(this.zzd), java.lang.Boolean.valueOf(this.zze), this.zza, this.zzf, java.lang.Boolean.valueOf(this.zzg), java.lang.Boolean.valueOf(this.zzh), java.lang.Integer.valueOf(this.zzi), java.lang.Boolean.valueOf(this.zzj), java.lang.Boolean.valueOf(this.zzk), java.lang.Integer.valueOf(this.zzl), java.lang.Integer.valueOf(this.zzm), java.lang.Boolean.valueOf(this.zzn));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("GamerTag", this.zzb).add("IsGamerTagExplicitlySet", java.lang.Boolean.valueOf(this.zzc)).add("IsProfileVisible", java.lang.Boolean.valueOf(this.zzd)).add("IsVisibilityExplicitlySet", java.lang.Boolean.valueOf(this.zze)).add("Status", this.zza).add("StockProfileImage", this.zzf).add("IsProfileDiscoverable", java.lang.Boolean.valueOf(this.zzg)).add("AutoSignIn", java.lang.Boolean.valueOf(this.zzh)).add("httpErrorCode", java.lang.Integer.valueOf(this.zzi)).add("IsSettingsChangesProhibited", java.lang.Boolean.valueOf(this.zzj)).add("AllowFriendInvites", java.lang.Boolean.valueOf(this.zzk)).add("ProfileVisibility", java.lang.Integer.valueOf(this.zzl)).add("global_friends_list_visibility", java.lang.Integer.valueOf(this.zzm)).add("always_auto_sign_in", java.lang.Boolean.valueOf(this.zzn)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 12, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 14, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.games.zzw
    public final int zza() {
        return this.zzm;
    }

    @Override // com.google.android.gms.games.zzw
    public final int zzb() {
        return this.zzi;
    }

    @Override // com.google.android.gms.games.zzw
    public final int zzc() {
        return this.zzl;
    }

    @Override // com.google.android.gms.games.zzw
    public final com.google.android.gms.games.internal.player.StockProfileImage zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.games.zzw
    public final java.lang.String zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.zzw
    public final boolean zzf() {
        return this.zzk;
    }

    @Override // com.google.android.gms.games.zzw
    public final boolean zzg() {
        return this.zzn;
    }

    @Override // com.google.android.gms.games.zzw
    public final boolean zzh() {
        return this.zzh;
    }

    @Override // com.google.android.gms.games.zzw
    public final boolean zzi() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.zzw
    public final boolean zzj() {
        return this.zzg;
    }

    @Override // com.google.android.gms.games.zzw
    public final boolean zzk() {
        return this.zzd;
    }

    @Override // com.google.android.gms.games.zzw
    public final boolean zzl() {
        return this.zzj;
    }

    @Override // com.google.android.gms.games.zzw
    public final boolean zzm() {
        return this.zze;
    }
}
