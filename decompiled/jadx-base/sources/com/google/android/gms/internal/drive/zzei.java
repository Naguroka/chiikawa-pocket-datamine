package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public final class zzei extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.FileUploadPreferences {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzei> CREATOR = new com.google.android.gms.internal.drive.zzej();
    private int zzbn;
    private int zzgy;
    private boolean zzgz;

    private static boolean zzh(int i) {
        return i == 1 || i == 2;
    }

    private static boolean zzi(int i) {
        return i == 256 || i == 257;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzgy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzbn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzgz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzei(int i, int i2, boolean z) {
        this.zzgy = i;
        this.zzbn = i2;
        this.zzgz = z;
    }

    public zzei(com.google.android.gms.drive.TransferPreferences transferPreferences) {
        this(transferPreferences.getNetworkPreference(), transferPreferences.getBatteryUsagePreference(), transferPreferences.isRoamingAllowed());
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final int getNetworkTypePreference() {
        if (zzh(this.zzgy)) {
            return this.zzgy;
        }
        return 0;
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final void setNetworkTypePreference(int i) {
        if (!zzh(i)) {
            throw new java.lang.IllegalArgumentException("Invalid data connection preference value.");
        }
        this.zzgy = i;
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final int getBatteryUsagePreference() {
        if (zzi(this.zzbn)) {
            return this.zzbn;
        }
        return 0;
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final void setBatteryUsagePreference(int i) {
        if (!zzi(i)) {
            throw new java.lang.IllegalArgumentException("Invalid battery usage preference value.");
        }
        this.zzbn = i;
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final boolean isRoamingAllowed() {
        return this.zzgz;
    }

    @Override // com.google.android.gms.drive.FileUploadPreferences
    public final void setRoamingAllowed(boolean z) {
        this.zzgz = z;
    }
}
