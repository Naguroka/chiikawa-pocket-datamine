package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfed extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfed> CREATOR = new com.google.android.gms.internal.ads.zzfee();

    @javax.annotation.Nullable
    public final android.content.Context zza;
    public final com.google.android.gms.internal.ads.zzfea zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final java.lang.String zzf;
    public final int zzg;
    private final com.google.android.gms.internal.ads.zzfea[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfed(int i, int i2, int i3, int i4, java.lang.String str, int i5, int i6) {
        com.google.android.gms.internal.ads.zzfea[] zzfeaVarArrValues = com.google.android.gms.internal.ads.zzfea.values();
        this.zzh = zzfeaVarArrValues;
        int[] iArrZza = com.google.android.gms.internal.ads.zzfeb.zza();
        this.zzl = iArrZza;
        int[] iArrZza2 = com.google.android.gms.internal.ads.zzfec.zza();
        this.zzm = iArrZza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = zzfeaVarArrValues[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = iArrZza[i5];
        this.zzk = i6;
        int i7 = iArrZza2[i6];
    }

    @javax.annotation.Nullable
    public static com.google.android.gms.internal.ads.zzfed zza(com.google.android.gms.internal.ads.zzfea zzfeaVar, android.content.Context context) {
        if (zzfeaVar == com.google.android.gms.internal.ads.zzfea.Rewarded) {
            return new com.google.android.gms.internal.ads.zzfed(context, zzfeaVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgi)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgo)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgq)).intValue(), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgs), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgk), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgm));
        }
        if (zzfeaVar == com.google.android.gms.internal.ads.zzfea.Interstitial) {
            return new com.google.android.gms.internal.ads.zzfed(context, zzfeaVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgj)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgp)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgr)).intValue(), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgt), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgl), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgn));
        }
        if (zzfeaVar != com.google.android.gms.internal.ads.zzfea.AppOpen) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzfed(context, zzfeaVar, ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgw)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgy)).intValue(), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgz)).intValue(), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgu), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgv), (java.lang.String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzgx));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zzi;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    private zzfed(@javax.annotation.Nullable android.content.Context context, com.google.android.gms.internal.ads.zzfea zzfeaVar, int i, int i2, int i3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i4;
        this.zzh = com.google.android.gms.internal.ads.zzfea.values();
        this.zzl = com.google.android.gms.internal.ads.zzfeb.zza();
        this.zzm = com.google.android.gms.internal.ads.zzfec.zza();
        this.zza = context;
        this.zzi = zzfeaVar.ordinal();
        this.zzb = zzfeaVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        com.json.ju.g.equals(str3);
        this.zzk = 0;
    }
}
