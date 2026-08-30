package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzm extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.ads.internal.client.zzm> CREATOR = new com.google.android.gms.ads.internal.client.zzo();
    public final int zza;

    @java.lang.Deprecated
    public final long zzb;
    public final android.os.Bundle zzc;

    @java.lang.Deprecated
    public final int zzd;
    public final java.util.List zze;
    public final boolean zzf;
    public final int zzg;
    public final boolean zzh;
    public final java.lang.String zzi;
    public final com.google.android.gms.ads.internal.client.zzfx zzj;
    public final android.location.Location zzk;
    public final java.lang.String zzl;
    public final android.os.Bundle zzm;
    public final android.os.Bundle zzn;
    public final java.util.List zzo;
    public final java.lang.String zzp;
    public final java.lang.String zzq;

    @java.lang.Deprecated
    public final boolean zzr;
    public final com.google.android.gms.ads.internal.client.zzc zzs;
    public final int zzt;
    public final java.lang.String zzu;
    public final java.util.List zzv;
    public final int zzw;
    public final java.lang.String zzx;
    public final int zzy;
    public final long zzz;

    public zzm(int i, long j, android.os.Bundle bundle, int i2, java.util.List list, boolean z, int i3, boolean z2, java.lang.String str, com.google.android.gms.ads.internal.client.zzfx zzfxVar, android.location.Location location, java.lang.String str2, android.os.Bundle bundle2, android.os.Bundle bundle3, java.util.List list2, java.lang.String str3, java.lang.String str4, boolean z3, com.google.android.gms.ads.internal.client.zzc zzcVar, int i4, java.lang.String str5, java.util.List list3, int i5, java.lang.String str6, int i6, long j2) {
        this.zza = i;
        this.zzb = j;
        this.zzc = bundle == null ? new android.os.Bundle() : bundle;
        this.zzd = i2;
        this.zze = list;
        this.zzf = z;
        this.zzg = i3;
        this.zzh = z2;
        this.zzi = str;
        this.zzj = zzfxVar;
        this.zzk = location;
        this.zzl = str2;
        this.zzm = bundle2 == null ? new android.os.Bundle() : bundle2;
        this.zzn = bundle3;
        this.zzo = list2;
        this.zzp = str3;
        this.zzq = str4;
        this.zzr = z3;
        this.zzs = zzcVar;
        this.zzt = i4;
        this.zzu = str5;
        this.zzv = list3 == null ? new java.util.ArrayList() : list3;
        this.zzw = i5;
        this.zzx = str6;
        this.zzy = i6;
        this.zzz = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.ads.internal.client.zzm) {
            return zza(obj) && this.zzz == ((com.google.android.gms.ads.internal.client.zzm) obj).zzz;
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Long.valueOf(this.zzb), this.zzc, java.lang.Integer.valueOf(this.zzd), this.zze, java.lang.Boolean.valueOf(this.zzf), java.lang.Integer.valueOf(this.zzg), java.lang.Boolean.valueOf(this.zzh), this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, java.lang.Boolean.valueOf(this.zzr), java.lang.Integer.valueOf(this.zzt), this.zzu, this.zzv, java.lang.Integer.valueOf(this.zzw), this.zzx, java.lang.Integer.valueOf(this.zzy), java.lang.Long.valueOf(this.zzz));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 13, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 14, this.zzn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 15, this.zzo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 16, this.zzp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 17, this.zzq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 18, this.zzr);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 19, this.zzs, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 20, this.zzt);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 21, this.zzu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 22, this.zzv, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 23, this.zzw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 24, this.zzx, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 25, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 26, this.zzz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zza(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.ads.internal.client.zzm)) {
            return false;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) obj;
        return this.zza == zzmVar.zza && this.zzb == zzmVar.zzb && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzc, zzmVar.zzc) && this.zzd == zzmVar.zzd && com.google.android.gms.common.internal.Objects.equal(this.zze, zzmVar.zze) && this.zzf == zzmVar.zzf && this.zzg == zzmVar.zzg && this.zzh == zzmVar.zzh && com.google.android.gms.common.internal.Objects.equal(this.zzi, zzmVar.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzj, zzmVar.zzj) && com.google.android.gms.common.internal.Objects.equal(this.zzk, zzmVar.zzk) && com.google.android.gms.common.internal.Objects.equal(this.zzl, zzmVar.zzl) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzm, zzmVar.zzm) && com.google.android.gms.ads.internal.util.client.zzp.zza(this.zzn, zzmVar.zzn) && com.google.android.gms.common.internal.Objects.equal(this.zzo, zzmVar.zzo) && com.google.android.gms.common.internal.Objects.equal(this.zzp, zzmVar.zzp) && com.google.android.gms.common.internal.Objects.equal(this.zzq, zzmVar.zzq) && this.zzr == zzmVar.zzr && this.zzt == zzmVar.zzt && com.google.android.gms.common.internal.Objects.equal(this.zzu, zzmVar.zzu) && com.google.android.gms.common.internal.Objects.equal(this.zzv, zzmVar.zzv) && this.zzw == zzmVar.zzw && com.google.android.gms.common.internal.Objects.equal(this.zzx, zzmVar.zzx) && this.zzy == zzmVar.zzy;
    }

    public final boolean zzb() {
        return this.zzc.getBoolean("is_sdk_preload", false);
    }
}
