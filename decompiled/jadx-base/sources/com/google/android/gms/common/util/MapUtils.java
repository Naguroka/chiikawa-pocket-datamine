package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class MapUtils {
    public static void writeStringMapToJson(java.lang.StringBuilder sb, java.util.HashMap<java.lang.String, java.lang.String> map) {
        sb.append("{");
        boolean z = true;
        for (java.lang.String str : map.keySet()) {
            if (!z) {
                sb.append(",");
            }
            java.lang.String str2 = map.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
            z = false;
        }
        sb.append("}");
    }
}
