package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class re extends android.app.Activity implements com.applovin.communicator.AppLovinCommunicatorSubscriber {
    protected java.util.List<java.lang.String> communicatorTopics = new java.util.ArrayList();

    protected abstract com.applovin.impl.sdk.j getSdk();

    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getSdk() != null && !com.applovin.impl.yp.c(getSdk())) {
            setTheme(com.applovin.sdk.R.style.com_applovin_mediation_MaxDebuggerActivity_Theme_Live);
        }
        java.util.List<java.lang.String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        com.applovin.communicator.AppLovinCommunicator.getInstance(this).subscribe(this, this.communicatorTopics);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        java.util.List<java.lang.String> list = this.communicatorTopics;
        if (list == null || list.size() <= 0) {
            return;
        }
        com.applovin.communicator.AppLovinCommunicator.getInstance(this).unsubscribe(this, this.communicatorTopics);
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return getClass().getSimpleName();
    }
}
