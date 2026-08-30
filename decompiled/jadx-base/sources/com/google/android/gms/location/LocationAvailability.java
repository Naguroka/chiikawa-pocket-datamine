package com.google.android.gms.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocationAvailability extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.location.LocationAvailability> CREATOR = new com.google.android.gms.location.zzbe();

    @java.lang.Deprecated
    int zza;

    @java.lang.Deprecated
    int zzb;
    long zzc;
    int zzd;
    com.google.android.gms.location.zzbo[] zze;

    LocationAvailability(int i, int i2, int i3, long j, com.google.android.gms.location.zzbo[] zzboVarArr) {
        this.zzd = i;
        this.zza = i2;
        this.zzb = i3;
        this.zzc = j;
        this.zze = zzboVarArr;
    }

    public static com.google.android.gms.location.LocationAvailability extractLocationAvailability(android.content.Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            android.os.Bundle extras = intent.getExtras();
            if (extras != null) {
                return (com.google.android.gms.location.LocationAvailability) extras.getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
            }
            return null;
        } catch (java.lang.ClassCastException unused) {
            return null;
        }
    }

    public static boolean hasLocationAvailability(android.content.Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.location.LocationAvailability) {
            com.google.android.gms.location.LocationAvailability locationAvailability = (com.google.android.gms.location.LocationAvailability) obj;
            if (this.zza == locationAvailability.zza && this.zzb == locationAvailability.zzb && this.zzc == locationAvailability.zzc && this.zzd == locationAvailability.zzd && java.util.Arrays.equals(this.zze, locationAvailability.zze)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zzd), java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb), java.lang.Long.valueOf(this.zzc), this.zze);
    }

    public boolean isLocationAvailable() {
        return this.zzd < 1000;
    }

    public java.lang.String toString() {
        boolean zIsLocationAvailable = isLocationAvailable();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(zIsLocationAvailable);
        sb.append(com.ironsource.y8.i.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 5, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
