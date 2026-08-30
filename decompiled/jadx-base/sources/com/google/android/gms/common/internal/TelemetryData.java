package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class TelemetryData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.TelemetryData> CREATOR = new com.google.android.gms.common.internal.zaab();
    private final int zaa;

    @javax.annotation.Nullable
    private java.util.List zab;

    public TelemetryData(int i, @javax.annotation.Nullable java.util.List list) {
        this.zaa = i;
        this.zab = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zab, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zaa() {
        return this.zaa;
    }

    public final java.util.List zab() {
        return this.zab;
    }

    public final void zac(com.google.android.gms.common.internal.MethodInvocation methodInvocation) {
        if (this.zab == null) {
            this.zab = new java.util.ArrayList();
        }
        this.zab.add(methodInvocation);
    }
}
