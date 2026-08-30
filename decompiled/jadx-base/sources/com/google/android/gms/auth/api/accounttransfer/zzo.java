package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public class zzo extends com.google.android.gms.internal.auth.zzaz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzo> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzp();
    private static final androidx.collection.ArrayMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zzbe;
    private java.util.List<java.lang.String> zzbf;
    private java.util.List<java.lang.String> zzbg;
    private java.util.List<java.lang.String> zzbh;
    private java.util.List<java.lang.String> zzbi;
    private java.util.List<java.lang.String> zzbj;
    private final int zzv;

    public zzo() {
        this.zzv = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return true;
    }

    zzo(int i, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, java.util.List<java.lang.String> list3, java.util.List<java.lang.String> list4, java.util.List<java.lang.String> list5) {
        this.zzv = i;
        this.zzbf = list;
        this.zzbg = list2;
        this.zzbh = list3;
        this.zzbi = list4;
        this.zzbj = list5;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 2, this.zzbf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 3, this.zzbg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 4, this.zzbh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 5, this.zzbi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 6, this.zzbj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings() {
        return zzbe;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return java.lang.Integer.valueOf(this.zzv);
            case 2:
                return this.zzbf;
            case 3:
                return this.zzbg;
            case 4:
                return this.zzbh;
            case 5:
                return this.zzbi;
            case 6:
                return this.zzbj;
            default:
                throw new java.lang.IllegalStateException(new java.lang.StringBuilder(37).append("Unknown SafeParcelable id=").append(field.getSafeParcelableFieldId()).toString());
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbf = arrayList;
            return;
        }
        if (safeParcelableFieldId == 3) {
            this.zzbg = arrayList;
            return;
        }
        if (safeParcelableFieldId == 4) {
            this.zzbh = arrayList;
        } else if (safeParcelableFieldId == 5) {
            this.zzbi = arrayList;
        } else {
            if (safeParcelableFieldId == 6) {
                this.zzbj = arrayList;
                return;
            }
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string list.", java.lang.Integer.valueOf(safeParcelableFieldId)));
        }
    }

    static {
        androidx.collection.ArrayMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> arrayMap = new androidx.collection.ArrayMap<>();
        zzbe = arrayMap;
        arrayMap.put("registered", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("registered", 2));
        arrayMap.put("in_progress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("in_progress", 3));
        arrayMap.put("success", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("success", 4));
        arrayMap.put(com.ironsource.y8.h.t, com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings(com.ironsource.y8.h.t, 5));
        arrayMap.put("escrowed", com.google.android.gms.common.server.response.FastJsonResponse.Field.forStrings("escrowed", 6));
    }
}
