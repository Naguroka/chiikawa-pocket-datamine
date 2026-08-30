package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzafn implements com.google.android.gms.internal.ads.zzax {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzafn> CREATOR = new com.google.android.gms.internal.ads.zzafm();
    public final int zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzafn(int i, java.lang.String str, java.lang.String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    zzafn(android.os.Parcel parcel) {
        this.zza = parcel.readInt();
        java.lang.String string = parcel.readString();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        this.zzb = string;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = parcel.createByteArray();
    }

    public static com.google.android.gms.internal.ads.zzafn zzb(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int iZzg = zzdyVar.zzg();
        java.lang.String strZze = com.google.android.gms.internal.ads.zzbb.zze(zzdyVar.zzB(zzdyVar.zzg(), java.nio.charset.StandardCharsets.US_ASCII));
        java.lang.String strZzB = zzdyVar.zzB(zzdyVar.zzg(), java.nio.charset.StandardCharsets.UTF_8);
        int iZzg2 = zzdyVar.zzg();
        int iZzg3 = zzdyVar.zzg();
        int iZzg4 = zzdyVar.zzg();
        int iZzg5 = zzdyVar.zzg();
        int iZzg6 = zzdyVar.zzg();
        byte[] bArr = new byte[iZzg6];
        zzdyVar.zzH(bArr, 0, iZzg6);
        return new com.google.android.gms.internal.ads.zzafn(iZzg, strZze, strZzB, iZzg2, iZzg3, iZzg4, iZzg5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            com.google.android.gms.internal.ads.zzafn zzafnVar = (com.google.android.gms.internal.ads.zzafn) obj;
            if (this.zza == zzafnVar.zza && this.zzb.equals(zzafnVar.zzb) && this.zzc.equals(zzafnVar.zzc) && this.zzd == zzafnVar.zzd && this.zze == zzafnVar.zze && this.zzf == zzafnVar.zzf && this.zzg == zzafnVar.zzg && java.util.Arrays.equals(this.zzh, zzafnVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + java.util.Arrays.hashCode(this.zzh);
    }

    public final java.lang.String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final void zza(com.google.android.gms.internal.ads.zzat zzatVar) {
        zzatVar.zza(this.zzh, this.zza);
    }
}
