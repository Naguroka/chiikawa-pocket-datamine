package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class zzo extends com.google.android.gms.drive.zzu implements com.google.android.gms.drive.events.DriveEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzo> CREATOR = new com.google.android.gms.drive.events.zzp();
    private final com.google.android.gms.common.data.DataHolder zzav;
    private final boolean zzcq;
    private final int zzcr;

    public zzo(com.google.android.gms.common.data.DataHolder dataHolder, boolean z, int i) {
        this.zzav = dataHolder;
        this.zzcq = z;
        this.zzcr = i;
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
        return 3;
    }

    @Override // com.google.android.gms.drive.zzu
    public final void zza(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzav, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 3, this.zzcq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzcr);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.common.data.DataHolder zzz() {
        return this.zzav;
    }

    public final boolean zzaa() {
        return this.zzcq;
    }

    public final int zzab() {
        return this.zzcr;
    }
}
