package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class JsonUtils {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\\\.");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private JsonUtils() {
    }

    public static boolean areJsonValuesEquivalent(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof org.json.JSONObject) && (obj2 instanceof org.json.JSONObject)) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                if (jSONObject2.has(next)) {
                    try {
                        com.google.android.gms.common.internal.Preconditions.checkNotNull(next);
                        java.lang.String str = next;
                        if (!areJsonValuesEquivalent(jSONObject.get(next), jSONObject2.get(next))) {
                        }
                    } catch (org.json.JSONException unused) {
                    }
                }
                return false;
            }
            return true;
        }
        if (!(obj instanceof org.json.JSONArray) || !(obj2 instanceof org.json.JSONArray)) {
            return obj.equals(obj2);
        }
        org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
        org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                if (!areJsonValuesEquivalent(jSONArray.get(i), jSONArray2.get(i))) {
                    return false;
                }
            } catch (org.json.JSONException unused2) {
            }
        }
        return true;
    }

    public static java.lang.String escapeString(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.util.regex.Matcher matcher = zzb.matcher(str);
        java.lang.StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new java.lang.StringBuffer();
            }
            char cCharAt = matcher.group().charAt(0);
            if (cCharAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (cCharAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (cCharAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (cCharAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (cCharAt != '\\') {
                switch (cCharAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static java.lang.String unescapeString(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String strZza = com.google.android.gms.common.util.zze.zza(str);
        java.util.regex.Matcher matcher = zza.matcher(strZza);
        java.lang.StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new java.lang.StringBuffer();
            }
            char cCharAt = matcher.group().charAt(1);
            if (cCharAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\"");
            } else if (cCharAt == '/') {
                matcher.appendReplacement(stringBuffer, "/");
            } else if (cCharAt == '\\') {
                matcher.appendReplacement(stringBuffer, "\\\\");
            } else if (cCharAt == 'b') {
                matcher.appendReplacement(stringBuffer, "\b");
            } else if (cCharAt == 'f') {
                matcher.appendReplacement(stringBuffer, "\f");
            } else if (cCharAt == 'n') {
                matcher.appendReplacement(stringBuffer, "\n");
            } else if (cCharAt == 'r') {
                matcher.appendReplacement(stringBuffer, "\r");
            } else {
                if (cCharAt != 't') {
                    throw new java.lang.IllegalStateException("Found an escaped character that should never be.");
                }
                matcher.appendReplacement(stringBuffer, "\t");
            }
        }
        if (stringBuffer == null) {
            return strZza;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
