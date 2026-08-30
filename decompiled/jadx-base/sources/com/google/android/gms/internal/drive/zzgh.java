package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgh extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzgh> CREATOR = new com.google.android.gms.internal.drive.zzgi();
    private final boolean zzea;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzea);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzgh(boolean z) {
        this.zzea = z;
    }
}
