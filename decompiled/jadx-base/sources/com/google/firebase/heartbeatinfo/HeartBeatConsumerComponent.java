package com.google.firebase.heartbeatinfo;

/* JADX INFO: loaded from: classes5.dex */
public class HeartBeatConsumerComponent {
    private HeartBeatConsumerComponent() {
    }

    public static com.google.firebase.components.Component<?> create() {
        return com.google.firebase.components.Component.intoSet(new com.google.firebase.heartbeatinfo.HeartBeatConsumer() { // from class: com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent.1
        }, (java.lang.Class<com.google.firebase.heartbeatinfo.HeartBeatConsumer>) com.google.firebase.heartbeatinfo.HeartBeatConsumer.class);
    }
}
