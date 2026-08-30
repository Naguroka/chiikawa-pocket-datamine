package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public class DriveId extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.DriveId> CREATOR = new com.google.android.gms.drive.zzk();
    public static final int RESOURCE_TYPE_FILE = 0;
    public static final int RESOURCE_TYPE_FOLDER = 1;
    public static final int RESOURCE_TYPE_UNKNOWN = -1;
    private final java.lang.String zzad;
    private final long zzae;
    private final int zzaf;
    private final long zzf;
    private volatile java.lang.String zzh = null;
    private volatile java.lang.String zzag = null;

    public static com.google.android.gms.drive.DriveId zza(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        return new com.google.android.gms.drive.DriveId(str, -1L, -1L, -1);
    }

    public java.lang.String getResourceId() {
        return this.zzad;
    }

    public int getResourceType() {
        return this.zzaf;
    }

    public com.google.android.gms.drive.DriveFile asDriveFile() {
        if (this.zzaf == 1) {
            throw new java.lang.IllegalStateException("This DriveId corresponds to a folder. Call asDriveFolder instead.");
        }
        return new com.google.android.gms.internal.drive.zzbn(this);
    }

    public com.google.android.gms.drive.DriveFolder asDriveFolder() {
        if (this.zzaf == 0) {
            throw new java.lang.IllegalStateException("This DriveId corresponds to a file. Call asDriveFile instead.");
        }
        return new com.google.android.gms.internal.drive.zzbs(this);
    }

    public com.google.android.gms.drive.DriveResource asDriveResource() {
        int i = this.zzaf;
        if (i == 1) {
            return asDriveFolder();
        }
        if (i == 0) {
            return asDriveFile();
        }
        return new com.google.android.gms.internal.drive.zzdp(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzad, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.zzae);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 4, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzaf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public DriveId(java.lang.String str, long j, long j2, int i) {
        this.zzad = str;
        boolean z = true;
        com.google.android.gms.common.internal.Preconditions.checkArgument(!"".equals(str));
        if (str == null && j == -1) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z);
        this.zzae = j;
        this.zzf = j2;
        this.zzaf = i;
    }

    public int hashCode() {
        if (this.zzae == -1) {
            return this.zzad.hashCode();
        }
        java.lang.String strValueOf = java.lang.String.valueOf(java.lang.String.valueOf(this.zzf));
        java.lang.String strValueOf2 = java.lang.String.valueOf(java.lang.String.valueOf(this.zzae));
        return (strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new java.lang.String(strValueOf)).hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        java.lang.String str;
        if (obj != null && obj.getClass() == com.google.android.gms.drive.DriveId.class) {
            com.google.android.gms.drive.DriveId driveId = (com.google.android.gms.drive.DriveId) obj;
            if (driveId.zzf != this.zzf) {
                return false;
            }
            long j = driveId.zzae;
            if (j == -1 && this.zzae == -1) {
                return driveId.zzad.equals(this.zzad);
            }
            java.lang.String str2 = this.zzad;
            if (str2 != null && (str = driveId.zzad) != null) {
                return j == this.zzae && str.equals(str2);
            }
            if (j == this.zzae) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String encodeToString() {
        if (this.zzh == null) {
            com.google.android.gms.internal.drive.zzfb.zza zzaVarZzm = com.google.android.gms.internal.drive.zzfb.zzan().zzm(1);
            java.lang.String str = this.zzad;
            if (str == null) {
                str = "";
            }
            java.lang.String strValueOf = java.lang.String.valueOf(android.util.Base64.encodeToString(((com.google.android.gms.internal.drive.zzfb) ((com.google.android.gms.internal.drive.zzkk) zzaVarZzm.zze(str).zzg(this.zzae).zzh(this.zzf).zzn(this.zzaf).zzdf())).toByteArray(), 10));
            this.zzh = strValueOf.length() != 0 ? "DriveId:".concat(strValueOf) : new java.lang.String("DriveId:");
        }
        return this.zzh;
    }

    public final java.lang.String toInvariantString() {
        if (this.zzag == null) {
            this.zzag = android.util.Base64.encodeToString(((com.google.android.gms.internal.drive.zzfd) ((com.google.android.gms.internal.drive.zzkk) com.google.android.gms.internal.drive.zzfd.zzap().zzi(this.zzae).zzj(this.zzf).zzdf())).toByteArray(), 10);
        }
        return this.zzag;
    }

    public java.lang.String toString() {
        return encodeToString();
    }

    public static com.google.android.gms.drive.DriveId decodeFromString(java.lang.String str) {
        boolean zStartsWith = str.startsWith("DriveId:");
        java.lang.String strValueOf = java.lang.String.valueOf(str);
        com.google.android.gms.common.internal.Preconditions.checkArgument(zStartsWith, strValueOf.length() != 0 ? "Invalid DriveId: ".concat(strValueOf) : new java.lang.String("Invalid DriveId: "));
        return zza(android.util.Base64.decode(str.substring(8), 10));
    }

    private static com.google.android.gms.drive.DriveId zza(byte[] bArr) {
        try {
            com.google.android.gms.internal.drive.zzfb zzfbVarZza = com.google.android.gms.internal.drive.zzfb.zza(bArr, com.google.android.gms.internal.drive.zzjx.zzcj());
            return new com.google.android.gms.drive.DriveId("".equals(zzfbVarZza.getResourceId()) ? null : zzfbVarZza.getResourceId(), zzfbVarZza.zzal(), zzfbVarZza.zzam(), zzfbVarZza.getResourceType());
        } catch (com.google.android.gms.internal.drive.zzkq unused) {
            throw new java.lang.IllegalArgumentException();
        }
    }
}
