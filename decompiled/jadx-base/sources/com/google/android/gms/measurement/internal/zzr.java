package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.measurement.internal.zzr> CREATOR = new com.google.android.gms.measurement.internal.zzs();
    public final java.lang.String zzA;
    public final int zzB;
    public final long zzC;
    public final java.lang.String zzD;
    public final java.lang.String zzE;
    public final long zzF;
    public final int zzG;
    public final java.lang.String zza;
    public final java.lang.String zzb;
    public final java.lang.String zzc;
    public final java.lang.String zzd;
    public final long zze;
    public final long zzf;
    public final java.lang.String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final java.lang.String zzk;
    public final long zzl;
    public final int zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final java.lang.String zzp;
    public final java.lang.Boolean zzq;
    public final long zzr;
    public final java.util.List zzs;
    public final java.lang.String zzt;
    public final java.lang.String zzu;
    public final java.lang.String zzv;
    public final java.lang.String zzw;
    public final boolean zzx;
    public final long zzy;
    public final int zzz;

    zzr(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, long j2, long j3, java.lang.String str5, boolean z, boolean z2, java.lang.String str6, long j4, int i, boolean z3, boolean z4, java.lang.String str7, java.lang.Boolean bool, long j5, java.util.List list, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, boolean z5, long j6, int i2, java.lang.String str12, int i3, long j7, java.lang.String str13, java.lang.String str14, long j8, int i4) {
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = true == android.text.TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j;
        this.zzd = str4;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = str7;
        this.zzq = bool;
        this.zzr = j5;
        this.zzs = list;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = str10;
        this.zzw = str11;
        this.zzx = z5;
        this.zzy = j6;
        this.zzz = i2;
        this.zzA = str12;
        this.zzB = i3;
        this.zzC = j7;
        this.zzD = str13;
        this.zzE = str14;
        this.zzF = j8;
        this.zzG = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 6, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 15, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 16, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 19, this.zzp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 22, this.zzr);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 23, this.zzs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 24, this.zzt, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 25, this.zzu, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 26, this.zzv, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 27, this.zzw, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 28, this.zzx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 29, this.zzy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 30, this.zzz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 31, this.zzA, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 32, this.zzB);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 34, this.zzC);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 35, this.zzD, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 36, this.zzE, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 37, this.zzF);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 38, this.zzG);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzr(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j, long j2, java.lang.String str5, boolean z, boolean z2, long j3, java.lang.String str6, long j4, int i, boolean z3, boolean z4, java.lang.String str7, java.lang.Boolean bool, long j5, java.util.List list, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, boolean z5, long j6, int i2, java.lang.String str12, int i3, long j7, java.lang.String str13, java.lang.String str14, long j8, int i4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j3;
        this.zzd = str4;
        this.zze = j;
        this.zzf = j2;
        this.zzg = str5;
        this.zzh = z;
        this.zzi = z2;
        this.zzk = str6;
        this.zzl = j4;
        this.zzm = i;
        this.zzn = z3;
        this.zzo = z4;
        this.zzp = str7;
        this.zzq = bool;
        this.zzr = j5;
        this.zzs = list;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = str10;
        this.zzw = str11;
        this.zzx = z5;
        this.zzy = j6;
        this.zzz = i2;
        this.zzA = str12;
        this.zzB = i3;
        this.zzC = j7;
        this.zzD = str13;
        this.zzE = str14;
        this.zzF = j8;
        this.zzG = i4;
    }
}
