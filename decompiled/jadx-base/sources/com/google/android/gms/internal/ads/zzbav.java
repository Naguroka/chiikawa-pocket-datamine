package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbav extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbav> CREATOR = new com.google.android.gms.internal.ads.zzbaw();
    public final java.lang.String zza;
    public final long zzb;
    public final java.lang.String zzc;
    public final java.lang.String zzd;
    public final java.lang.String zze;
    public final android.os.Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public java.lang.String zzi;
    public int zzj;

    zzbav(java.lang.String str, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.os.Bundle bundle, boolean z, long j2, java.lang.String str5, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new android.os.Bundle() : bundle;
        this.zzg = z;
        this.zzh = j2;
        this.zzi = str5;
        this.zzj = i;
    }

    public static com.google.android.gms.internal.ads.zzbav zza(android.net.Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            java.lang.String str = pathSegments.get(0);
            java.lang.String str2 = pathSegments.get(1);
            java.lang.String host = uri.getHost();
            java.lang.String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            java.lang.String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : java.lang.Long.parseLong(queryParameter2);
            android.os.Bundle bundle = new android.os.Bundle();
            for (java.lang.String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new com.google.android.gms.internal.ads.zzbav(queryParameter, j, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (java.lang.NullPointerException | java.lang.NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
