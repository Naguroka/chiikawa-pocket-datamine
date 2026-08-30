package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zan extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.zan> CREATOR = new com.google.android.gms.common.server.response.zao();
    final int zaa;
    private final java.util.HashMap zab;
    private final java.lang.String zac;

    zan(int i, java.util.ArrayList arrayList, java.lang.String str) {
        this.zaa = i;
        java.util.HashMap map = new java.util.HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.common.server.response.zal zalVar = (com.google.android.gms.common.server.response.zal) arrayList.get(i2);
            java.lang.String str2 = zalVar.zab;
            java.util.HashMap map2 = new java.util.HashMap();
            int size2 = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(zalVar.zac)).size();
            for (int i3 = 0; i3 < size2; i3++) {
                com.google.android.gms.common.server.response.zam zamVar = (com.google.android.gms.common.server.response.zam) zalVar.zac.get(i3);
                map2.put(zamVar.zab, zamVar.zac);
            }
            map.put(str2, map2);
        }
        this.zab = map;
        this.zac = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        zad();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : this.zab.keySet()) {
            sb.append(str);
            sb.append(":\n");
            java.util.Map map = (java.util.Map) this.zab.get(str);
            for (java.lang.String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zaa);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.zab.keySet()) {
            arrayList.add(new com.google.android.gms.common.server.response.zal(str, (java.util.Map) this.zab.get(str)));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zac, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final java.lang.String zaa() {
        return this.zac;
    }

    public final java.util.Map zab(java.lang.String str) {
        return (java.util.Map) this.zab.get(str);
    }

    public final void zac() {
        for (java.lang.String str : this.zab.keySet()) {
            java.util.Map map = (java.util.Map) this.zab.get(str);
            java.util.HashMap map2 = new java.util.HashMap();
            for (java.lang.String str2 : map.keySet()) {
                map2.put(str2, ((com.google.android.gms.common.server.response.FastJsonResponse.Field) map.get(str2)).zab());
            }
            this.zab.put(str, map2);
        }
    }

    public final void zad() {
        java.util.Iterator it = this.zab.keySet().iterator();
        while (it.hasNext()) {
            java.util.Map map = (java.util.Map) this.zab.get((java.lang.String) it.next());
            java.util.Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((com.google.android.gms.common.server.response.FastJsonResponse.Field) map.get((java.lang.String) it2.next())).zai(this);
            }
        }
    }

    public final void zae(java.lang.Class cls, java.util.Map map) {
        this.zab.put((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cls.getCanonicalName()), map);
    }

    public final boolean zaf(java.lang.Class cls) {
        return this.zab.containsKey(com.google.android.gms.common.internal.Preconditions.checkNotNull(cls.getCanonicalName()));
    }

    public zan(java.lang.Class cls) {
        this.zaa = 1;
        this.zab = new java.util.HashMap();
        this.zac = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(cls.getCanonicalName());
    }
}
