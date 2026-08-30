package com.unity3d.ads.network.model;

/* JADX INFO: compiled from: HttpBody.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody;", "", "ByteArrayBody", "EmptyBody", "StringBody", "Lcom/unity3d/ads/network/model/HttpBody$ByteArrayBody;", "Lcom/unity3d/ads/network/model/HttpBody$EmptyBody;", "Lcom/unity3d/ads/network/model/HttpBody$StringBody;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface HttpBody {

    /* JADX INFO: compiled from: HttpBody.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody$StringBody;", "Lcom/unity3d/ads/network/model/HttpBody;", "content", "", "(Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class StringBody implements com.unity3d.ads.network.model.HttpBody {
        private final java.lang.String content;

        public StringBody(java.lang.String content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final java.lang.String getContent() {
            return this.content;
        }
    }

    /* JADX INFO: compiled from: HttpBody.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody$ByteArrayBody;", "Lcom/unity3d/ads/network/model/HttpBody;", "content", "", "([B)V", "getContent", "()[B", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ByteArrayBody implements com.unity3d.ads.network.model.HttpBody {
        private final byte[] content;

        public ByteArrayBody(byte[] content) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        public final byte[] getContent() {
            return this.content;
        }
    }

    /* JADX INFO: compiled from: HttpBody.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/unity3d/ads/network/model/HttpBody$EmptyBody;", "Lcom/unity3d/ads/network/model/HttpBody;", "()V", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class EmptyBody implements com.unity3d.ads.network.model.HttpBody {
        public static final com.unity3d.ads.network.model.HttpBody.EmptyBody INSTANCE = new com.unity3d.ads.network.model.HttpBody.EmptyBody();

        private EmptyBody() {
        }
    }
}
