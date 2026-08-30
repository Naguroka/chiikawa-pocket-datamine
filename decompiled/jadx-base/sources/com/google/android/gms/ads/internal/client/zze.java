package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zze extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zze> CREATOR = new com.google.android.gms.ads.internal.client.zzf();
    public final int zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public com.google.android.gms.ads.internal.client.zze zzd;
    public android.os.IBinder zze;

    public zze(int i, java.lang.String str, java.lang.String str2, com.google.android.gms.ads.internal.client.zze zzeVar, android.os.IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.ads.AdError zza() {
        com.google.android.gms.ads.AdError adError;
        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzd;
        if (zzeVar == null) {
            adError = null;
        } else {
            java.lang.String str = zzeVar.zzc;
            adError = new com.google.android.gms.ads.AdError(zzeVar.zza, zzeVar.zzb, str);
        }
        return new com.google.android.gms.ads.AdError(this.zza, this.zzb, this.zzc, adError);
    }

    public final com.google.android.gms.ads.LoadAdError zzb() {
        com.google.android.gms.ads.AdError adError;
        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzd;
        com.google.android.gms.ads.internal.client.zzdy zzdwVar = null;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new com.google.android.gms.ads.AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i = this.zza;
        java.lang.String str = this.zzb;
        java.lang.String str2 = this.zzc;
        android.os.IBinder iBinder = this.zze;
        if (iBinder != null) {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdwVar = iInterfaceQueryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdy ? (com.google.android.gms.ads.internal.client.zzdy) iInterfaceQueryLocalInterface : new com.google.android.gms.ads.internal.client.zzdw(iBinder);
        }
        return new com.google.android.gms.ads.LoadAdError(i, str, str2, adError, com.google.android.gms.ads.ResponseInfo.zza(zzdwVar));
    }
}
