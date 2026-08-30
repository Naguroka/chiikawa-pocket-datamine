package com.google.android.gms.drive.query.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zzr extends com.google.android.gms.drive.query.internal.zza {
    public static final android.os.Parcelable.Creator<com.google.android.gms.drive.query.internal.zzr> CREATOR = new com.google.android.gms.drive.query.internal.zzs();
    private java.util.List<com.google.android.gms.drive.query.Filter> zzls;
    private final com.google.android.gms.drive.query.internal.zzx zzlz;
    private final java.util.List<com.google.android.gms.drive.query.internal.FilterHolder> zzmo;

    zzr(com.google.android.gms.drive.query.internal.zzx zzxVar, java.util.List<com.google.android.gms.drive.query.internal.FilterHolder> list) {
        this.zzlz = zzxVar;
        this.zzmo = list;
    }

    public zzr(com.google.android.gms.drive.query.internal.zzx zzxVar, java.lang.Iterable<com.google.android.gms.drive.query.Filter> iterable) {
        this.zzlz = zzxVar;
        this.zzls = new java.util.ArrayList();
        this.zzmo = new java.util.ArrayList();
        for (com.google.android.gms.drive.query.Filter filter : iterable) {
            this.zzls.add(filter);
            this.zzmo.add(new com.google.android.gms.drive.query.internal.FilterHolder(filter));
        }
    }

    public zzr(com.google.android.gms.drive.query.internal.zzx zzxVar, com.google.android.gms.drive.query.Filter filter, com.google.android.gms.drive.query.Filter... filterArr) {
        this.zzlz = zzxVar;
        java.util.ArrayList arrayList = new java.util.ArrayList(filterArr.length + 1);
        this.zzmo = arrayList;
        arrayList.add(new com.google.android.gms.drive.query.internal.FilterHolder(filter));
        java.util.ArrayList arrayList2 = new java.util.ArrayList(filterArr.length + 1);
        this.zzls = arrayList2;
        arrayList2.add(filter);
        for (com.google.android.gms.drive.query.Filter filter2 : filterArr) {
            this.zzmo.add(new com.google.android.gms.drive.query.internal.FilterHolder(filter2));
            this.zzls.add(filter2);
        }
    }

    @Override // com.google.android.gms.drive.query.Filter
    public final <T> T zza(com.google.android.gms.drive.query.internal.zzj<T> zzjVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.google.android.gms.drive.query.internal.FilterHolder> it = this.zzmo.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getFilter().zza(zzjVar));
        }
        return zzjVar.zza(this.zzlz, arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, this.zzlz, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzmo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
