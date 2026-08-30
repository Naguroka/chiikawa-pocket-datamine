package com.unity3d.ads.core.configuration;

/* JADX INFO: compiled from: MetadataReader.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\f\u001a\u0002H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\u0006\u0010\r\u001a\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u000eJ\u001e\u0010\u000f\u001a\u0002H\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u00012\u0006\u0010\r\u001a\u0002H\u0001H\u0086\b¢\u0006\u0002\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/unity3d/ads/core/configuration/MetadataReader;", "T", "", "jsonStorage", "Lcom/unity3d/services/core/misc/JsonStorage;", com.ironsource.y8.h.W, "", "(Lcom/unity3d/services/core/misc/JsonStorage;Ljava/lang/String;)V", "getJsonStorage", "()Lcom/unity3d/services/core/misc/JsonStorage;", "getKey", "()Ljava/lang/String;", "read", "defaultValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "readAndDelete", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class MetadataReader<T> {
    private final com.unity3d.services.core.misc.JsonStorage jsonStorage;
    private final java.lang.String key;

    public MetadataReader(com.unity3d.services.core.misc.JsonStorage jsonStorage, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonStorage, "jsonStorage");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.jsonStorage = jsonStorage;
        this.key = key;
    }

    public final com.unity3d.services.core.misc.JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final java.lang.String getKey() {
        return this.key;
    }

    public final /* synthetic */ <T> T read(T defaultValue) throws org.json.JSONException {
        java.lang.Object obj = getJsonStorage().get(getKey());
        if (obj == null) {
            return defaultValue;
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
        if (!(obj instanceof java.lang.Object)) {
            obj = defaultValue;
        }
        return obj == null ? defaultValue : (T) obj;
    }

    public final /* synthetic */ <T> T readAndDelete(T defaultValue) throws org.json.JSONException {
        java.lang.Object obj = getJsonStorage().get(getKey());
        if (obj != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "get(key)");
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(3, "T");
            if (!(obj instanceof java.lang.Object)) {
                obj = defaultValue;
            }
            if (obj != null) {
                defaultValue = (T) obj;
            }
        }
        java.lang.Object obj2 = getJsonStorage().get(getKey());
        if (obj2 != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "get(key)");
            getJsonStorage().delete(getKey());
        }
        return defaultValue;
    }
}
