package com.amoad;

/* JADX INFO: loaded from: classes3.dex */
final class bg {
    private static com.amoad.bg b;
    private static java.lang.String c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    java.lang.String f274a;

    private bg(android.content.Context context) {
        if (com.amoad.bc.a(context)) {
            b(context);
        } else {
            c(context);
        }
    }

    static com.amoad.bg a(android.content.Context context) {
        if (b == null) {
            b = new com.amoad.bg(context);
        }
        return b;
    }

    private synchronized void c(final android.content.Context context) {
        com.amoad.bc.a(new android.os.Handler(context.getMainLooper()), new java.lang.Runnable() { // from class: com.amoad.bg.1
            @Override // java.lang.Runnable
            public final void run() {
                com.amoad.bg.this.b(context);
            }
        });
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
        }
    }

    final synchronized void b(android.content.Context context) {
        java.lang.String str = c;
        if (str == null) {
            this.f274a = new android.webkit.WebView(context).getSettings().getUserAgentString();
        } else {
            this.f274a = str;
        }
        notifyAll();
    }
}
