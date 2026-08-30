package com.applovin.impl.privacy.cmp;

/* JADX INFO: loaded from: classes3.dex */
public class CmpServiceImpl implements com.applovin.sdk.AppLovinCmpService, com.applovin.impl.privacy.cmp.a.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f1156a;
    private final com.applovin.impl.m3 b;
    private com.applovin.impl.privacy.cmp.a c = b();
    private com.applovin.impl.privacy.cmp.CmpServiceImpl.d d;
    private com.applovin.impl.privacy.cmp.CmpServiceImpl.e e;

    class a implements com.applovin.impl.privacy.cmp.CmpServiceImpl.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.applovin.sdk.AppLovinCmpService.OnCompletedListener f1157a;
        final /* synthetic */ android.app.Activity b;

        /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.CmpServiceImpl$a$a, reason: collision with other inner class name */
        class C0046a implements com.applovin.impl.privacy.cmp.CmpServiceImpl.e {
            C0046a() {
            }

            @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
            public void a(com.applovin.sdk.AppLovinCmpError appLovinCmpError) {
                com.applovin.impl.privacy.cmp.CmpServiceImpl.a.this.f1157a.onCompleted(appLovinCmpError);
            }
        }

        a(com.applovin.sdk.AppLovinCmpService.OnCompletedListener onCompletedListener, android.app.Activity activity) {
            this.f1157a = onCompletedListener;
            this.b = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.d
        public void a(com.applovin.sdk.AppLovinCmpError appLovinCmpError) {
            if (appLovinCmpError != null) {
                this.f1157a.onCompleted(appLovinCmpError);
            } else {
                com.applovin.impl.privacy.cmp.CmpServiceImpl.this.showCmp(this.b, new com.applovin.impl.privacy.cmp.CmpServiceImpl.a.C0046a());
            }
        }
    }

    class b implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1159a;

        b(android.app.Activity activity) {
            this.f1159a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.privacy.cmp.CmpServiceImpl.this.c.a(this.f1159a, com.applovin.impl.privacy.cmp.CmpServiceImpl.this.b, com.applovin.impl.privacy.cmp.CmpServiceImpl.this);
        }
    }

    class c implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.app.Activity f1160a;

        c(android.app.Activity activity) {
            this.f1160a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.applovin.impl.privacy.cmp.CmpServiceImpl.this.c.b(this.f1160a, com.applovin.impl.privacy.cmp.CmpServiceImpl.this.b, com.applovin.impl.privacy.cmp.CmpServiceImpl.this);
        }
    }

    public interface d {
        void a(com.applovin.sdk.AppLovinCmpError appLovinCmpError);
    }

    public interface e {
        void a(com.applovin.sdk.AppLovinCmpError appLovinCmpError);
    }

    public CmpServiceImpl(com.applovin.impl.sdk.j jVar) {
        this.f1156a = jVar;
        this.b = new com.applovin.impl.m3(jVar.u().e());
    }

    private void c() {
        if (hasSupportedCmp()) {
            this.c.c();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public boolean hasSupportedCmp() {
        return this.c != null;
    }

    public void loadCmp(android.app.Activity activity, com.applovin.impl.privacy.cmp.CmpServiceImpl.d dVar) {
        if (!hasSupportedCmp()) {
            dVar.a(new com.applovin.impl.privacy.cmp.CmpErrorImpl(com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
            return;
        }
        this.d = dVar;
        com.applovin.impl.privacy.cmp.CmpServiceImpl.b bVar = new com.applovin.impl.privacy.cmp.CmpServiceImpl.b(activity);
        if (this.c.d()) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(bVar);
        } else {
            bVar.run();
        }
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowHidden(android.os.Bundle bundle) {
        b((com.applovin.sdk.AppLovinCmpError) null);
        a();
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowLoadFailed(com.applovin.impl.privacy.cmp.CmpErrorImpl cmpErrorImpl) {
        a(cmpErrorImpl);
        a();
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowLoaded(android.os.Bundle bundle) {
        a((com.applovin.sdk.AppLovinCmpError) null);
    }

    @Override // com.applovin.impl.privacy.cmp.a.d
    public void onFlowShowFailed(com.applovin.impl.privacy.cmp.CmpErrorImpl cmpErrorImpl) {
        b(cmpErrorImpl);
        a();
    }

    public void showCmp(android.app.Activity activity, com.applovin.impl.privacy.cmp.CmpServiceImpl.e eVar) {
        com.applovin.impl.privacy.cmp.CmpServiceImpl.c cVar = new com.applovin.impl.privacy.cmp.CmpServiceImpl.c(activity);
        this.e = eVar;
        if (this.c.e()) {
            com.applovin.sdk.AppLovinSdkUtils.runOnUiThread(cVar);
        } else {
            cVar.run();
        }
    }

    @Override // com.applovin.sdk.AppLovinCmpService
    public void showCmpForExistingUser(android.app.Activity activity, com.applovin.sdk.AppLovinCmpService.OnCompletedListener onCompletedListener) {
        this.f1156a.I();
        if (com.applovin.impl.sdk.n.a()) {
            this.f1156a.I().a("AppLovinCmpService", "showCmpForExistingUser(activity=" + activity + ", completedListener=" + onCompletedListener + ")");
        }
        if (!hasSupportedCmp()) {
            onCompletedListener.onCompleted(new com.applovin.impl.privacy.cmp.CmpErrorImpl(com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR, "A supported CMP is not integrated"));
        } else {
            c();
            loadCmp(activity, new com.applovin.impl.privacy.cmp.CmpServiceImpl.a(onCompletedListener, activity));
        }
    }

    public java.lang.String toString() {
        return "[CmpService]";
    }

    private void b(com.applovin.sdk.AppLovinCmpError appLovinCmpError) {
        com.applovin.impl.privacy.cmp.CmpServiceImpl.e eVar = this.e;
        if (eVar == null) {
            return;
        }
        eVar.a(appLovinCmpError);
        this.e = null;
    }

    private com.applovin.impl.privacy.cmp.a b() {
        if (com.applovin.impl.yp.a("com.google.android.ump.ConsentForm")) {
            return new com.applovin.impl.privacy.cmp.a(this.f1156a);
        }
        if (!this.f1156a.u().j()) {
            return null;
        }
        com.applovin.impl.sdk.n.h("AppLovinSdk", "Could not load Google UMP. Please add the Google User Messaging Platform SDK into your application. Instructions can be found here: https://developers.applovin.com/en/android/overview/terms-and-privacy-policy-flow#enabling-google-ump");
        return null;
    }

    private void a(com.applovin.sdk.AppLovinCmpError appLovinCmpError) {
        com.applovin.impl.privacy.cmp.CmpServiceImpl.d dVar = this.d;
        if (dVar == null) {
            return;
        }
        dVar.a(appLovinCmpError);
        this.d = null;
    }

    private void a() {
        com.applovin.impl.privacy.cmp.a aVar = this.c;
        if (aVar == null) {
            return;
        }
        aVar.a();
    }
}
