package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.games_v2.zzy> CREATOR = new com.google.android.gms.internal.games_v2.zzz();
    private final int zza;
    private final com.google.android.gms.internal.games_v2.zzaf zzb;

    zzy(int i, com.google.android.gms.internal.games_v2.zzaf zzafVar) {
        this.zza = i;
        this.zzb = zzafVar;
    }

    public static com.google.android.gms.internal.games_v2.zzy zzb(int i) {
        return new com.google.android.gms.internal.games_v2.zzy(i, null);
    }

    public static com.google.android.gms.internal.games_v2.zzy zzc(int i, com.google.android.gms.internal.games_v2.zzaf zzafVar) {
        return new com.google.android.gms.internal.games_v2.zzy(i, zzafVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.games_v2.zzy)) {
            return false;
        }
        com.google.android.gms.internal.games_v2.zzy zzyVar = (com.google.android.gms.internal.games_v2.zzy) obj;
        return this.zza == zzyVar.zza && com.google.android.gms.common.internal.Objects.equal(this.zzb, zzyVar.zzb);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), this.zzb);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("signInType", java.lang.Integer.valueOf(this.zza)).add("previousStepResolutionResult", this.zzb).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb == null;
    }
}
