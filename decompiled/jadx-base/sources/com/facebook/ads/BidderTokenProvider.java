package com.facebook.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class BidderTokenProvider {
    public static java.lang.String getBidderToken(android.content.Context context) {
        com.facebook.ads.internal.util.common.Preconditions.checkNotNull(context, "Context can not be null.");
        return com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory.makeLoader(context).createBidderTokenProviderApi().getBidderToken(context);
    }
}
