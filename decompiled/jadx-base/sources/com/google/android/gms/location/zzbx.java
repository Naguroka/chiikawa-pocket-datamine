package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.zzbx> CREATOR = new com.google.android.gms.location.zzby();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    public zzbx(int i, int i2, int i3, int i4) {
        com.google.android.gms.common.internal.Preconditions.checkState(i >= 0 && i <= 23, "Start hour must be in range [0, 23].");
        com.google.android.gms.common.internal.Preconditions.checkState(i2 >= 0 && i2 <= 59, "Start minute must be in range [0, 59].");
        com.google.android.gms.common.internal.Preconditions.checkState(i3 >= 0 && i3 <= 23, "End hour must be in range [0, 23].");
        com.google.android.gms.common.internal.Preconditions.checkState(i4 >= 0 && i4 <= 59, "End minute must be in range [0, 59].");
        com.google.android.gms.common.internal.Preconditions.checkState(((i + i2) + i3) + i4 > 0, "Parameters can't be all 0.");
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.location.zzbx)) {
            return false;
        }
        com.google.android.gms.location.zzbx zzbxVar = (com.google.android.gms.location.zzbx) obj;
        return this.zza == zzbxVar.zza && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Integer.valueOf(this.zzc), java.lang.Integer.valueOf(this.zzd));
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(i);
        sb.append(", startMinute=");
        sb.append(i2);
        sb.append(", endHour=");
        sb.append(i3);
        sb.append(", endMinute=");
        sb.append(i4);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
