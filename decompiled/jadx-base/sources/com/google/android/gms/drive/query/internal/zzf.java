package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzf> CREATOR = new com.google.android.gms.drive.query.internal.zzg();
    private final java.lang.String fieldName;
    private final boolean zzmc;

    public zzf(java.lang.String str, boolean z) {
        this.fieldName = str;
        this.zzmc = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.fieldName, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzmc);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = this.fieldName;
        objArr[1] = this.zzmc ? "ASC" : "DESC";
        return java.lang.String.format(locale, "FieldWithSortOrder[%s %s]", objArr);
    }
}
