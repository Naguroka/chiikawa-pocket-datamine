package com.google.android.gms.auth.api.proxy;

/* JADX INFO: loaded from: classes4.dex */
public class ProxyResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.proxy.ProxyResponse> CREATOR = new com.google.android.gms.auth.api.proxy.zzb();
    public static final int STATUS_CODE_NO_CONNECTION = -1;
    public final byte[] body;
    public final int googlePlayServicesStatusCode;
    public final android.app.PendingIntent recoveryAction;
    public final int statusCode;
    private final int versionCode;
    private final android.os.Bundle zzby;

    public static com.google.android.gms.auth.api.proxy.ProxyResponse createErrorProxyResponse(int i, android.app.PendingIntent pendingIntent, int i2, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr) {
        return new com.google.android.gms.auth.api.proxy.ProxyResponse(1, i, pendingIntent, i2, zza(map), bArr);
    }

    private static android.os.Bundle zza(java.util.Map<java.lang.String, java.lang.String> map) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (map == null) {
            return bundle;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    ProxyResponse(int i, int i2, android.app.PendingIntent pendingIntent, int i3, android.os.Bundle bundle, byte[] bArr) {
        this.versionCode = i;
        this.googlePlayServicesStatusCode = i2;
        this.statusCode = i3;
        this.zzby = bundle;
        this.body = bArr;
        this.recoveryAction = pendingIntent;
    }

    public ProxyResponse(int i, android.app.PendingIntent pendingIntent, int i2, android.os.Bundle bundle, byte[] bArr) {
        this(1, i, pendingIntent, i2, bundle, bArr);
    }

    private ProxyResponse(int i, android.os.Bundle bundle, byte[] bArr) {
        this(1, 0, null, i, bundle, bArr);
    }

    public ProxyResponse(int i, java.util.Map<java.lang.String, java.lang.String> map, byte[] bArr) {
        this(i, zza(map), bArr);
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaders() {
        if (this.zzby == null) {
            return java.util.Collections.emptyMap();
        }
        java.util.HashMap map = new java.util.HashMap();
        for (java.lang.String str : this.zzby.keySet()) {
            map.put(str, this.zzby.getString(str));
        }
        return map;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.googlePlayServicesStatusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.recoveryAction, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 3, this.statusCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 4, this.zzby, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 5, this.body, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
