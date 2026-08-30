package com.google.android.gms.auth;

/* JADX INFO: loaded from: classes4.dex */
public class AccountChangeEventsResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.AccountChangeEventsResponse> CREATOR = new com.google.android.gms.auth.zzc();
    private final int zze;
    private final java.util.List<com.google.android.gms.auth.AccountChangeEvent> zzl;

    AccountChangeEventsResponse(int i, java.util.List<com.google.android.gms.auth.AccountChangeEvent> list) {
        this.zze = i;
        this.zzl = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
    }

    public AccountChangeEventsResponse(java.util.List<com.google.android.gms.auth.AccountChangeEvent> list) {
        this.zze = 1;
        this.zzl = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
    }

    public java.util.List<com.google.android.gms.auth.AccountChangeEvent> getEvents() {
        return this.zzl;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zze);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
