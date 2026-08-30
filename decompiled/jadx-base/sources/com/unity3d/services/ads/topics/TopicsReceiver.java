package com.unity3d.services.ads.topics;

/* JADX INFO: compiled from: TopicsReceiver.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0014\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0003j\u0002`\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/unity3d/services/ads/topics/TopicsReceiver;", "Landroid/os/OutcomeReceiver;", "Landroid/adservices/topics/GetTopicsResponse;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "eventSender", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "(Lcom/unity3d/services/core/webview/bridge/IEventSender;)V", "formatTopic", "Lorg/json/JSONObject;", "topic", "Landroid/adservices/topics/Topic;", "onError", "", "error", "onResult", "result", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TopicsReceiver implements android.os.OutcomeReceiver<android.adservices.topics.GetTopicsResponse, java.lang.Exception> {
    private final com.unity3d.services.core.webview.bridge.IEventSender eventSender;

    public TopicsReceiver(com.unity3d.services.core.webview.bridge.IEventSender eventSender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(android.adservices.topics.GetTopicsResponse result) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "result");
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        java.util.List<android.adservices.topics.Topic> topics = result.getTopics();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(topics, "result.topics");
        for (android.adservices.topics.Topic it : topics) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "it");
            jSONArray.put(formatTopic(it));
        }
        com.unity3d.services.core.webview.bridge.IEventSender iEventSender = this.eventSender;
        com.unity3d.services.core.webview.WebViewEventCategory webViewEventCategory = com.unity3d.services.core.webview.WebViewEventCategory.TOPICS;
        com.unity3d.services.ads.topics.TopicsEvents topicsEvents = com.unity3d.services.ads.topics.TopicsEvents.TOPICS_AVAILABLE;
        java.lang.String string = jSONArray.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, string);
    }

    @Override // android.os.OutcomeReceiver
    public void onError(java.lang.Exception error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.unity3d.services.core.log.DeviceLog.debug("GetTopics exception: " + error);
        this.eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.TOPICS, com.unity3d.services.ads.topics.TopicsEvents.NOT_AVAILABLE, com.unity3d.services.ads.topics.TopicsErrors.ERROR_EXCEPTION, error.toString());
    }

    public final org.json.JSONObject formatTopic(android.adservices.topics.Topic topic) throws org.json.JSONException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topic, "topic");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("taxonomyVersion", topic.getTaxonomyVersion());
        jSONObject.put("modelVersion", topic.getModelVersion());
        jSONObject.put("topicId", topic.getTopicId());
        return jSONObject;
    }
}
