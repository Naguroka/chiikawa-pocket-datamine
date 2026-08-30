package com.google.android.gms.drive.query;

/* JADX INFO: loaded from: classes4.dex */
public class Query extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.Query> CREATOR = new com.google.android.gms.drive.query.zzb();
    private final java.util.List<com.google.android.gms.drive.DriveSpace> zzby;
    private final com.google.android.gms.drive.query.internal.zzr zzlm;
    private final java.lang.String zzln;
    private final com.google.android.gms.drive.query.SortOrder zzlo;
    final java.util.List<java.lang.String> zzlp;
    final boolean zzlq;
    final boolean zzlr;

    private Query(com.google.android.gms.drive.query.internal.zzr zzrVar, java.lang.String str, com.google.android.gms.drive.query.SortOrder sortOrder, java.util.List<java.lang.String> list, boolean z, java.util.Set<com.google.android.gms.drive.DriveSpace> set, boolean z2) {
        this(zzrVar, str, sortOrder, list, z, new java.util.ArrayList(set), z2);
    }

    Query(com.google.android.gms.drive.query.internal.zzr zzrVar, java.lang.String str, com.google.android.gms.drive.query.SortOrder sortOrder, java.util.List<java.lang.String> list, boolean z, java.util.List<com.google.android.gms.drive.DriveSpace> list2, boolean z2) {
        this.zzlm = zzrVar;
        this.zzln = str;
        this.zzlo = sortOrder;
        this.zzlp = list;
        this.zzlq = z;
        this.zzby = list2;
        this.zzlr = z2;
    }

    public static class Builder {
        private java.lang.String zzln;
        private com.google.android.gms.drive.query.SortOrder zzlo;
        private java.util.List<java.lang.String> zzlp;
        private boolean zzlq;
        private boolean zzlr;
        private final java.util.List<com.google.android.gms.drive.query.Filter> zzls;
        private java.util.Set<com.google.android.gms.drive.DriveSpace> zzlt;

        public Builder() {
            this.zzls = new java.util.ArrayList();
            this.zzlp = java.util.Collections.emptyList();
            this.zzlt = java.util.Collections.emptySet();
        }

        public Builder(com.google.android.gms.drive.query.Query query) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.zzls = arrayList;
            this.zzlp = java.util.Collections.emptyList();
            this.zzlt = java.util.Collections.emptySet();
            arrayList.add(query.getFilter());
            this.zzln = query.getPageToken();
            this.zzlo = query.getSortOrder();
            this.zzlp = query.zzlp;
            this.zzlq = query.zzlq;
            query.zzbi();
            this.zzlt = query.zzbi();
            this.zzlr = query.zzlr;
        }

        public com.google.android.gms.drive.query.Query.Builder addFilter(com.google.android.gms.drive.query.Filter filter) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(filter, "Filter may not be null.");
            if (!(filter instanceof com.google.android.gms.drive.query.internal.zzt)) {
                this.zzls.add(filter);
            }
            return this;
        }

        public com.google.android.gms.drive.query.Query.Builder setSortOrder(com.google.android.gms.drive.query.SortOrder sortOrder) {
            this.zzlo = sortOrder;
            return this;
        }

        @java.lang.Deprecated
        public com.google.android.gms.drive.query.Query.Builder setPageToken(java.lang.String str) {
            this.zzln = str;
            return this;
        }

        public com.google.android.gms.drive.query.Query build() {
            return new com.google.android.gms.drive.query.Query(new com.google.android.gms.drive.query.internal.zzr(com.google.android.gms.drive.query.internal.zzx.zzmv, this.zzls), this.zzln, this.zzlo, this.zzlp, this.zzlq, this.zzlt, this.zzlr);
        }
    }

    public com.google.android.gms.drive.query.Filter getFilter() {
        return this.zzlm;
    }

    @java.lang.Deprecated
    public java.lang.String getPageToken() {
        return this.zzln;
    }

    public com.google.android.gms.drive.query.SortOrder getSortOrder() {
        return this.zzlo;
    }

    public final java.util.Set<com.google.android.gms.drive.DriveSpace> zzbi() {
        return this.zzby == null ? new java.util.HashSet() : new java.util.HashSet(this.zzby);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzlm, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzln, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzlo, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 5, this.zzlp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 6, this.zzlq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 7, this.zzby, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 8, this.zzlr);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public java.lang.String toString() {
        return java.lang.String.format(java.util.Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", this.zzlm, this.zzlo, this.zzln, this.zzby);
    }
}
