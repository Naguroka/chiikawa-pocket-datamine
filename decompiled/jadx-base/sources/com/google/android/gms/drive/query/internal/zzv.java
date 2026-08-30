package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzv extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzv> CREATOR = new com.google.android.gms.drive.query.internal.zzw();
    private final com.google.android.gms.drive.query.internal.FilterHolder zzmp;

    zzv(com.google.android.gms.drive.query.internal.FilterHolder filterHolder) {
        this.zzmp = filterHolder;
    }

    public zzv(com.google.android.gms.drive.query.Filter filter) {
        this(new com.google.android.gms.drive.query.internal.FilterHolder(filter));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.drive.query.Filter
    public final <T> T zza(com.google.android.gms.drive.query.internal.zzj<T> zzjVar) {
        return (T) zzjVar.zza(this.zzmp.getFilter().zza(zzjVar));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzmp, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
