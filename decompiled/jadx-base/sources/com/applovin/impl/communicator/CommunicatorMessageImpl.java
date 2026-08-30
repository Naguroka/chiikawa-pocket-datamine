package com.applovin.impl.communicator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CommunicatorMessageImpl extends android.content.Intent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.String f688a;
    protected final android.os.Bundle data;
    protected final java.lang.ref.WeakReference<com.applovin.communicator.AppLovinCommunicatorPublisher> publisherRef;

    public CommunicatorMessageImpl(android.os.Bundle bundle, java.lang.String str, com.applovin.communicator.AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(str);
        this.f688a = java.util.UUID.randomUUID().toString();
        this.publisherRef = new java.lang.ref.WeakReference<>(appLovinCommunicatorPublisher);
        this.data = bundle;
    }

    public static com.applovin.communicator.AppLovinCommunicatorMessage create(android.os.Bundle bundle, java.lang.String str, com.applovin.communicator.AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        return new com.applovin.communicator.AppLovinCommunicatorMessage(bundle, str, appLovinCommunicatorPublisher);
    }

    public abstract android.os.Bundle getMessageData();

    public abstract java.lang.String getPublisherId();

    public abstract java.lang.String getTopic();

    public java.lang.String getUniqueId() {
        return this.f688a;
    }

    @Override // android.content.Intent
    public java.lang.String toString() {
        return "AppLovinCommunicatorMessage{publisherId=" + getPublisherId() + ", topic=" + getTopic() + "', uniqueId='" + this.f688a + "', data=" + this.data + '}';
    }
}
