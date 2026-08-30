package androidx.media3.exoplayer.drm;

/* JADX INFO: loaded from: classes.dex */
final class ClearKeyUtil {
    private static final java.lang.String TAG = "ClearKeyUtil";

    private ClearKeyUtil() {
    }

    public static byte[] adjustRequestData(byte[] bArr) {
        return androidx.media3.common.util.Util.SDK_INT >= 27 ? bArr : androidx.media3.common.util.Util.getUtf8Bytes(base64ToBase64Url(androidx.media3.common.util.Util.fromUtf8Bytes(bArr)));
    }

    public static byte[] adjustResponseData(byte[] bArr) {
        if (androidx.media3.common.util.Util.SDK_INT >= 27) {
            return bArr;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(androidx.media3.common.util.Util.fromUtf8Bytes(bArr));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"keys\":[");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(base64UrlToBase64(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(base64UrlToBase64(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return androidx.media3.common.util.Util.getUtf8Bytes(sb.toString());
        } catch (org.json.JSONException e) {
            androidx.media3.common.util.Log.e(TAG, "Failed to adjust response data: " + androidx.media3.common.util.Util.fromUtf8Bytes(bArr), e);
            return bArr;
        }
    }

    private static java.lang.String base64ToBase64Url(java.lang.String str) {
        return str.replace(org.objectweb.asm.signature.SignatureVisitor.EXTENDS, org.objectweb.asm.signature.SignatureVisitor.SUPER).replace('/', '_');
    }

    private static java.lang.String base64UrlToBase64(java.lang.String str) {
        return str.replace(org.objectweb.asm.signature.SignatureVisitor.SUPER, org.objectweb.asm.signature.SignatureVisitor.EXTENDS).replace('_', '/');
    }
}
