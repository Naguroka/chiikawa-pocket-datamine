package com.unity3d.ads.core.data.datasource;

/* JADX INFO: compiled from: AndroidStoreDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidStoreDataSource;", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fetchStores", "", "", "additionalStores", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidStoreDataSource implements com.unity3d.ads.core.data.datasource.StoreDataSource {
    private final android.content.Context context;

    public AndroidStoreDataSource(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    public java.util.List<java.lang.String> fetchStores(java.util.List<java.lang.String> additionalStores) {
        boolean z;
        android.content.pm.PackageInfo packageInfo;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalStores, "additionalStores");
        com.unity3d.ads.core.data.datasource.AndroidKnownStore[] androidKnownStoreArrValues = com.unity3d.ads.core.data.datasource.AndroidKnownStore.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(androidKnownStoreArrValues.length);
        for (com.unity3d.ads.core.data.datasource.AndroidKnownStore androidKnownStore : androidKnownStoreArrValues) {
            arrayList.add(androidKnownStore.getPackageName());
        }
        java.util.List listDistinct = kotlin.collections.CollectionsKt.distinct(kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList, (java.lang.Iterable) additionalStores));
        android.content.pm.PackageManager packageManager = this.context.getPackageManager();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : listDistinct) {
            java.lang.String str = (java.lang.String) obj;
            try {
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    packageInfo = packageManager.getPackageInfo(str, android.content.pm.PackageManager.PackageInfoFlags.of(0L));
                } else {
                    packageInfo = packageManager.getPackageInfo(str, 0);
                }
                z = packageInfo != null;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
            if (z) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
