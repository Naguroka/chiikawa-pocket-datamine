package com.adjust.sdk;

/* JADX INFO: loaded from: classes3.dex */
public class AdjustSigner {
    private static volatile java.lang.Object signerInstance;

    private AdjustSigner() {
    }

    private static void getSignerInstance() {
        if (signerInstance == null) {
            synchronized (com.adjust.sdk.AdjustSigner.class) {
                if (signerInstance == null) {
                    signerInstance = com.adjust.sdk.Reflection.createDefaultInstance("com.adjust.sdk.sig.Signer");
                }
            }
        }
    }

    public static boolean isPresent() {
        getSignerInstance();
        return signerInstance != null;
    }

    public static void onResume(com.adjust.sdk.ILogger iLogger) {
        getSignerInstance();
        if (signerInstance == null) {
            return;
        }
        try {
            com.adjust.sdk.Reflection.invokeInstanceMethod(signerInstance, com.ironsource.y8.h.u0, null, new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            iLogger.warn("Invoking Signer onResume() received an error [%s]", e.getMessage());
        }
    }

    public static java.util.Map<java.lang.String, java.lang.String> sign(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, android.content.Context context, com.adjust.sdk.ILogger iLogger) {
        getSignerInstance();
        java.util.HashMap map3 = new java.util.HashMap();
        if (signerInstance != null) {
            try {
                iLogger.debug("Signing all the parameters", new java.lang.Object[0]);
                com.adjust.sdk.Reflection.invokeInstanceMethod(signerInstance, "sign", new java.lang.Class[]{android.content.Context.class, java.util.Map.class, java.util.Map.class, java.util.Map.class}, context, map, map2, map3);
            } catch (java.lang.Exception e) {
                iLogger.warn("Invoking Signer sign() for %s received an error [%s]", e.getMessage());
            }
        }
        return map3;
    }
}
