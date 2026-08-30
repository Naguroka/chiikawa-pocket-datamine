package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: GetTopicsResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B#\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\u0010\bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0013"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/GetTopicsResponse;", "", "topics", "", "Landroidx/privacysandbox/ads/adservices/topics/Topic;", "(Ljava/util/List;)V", "encryptedTopics", "Landroidx/privacysandbox/ads/adservices/topics/EncryptedTopic;", "(Ljava/util/List;Ljava/util/List;)V", "getEncryptedTopics", "()Ljava/util/List;", "getTopics", "equals", "", "other", "hashCode", "", "toString", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GetTopicsResponse {
    private final java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> encryptedTopics;
    private final java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> topics;

    @androidx.privacysandbox.ads.adservices.common.ExperimentalFeatures.Ext11OptIn
    public GetTopicsResponse(java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> topics, java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> encryptedTopics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topics, "topics");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedTopics, "encryptedTopics");
        this.topics = topics;
        this.encryptedTopics = encryptedTopics;
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> getTopics() {
        return this.topics;
    }

    public final java.util.List<androidx.privacysandbox.ads.adservices.topics.EncryptedTopic> getEncryptedTopics() {
        return this.encryptedTopics;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetTopicsResponse(java.util.List<androidx.privacysandbox.ads.adservices.topics.Topic> topics) {
        this(topics, kotlin.collections.CollectionsKt.emptyList());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(topics, "topics");
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse getTopicsResponse = (androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse) other;
        if (this.topics.size() == getTopicsResponse.topics.size() && this.encryptedTopics.size() == getTopicsResponse.encryptedTopics.size()) {
            return kotlin.jvm.internal.Intrinsics.areEqual(new java.util.HashSet(this.topics), new java.util.HashSet(getTopicsResponse.topics)) && kotlin.jvm.internal.Intrinsics.areEqual(new java.util.HashSet(this.encryptedTopics), new java.util.HashSet(getTopicsResponse.encryptedTopics));
        }
        return false;
    }

    public int hashCode() {
        return java.util.Objects.hash(this.topics, this.encryptedTopics);
    }

    public java.lang.String toString() {
        return "GetTopicsResponse: Topics=" + this.topics + ", EncryptedTopics=" + this.encryptedTopics;
    }
}
