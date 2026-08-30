package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.auth.zzaf> CREATOR = new com.google.android.gms.internal.auth.zzag();
    private final java.lang.String accountType;
    private final byte[] zzbp;
    private final int zzv;

    public zzaf(java.lang.String str, byte[] bArr) {
        this(1, str, bArr);
    }

    zzaf(int i, java.lang.String str, byte[] bArr) {
        this.zzv = 1;
        this.accountType = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzbp = (byte[]) com.google.android.gms.common.internal.Preconditions.checkNotNull(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzbp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
