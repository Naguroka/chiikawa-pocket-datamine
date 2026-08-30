package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: CacheRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J7\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H&J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/unity3d/ads/core/data/repository/CacheRepository;", "", "clearCache", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doesFileExist", "", com.ironsource.rc.c.b, "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCacheSize", "", "getFile", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "objectId", "headers", "Lorg/json/JSONArray;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeFile", "cachedFile", "Lcom/unity3d/ads/core/data/model/CachedFile;", "retrieveFile", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CacheRepository {
    java.lang.Object clearCache(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object doesFileExist(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object getCacheSize(kotlin.coroutines.Continuation<? super java.lang.Long> continuation);

    java.lang.Object getFile(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, int i, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.model.CacheResult> continuation);

    boolean removeFile(com.unity3d.ads.core.data.model.CachedFile cachedFile);

    com.unity3d.ads.core.data.model.CacheResult retrieveFile(java.lang.String fileName);

    /* JADX INFO: compiled from: CacheRepository.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object getFile$default(com.unity3d.ads.core.data.repository.CacheRepository cacheRepository, java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, int i, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i2 & 4) != 0) {
                jSONArray = null;
            }
            org.json.JSONArray jSONArray2 = jSONArray;
            if ((i2 & 8) != 0) {
                i = 0;
            }
            return cacheRepository.getFile(str, str2, jSONArray2, i, continuation);
        }
    }
}
