package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustDeeplink {
    android.net.Uri url;

    public AdjustDeeplink(android.net.Uri uri) {
        this.url = uri;
    }

    public android.net.Uri getUrl() {
        return this.url;
    }

    public boolean isValid() {
        android.net.Uri uri = this.url;
        return (uri == null || uri.toString().isEmpty()) ? false : true;
    }
}
