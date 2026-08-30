package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public class zzr extends com.google.android.gms.internal.auth.zzaz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzr> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzs();
    private static final java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zzaz;
    private java.lang.String mPackageName;
    private final java.util.Set<java.lang.Integer> zzba;
    private com.google.android.gms.auth.api.accounttransfer.zzt zzbk;
    private java.lang.String zzbl;
    private java.lang.String zzbm;
    private final int zzv;

    public zzr() {
        this.zzba = new java.util.HashSet(3);
        this.zzv = 1;
    }

    zzr(java.util.Set<java.lang.Integer> set, int i, com.google.android.gms.auth.api.accounttransfer.zzt zztVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zzba = set;
        this.zzv = i;
        this.zzbk = zztVar;
        this.zzbl = str;
        this.mPackageName = str2;
        this.zzbm = str3;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        java.util.Set<java.lang.Integer> set = this.zzba;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzbk, i, true);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzbl, true);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.mPackageName, true);
        }
        if (set.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzbm, true);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return this.zzba.contains(java.lang.Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return java.lang.Integer.valueOf(this.zzv);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzbk;
        }
        if (safeParcelableFieldId == 3) {
            return this.zzbl;
        }
        if (safeParcelableFieldId == 4) {
            return this.mPackageName;
        }
        throw new java.lang.IllegalStateException(new java.lang.StringBuilder(37).append("Unknown SafeParcelable id=").append(field.getSafeParcelableFieldId()).toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.zzbl = str2;
        } else if (safeParcelableFieldId == 4) {
            this.mPackageName = str2;
        } else {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string.", java.lang.Integer.valueOf(safeParcelableFieldId)));
        }
        this.zzba.add(java.lang.Integer.valueOf(safeParcelableFieldId));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, T t) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbk = (com.google.android.gms.auth.api.accounttransfer.zzt) t;
            this.zzba.add(java.lang.Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known custom type. Found %s", java.lang.Integer.valueOf(safeParcelableFieldId), t.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public /* synthetic */ java.util.Map getFieldMappings() {
        return zzaz;
    }

    static {
        java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map = new java.util.HashMap<>();
        zzaz = map;
        map.put("authenticatorInfo", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, com.google.android.gms.auth.api.accounttransfer.zzt.class));
        map.put(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, com.google.android.gms.common.server.response.FastJsonResponse.Field.forString(com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, 3));
        map.put("package", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("package", 4));
    }
}
