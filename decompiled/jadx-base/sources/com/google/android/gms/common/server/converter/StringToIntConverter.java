package com.google.android.gms.common.server.converter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class StringToIntConverter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter<java.lang.String, java.lang.Integer> {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.converter.StringToIntConverter> CREATOR = new com.google.android.gms.common.server.converter.zad();
    final int zaa;
    private final java.util.HashMap zab;
    private final android.util.SparseArray zac;

    public StringToIntConverter() {
        this.zaa = 1;
        this.zab = new java.util.HashMap();
        this.zac = new android.util.SparseArray();
    }

    public com.google.android.gms.common.server.converter.StringToIntConverter add(java.lang.String str, int i) {
        this.zab.put(str, java.lang.Integer.valueOf(i));
        this.zac.put(i, str);
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int i2 = this.zaa;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : this.zab.keySet()) {
            arrayList.add(new com.google.android.gms.common.server.converter.zac(str, ((java.lang.Integer) this.zab.get(str)).intValue()));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, arrayList, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zaa() {
        return 7;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final int zab() {
        return 0;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* bridge */ /* synthetic */ java.lang.Object zac(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) this.zab.get((java.lang.String) obj);
        return num == null ? (java.lang.Integer) this.zab.get("gms_unknown") : num;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter
    public final /* bridge */ /* synthetic */ java.lang.Object zad(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) this.zac.get(((java.lang.Integer) obj).intValue());
        return (str == null && this.zab.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    StringToIntConverter(int i, java.util.ArrayList arrayList) {
        this.zaa = i;
        this.zab = new java.util.HashMap();
        this.zac = new android.util.SparseArray();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            com.google.android.gms.common.server.converter.zac zacVar = (com.google.android.gms.common.server.converter.zac) arrayList.get(i2);
            add(zacVar.zab, zacVar.zac);
        }
    }
}
