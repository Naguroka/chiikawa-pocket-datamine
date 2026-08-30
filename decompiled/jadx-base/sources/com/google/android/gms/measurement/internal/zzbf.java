package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements java.lang.Iterable<java.lang.String> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzbf> CREATOR = new com.google.android.gms.measurement.internal.zzbg();
    private final android.os.Bundle zza;

    zzbf(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<java.lang.String> iterator() {
        return new com.google.android.gms.measurement.internal.zzbe(this);
    }

    public final java.lang.String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 2, zzc(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zza.size();
    }

    public final android.os.Bundle zzc() {
        return new android.os.Bundle(this.zza);
    }

    final java.lang.Double zzd(java.lang.String str) {
        return java.lang.Double.valueOf(this.zza.getDouble("value"));
    }

    final java.lang.Long zze(java.lang.String str) {
        return java.lang.Long.valueOf(this.zza.getLong(str));
    }

    final java.lang.Object zzf(java.lang.String str) {
        return this.zza.get(str);
    }

    final java.lang.String zzg(java.lang.String str) {
        return this.zza.getString(str);
    }
}
