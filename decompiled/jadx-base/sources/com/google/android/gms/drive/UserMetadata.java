package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public class UserMetadata extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.UserMetadata> CREATOR = new com.google.android.gms.drive.zzt();
    private final java.lang.String zzbo;
    private final java.lang.String zzbp;
    private final java.lang.String zzbq;
    private final boolean zzbr;
    private final java.lang.String zzbs;

    public UserMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4) {
        this.zzbo = str;
        this.zzbp = str2;
        this.zzbq = str3;
        this.zzbr = z;
        this.zzbs = str4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzbo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzbp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzbq, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zzbr);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzbs, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public java.lang.String toString() {
        return java.lang.String.format("Permission ID: '%s', Display Name: '%s', Picture URL: '%s', Authenticated User: %b, Email: '%s'", this.zzbo, this.zzbp, this.zzbq, java.lang.Boolean.valueOf(this.zzbr), this.zzbs);
    }
}
