package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.TransferPreferences {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgo> CREATOR = new com.google.android.gms.internal.drive.zzgp();
    private final boolean zzbm;
    private final int zzbn;
    private final int zzgy;

    zzgo(int i, int i2, boolean z) {
        this.zzgy = i;
        this.zzbn = i2;
        this.zzbm = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzgy);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzbn);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zzbm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.drive.TransferPreferences
    public final int getNetworkPreference() {
        return this.zzgy;
    }

    @Override // com.google.android.gms.drive.TransferPreferences
    public final boolean isRoamingAllowed() {
        return this.zzbm;
    }

    @Override // com.google.android.gms.drive.TransferPreferences
    public final int getBatteryUsagePreference() {
        return this.zzbn;
    }
}
