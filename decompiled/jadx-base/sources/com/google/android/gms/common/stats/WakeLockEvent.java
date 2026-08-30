package com.google.android.gms.common.stats;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class WakeLockEvent extends com.google.android.gms.common.stats.StatsEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.stats.WakeLockEvent> CREATOR = new com.google.android.gms.common.stats.zza();
    final int zza;
    private final long zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.String zzf;
    private final int zzg;

    @javax.annotation.Nullable
    private final java.util.List zzh;
    private final java.lang.String zzi;
    private final long zzj;
    private final int zzk;
    private final java.lang.String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    WakeLockEvent(int i, long j, int i2, java.lang.String str, int i3, @javax.annotation.Nullable java.util.List list, java.lang.String str2, long j2, int i4, java.lang.String str3, java.lang.String str4, float f, long j3, java.lang.String str5, boolean z) {
        this.zza = i;
        this.zzb = j;
        this.zzc = i2;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i3;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j2;
        this.zzk = i4;
        this.zzl = str4;
        this.zzm = f;
        this.zzn = j3;
        this.zzo = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final java.lang.String zzc() {
        java.util.List list = this.zzh;
        java.lang.String strJoin = list == null ? "" : android.text.TextUtils.join(",", list);
        int i = this.zzk;
        java.lang.String str = this.zze;
        java.lang.String str2 = this.zzl;
        float f = this.zzm;
        java.lang.String str3 = this.zzf;
        int i2 = this.zzg;
        java.lang.String str4 = this.zzd;
        boolean z = this.zzo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\t");
        sb.append(str4);
        sb.append("\t");
        sb.append(i2);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(i);
        sb.append("\t");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("\t");
        if (str2 == null) {
            str2 = "";
        }
        sb.append(str2);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str3 != null ? str3 : "");
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }
}
