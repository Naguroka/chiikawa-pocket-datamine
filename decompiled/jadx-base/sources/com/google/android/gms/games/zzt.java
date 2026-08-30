package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzt extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.PlayerRelationshipInfo {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.zzt> CREATOR = new com.google.android.gms.games.zzu();
    private final int zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;

    public zzt(int i, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
    }

    static int zzd(com.google.android.gms.games.PlayerRelationshipInfo playerRelationshipInfo) {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(playerRelationshipInfo.getFriendStatus()), playerRelationshipInfo.zzb(), playerRelationshipInfo.zza(), playerRelationshipInfo.zzc());
    }

    static java.lang.String zze(com.google.android.gms.games.PlayerRelationshipInfo playerRelationshipInfo) {
        com.google.android.gms.common.internal.Objects.ToStringHelper stringHelper = com.google.android.gms.common.internal.Objects.toStringHelper(playerRelationshipInfo);
        stringHelper.add("FriendStatus", java.lang.Integer.valueOf(playerRelationshipInfo.getFriendStatus()));
        if (playerRelationshipInfo.zzb() != null) {
            stringHelper.add("Nickname", playerRelationshipInfo.zzb());
        }
        if (playerRelationshipInfo.zza() != null) {
            stringHelper.add("InvitationNickname", playerRelationshipInfo.zza());
        }
        if (playerRelationshipInfo.zzc() != null) {
            stringHelper.add("NicknameAbuseReportToken", playerRelationshipInfo.zza());
        }
        return stringHelper.toString();
    }

    static boolean zzf(com.google.android.gms.games.PlayerRelationshipInfo playerRelationshipInfo, java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.PlayerRelationshipInfo)) {
            return false;
        }
        if (obj == playerRelationshipInfo) {
            return true;
        }
        com.google.android.gms.games.PlayerRelationshipInfo playerRelationshipInfo2 = (com.google.android.gms.games.PlayerRelationshipInfo) obj;
        return playerRelationshipInfo2.getFriendStatus() == playerRelationshipInfo.getFriendStatus() && com.google.android.gms.common.internal.Objects.equal(playerRelationshipInfo2.zzb(), playerRelationshipInfo.zzb()) && com.google.android.gms.common.internal.Objects.equal(playerRelationshipInfo2.zza(), playerRelationshipInfo.zza()) && com.google.android.gms.common.internal.Objects.equal(playerRelationshipInfo2.zzc(), playerRelationshipInfo.zzc());
    }

    public final boolean equals(java.lang.Object obj) {
        return zzf(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.PlayerRelationshipInfo freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return this.zza;
    }

    public final int hashCode() {
        return zzd(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return zze(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.games.zzu.zza(this, parcel, i);
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.games.PlayerRelationshipInfo
    public final java.lang.String zzc() {
        return this.zzd;
    }

    public zzt(com.google.android.gms.games.PlayerRelationshipInfo playerRelationshipInfo) {
        this.zza = playerRelationshipInfo.getFriendStatus();
        this.zzb = playerRelationshipInfo.zzb();
        this.zzc = playerRelationshipInfo.zza();
        this.zzd = playerRelationshipInfo.zzc();
    }
}
