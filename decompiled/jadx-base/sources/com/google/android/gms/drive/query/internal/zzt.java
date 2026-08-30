package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzt extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzt> CREATOR = new com.google.android.gms.drive.query.internal.zzu();

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(com.google.android.gms.drive.query.internal.zzj<F> zzjVar) {
        return zzjVar.zzbk();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel));
    }
}
