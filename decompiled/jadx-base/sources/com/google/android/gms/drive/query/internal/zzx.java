package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzx> CREATOR = new com.google.android.gms.drive.query.internal.zzy();
    public static final com.google.android.gms.drive.query.internal.zzx zzmq = new com.google.android.gms.drive.query.internal.zzx(com.ironsource.y8.i.b);
    public static final com.google.android.gms.drive.query.internal.zzx zzmr = new com.google.android.gms.drive.query.internal.zzx("<");
    public static final com.google.android.gms.drive.query.internal.zzx zzms = new com.google.android.gms.drive.query.internal.zzx("<=");
    public static final com.google.android.gms.drive.query.internal.zzx zzmt = new com.google.android.gms.drive.query.internal.zzx(">");
    public static final com.google.android.gms.drive.query.internal.zzx zzmu = new com.google.android.gms.drive.query.internal.zzx(">=");
    public static final com.google.android.gms.drive.query.internal.zzx zzmv = new com.google.android.gms.drive.query.internal.zzx("and");
    public static final com.google.android.gms.drive.query.internal.zzx zzmw = new com.google.android.gms.drive.query.internal.zzx("or");
    private static final com.google.android.gms.drive.query.internal.zzx zzmx = new com.google.android.gms.drive.query.internal.zzx("not");
    public static final com.google.android.gms.drive.query.internal.zzx zzmy = new com.google.android.gms.drive.query.internal.zzx("contains");
    private final java.lang.String tag;

    zzx(java.lang.String str) {
        this.tag = str;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.tag, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int hashCode() {
        java.lang.String str = this.tag;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.google.android.gms.drive.query.internal.zzx zzxVar = (com.google.android.gms.drive.query.internal.zzx) obj;
        java.lang.String str = this.tag;
        if (str == null) {
            if (zzxVar.tag != null) {
                return false;
            }
        } else if (!str.equals(zzxVar.tag)) {
            return false;
        }
        return true;
    }
}
