package com.five_corp.ad.internal.view;

/* JADX INFO: renamed from: com.five_corp.ad.internal.view.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1512e extends android.webkit.WebView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2095a = 0;

    public C1512e(android.content.Context context, java.lang.String str) {
        super(context);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            a();
        }
        a(str);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
    }

    public final void a(java.lang.String str) {
        loadData(android.util.Base64.encodeToString(str.getBytes(), 0), "text/html", "base64");
    }

    public final void a() {
        setWebViewClient(new com.five_corp.ad.internal.view.C1511d());
    }
}
