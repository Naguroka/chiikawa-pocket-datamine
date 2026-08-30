package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzdj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.measurement.zzdj> CREATOR = new com.google.android.gms.internal.measurement.zzdk();
    public final int zza;
    public final java.lang.String zzb;
    public final android.content.Intent zzc;

    public zzdj(int i, java.lang.String str, android.content.Intent intent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = intent;
    }

    public static com.google.android.gms.internal.measurement.zzdj zza(android.app.Activity activity) {
        return new com.google.android.gms.internal.measurement.zzdj(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.measurement.zzdj)) {
            return false;
        }
        com.google.android.gms.internal.measurement.zzdj zzdjVar = (com.google.android.gms.internal.measurement.zzdj) obj;
        return this.zza == zzdjVar.zza && java.util.Objects.equals(this.zzb, zzdjVar.zzb) && java.util.Objects.equals(this.zzc, zzdjVar.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
