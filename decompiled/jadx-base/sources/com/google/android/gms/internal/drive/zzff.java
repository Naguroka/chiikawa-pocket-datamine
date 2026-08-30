package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzff extends com.google.android.gms.drive.zzu {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzff> CREATOR = new com.google.android.gms.internal.drive.zzfg();
    private final com.google.android.gms.common.data.DataHolder zzhr;
    private final java.util.List<com.google.android.gms.drive.DriveId> zzhs;
    private final com.google.android.gms.drive.zza zzht;
    private final boolean zzhu;

    @Override // com.google.android.gms.drive.zzu
    protected final void zza(android.os.Parcel parcel, int i) {
        int i2 = i | 1;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzhr, i2, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 3, this.zzhs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzht, i2, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzhu);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzff(com.google.android.gms.common.data.DataHolder dataHolder, java.util.List<com.google.android.gms.drive.DriveId> list, com.google.android.gms.drive.zza zzaVar, boolean z) {
        this.zzhr = dataHolder;
        this.zzhs = list;
        this.zzht = zzaVar;
        this.zzhu = z;
    }
}
