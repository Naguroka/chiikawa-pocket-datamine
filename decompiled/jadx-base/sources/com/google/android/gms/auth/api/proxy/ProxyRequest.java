package com.google.android.gms.auth.api.proxy;

/* JADX INFO: loaded from: classes4.dex */
public class ProxyRequest extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final int VERSION_CODE = 2;
    public final byte[] body;
    public final int httpMethod;
    public final long timeoutMillis;
    public final java.lang.String url;
    private final int versionCode;
    private android.os.Bundle zzby;
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.proxy.ProxyRequest> CREATOR = new com.google.android.gms.auth.api.proxy.zza();
    public static final int HTTP_METHOD_GET = 0;
    public static final int HTTP_METHOD_POST = 1;
    public static final int HTTP_METHOD_PUT = 2;
    public static final int HTTP_METHOD_DELETE = 3;
    public static final int HTTP_METHOD_HEAD = 4;
    public static final int HTTP_METHOD_OPTIONS = 5;
    public static final int HTTP_METHOD_TRACE = 6;
    public static final int HTTP_METHOD_PATCH = 7;
    public static final int LAST_CODE = 7;

    ProxyRequest(int i, java.lang.String str, int i2, long j, byte[] bArr, android.os.Bundle bundle) {
        this.versionCode = i;
        this.url = str;
        this.httpMethod = i2;
        this.timeoutMillis = j;
        this.body = bArr;
        this.zzby = bundle;
    }

    public static class Builder {
        private java.lang.String zzbz;
        private int zzca = com.google.android.gms.auth.api.proxy.ProxyRequest.HTTP_METHOD_GET;
        private long zzcb = androidx.media3.common.C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
        private byte[] zzcc = null;
        private android.os.Bundle zzcd = new android.os.Bundle();

        public Builder(java.lang.String str) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str);
            if (!android.util.Patterns.WEB_URL.matcher(str).matches()) {
                throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 51).append("The supplied url [ ").append(str).append("] is not match Patterns.WEB_URL!").toString());
            }
            this.zzbz = str;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setHttpMethod(int i) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i >= 0 && i <= com.google.android.gms.auth.api.proxy.ProxyRequest.LAST_CODE, "Unrecognized http method code.");
            this.zzca = i;
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setTimeoutMillis(long j) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(j >= 0, "The specified timeout must be non-negative.");
            this.zzcb = j;
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder putHeader(java.lang.String str, java.lang.String str2) {
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "Header name cannot be null or empty!");
            android.os.Bundle bundle = this.zzcd;
            if (str2 == null) {
                str2 = "";
            }
            bundle.putString(str, str2);
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest.Builder setBody(byte[] bArr) {
            this.zzcc = bArr;
            return this;
        }

        public com.google.android.gms.auth.api.proxy.ProxyRequest build() {
            if (this.zzcc == null) {
                this.zzcc = new byte[0];
            }
            return new com.google.android.gms.auth.api.proxy.ProxyRequest(2, this.zzbz, this.zzca, this.zzcb, this.zzcc, this.zzcd);
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> getHeaderMap() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(this.zzby.size());
        for (java.lang.String str : this.zzby.keySet()) {
            linkedHashMap.put(str, this.zzby.getString(str));
        }
        return java.util.Collections.unmodifiableMap(linkedHashMap);
    }

    public java.lang.String toString() {
        java.lang.String str = this.url;
        return new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 42).append("ProxyRequest[ url: ").append(str).append(", method: ").append(this.httpMethod).append(" ]").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, this.url, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.httpMethod);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 3, this.timeoutMillis);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 4, this.body, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(parcel, 5, this.zzby, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1000, this.versionCode);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
