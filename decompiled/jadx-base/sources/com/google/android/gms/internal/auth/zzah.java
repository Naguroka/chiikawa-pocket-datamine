package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public final class zzah extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.auth.zzah> CREATOR = new com.google.android.gms.internal.auth.zzai();
    private final java.lang.String accountType;
    private final android.app.PendingIntent zzbx;
    private final int zzv;

    public zzah(java.lang.String str, android.app.PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    zzah(int i, java.lang.String str, android.app.PendingIntent pendingIntent) {
        this.zzv = 1;
        this.accountType = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzbx = (android.app.PendingIntent) com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.accountType, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzbx, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
