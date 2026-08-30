package com.unity3d.ads.core.domain;

/* JADX INFO: compiled from: CommonCreateFile.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonCreateFile;", "Lcom/unity3d/ads/core/domain/CreateFile;", "()V", "invoke", "Ljava/io/File;", "parent", "child", "", "pathname", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CommonCreateFile implements com.unity3d.ads.core.domain.CreateFile {
    @Override // com.unity3d.ads.core.domain.CreateFile
    public java.io.File invoke(java.io.File parent, java.lang.String child) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parent, "parent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(child, "child");
        return new java.io.File(parent, child);
    }

    @Override // com.unity3d.ads.core.domain.CreateFile
    public java.io.File invoke(java.lang.String pathname) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathname, "pathname");
        return new java.io.File(pathname);
    }
}
