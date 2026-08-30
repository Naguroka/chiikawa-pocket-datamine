package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzqb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzqb> CREATOR = new com.google.android.gms.measurement.internal.zzqc();
    public final int zza;
    public final java.lang.String zzb;
    public final long zzc;
    public final java.lang.Long zzd;
    public final java.lang.String zze;
    public final java.lang.String zzf;
    public final java.lang.Double zzg;

    zzqb(int i, java.lang.String str, long j, java.lang.Long l, java.lang.Float f, java.lang.String str2, java.lang.String str3, java.lang.Double d) {
        this.zza = i;
        this.zzb = str;
        this.zzc = j;
        this.zzd = l;
        this.zzg = i == 1 ? f != null ? java.lang.Double.valueOf(f.doubleValue()) : null : d;
        this.zze = str2;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.measurement.internal.zzqc.zza(this, parcel, i);
    }

    public final java.lang.Object zza() {
        java.lang.Long l = this.zzd;
        if (l != null) {
            return l;
        }
        java.lang.Double d = this.zzg;
        if (d != null) {
            return d;
        }
        java.lang.String str = this.zze;
        if (str != null) {
            return str;
        }
        return null;
    }

    zzqb(com.google.android.gms.measurement.internal.zzqd zzqdVar) {
        this(zzqdVar.zzc, zzqdVar.zzd, zzqdVar.zze, zzqdVar.zzb);
    }

    zzqb(java.lang.String str, long j, java.lang.Object obj, java.lang.String str2) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza = 2;
        this.zzb = str;
        this.zzc = j;
        this.zzf = str2;
        if (obj == null) {
            this.zzd = null;
            this.zzg = null;
            this.zze = null;
            return;
        }
        if (obj instanceof java.lang.Long) {
            this.zzd = (java.lang.Long) obj;
            this.zzg = null;
            this.zze = null;
        } else if (obj instanceof java.lang.String) {
            this.zzd = null;
            this.zzg = null;
            this.zze = (java.lang.String) obj;
        } else {
            if (obj instanceof java.lang.Double) {
                this.zzd = null;
                this.zzg = (java.lang.Double) obj;
                this.zze = null;
                return;
            }
            throw new java.lang.IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
