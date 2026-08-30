package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzba extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    final com.google.android.gms.location.LocationRequest zzb;
    final java.util.List<com.google.android.gms.common.internal.ClientIdentity> zzc;
    final java.lang.String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final java.lang.String zzh;
    final boolean zzi;
    boolean zzj;
    java.lang.String zzk;
    long zzl;
    static final java.util.List<com.google.android.gms.common.internal.ClientIdentity> zza = java.util.Collections.emptyList();
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzba> CREATOR = new com.google.android.gms.internal.location.zzbb();

    zzba(com.google.android.gms.location.LocationRequest locationRequest, java.util.List<com.google.android.gms.common.internal.ClientIdentity> list, java.lang.String str, boolean z, boolean z2, boolean z3, java.lang.String str2, boolean z4, boolean z5, java.lang.String str3, long j) {
        this.zzb = locationRequest;
        this.zzc = list;
        this.zzd = str;
        this.zze = z;
        this.zzf = z2;
        this.zzg = z3;
        this.zzh = str2;
        this.zzi = z4;
        this.zzj = z5;
        this.zzk = str3;
        this.zzl = j;
    }

    public static com.google.android.gms.internal.location.zzba zza(java.lang.String str, com.google.android.gms.location.LocationRequest locationRequest) {
        return new com.google.android.gms.internal.location.zzba(locationRequest, zza, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.location.zzba) {
            com.google.android.gms.internal.location.zzba zzbaVar = (com.google.android.gms.internal.location.zzba) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzb, zzbaVar.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, zzbaVar.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, zzbaVar.zzd) && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && com.google.android.gms.common.internal.Objects.equal(this.zzh, zzbaVar.zzh) && this.zzi == zzbaVar.zzi && this.zzj == zzbaVar.zzj && com.google.android.gms.common.internal.Objects.equal(this.zzk, zzbaVar.zzk)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.zzb);
        if (this.zzd != null) {
            sb.append(" tag=");
            sb.append(this.zzd);
        }
        if (this.zzh != null) {
            sb.append(" moduleId=");
            sb.append(this.zzh);
        }
        if (this.zzk != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.zzk);
        }
        sb.append(" hideAppOps=");
        sb.append(this.zze);
        sb.append(" clients=");
        sb.append(this.zzc);
        sb.append(" forceCoarseLocation=");
        sb.append(this.zzf);
        if (this.zzg) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.zzi) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.zzj) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 5, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 11, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.internal.location.zzba zzb(long j) {
        if (this.zzb.getMaxWaitTime() <= this.zzb.getInterval()) {
            this.zzl = 10000L;
            return this;
        }
        long interval = this.zzb.getInterval();
        long maxWaitTime = this.zzb.getMaxWaitTime();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(120);
        sb.append("could not set max age when location batching is requested, interval=");
        sb.append(interval);
        sb.append("maxWaitTime=");
        sb.append(maxWaitTime);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public final com.google.android.gms.internal.location.zzba zzc(java.lang.String str) {
        this.zzk = str;
        return this;
    }

    public final com.google.android.gms.internal.location.zzba zzd(boolean z) {
        this.zzj = true;
        return this;
    }
}
