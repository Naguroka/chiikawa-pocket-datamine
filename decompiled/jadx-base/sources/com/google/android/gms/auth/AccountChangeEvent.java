package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public class AccountChangeEvent extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEvent> CREATOR = new com.google.android.gms.auth.zza();
    private final int zze;
    private final long zzf;
    private final java.lang.String zzg;
    private final int zzh;
    private final int zzi;
    private final java.lang.String zzj;

    AccountChangeEvent(int i, long j, java.lang.String str, int i2, int i3, java.lang.String str2) {
        this.zze = i;
        this.zzf = j;
        this.zzg = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzh = i2;
        this.zzi = i3;
        this.zzj = str2;
    }

    public AccountChangeEvent(long j, java.lang.String str, int i, int i2, java.lang.String str2) {
        this.zze = 1;
        this.zzf = j;
        this.zzg = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zzh = i;
        this.zzi = i2;
        this.zzj = str2;
    }

    public java.lang.String getAccountName() {
        return this.zzg;
    }

    public int getChangeType() {
        return this.zzh;
    }

    public int getEventIndex() {
        return this.zzi;
    }

    public java.lang.String getChangeData() {
        return this.zzj;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 2, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 4, this.zzh);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public java.lang.String toString() {
        java.lang.String str;
        int i = this.zzh;
        if (i == 1) {
            str = "ADDED";
        } else if (i == 2) {
            str = "REMOVED";
        } else if (i != 3) {
            str = i != 4 ? "UNKNOWN" : "RENAMED_TO";
        } else {
            str = "RENAMED_FROM";
        }
        java.lang.String str2 = this.zzg;
        java.lang.String str3 = this.zzj;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 91 + str.length() + java.lang.String.valueOf(str3).length()).append("AccountChangeEvent {accountName = ").append(str2).append(", changeType = ").append(str).append(", changeData = ").append(str3).append(", eventIndex = ").append(this.zzi).append("}").toString();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zze), java.lang.Long.valueOf(this.zzf), this.zzg, java.lang.Integer.valueOf(this.zzh), java.lang.Integer.valueOf(this.zzi), this.zzj);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.auth.AccountChangeEvent) {
            com.google.android.gms.auth.AccountChangeEvent accountChangeEvent = (com.google.android.gms.auth.AccountChangeEvent) obj;
            if (this.zze == accountChangeEvent.zze && this.zzf == accountChangeEvent.zzf && com.google.android.gms.common.internal.Objects.equal(this.zzg, accountChangeEvent.zzg) && this.zzh == accountChangeEvent.zzh && this.zzi == accountChangeEvent.zzi && com.google.android.gms.common.internal.Objects.equal(this.zzj, accountChangeEvent.zzj)) {
                return true;
            }
        }
        return false;
    }
}
