package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlayerLevelInfo extends com.google.android.gms.games.internal.zzh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.PlayerLevelInfo> CREATOR = new com.google.android.gms.games.zzs();
    private final long zza;
    private final long zzb;
    private final com.google.android.gms.games.PlayerLevel zzc;
    private final com.google.android.gms.games.PlayerLevel zzd;

    public PlayerLevelInfo(long j, long j2, com.google.android.gms.games.PlayerLevel playerLevel, com.google.android.gms.games.PlayerLevel playerLevel2) {
        com.google.android.gms.common.internal.Preconditions.checkState(j != -1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(playerLevel);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(playerLevel2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = playerLevel;
        this.zzd = playerLevel2;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.PlayerLevelInfo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        com.google.android.gms.games.PlayerLevelInfo playerLevelInfo = (com.google.android.gms.games.PlayerLevelInfo) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(playerLevelInfo.zza)) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(this.zzb), java.lang.Long.valueOf(playerLevelInfo.zzb)) && com.google.android.gms.common.internal.Objects.equal(this.zzc, playerLevelInfo.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, playerLevelInfo.zzd);
    }

    public com.google.android.gms.games.PlayerLevel getCurrentLevel() {
        return this.zzc;
    }

    public long getCurrentXpTotal() {
        return this.zza;
    }

    public long getLastLevelUpTimestamp() {
        return this.zzb;
    }

    public com.google.android.gms.games.PlayerLevel getNextLevel() {
        return this.zzd;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Long.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public boolean isMaxLevel() {
        return this.zzc.equals(this.zzd);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 1, getCurrentXpTotal());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, getLastLevelUpTimestamp());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getCurrentLevel(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getNextLevel(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
