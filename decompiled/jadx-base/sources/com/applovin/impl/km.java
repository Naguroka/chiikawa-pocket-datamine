package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class km extends com.applovin.impl.yl {
    private final com.applovin.impl.km.b h;

    public interface b {
        void a(com.applovin.impl.y0.b bVar);

        void a(java.lang.String str);
    }

    public km(com.applovin.impl.sdk.j jVar, com.applovin.impl.km.b bVar) {
        super("TaskFetchDeveloperUri", jVar);
        this.h = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String strValueOf = java.lang.String.valueOf(this.f1547a.x().B().get(com.ironsource.y8.h.V));
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Looking up developer URI for package name: " + strValueOf);
        }
        this.f1547a.i0().a(new com.applovin.impl.km.a(com.applovin.impl.sdk.network.a.a(this.f1547a).c("GET").b("https://play.google.com/store/apps/details?id=" + strValueOf).a((java.lang.Object) "").a(false).a(), this.f1547a));
    }

    class a extends com.applovin.impl.dn {
        a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.j jVar) {
            super(aVar, jVar);
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, java.lang.String str2, int i) {
            if (android.text.TextUtils.isEmpty(str2)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "No developer URI found - response from the Play Store is empty");
                }
                com.applovin.impl.km.this.h.a(com.applovin.impl.y0.b.APP_DETAILS_NOT_FOUND);
                return;
            }
            java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("(?<=\"appstore:developer_url\" content=\").*?(?=\">)").matcher(str2);
            if (!matcher.find()) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "No developer URI found - unable to find the developer_url meta tag from the Play Store listing");
                }
                com.applovin.impl.km.this.h.a(com.applovin.impl.y0.b.INVALID_DEVELOPER_URI);
                return;
            }
            java.lang.String strGroup = matcher.group();
            if (!android.webkit.URLUtil.isValidUrl(strGroup)) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.b(this.b, "Developer URI (" + strGroup + ") is not valid");
                }
                com.applovin.impl.km.this.h.a(com.applovin.impl.y0.b.INVALID_DEVELOPER_URI);
            } else {
                if (com.applovin.impl.sdk.n.a()) {
                    this.c.a(this.b, "Found developer URI: " + strGroup);
                }
                com.applovin.impl.km.this.h.a(strGroup);
            }
        }

        @Override // com.applovin.impl.dn, com.applovin.impl.d4.e
        public void a(java.lang.String str, int i, java.lang.String str2, java.lang.String str3) {
            if (com.applovin.impl.sdk.n.a()) {
                this.c.b(this.b, "Unable to fetch app details due to: " + str2 + ", and received error code: " + i);
            }
            com.applovin.impl.km.this.h.a(com.applovin.impl.y0.b.APP_DETAILS_NOT_FOUND);
        }
    }
}
