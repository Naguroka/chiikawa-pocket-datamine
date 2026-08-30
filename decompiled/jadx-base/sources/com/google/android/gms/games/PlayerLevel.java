package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class PlayerLevel extends com.google.android.gms.games.internal.zzh {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.PlayerLevel> CREATOR = new com.google.android.gms.games.zzr();
    private final int zza;
    private final long zzb;
    private final long zzc;

    public PlayerLevel(int i, long j, long j2) {
        com.google.android.gms.common.internal.Preconditions.checkState(j >= 0, "Min XP must be positive!");
        com.google.android.gms.common.internal.Preconditions.checkState(j2 > j, "Max XP must be more than min XP!");
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.games.PlayerLevel)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        com.google.android.gms.games.PlayerLevel playerLevel = (com.google.android.gms.games.PlayerLevel) obj;
        return com.google.android.gms.common.internal.Objects.equal(java.lang.Integer.valueOf(playerLevel.getLevelNumber()), java.lang.Integer.valueOf(getLevelNumber())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(playerLevel.getMinXp()), java.lang.Long.valueOf(getMinXp())) && com.google.android.gms.common.internal.Objects.equal(java.lang.Long.valueOf(playerLevel.getMaxXp()), java.lang.Long.valueOf(getMaxXp()));
    }

    public int getLevelNumber() {
        return this.zza;
    }

    public long getMaxXp() {
        return this.zzc;
    }

    public long getMinXp() {
        return this.zzb;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Long.valueOf(this.zzc));
    }

    public java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("LevelNumber", java.lang.Integer.valueOf(getLevelNumber())).add("MinXp", java.lang.Long.valueOf(getMinXp())).add("MaxXp", java.lang.Long.valueOf(getMaxXp())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getLevelNumber());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, getMinXp());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, getMaxXp());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
