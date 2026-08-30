package com.apm.insight;

/* JADX INFO: compiled from: CrashCallbackWrapper.java */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements com.apm.insight.ICrashCallback, com.apm.insight.IOOMCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.apm.insight.IOOMCallback f360a;
    private com.apm.insight.ICrashCallback b;
    private java.lang.String c;

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(com.apm.insight.CrashType crashType, java.lang.String str, java.lang.Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(com.apm.insight.CrashType crashType, java.lang.Throwable th, java.lang.Thread thread, long j) {
    }

    public b(java.lang.String str, com.apm.insight.ICrashCallback iCrashCallback) {
        this.c = str;
        this.b = iCrashCallback;
    }

    public b(java.lang.String str, com.apm.insight.IOOMCallback iOOMCallback) {
        this.c = str;
        this.f360a = iOOMCallback;
    }

    public final void a(com.apm.insight.CrashType crashType, java.lang.Throwable th, java.lang.Thread thread, long j, org.json.JSONArray jSONArray) {
        if (this.f360a == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (android.text.TextUtils.equals(com.apm.insight.a.a(jSONArray.optJSONObject(i), "header", com.json.tk.SESSION_HISTORY_KEY_AD_ID), this.c)) {
                this.f360a.onCrash(crashType, th, thread, j);
            }
        }
    }

    public final void a(com.apm.insight.CrashType crashType, java.lang.String str, java.lang.Thread thread, org.json.JSONArray jSONArray) {
        if (this.b == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (android.text.TextUtils.equals(com.apm.insight.a.a(jSONArray.optJSONObject(i), "header", com.json.tk.SESSION_HISTORY_KEY_AD_ID), this.c)) {
                this.b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(com.apm.insight.CrashType crashType, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.apm.insight.d dVarA;
        if (this.b == null || (dVarA = com.apm.insight.d.a(this.c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.b.onCrash(crashType, str, null);
    }
}
