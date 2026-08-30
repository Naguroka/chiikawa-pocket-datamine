package com.applovin.impl.adview;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinWebViewBase extends android.webkit.WebView {
    public AppLovinWebViewBase(android.content.Context context) {
        super(context);
    }

    protected void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        java.lang.Boolean boolM;
        loadUrl(com.unity3d.ads.adplayer.AndroidWebViewClient.BLANK_PAGE);
        int iV0 = bVar.v0();
        if (iV0 >= 0) {
            setLayerType(iV0, null);
        }
        if (com.applovin.impl.z3.d()) {
            getSettings().setMediaPlaybackRequiresUserGesture(bVar.H());
        }
        if (com.applovin.impl.z3.e() && bVar.L0()) {
            android.webkit.WebView.setWebContentsDebuggingEnabled(true);
        }
        com.applovin.impl.adview.m mVarW0 = bVar.w0();
        if (mVarW0 != null) {
            android.webkit.WebSettings settings = getSettings();
            android.webkit.WebSettings.PluginState pluginStateB = mVarW0.b();
            if (pluginStateB != null) {
                settings.setPluginState(pluginStateB);
            }
            java.lang.Boolean boolE = mVarW0.e();
            if (boolE != null) {
                settings.setAllowFileAccess(boolE.booleanValue());
            }
            java.lang.Boolean boolI = mVarW0.i();
            if (boolI != null) {
                settings.setLoadWithOverviewMode(boolI.booleanValue());
            }
            java.lang.Boolean boolQ = mVarW0.q();
            if (boolQ != null) {
                settings.setUseWideViewPort(boolQ.booleanValue());
            }
            java.lang.Boolean boolD = mVarW0.d();
            if (boolD != null) {
                settings.setAllowContentAccess(boolD.booleanValue());
            }
            java.lang.Boolean boolP = mVarW0.p();
            if (boolP != null) {
                settings.setBuiltInZoomControls(boolP.booleanValue());
            }
            java.lang.Boolean boolH = mVarW0.h();
            if (boolH != null) {
                settings.setDisplayZoomControls(boolH.booleanValue());
            }
            java.lang.Boolean boolL = mVarW0.l();
            if (boolL != null) {
                settings.setSaveFormData(boolL.booleanValue());
            }
            java.lang.Boolean boolC = mVarW0.c();
            if (boolC != null) {
                settings.setGeolocationEnabled(boolC.booleanValue());
            }
            java.lang.Boolean boolJ = mVarW0.j();
            if (boolJ != null) {
                settings.setNeedInitialFocus(boolJ.booleanValue());
            }
            java.lang.Boolean boolF = mVarW0.f();
            if (boolF != null) {
                settings.setAllowFileAccessFromFileURLs(boolF.booleanValue());
            }
            java.lang.Boolean boolG = mVarW0.g();
            if (boolG != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolG.booleanValue());
            }
            java.lang.Boolean boolO = mVarW0.o();
            if (boolO != null) {
                settings.setLoadsImagesAutomatically(boolO.booleanValue());
            }
            java.lang.Boolean boolN = mVarW0.n();
            if (boolN != null) {
                settings.setBlockNetworkImage(boolN.booleanValue());
            }
            if (com.applovin.impl.z3.f()) {
                java.lang.Integer numA = mVarW0.a();
                if (numA != null) {
                    settings.setMixedContentMode(numA.intValue());
                }
                if (com.applovin.impl.z3.g()) {
                    java.lang.Boolean boolK = mVarW0.k();
                    if (boolK != null) {
                        settings.setOffscreenPreRaster(boolK.booleanValue());
                    }
                    if (!com.applovin.impl.z3.l() || (boolM = mVarW0.m()) == null) {
                        return;
                    }
                    settings.setAlgorithmicDarkeningAllowed(boolM.booleanValue());
                }
            }
        }
    }
}
