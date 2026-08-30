package com.applovin.communicator;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinCommunicatorMessage extends com.applovin.impl.communicator.CommunicatorMessageImpl {
    public AppLovinCommunicatorMessage(android.os.Bundle bundle, java.lang.String str, com.applovin.communicator.AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(bundle, str, appLovinCommunicatorPublisher);
    }

    @Override // com.applovin.impl.communicator.CommunicatorMessageImpl
    public android.os.Bundle getMessageData() {
        return this.data;
    }

    @Override // com.applovin.impl.communicator.CommunicatorMessageImpl
    public java.lang.String getPublisherId() {
        com.applovin.communicator.AppLovinCommunicatorPublisher appLovinCommunicatorPublisher = this.publisherRef.get();
        return appLovinCommunicatorPublisher != null ? appLovinCommunicatorPublisher.getCommunicatorId() : "";
    }

    @Override // com.applovin.impl.communicator.CommunicatorMessageImpl
    public java.lang.String getTopic() {
        return getAction();
    }
}
