package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zav extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zav> CREATOR = new com.google.android.gms.common.internal.zaw();
    final int zaa;
    final android.os.IBinder zab;
    private final com.google.android.gms.common.ConnectionResult zac;
    private final boolean zad;
    private final boolean zae;

    zav(int i, android.os.IBinder iBinder, com.google.android.gms.common.ConnectionResult connectionResult, boolean z, boolean z2) {
        this.zaa = i;
        this.zab = iBinder;
        this.zac = connectionResult;
        this.zad = z;
        this.zae = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.internal.zav)) {
            return false;
        }
        com.google.android.gms.common.internal.zav zavVar = (com.google.android.gms.common.internal.zav) obj;
        return this.zac.equals(zavVar.zac) && com.google.android.gms.common.internal.Objects.equal(zab(), zavVar.zab());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(parcel, 2, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zac, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 4, this.zad);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 5, this.zae);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final com.google.android.gms.common.ConnectionResult zaa() {
        return this.zac;
    }

    public final com.google.android.gms.common.internal.IAccountAccessor zab() {
        android.os.IBinder iBinder = this.zab;
        if (iBinder == null) {
            return null;
        }
        return com.google.android.gms.common.internal.IAccountAccessor.Stub.asInterface(iBinder);
    }

    public final boolean zac() {
        return this.zad;
    }

    public final boolean zad() {
        return this.zae;
    }
}
