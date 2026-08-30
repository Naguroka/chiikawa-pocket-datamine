package com.unity3d.ads.core.data.repository;

/* JADX INFO: compiled from: AndroidTcfRepository.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/data/repository/AndroidTcfRepository;", "Lcom/unity3d/ads/core/data/repository/TcfRepository;", "tcfDataSource", "Lcom/unity3d/ads/core/data/datasource/TcfDataSource;", "(Lcom/unity3d/ads/core/data/datasource/TcfDataSource;)V", "getTcfDataSource", "()Lcom/unity3d/ads/core/data/datasource/TcfDataSource;", "tcfString", "", "getTcfString", "()Ljava/lang/String;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTcfRepository implements com.unity3d.ads.core.data.repository.TcfRepository {
    private final com.unity3d.ads.core.data.datasource.TcfDataSource tcfDataSource;

    public AndroidTcfRepository(com.unity3d.ads.core.data.datasource.TcfDataSource tcfDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tcfDataSource, "tcfDataSource");
        this.tcfDataSource = tcfDataSource;
    }

    public final com.unity3d.ads.core.data.datasource.TcfDataSource getTcfDataSource() {
        return this.tcfDataSource;
    }

    @Override // com.unity3d.ads.core.data.repository.TcfRepository
    public java.lang.String getTcfString() {
        return this.tcfDataSource.getTcfString();
    }
}
