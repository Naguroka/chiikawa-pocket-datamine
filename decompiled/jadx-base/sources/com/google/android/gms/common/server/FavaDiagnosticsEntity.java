package com.google.android.gms.common.server;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class FavaDiagnosticsEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.FavaDiagnosticsEntity> CREATOR = new com.google.android.gms.common.server.zaa();
    final int zaa;
    public final java.lang.String zab;
    public final int zac;

    public FavaDiagnosticsEntity(int i, java.lang.String str, int i2) {
        this.zaa = i;
        this.zab = str;
        this.zac = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zac);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public FavaDiagnosticsEntity(java.lang.String str, int i) {
        this.zaa = 1;
        this.zab = str;
        this.zac = i;
    }
}
