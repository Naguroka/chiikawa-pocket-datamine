package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzft extends com.google.android.gms.drive.zzu {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzft> CREATOR = new com.google.android.gms.internal.drive.zzfu();
    final boolean zzea;
    final com.google.android.gms.common.data.DataHolder zzii;

    @Override // com.google.android.gms.drive.zzu
    protected final void zza(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzii, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzea);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzft(com.google.android.gms.common.data.DataHolder dataHolder, boolean z) {
        this.zzii = dataHolder;
        this.zzea = z;
    }

    public final com.google.android.gms.common.data.DataHolder zzau() {
        return this.zzii;
    }
}
