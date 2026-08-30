package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: GetTopicsResponseHelper.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponseHelper;", "", "()V", "convertResponse", "Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", com.json.hs.n, "Landroid/adservices/topics/GetTopicsResponse;", "convertResponse$ads_adservices_release", "convertResponseWithEncryptedTopics", "convertResponseWithEncryptedTopics$ads_adservices_release", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTopicsResponseHelper {
    public static final androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper INSTANCE = new androidx.privacysandbox.ads.adservices.topics.GetTopicsResponseHelper();

    private GetTopicsResponseHelper() {
    }

    public final androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse convertResponse$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.adservices.topics.Topic topic : response.getTopics()) {
            arrayList.add(new androidx.privacysandbox.ads.adservices.topics.Topic(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        return new androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse(arrayList);
    }

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext11OptIn
    public final androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse convertResponseWithEncryptedTopics$ads_adservices_release(android.adservices.topics.GetTopicsResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.adservices.topics.Topic topic : response.getTopics()) {
            arrayList.add(new androidx.privacysandbox.ads.adservices.topics.Topic(topic.getTaxonomyVersion(), topic.getModelVersion(), topic.getTopicId()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (android.adservices.topics.EncryptedTopic encryptedTopic : response.getEncryptedTopics()) {
            byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encryptedTopic2, "encryptedTopic.encryptedTopic");
            java.lang.String keyIdentifier = encryptedTopic.getKeyIdentifier();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(keyIdentifier, "encryptedTopic.keyIdentifier");
            byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encapsulatedKey, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new androidx.privacysandbox.ads.adservices.topics.EncryptedTopic(encryptedTopic2, keyIdentifier, encapsulatedKey));
        }
        return new androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse(arrayList, arrayList2);
    }
}
