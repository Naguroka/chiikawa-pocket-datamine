package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.DriveEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzr> CREATOR = new com.google.android.gms.drive.events.zzs();
    private final com.google.android.gms.internal.drive.zzh zzcs;

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
        return 8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzcs, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzr(com.google.android.gms.internal.drive.zzh zzhVar) {
        this.zzcs = zzhVar;
    }

    public final com.google.android.gms.internal.drive.zzh zzac() {
        return this.zzcs;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.common.internal.Objects.equal(this.zzcs, ((com.google.android.gms.drive.events.zzr) obj).zzcs);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzcs);
    }
}
