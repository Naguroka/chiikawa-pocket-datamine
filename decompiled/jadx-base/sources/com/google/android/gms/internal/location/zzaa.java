package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaa extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zzb;
    public static final com.google.android.gms.internal.location.zzaa zza = new com.google.android.gms.internal.location.zzaa(com.google.android.gms.common.api.Status.RESULT_SUCCESS);
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.location.zzaa> CREATOR = new com.google.android.gms.internal.location.zzab();

    public zzaa(com.google.android.gms.common.api.Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
