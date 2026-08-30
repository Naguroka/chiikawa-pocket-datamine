package com.google.android.gms.drive.query;

/* JADX INFO: loaded from: classes4.dex */
public class SortOrder extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.SortOrder> CREATOR = new com.google.android.gms.drive.query.zzc();
    private final java.util.List<com.google.android.gms.drive.query.internal.zzf> zzlw;
    private final boolean zzlx;

    SortOrder(java.util.List<com.google.android.gms.drive.query.internal.zzf> list, boolean z) {
        this.zzlw = list;
        this.zzlx = z;
    }

    public static class Builder {
        private final java.util.List<com.google.android.gms.drive.query.internal.zzf> zzlw = new java.util.ArrayList();
        private boolean zzlx = false;

        public com.google.android.gms.drive.query.SortOrder.Builder addSortAscending(com.google.android.gms.drive.metadata.SortableMetadataField sortableMetadataField) {
            this.zzlw.add(new com.google.android.gms.drive.query.internal.zzf(sortableMetadataField.getName(), true));
            return this;
        }

        public com.google.android.gms.drive.query.SortOrder.Builder addSortDescending(com.google.android.gms.drive.metadata.SortableMetadataField sortableMetadataField) {
            this.zzlw.add(new com.google.android.gms.drive.query.internal.zzf(sortableMetadataField.getName(), false));
            return this;
        }

        public com.google.android.gms.drive.query.SortOrder build() {
            return new com.google.android.gms.drive.query.SortOrder(this.zzlw, false);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 1, this.zzlw, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 2, this.zzlx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "SortOrder[%s, %s]", android.text.TextUtils.join(",", this.zzlw), java.lang.Boolean.valueOf(this.zzlx));
    }
}
