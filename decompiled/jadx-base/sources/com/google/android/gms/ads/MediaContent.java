package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    android.graphics.drawable.Drawable getMainImage();

    com.google.android.gms.ads.VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(android.graphics.drawable.Drawable drawable);

    com.google.android.gms.internal.ads.zzbgq zza();

    boolean zzb();
}
