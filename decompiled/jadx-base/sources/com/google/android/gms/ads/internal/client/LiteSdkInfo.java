package com.google.android.gms.ads.internal.client;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class LiteSdkInfo extends com.google.android.gms.ads.internal.client.zzcv {
    public LiteSdkInfo(android.content.Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public com.google.android.gms.internal.ads.zzbpe getAdapterCreator() {
        return new com.google.android.gms.internal.ads.zzbpa();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public com.google.android.gms.ads.internal.client.zzfb getLiteSdkVersion() {
        return new com.google.android.gms.ads.internal.client.zzfb(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION, 244410000, "23.6.0");
    }
}
