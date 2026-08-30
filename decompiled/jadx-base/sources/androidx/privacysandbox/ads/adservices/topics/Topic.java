package androidx.privacysandbox.ads.adservices.topics;

/* JADX INFO: compiled from: Topic.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/privacysandbox/ads/adservices/topics/Topic;", "", "taxonomyVersion", "", "modelVersion", "topicId", "", "(JJI)V", "getModelVersion", "()J", "getTaxonomyVersion", "getTopicId", "()I", "equals", "", "other", "hashCode", "toString", "", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Topic {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public Topic(long j, long j2, int i) {
        this.taxonomyVersion = j;
        this.modelVersion = j2;
        this.topicId = i;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public java.lang.String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.taxonomyVersion + ", ModelVersion=" + this.modelVersion + ", TopicCode=" + this.topicId + " }");
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.privacysandbox.ads.adservices.topics.Topic)) {
            return false;
        }
        androidx.privacysandbox.ads.adservices.topics.Topic topic = (androidx.privacysandbox.ads.adservices.topics.Topic) other;
        return this.taxonomyVersion == topic.taxonomyVersion && this.modelVersion == topic.modelVersion && this.topicId == topic.topicId;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.taxonomyVersion) * 31) + java.lang.Long.hashCode(this.modelVersion)) * 31) + java.lang.Integer.hashCode(this.topicId);
    }
}
