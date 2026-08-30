package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationRequest> CREATOR = new com.google.android.gms.location.zzbf();
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;
    public static final int PRIORITY_HIGH_ACCURACY = 100;
    public static final int PRIORITY_LOW_POWER = 104;
    public static final int PRIORITY_NO_POWER = 105;
    int zza;
    long zzb;
    long zzc;
    boolean zzd;
    long zze;
    int zzf;
    float zzg;
    long zzh;
    boolean zzi;

    @java.lang.Deprecated
    public LocationRequest() {
        this.zza = 102;
        this.zzb = 3600000L;
        this.zzc = com.bytedance.sdk.openadsdk.TTAdConstant.AD_MAX_EVENT_TIME;
        this.zzd = false;
        this.zze = Long.MAX_VALUE;
        this.zzf = Integer.MAX_VALUE;
        this.zzg = 0.0f;
        this.zzh = 0L;
        this.zzi = false;
    }

    public static com.google.android.gms.location.LocationRequest create() {
        com.google.android.gms.location.LocationRequest locationRequest = new com.google.android.gms.location.LocationRequest();
        locationRequest.setWaitForAccurateLocation(true);
        return locationRequest;
    }

    private static void zza(long j) {
        if (j >= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(38);
        sb.append("invalid interval: ");
        sb.append(j);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.location.LocationRequest) {
            com.google.android.gms.location.LocationRequest locationRequest = (com.google.android.gms.location.LocationRequest) obj;
            if (this.zza == locationRequest.zza && this.zzb == locationRequest.zzb && this.zzc == locationRequest.zzc && this.zzd == locationRequest.zzd && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && getMaxWaitTime() == locationRequest.getMaxWaitTime() && this.zzi == locationRequest.zzi) {
                return true;
            }
        }
        return false;
    }

    public long getExpirationTime() {
        return this.zze;
    }

    public long getFastestInterval() {
        return this.zzc;
    }

    public long getInterval() {
        return this.zzb;
    }

    public long getMaxWaitTime() {
        long j = this.zzh;
        long j2 = this.zzb;
        return j < j2 ? j2 : j;
    }

    public int getNumUpdates() {
        return this.zzf;
    }

    public int getPriority() {
        return this.zza;
    }

    public float getSmallestDisplacement() {
        return this.zzg;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), java.lang.Float.valueOf(this.zzg), java.lang.Long.valueOf(this.zzh));
    }

    public boolean isFastestIntervalExplicitlySet() {
        return this.zzd;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzi;
    }

    public com.google.android.gms.location.LocationRequest setExpirationDuration(long j) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = j <= Long.MAX_VALUE - jElapsedRealtime ? j + jElapsedRealtime : Long.MAX_VALUE;
        this.zze = j2;
        if (j2 < 0) {
            this.zze = 0L;
        }
        return this;
    }

    public com.google.android.gms.location.LocationRequest setExpirationTime(long j) {
        this.zze = j;
        if (j < 0) {
            this.zze = 0L;
        }
        return this;
    }

    public com.google.android.gms.location.LocationRequest setFastestInterval(long j) {
        zza(j);
        this.zzd = true;
        this.zzc = j;
        return this;
    }

    public com.google.android.gms.location.LocationRequest setInterval(long j) {
        zza(j);
        this.zzb = j;
        if (!this.zzd) {
            this.zzc = (long) (j / 6.0d);
        }
        return this;
    }

    public com.google.android.gms.location.LocationRequest setMaxWaitTime(long j) {
        zza(j);
        this.zzh = j;
        return this;
    }

    public com.google.android.gms.location.LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzf = i;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
        sb.append("invalid numUpdates: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public com.google.android.gms.location.LocationRequest setPriority(int i) {
        if (i == 100 || i == 102 || i == 104 || i == 105) {
            this.zza = i;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public com.google.android.gms.location.LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(37);
        sb.append("invalid displacement: ");
        sb.append(f);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public com.google.android.gms.location.LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzi = z;
        return this;
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Request[");
        int i = this.zza;
        if (i == 100) {
            str = "PRIORITY_HIGH_ACCURACY";
        } else if (i == 102) {
            str = "PRIORITY_BALANCED_POWER_ACCURACY";
        } else if (i != 104) {
            str = i != 105 ? "???" : "PRIORITY_NO_POWER";
        } else {
            str = "PRIORITY_LOW_POWER";
        }
        sb.append(str);
        if (this.zza != 105) {
            sb.append(" requested=");
            sb.append(this.zzb);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.zzc);
        sb.append("ms");
        if (this.zzh > this.zzb) {
            sb.append(" maxWait=");
            sb.append(this.zzh);
            sb.append("ms");
        }
        if (this.zzg > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.zzg);
            sb.append("m");
        }
        long j = this.zze;
        if (j != Long.MAX_VALUE) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - jElapsedRealtime);
            sb.append("ms");
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.zzf);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = z;
        this.zze = j3;
        this.zzf = i2;
        this.zzg = f;
        this.zzh = j4;
        this.zzi = z2;
    }
}
