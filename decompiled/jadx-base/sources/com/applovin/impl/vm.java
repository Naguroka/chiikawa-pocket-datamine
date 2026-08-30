package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class vm extends com.applovin.impl.yl implements com.applovin.impl.ye.a {
    private final com.applovin.impl.sdk.ad.a h;
    private com.applovin.sdk.AppLovinAdLoadListener i;
    private com.applovin.impl.adview.b j;

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.n.a()) {
            this.c.a(this.b, "Rendering AppLovin ad #" + this.h.getAdIdNumber());
        }
        com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(new java.lang.Runnable() { // from class: com.applovin.impl.vm$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.e();
            }
        });
    }

    public vm(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.j jVar) {
        super("TaskProcessJavaScriptTagAd", jVar);
        this.h = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, jVar);
        this.i = appLovinAdLoadListener;
        jVar.R().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        try {
            com.applovin.impl.adview.b bVar = new com.applovin.impl.adview.b(this.f1547a, a());
            this.j = bVar;
            bVar.a(new com.applovin.impl.vm.b(this.f1547a));
            this.j.loadDataWithBaseURL(this.h.h(), this.h.l1(), "text/html", null, "");
        } catch (java.lang.Throwable th) {
            this.f1547a.R().b(this);
            if (com.applovin.impl.sdk.n.a()) {
                this.c.a(this.b, "Failed to initialize WebView", th);
            }
            com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener = this.i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(-1);
                this.i = null;
            }
        }
    }

    private class b extends com.applovin.impl.adview.c {
        private b(com.applovin.impl.sdk.j jVar) {
            super(null, jVar);
        }

        private boolean a(java.lang.String str, com.applovin.impl.sj sjVar) {
            java.util.Iterator it = com.applovin.impl.vm.this.f1547a.c(sjVar).iterator();
            while (it.hasNext()) {
                if (((java.lang.String) it.next()).equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.impl.adview.c
        protected boolean a(android.webkit.WebView webView, java.lang.String str) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.vm.this.c;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.vm vmVar = com.applovin.impl.vm.this;
                vmVar.c.d(vmVar.b, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof com.applovin.impl.adview.b)) {
                return true;
            }
            android.net.Uri uri = android.net.Uri.parse(str);
            java.lang.String scheme = uri.getScheme();
            java.lang.String host = uri.getHost();
            if (!a(scheme, com.applovin.impl.sj.N1)) {
                return true;
            }
            if (a(host, com.applovin.impl.sj.O1)) {
                com.applovin.impl.sdk.n nVar2 = com.applovin.impl.vm.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.vm vmVar2 = com.applovin.impl.vm.this;
                    vmVar2.c.a(vmVar2.b, "Ad load succeeded");
                }
                if (com.applovin.impl.vm.this.i == null) {
                    return true;
                }
                com.applovin.impl.vm.this.i.adReceived(com.applovin.impl.vm.this.h);
                com.applovin.impl.vm.this.i = null;
                return true;
            }
            if (a(host, com.applovin.impl.sj.P1)) {
                com.applovin.impl.sdk.n nVar3 = com.applovin.impl.vm.this.c;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.vm vmVar3 = com.applovin.impl.vm.this;
                    vmVar3.c.a(vmVar3.b, "Ad load failed");
                }
                if (com.applovin.impl.vm.this.i == null) {
                    return true;
                }
                com.applovin.impl.vm.this.i.failedToReceiveAd(204);
                com.applovin.impl.vm.this.i = null;
                return true;
            }
            com.applovin.impl.sdk.n nVar4 = com.applovin.impl.vm.this.c;
            if (!com.applovin.impl.sdk.n.a()) {
                return true;
            }
            com.applovin.impl.vm vmVar4 = com.applovin.impl.vm.this;
            vmVar4.c.b(vmVar4.b, "Unrecognized webview event");
            return true;
        }
    }

    @Override // com.applovin.impl.ye.a
    public void a(com.applovin.impl.fe feVar) {
        if (feVar.R().equalsIgnoreCase(this.h.I())) {
            this.f1547a.R().b(this);
            com.applovin.sdk.AppLovinAdLoadListener appLovinAdLoadListener = this.i;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.h);
                this.i = null;
            }
        }
    }
}
