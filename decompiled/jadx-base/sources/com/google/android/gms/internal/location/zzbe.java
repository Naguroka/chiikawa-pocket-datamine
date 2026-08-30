package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbe extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.location.Geofence {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzbe> CREATOR = new com.google.android.gms.internal.location.zzbf();
    private final java.lang.String zza;
    private final long zzb;
    private final short zzc;
    private final double zzd;
    private final double zze;
    private final float zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;

    public zzbe(java.lang.String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            java.lang.String strValueOf = java.lang.String.valueOf(str);
            throw new java.lang.IllegalArgumentException(strValueOf.length() != 0 ? "requestId is null or too long: ".concat(strValueOf) : new java.lang.String("requestId is null or too long: "));
        }
        if (f <= 0.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (d > 90.0d || d < -90.0d) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new java.lang.IllegalArgumentException(sb3.toString());
        }
        int i4 = i & 7;
        if (i4 == 0) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new java.lang.IllegalArgumentException(sb4.toString());
        }
        this.zzc = s;
        this.zza = str;
        this.zzd = d;
        this.zze = d2;
        this.zzf = f;
        this.zzb = j;
        this.zzg = i4;
        this.zzh = i2;
        this.zzi = i3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.location.zzbe) {
            com.google.android.gms.internal.location.zzbe zzbeVar = (com.google.android.gms.internal.location.zzbe) obj;
            if (this.zzf == zzbeVar.zzf && this.zzd == zzbeVar.zzd && this.zze == zzbeVar.zze && this.zzc == zzbeVar.zzc) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final java.lang.String getRequestId() {
        return this.zza;
    }

    public final int hashCode() {
        long jDoubleToLongBits = java.lang.Double.doubleToLongBits(this.zzd);
        long jDoubleToLongBits2 = java.lang.Double.doubleToLongBits(this.zze);
        return ((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + java.lang.Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[9];
        short s = this.zzc;
        if (s != -1) {
            str = s != 1 ? "UNKNOWN" : "CIRCLE";
        } else {
            str = "INVALID";
        }
        objArr[0] = str;
        objArr[1] = this.zza.replaceAll("\\p{C}", "?");
        objArr[2] = java.lang.Integer.valueOf(this.zzg);
        objArr[3] = java.lang.Double.valueOf(this.zzd);
        objArr[4] = java.lang.Double.valueOf(this.zze);
        objArr[5] = java.lang.Float.valueOf(this.zzf);
        objArr[6] = java.lang.Integer.valueOf(this.zzh / 1000);
        objArr[7] = java.lang.Integer.valueOf(this.zzi);
        objArr[8] = java.lang.Long.valueOf(this.zzb);
        return java.lang.String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
