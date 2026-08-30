package com.bytedance.sdk.component.iR.eqN;

/* JADX INFO: loaded from: classes3.dex */
public class bg {
    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[PHI: r1
  0x0023: PHI (r1v1 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:6:0x0010, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean bg(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str;
        if (map == null) {
            return false;
        }
        java.lang.String str2 = "content-type";
        if (android.text.TextUtils.isEmpty(map.get("content-type"))) {
            str2 = "Content-Type";
            if (android.text.TextUtils.isEmpty(map.get("Content-Type"))) {
                str = "";
            } else {
                str = map.get(str2);
            }
        } else {
            str = map.get(str2);
        }
        return str.contains("application/octet-stream");
    }
}
