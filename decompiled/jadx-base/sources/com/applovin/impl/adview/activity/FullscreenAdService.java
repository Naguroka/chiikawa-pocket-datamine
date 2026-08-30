package com.applovin.impl.adview.activity;

/* JADX INFO: loaded from: classes3.dex */
public class FullscreenAdService extends android.app.Service {
    public static final java.lang.String DATA_KEY_RAW_FULL_AD_RESPONSE = "raw_full_ad_response";
    private static final java.lang.String TAG = "FullscreenAdService";

    private static class b extends android.os.Handler {
        private b() {
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            try {
                com.applovin.impl.sb sbVar = com.applovin.adview.AppLovinFullscreenActivity.parentInterstitialWrapper;
                if (sbVar == null) {
                    if (com.applovin.impl.yp.a(1.0d)) {
                        throw new java.lang.RuntimeException("parentWrapper is null for " + message.what);
                    }
                    super.handleMessage(message);
                    return;
                }
                com.applovin.impl.sdk.ad.b bVarF = sbVar.f();
                int i = message.what;
                com.applovin.impl.adview.activity.FullscreenAdService.c cVar = com.applovin.impl.adview.activity.FullscreenAdService.c.AD;
                if (i == cVar.b()) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString(com.applovin.impl.adview.activity.FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE, bVarF.getRawFullResponse());
                    android.os.Message messageObtain = android.os.Message.obtain((android.os.Handler) null, cVar.b());
                    messageObtain.setData(bundle);
                    try {
                        message.replyTo.send(messageObtain);
                        return;
                    } catch (android.os.RemoteException e) {
                        com.applovin.impl.sdk.n.c(com.applovin.impl.adview.activity.FullscreenAdService.TAG, "Failed to respond to Fullscreen Activity in another process with ad", e);
                        return;
                    }
                }
                if (message.what == com.applovin.impl.adview.activity.FullscreenAdService.c.AD_DISPLAYED.b()) {
                    com.applovin.impl.fc.a(sbVar.c(), bVarF);
                    return;
                }
                if (message.what == com.applovin.impl.adview.activity.FullscreenAdService.c.AD_CLICKED.b()) {
                    com.applovin.impl.fc.a(sbVar.b(), bVarF);
                    return;
                }
                if (message.what == com.applovin.impl.adview.activity.FullscreenAdService.c.AD_VIDEO_STARTED.b()) {
                    com.applovin.impl.fc.a(sbVar.d(), bVarF);
                    return;
                }
                if (message.what == com.applovin.impl.adview.activity.FullscreenAdService.c.AD_VIDEO_ENDED.b()) {
                    android.os.Bundle data = message.getData();
                    com.applovin.impl.fc.a(sbVar.d(), bVarF, data.getDouble("percent_viewed"), data.getBoolean("fully_watched"));
                    return;
                }
                if (message.what == com.applovin.impl.adview.activity.FullscreenAdService.c.AD_HIDDEN.b()) {
                    com.applovin.impl.fc.b(sbVar.c(), bVarF);
                } else {
                    super.handleMessage(message);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public enum c {
        AD(0),
        AD_DISPLAYED(1),
        AD_CLICKED(2),
        AD_VIDEO_STARTED(3),
        AD_VIDEO_ENDED(4),
        AD_HIDDEN(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f600a;

        c(int i2) {
            this.f600a = i2;
        }

        public int b() {
            return this.f600a;
        }
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return new android.os.Messenger(new com.applovin.impl.adview.activity.FullscreenAdService.b()).getBinder();
    }
}
