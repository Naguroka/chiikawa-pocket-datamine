package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzab extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.auth.zzab> CREATOR = new com.google.android.gms.internal.auth.zzac();
    private final java.lang.String accountType;
    private final int zzbw;
    private final int zzv;

    public zzab(java.lang.String str, int i) {
        this(1, str, i);
    }

    zzab(int i, java.lang.String str, int i2) {
        this.zzv = 1;
        this.accountType = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzbw = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzbw);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
