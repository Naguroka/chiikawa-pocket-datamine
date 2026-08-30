package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public final class zzl extends com.google.android.gms.internal.auth.zzaz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzl> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzm();
    private static final java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zzaz;
    private final java.util.Set<java.lang.Integer> zzba;
    private java.util.ArrayList<com.google.android.gms.auth.api.accounttransfer.zzr> zzbb;
    private int zzbc;
    private com.google.android.gms.auth.api.accounttransfer.zzo zzbd;
    private final int zzv;

    zzl(java.util.Set<java.lang.Integer> set, int i, java.util.ArrayList<com.google.android.gms.auth.api.accounttransfer.zzr> arrayList, int i2, com.google.android.gms.auth.api.accounttransfer.zzo zzoVar) {
        this.zzba = set;
        this.zzv = i;
        this.zzbb = arrayList;
        this.zzbc = i2;
        this.zzbd = zzoVar;
    }

    public zzl() {
        this.zzba = new java.util.HashSet(1);
        this.zzv = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        java.util.Set<java.lang.Integer> set = this.zzba;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 2, this.zzbb, true);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzbc);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzbd, i, true);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean isFieldSet(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        return this.zzba.contains(java.lang.Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final java.lang.Object getFieldValue(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 1) {
            return java.lang.Integer.valueOf(this.zzv);
        }
        if (safeParcelableFieldId == 2) {
            return this.zzbb;
        }
        if (safeParcelableFieldId == 4) {
            return this.zzbd;
        }
        throw new java.lang.IllegalStateException(new java.lang.StringBuilder(37).append("Unknown SafeParcelable id=").append(field.getSafeParcelableFieldId()).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbb = arrayList;
            this.zzba.add(java.lang.Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", java.lang.Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, T t) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.zzbd = (com.google.android.gms.auth.api.accounttransfer.zzo) t;
            this.zzba.add(java.lang.Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not a known custom type. Found %s", java.lang.Integer.valueOf(safeParcelableFieldId), t.getClass().getCanonicalName()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ java.util.Map getFieldMappings() {
        return zzaz;
    }

    static {
        java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map = new java.util.HashMap<>();
        zzaz = map;
        map.put("authenticatorData", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, com.google.android.gms.auth.api.accounttransfer.zzr.class));
        map.put("progress", com.google.android.gms.common.server.response.FastJsonResponse.Field.forConcreteType("progress", 4, com.google.android.gms.auth.api.accounttransfer.zzo.class));
    }
}
