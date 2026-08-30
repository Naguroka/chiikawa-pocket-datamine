package com.google.android.gms.drive;

/* JADX INFO: loaded from: classes4.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.zzr> CREATOR = new com.google.android.gms.drive.zzs();
    private int accountType;
    private java.lang.String zzbg;
    private java.lang.String zzbh;
    private java.lang.String zzbi;
    private int zzbj;
    private boolean zzbk;

    public zzr(java.lang.String str, int i, java.lang.String str2, java.lang.String str3, int i2, boolean z) {
        this.zzbg = str;
        this.accountType = i;
        this.zzbh = str2;
        this.zzbi = str3;
        this.zzbj = i2;
        this.zzbk = z;
    }

    private static boolean zzb(int i) {
        switch (i) {
            case 256:
            case 257:
            case 258:
                return true;
            default:
                return false;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, !zzb(this.accountType) ? null : this.zzbg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, !zzb(this.accountType) ? -1 : this.accountType);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzbh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzbi, false);
        int i2 = this.zzbj;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 ? i2 : -1);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 7, this.zzbk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zzbg, java.lang.Integer.valueOf(this.accountType), java.lang.Integer.valueOf(this.zzbj), java.lang.Boolean.valueOf(this.zzbk));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            if (obj == this) {
                return true;
            }
            com.google.android.gms.drive.zzr zzrVar = (com.google.android.gms.drive.zzr) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zzbg, zzrVar.zzbg) && this.accountType == zzrVar.accountType && this.zzbj == zzrVar.zzbj && this.zzbk == zzrVar.zzbk) {
                return true;
            }
        }
        return false;
    }
}
