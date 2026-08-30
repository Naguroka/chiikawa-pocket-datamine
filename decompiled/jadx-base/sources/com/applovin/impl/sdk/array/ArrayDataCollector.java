package com.applovin.impl.sdk.array;

/* JADX INFO: loaded from: classes3.dex */
public class ArrayDataCollector {
    private static final java.lang.String TAG = "ArrayService";
    private final com.applovin.impl.sdk.n logger;
    private final com.applovin.impl.sdk.j sdk;

    public ArrayDataCollector(com.applovin.impl.sdk.j jVar) {
        this.sdk = jVar;
        this.logger = jVar.I();
    }

    public long collectAppHubVersionCode(com.applovin.array.apphub.aidl.IAppHubService iAppHubService) {
        try {
            return iAppHubService.getAppHubVersionCode();
        } catch (java.lang.Throwable th) {
            if (!com.applovin.impl.sdk.n.a()) {
                return -1L;
            }
            this.logger.a(TAG, "Failed to collect version code", th);
            return -1L;
        }
    }

    public java.lang.Boolean collectDirectDownloadEnabled(com.applovin.array.apphub.aidl.IAppHubService iAppHubService) {
        try {
            return java.lang.Boolean.valueOf(iAppHubService.getEnabledFeatures().getBoolean("DIRECT_DOWNLOAD"));
        } catch (java.lang.Throwable th) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.logger.a(TAG, "Failed to collect enabled features", th);
            return null;
        }
    }

    public java.lang.String collectRandomUserToken(com.applovin.array.apphub.aidl.IAppHubService iAppHubService) {
        try {
            return iAppHubService.getRandomUserToken();
        } catch (java.lang.Throwable th) {
            if (!com.applovin.impl.sdk.n.a()) {
                return null;
            }
            this.logger.a(TAG, "Failed to collect random user token", th);
            return null;
        }
    }
}
