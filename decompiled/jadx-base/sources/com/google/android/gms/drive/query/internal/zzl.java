package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzl extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzl> CREATOR = new com.google.android.gms.drive.query.internal.zzm();
    private final java.lang.String value;

    public zzl(java.lang.String str) {
        this.value = str;
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <F> F zza(com.google.android.gms.drive.query.internal.zzj<F> zzjVar) {
        return zzjVar.zzi(this.value);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.value, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
