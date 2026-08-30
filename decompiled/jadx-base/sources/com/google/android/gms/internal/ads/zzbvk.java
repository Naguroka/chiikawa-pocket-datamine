package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@javax.annotation.ParametersAreNonnullByDefault
public final class zzbvk extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbvk> CREATOR = new com.google.android.gms.internal.ads.zzbvl();
    public final android.os.Bundle zza;
    public final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    public final android.content.pm.ApplicationInfo zzc;
    public final java.lang.String zzd;
    public final java.util.List zze;
    public final android.content.pm.PackageInfo zzf;
    public final java.lang.String zzg;
    public final java.lang.String zzh;
    public com.google.android.gms.internal.ads.zzfed zzi;
    public java.lang.String zzj;
    public final boolean zzk;
    public final boolean zzl;
    public final android.os.Bundle zzm;
    public final android.os.Bundle zzn;

    public zzbvk(android.os.Bundle bundle, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, android.content.pm.ApplicationInfo applicationInfo, java.lang.String str, java.util.List list, android.content.pm.PackageInfo packageInfo, java.lang.String str2, java.lang.String str3, com.google.android.gms.internal.ads.zzfed zzfedVar, java.lang.String str4, boolean z, boolean z2, android.os.Bundle bundle2, android.os.Bundle bundle3) {
        this.zza = bundle;
        this.zzb = versionInfoParcel;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfedVar;
        this.zzj = str4;
        this.zzk = z;
        this.zzl = z2;
        this.zzm = bundle2;
        this.zzn = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        android.os.Bundle bundle = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 1, bundle, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 14, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 15, this.zzn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
