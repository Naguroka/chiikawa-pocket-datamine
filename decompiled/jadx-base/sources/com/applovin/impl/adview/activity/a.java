package com.applovin.impl.adview.activity;

/* JADX INFO: loaded from: classes3.dex */
public class a implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f601a;
    private final com.applovin.impl.sdk.n b;
    private final java.lang.ref.WeakReference c;
    private final java.util.concurrent.atomic.AtomicBoolean d = new java.util.concurrent.atomic.AtomicBoolean();
    private android.os.Messenger e;

    private class b implements com.applovin.sdk.AppLovinAdDisplayListener, com.applovin.sdk.AppLovinAdClickListener, com.applovin.sdk.AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(com.applovin.impl.adview.activity.FullscreenAdService.c cVar) {
            a(null, cVar);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(com.applovin.sdk.AppLovinAd appLovinAd) {
            a(com.applovin.impl.adview.activity.FullscreenAdService.c.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(com.applovin.sdk.AppLovinAd appLovinAd) {
            a(com.applovin.impl.adview.activity.FullscreenAdService.c.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(com.applovin.sdk.AppLovinAd appLovinAd) {
            a(com.applovin.impl.adview.activity.FullscreenAdService.c.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(com.applovin.sdk.AppLovinAd appLovinAd) {
            a(com.applovin.impl.adview.activity.FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(com.applovin.sdk.AppLovinAd appLovinAd, double d, boolean z) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            a(bundle, com.applovin.impl.adview.activity.FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        /* synthetic */ b(com.applovin.impl.adview.activity.a aVar, com.applovin.impl.adview.activity.a.C0030a c0030a) {
            this();
        }

        private void a(android.os.Bundle bundle, com.applovin.impl.adview.activity.FullscreenAdService.c cVar) {
            android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, cVar.b());
            if (bundle != null) {
                messageObtain.setData(bundle);
            }
            try {
                com.applovin.impl.adview.activity.a.this.e.send(messageObtain);
            } catch (android.os.RemoteException e) {
                com.applovin.impl.sdk.n unused = com.applovin.impl.adview.activity.a.this.b;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.adview.activity.a.this.b.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e);
                }
            }
        }
    }

    private static class c extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.lang.ref.WeakReference f605a;

        /* synthetic */ c(com.applovin.impl.adview.activity.a aVar, com.applovin.impl.adview.activity.a.C0030a c0030a) {
            this(aVar);
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.applovin.impl.adview.activity.a aVar;
            if (message.what != com.applovin.impl.adview.activity.FullscreenAdService.c.AD.b() || (aVar = (com.applovin.impl.adview.activity.a) this.f605a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.a(message.getData().getString(com.applovin.impl.adview.activity.FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }

        private c(com.applovin.impl.adview.activity.a aVar) {
            this.f605a = new java.lang.ref.WeakReference(aVar);
        }
    }

    public a(com.applovin.adview.AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.impl.sdk.j jVar) {
        this.f601a = jVar;
        this.b = jVar.I();
        this.c = new java.lang.ref.WeakReference(appLovinFullscreenActivity);
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        if (this.d.compareAndSet(false, true)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.e = new android.os.Messenger(iBinder);
            android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, com.applovin.impl.adview.activity.FullscreenAdService.c.AD.b());
            messageObtain.replyTo = new android.os.Messenger(new com.applovin.impl.adview.activity.a.c(this, null));
            try {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.e.send(messageObtain);
            } catch (android.os.RemoteException e) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e);
                }
                a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(android.content.ComponentName componentName) {
        if (this.d.compareAndSet(true, false) && com.applovin.impl.sdk.n.a()) {
            this.b.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        com.applovin.adview.AppLovinFullscreenActivity appLovinFullscreenActivity = (com.applovin.adview.AppLovinFullscreenActivity) this.c.get();
        if (appLovinFullscreenActivity != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (com.applovin.impl.sdk.n.a()) {
            this.b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String string = com.applovin.impl.sdk.utils.JsonUtils.getString(jSONObject, com.applovin.mediation.AppLovinUtils.ServerParameterKeys.ZONE_ID, "");
            if (!android.text.TextUtils.isEmpty(string)) {
                this.f601a.i0().a(new com.applovin.impl.um(jSONObject, com.applovin.impl.h0.a(string), true, new com.applovin.impl.adview.activity.a.C0030a(), this.f601a));
                return;
            }
            throw new java.lang.IllegalStateException("No zone identifier found in ad response: " + jSONObject);
        } catch (org.json.JSONException e) {
            if (com.applovin.impl.sdk.n.a()) {
                this.b.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e);
            }
            a();
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a, reason: collision with other inner class name */
    class C0030a implements com.applovin.sdk.AppLovinAdLoadListener {
        C0030a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(com.applovin.sdk.AppLovinAd appLovinAd) {
            com.applovin.adview.AppLovinFullscreenActivity appLovinFullscreenActivity = (com.applovin.adview.AppLovinFullscreenActivity) com.applovin.impl.adview.activity.a.this.c.get();
            if (appLovinFullscreenActivity == null) {
                com.applovin.impl.sdk.n unused = com.applovin.impl.adview.activity.a.this.b;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.adview.activity.a.this.b.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.n unused2 = com.applovin.impl.adview.activity.a.this.b;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.adview.activity.a.this.b.a("AppLovinFullscreenActivity", "Presenting ad...");
            }
            com.applovin.impl.adview.activity.a.b bVar = new com.applovin.impl.adview.activity.a.b(com.applovin.impl.adview.activity.a.this, null);
            com.applovin.impl.o9.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, null, com.applovin.impl.adview.activity.a.this.f601a, appLovinFullscreenActivity, new com.applovin.impl.adview.activity.a.C0030a.C0031a(appLovinFullscreenActivity, appLovinAd, bVar));
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            com.applovin.impl.adview.activity.a.this.a();
        }

        /* JADX INFO: renamed from: com.applovin.impl.adview.activity.a$a$a, reason: collision with other inner class name */
        class C0031a implements com.applovin.impl.o9.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.applovin.adview.AppLovinFullscreenActivity f603a;
            final /* synthetic */ com.applovin.sdk.AppLovinAd b;
            final /* synthetic */ com.applovin.impl.adview.activity.a.b c;

            C0031a(com.applovin.adview.AppLovinFullscreenActivity appLovinFullscreenActivity, com.applovin.sdk.AppLovinAd appLovinAd, com.applovin.impl.adview.activity.a.b bVar) {
                this.f603a = appLovinFullscreenActivity;
                this.b = appLovinAd;
                this.c = bVar;
            }

            @Override // com.applovin.impl.o9.d
            public void a(com.applovin.impl.o9 o9Var) {
                this.f603a.setPresenter(o9Var);
                o9Var.y();
            }

            @Override // com.applovin.impl.o9.d
            public void a(java.lang.String str, java.lang.Throwable th) {
                com.applovin.impl.sb.a((com.applovin.impl.sdk.ad.b) this.b, this.c, str, th, this.f603a);
            }
        }
    }
}
