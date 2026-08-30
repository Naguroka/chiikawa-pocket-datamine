package com.google.android.gms.drive.events;

/* JADX INFO: loaded from: classes4.dex */
public final class zzb extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.drive.events.DriveEvent {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.events.zzb> CREATOR = new com.google.android.gms.drive.events.zzc();
    private final com.google.android.gms.drive.events.zze zzbv;

    public zzb(com.google.android.gms.drive.events.zze zzeVar) {
        this.zzbv = zzeVar;
    }

    @Override // com.google.android.gms.drive.events.DriveEvent
    public final int getType() {
        return 4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzbv, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return com.google.android.gms.common.internal.Objects.equal(this.zzbv, ((com.google.android.gms.drive.events.zzb) obj).zzbv);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzbv);
    }

    public final java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "ChangesAvailableEvent [changesAvailableOptions=%s]", this.zzbv);
    }
}
