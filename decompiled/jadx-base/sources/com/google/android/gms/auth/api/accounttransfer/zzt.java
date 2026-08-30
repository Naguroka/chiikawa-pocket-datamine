package com.google.android.gms.auth.api.accounttransfer;

/* JADX INFO: loaded from: classes4.dex */
public class zzt extends com.google.android.gms.internal.auth.zzaz {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.accounttransfer.zzt> CREATOR = new com.google.android.gms.auth.api.accounttransfer.zzu();
    private static final java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> zzaz;
    private final java.util.Set<java.lang.Integer> zzba;
    private java.lang.String zzbn;
    private int zzbo;
    private byte[] zzbp;
    private android.app.PendingIntent zzbq;
    private com.google.android.gms.auth.api.accounttransfer.DeviceMetaData zzbr;
    private final int zzv;

    zzt(java.util.Set<java.lang.Integer> set, int i, java.lang.String str, int i2, byte[] bArr, android.app.PendingIntent pendingIntent, com.google.android.gms.auth.api.accounttransfer.DeviceMetaData deviceMetaData) {
        this.zzba = set;
        this.zzv = i;
        this.zzbn = str;
        this.zzbo = i2;
        this.zzbp = bArr;
        this.zzbq = pendingIntent;
        this.zzbr = deviceMetaData;
    }

    public zzt() {
        this.zzba = new androidx.collection.ArraySet(3);
        this.zzv = 1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        java.util.Set<java.lang.Integer> set = this.zzba;
        if (set.contains(1)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zzv);
        }
        if (set.contains(2)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zzbn, true);
        }
        if (set.contains(3)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.zzbo);
        }
        if (set.contains(4)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.zzbp, true);
        }
        if (set.contains(5)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzbq, i, true);
        }
        if (set.contains(6)) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zzbr, i, true);
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
            return this.zzbn;
        }
        if (safeParcelableFieldId == 3) {
            return java.lang.Integer.valueOf(this.zzbo);
        }
        if (safeParcelableFieldId == 4) {
            return this.zzbp;
        }
        throw new java.lang.IllegalStateException(new java.lang.StringBuilder(37).append("Unknown SafeParcelable id=").append(field.getSafeParcelableFieldId()).toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.zzbn = str2;
            this.zzba.add(java.lang.Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Field with id=%d is not known to be a string.", java.lang.Integer.valueOf(safeParcelableFieldId)));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, int i) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.zzbo = i;
            this.zzba.add(java.lang.Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(52).append("Field with id=").append(safeParcelableFieldId).append(" is not known to be an int.").toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.zzbp = bArr;
            this.zzba.add(java.lang.Integer.valueOf(safeParcelableFieldId));
            return;
        }
        throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(59).append("Field with id=").append(safeParcelableFieldId).append(" is not known to be an byte array.").toString());
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public /* synthetic */ java.util.Map getFieldMappings() {
        return zzaz;
    }

    static {
        java.util.HashMap<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> map = new java.util.HashMap<>();
        zzaz = map;
        map.put("accountType", com.google.android.gms.common.server.response.FastJsonResponse.Field.forString("accountType", 2));
        map.put("status", com.google.android.gms.common.server.response.FastJsonResponse.Field.forInteger("status", 3));
        map.put("transferBytes", com.google.android.gms.common.server.response.FastJsonResponse.Field.forBase64("transferBytes", 4));
    }
}
