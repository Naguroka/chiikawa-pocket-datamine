package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public class zza extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.zza> CREATOR = new com.google.android.gms.drive.zzb();
    private final long zze;
    private final long zzf;
    private final long zzg;
    private volatile java.lang.String zzh = null;

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzg);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zza(long j, long j2, long j3) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(j != -1);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j2 != -1);
        com.google.android.gms.common.internal.Preconditions.checkArgument(j3 != -1);
        this.zze = j;
        this.zzf = j2;
        this.zzg = j3;
    }

    public int hashCode() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.zze);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.zzf);
        java.lang.String strValueOf3 = java.lang.String.valueOf(this.zzg);
        return new java.lang.StringBuilder(java.lang.String.valueOf(strValueOf).length() + java.lang.String.valueOf(strValueOf2).length() + java.lang.String.valueOf(strValueOf3).length()).append(strValueOf).append(strValueOf2).append(strValueOf3).toString().hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == com.google.android.gms.drive.zza.class) {
            com.google.android.gms.drive.zza zzaVar = (com.google.android.gms.drive.zza) obj;
            if (zzaVar.zzf == this.zzf && zzaVar.zzg == this.zzg && zzaVar.zze == this.zze) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        if (this.zzh == null) {
            java.lang.String strValueOf = java.lang.String.valueOf(android.util.Base64.encodeToString(((com.google.android.gms.internal.drive.zzez) ((com.google.android.gms.internal.drive.zzkk) com.google.android.gms.internal.drive.zzez.zzaj().zzk(1).zzc(this.zze).zzd(this.zzf).zze(this.zzg).zzdf())).toByteArray(), 10));
            this.zzh = strValueOf.length() != 0 ? "ChangeSequenceNumber:".concat(strValueOf) : new java.lang.String("ChangeSequenceNumber:");
        }
        return this.zzh;
    }
}
