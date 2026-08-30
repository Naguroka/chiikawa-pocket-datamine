package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonGetCacheDirectory.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetCacheDirectory;", "Lcom/unity3d/ads/core/domain/GetCacheDirectory;", "()V", "invoke", "Ljava/io/File;", "cacheDirectoryBase", "cacheDirectoryPath", "", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonGetCacheDirectory implements com.unity3d.ads.core.domain.GetCacheDirectory {
    @Override // com.unity3d.ads.core.domain.GetCacheDirectory
    public java.io.File invoke(java.io.File cacheDirectoryBase, java.lang.String cacheDirectoryPath) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheDirectoryBase, "cacheDirectoryBase");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheDirectoryPath, "cacheDirectoryPath");
        return new java.io.File(cacheDirectoryBase, cacheDirectoryPath);
    }
}
