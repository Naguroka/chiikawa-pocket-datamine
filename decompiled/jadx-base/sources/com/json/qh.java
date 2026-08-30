package com.json;

/* JADX INFO: loaded from: classes5.dex */
public interface qh {

    public interface a {
        void a(java.lang.String str);

        void b(java.lang.String str);
    }

    void a(java.lang.String str, java.lang.String str2);

    void a(java.lang.String str, java.lang.String str2, java.lang.String str3);

    void a(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2);

    void b(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2);

    void c(org.json.JSONObject jSONObject, java.lang.String str, java.lang.String str2) throws org.json.JSONException;

    android.webkit.WebView getPresentingView();
}
