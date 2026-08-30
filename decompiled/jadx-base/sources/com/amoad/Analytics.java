package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
public final class Analytics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.lang.String> f166a = new java.util.HashMap();
    private final java.lang.String b;

    public Analytics(java.lang.String str) {
        this.b = str;
    }

    public final void setParameter(java.lang.String str, java.lang.String str2) {
        this.f166a.put(str, str2);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : this.f166a.entrySet()) {
            if (sb.length() > 0) {
                sb.append("|");
            }
            sb.append(entry.getKey()).append(":").append(entry.getValue());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("rparam=");
        sb2.append(com.amoad.l.a(this.b, com.adjust.sdk.Constants.ENCODING));
        if (sb.length() > 0) {
            sb2.append("&plog=").append(com.amoad.l.a(sb.toString(), com.adjust.sdk.Constants.ENCODING));
        }
        return sb2.toString();
    }
}
