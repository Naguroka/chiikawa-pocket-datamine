package com.google.android.gms.internal.games_v2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.games_v2.zzaf> CREATOR = new com.google.android.gms.internal.games_v2.zzag();
    private final android.content.Intent zza;

    zzaf(android.content.Intent intent) {
        this.zza = intent;
    }

    public static com.google.android.gms.internal.games_v2.zzaf zza(android.content.Intent intent) {
        return new com.google.android.gms.internal.games_v2.zzaf(intent);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.games_v2.zzaf) {
            return com.google.android.gms.common.internal.Objects.equal(this.zza, ((com.google.android.gms.internal.games_v2.zzaf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        android.content.Intent intent = this.zza;
        if (intent != null) {
            return intent.hashCode();
        }
        return 0;
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("resultData", this.zza).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
