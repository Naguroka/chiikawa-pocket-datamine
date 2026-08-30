package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.drive.zzfp> CREATOR = new com.google.android.gms.internal.drive.zzfq();
    private final int zzda;
    private final com.google.android.gms.drive.events.ChangeEvent zzib;
    private final com.google.android.gms.drive.events.CompletionEvent zzic;
    private final com.google.android.gms.drive.events.zzo zzid;
    private final com.google.android.gms.drive.events.zzb zzie;
    private final com.google.android.gms.drive.events.zzv zzif;
    private final com.google.android.gms.drive.events.zzr zzig;

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzda);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzib, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzic, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzid, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzie, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzif, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzig, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    zzfp(int i, com.google.android.gms.drive.events.ChangeEvent changeEvent, com.google.android.gms.drive.events.CompletionEvent completionEvent, com.google.android.gms.drive.events.zzo zzoVar, com.google.android.gms.drive.events.zzb zzbVar, com.google.android.gms.drive.events.zzv zzvVar, com.google.android.gms.drive.events.zzr zzrVar) {
        this.zzda = i;
        this.zzib = changeEvent;
        this.zzic = completionEvent;
        this.zzid = zzoVar;
        this.zzie = zzbVar;
        this.zzif = zzvVar;
        this.zzig = zzrVar;
    }

    public final com.google.android.gms.drive.events.DriveEvent zzat() {
        int i = this.zzda;
        if (i == 1) {
            return this.zzib;
        }
        if (i == 2) {
            return this.zzic;
        }
        if (i == 3) {
            return this.zzid;
        }
        if (i == 4) {
            return this.zzie;
        }
        if (i == 7) {
            return this.zzif;
        }
        if (i == 8) {
            return this.zzig;
        }
        throw new java.lang.IllegalStateException(new java.lang.StringBuilder(33).append("Unexpected event type ").append(this.zzda).toString());
    }
}
