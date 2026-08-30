package com.google.android.gms.internal.p000authapi;

/* JADX INFO: loaded from: classes4.dex */
public final class zzy extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.p000authapi.zzy> CREATOR = new com.google.android.gms.internal.p000authapi.zzz();
    private final com.google.android.gms.auth.api.credentials.Credential zzal;

    public zzy(com.google.android.gms.auth.api.credentials.Credential credential) {
        this.zzal = credential;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzal, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
