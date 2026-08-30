package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public class AccountChangeEventsRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsRequest> CREATOR = new com.google.android.gms.auth.zzb();
    private final int zze;

    @java.lang.Deprecated
    private java.lang.String zzg;
    private int zzi;
    private android.accounts.Account zzk;

    AccountChangeEventsRequest(int i, int i2, java.lang.String str, android.accounts.Account account) {
        this.zze = i;
        this.zzi = i2;
        this.zzg = str;
        if (account != null || android.text.TextUtils.isEmpty(str)) {
            this.zzk = account;
        } else {
            this.zzk = new android.accounts.Account(str, "com.google");
        }
    }

    public AccountChangeEventsRequest() {
        this.zze = 1;
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setEventIndex(int i) {
        this.zzi = i;
        return this;
    }

    @java.lang.Deprecated
    public com.google.android.gms.auth.AccountChangeEventsRequest setAccountName(java.lang.String str) {
        this.zzg = str;
        return this;
    }

    @java.lang.Deprecated
    public java.lang.String getAccountName() {
        return this.zzg;
    }

    public com.google.android.gms.auth.AccountChangeEventsRequest setAccount(android.accounts.Account account) {
        this.zzk = account;
        return this;
    }

    public android.accounts.Account getAccount() {
        return this.zzk;
    }

    public int getEventIndex() {
        return this.zzi;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzi);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzk, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
