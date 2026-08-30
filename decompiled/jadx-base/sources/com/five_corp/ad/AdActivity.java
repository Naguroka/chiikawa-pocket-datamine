package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public class AdActivity extends android.app.Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.five_corp.ad.AdActivity.Callback f1759a;

    public interface Callback {
        void onAdActivityBackPressed();

        void onAdActivityDestroy();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        com.five_corp.ad.AdActivity.Callback callback = this.f1759a;
        if (callback != null) {
            callback.onAdActivityBackPressed();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        int i;
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            window.setDecorFitsSystemWindows(false);
            window.getDecorView().getWindowInsetsController().hide(android.view.WindowInsets.Type.statusBars() | android.view.WindowInsets.Type.navigationBars());
            window.getInsetsController().setSystemBarsBehavior(2);
        } else {
            window.addFlags(1536);
            android.view.View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes.BLE_SCANNING_UNSUPPORTED);
            decorView.setOnSystemUiVisibilityChangeListener(new com.five_corp.ad.a(window));
        }
        if (com.five_corp.ad.internal.fullscreen.c.f1902a == null) {
            com.five_corp.ad.internal.fullscreen.c.f1902a = new com.five_corp.ad.internal.fullscreen.a();
        }
        com.five_corp.ad.internal.fullscreen.a aVar = com.five_corp.ad.internal.fullscreen.c.f1902a;
        com.five_corp.ad.internal.fullscreen.b bVar = aVar.b;
        aVar.b = null;
        if (bVar == null) {
            finish();
            return;
        }
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) bVar;
        this.f1759a = fVar;
        fVar.o.f();
        synchronized (fVar.m) {
            i = fVar.u;
        }
        if (i == 1) {
            com.five_corp.ad.internal.context.l lVar = fVar.l;
            com.five_corp.ad.internal.ad.fullscreen.j jVar = lVar.e.c;
            if (jVar != null) {
                com.five_corp.ad.internal.fullscreen.e eVar = new com.five_corp.ad.internal.fullscreen.e(this, fVar.h, lVar, jVar, fVar, fVar.b.s, fVar.x, fVar.i, fVar.w);
                fVar.v = eVar;
                eVar.c();
                com.five_corp.ad.internal.viewability.a aVar2 = eVar.j;
                android.widget.FrameLayout frameLayout = eVar.g;
                aVar2.f = frameLayout;
                eVar.f1903a.setContentView(frameLayout);
                return;
            }
        }
        finish();
        fVar.a(0, new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.b4, null, null, null));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.five_corp.ad.AdActivity.Callback callback = this.f1759a;
        if (callback != null) {
            callback.onAdActivityDestroy();
        }
    }
}
