package com.google.android.gms.games;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zza extends com.google.android.gms.games.internal.zzh implements com.google.android.gms.games.CurrentPlayerInfo {
    public static final android.os.Parcelable.Creator<com.google.android.gms.games.zza> CREATOR = new com.google.android.gms.games.zzb();
    private final int zza;

    public zza(int i) {
        this.zza = i;
    }

    static int zza(com.google.android.gms.games.CurrentPlayerInfo currentPlayerInfo) {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(currentPlayerInfo.getFriendsListVisibilityStatus()));
    }

    static java.lang.String zzb(com.google.android.gms.games.CurrentPlayerInfo currentPlayerInfo) {
        com.google.android.gms.common.internal.Objects.ToStringHelper stringHelper = com.google.android.gms.common.internal.Objects.toStringHelper(currentPlayerInfo);
        stringHelper.add("FriendsListVisibilityStatus", java.lang.Integer.valueOf(currentPlayerInfo.getFriendsListVisibilityStatus()));
        return stringHelper.toString();
    }

    static boolean zzc(com.google.android.gms.games.CurrentPlayerInfo currentPlayerInfo, java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.games.CurrentPlayerInfo) {
            return obj == currentPlayerInfo || ((com.google.android.gms.games.CurrentPlayerInfo) obj).getFriendsListVisibilityStatus() == currentPlayerInfo.getFriendsListVisibilityStatus();
        }
        return false;
    }

    public final boolean equals(java.lang.Object obj) {
        return zzc(this, obj);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ com.google.android.gms.games.CurrentPlayerInfo freeze() {
        return this;
    }

    @Override // com.google.android.gms.games.CurrentPlayerInfo
    public final int getFriendsListVisibilityStatus() {
        return this.zza;
    }

    public final int hashCode() {
        return zza(this);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    public final java.lang.String toString() {
        return zzb(this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.games.zzb.zza(this, parcel, i);
    }

    public zza(com.google.android.gms.games.CurrentPlayerInfo currentPlayerInfo) {
        this.zza = currentPlayerInfo.getFriendsListVisibilityStatus();
    }
}
