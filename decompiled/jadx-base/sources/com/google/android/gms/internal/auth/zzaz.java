package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzaz extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    private static java.lang.String zzem = "AUTH";

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public byte[] toByteArray() {
        try {
            return toString().getBytes(com.adjust.sdk.Constants.ENCODING);
        } catch (java.io.UnsupportedEncodingException e) {
            android.util.Log.e(zzem, "Error serializing object.", e);
            return null;
        }
    }
}
