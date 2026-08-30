package androidx.media3.datasource.cache;

/* JADX INFO: loaded from: classes.dex */
public interface CacheKeyFactory {
    public static final androidx.media3.datasource.cache.CacheKeyFactory DEFAULT = new androidx.media3.datasource.cache.CacheKeyFactory() { // from class: androidx.media3.datasource.cache.CacheKeyFactory$$ExternalSyntheticLambda0
        @Override // androidx.media3.datasource.cache.CacheKeyFactory
        public final java.lang.String buildCacheKey(androidx.media3.datasource.DataSpec dataSpec) {
            return androidx.media3.datasource.cache.CacheKeyFactory.lambda$static$0(dataSpec);
        }
    };

    java.lang.String buildCacheKey(androidx.media3.datasource.DataSpec dataSpec);

    static /* synthetic */ java.lang.String lambda$static$0(androidx.media3.datasource.DataSpec dataSpec) {
        return dataSpec.key != null ? dataSpec.key : dataSpec.uri.toString();
    }
}
