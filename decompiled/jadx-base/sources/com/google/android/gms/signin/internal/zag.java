package com.google.android.gms.signin.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zag extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.api.Result {
    public static final android.os.Parcelable.Creator<com.google.android.gms.signin.internal.zag> CREATOR = new com.google.android.gms.signin.internal.zah();
    private final java.util.List zaa;
    private final java.lang.String zab;

    public zag(java.util.List list, java.lang.String str) {
        this.zaa = list;
        this.zab = str;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zab != null ? com.google.android.gms.common.api.Status.RESULT_SUCCESS : com.google.android.gms.common.api.Status.RESULT_CANCELED;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.util.List list = this.zaa;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 1, list, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
