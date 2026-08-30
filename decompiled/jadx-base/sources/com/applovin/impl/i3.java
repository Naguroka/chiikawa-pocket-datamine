package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class i3 {
    private static java.lang.String a(java.lang.String str) {
        return str.replace(org.objectweb.asm.signature.SignatureVisitor.EXTENDS, org.objectweb.asm.signature.SignatureVisitor.SUPER).replace('/', '_');
    }

    public static byte[] a(byte[] bArr) {
        return com.applovin.impl.xp.f1515a >= 27 ? bArr : com.applovin.impl.xp.c(a(com.applovin.impl.xp.a(bArr)));
    }

    private static java.lang.String b(java.lang.String str) {
        return str.replace(org.objectweb.asm.signature.SignatureVisitor.SUPER, org.objectweb.asm.signature.SignatureVisitor.EXTENDS).replace('_', '/');
    }

    public static byte[] b(byte[] bArr) {
        if (com.applovin.impl.xp.f1515a >= 27) {
            return bArr;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.applovin.impl.xp.a(bArr));
            java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"keys\":[");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME);
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(b(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(b(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return com.applovin.impl.xp.c(sb.toString());
        } catch (org.json.JSONException e) {
            com.applovin.impl.oc.a("ClearKeyUtil", "Failed to adjust response data: " + com.applovin.impl.xp.a(bArr), e);
            return bArr;
        }
    }
}
