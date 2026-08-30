package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgf> CREATOR = new com.google.android.gms.internal.drive.zzgg();
    private final android.os.ParcelFileDescriptor zzin;
    private final android.os.IBinder zzio;
    private final java.lang.String zzm;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzin, i | 1, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 3, this.zzio, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzgf(android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.IBinder iBinder, java.lang.String str) {
        this.zzin = parcelFileDescriptor;
        this.zzio = iBinder;
        this.zzm = str;
    }
}
