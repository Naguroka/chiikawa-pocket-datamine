package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.util.zzbb> CREATOR = new com.google.android.gms.ads.internal.util.zzbc();
    public final java.lang.String zza;
    public final int zzb;

    zzbb(java.lang.String str, int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    public static com.google.android.gms.ads.internal.util.zzbb zzb(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = com.google.android.gms.internal.ads.zzfdk.zza(th);
        return new com.google.android.gms.ads.internal.util.zzbb(com.google.android.gms.internal.ads.zzfve.zzd(th.getMessage()) ? zzeVarZza.zzb : th.getMessage(), zzeVarZza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.ads.internal.util.zzba zza() {
        return new com.google.android.gms.ads.internal.util.zzba(this.zza, this.zzb);
    }
}
