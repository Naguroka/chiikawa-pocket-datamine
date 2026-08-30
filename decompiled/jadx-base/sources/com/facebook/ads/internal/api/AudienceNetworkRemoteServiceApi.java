package com.facebook.ads.internal.api;

/* JADX INFO: loaded from: classes4.dex */
public interface AudienceNetworkRemoteServiceApi {

    public interface MessageHandler {
        boolean handleMessage(android.os.Message message);
    }

    android.os.IBinder onBind(android.content.Intent intent);

    void onCreate();

    void onDestroy();

    void setMessageHandler(com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi.MessageHandler messageHandler);
}
