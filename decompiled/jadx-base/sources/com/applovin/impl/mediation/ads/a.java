package com.applovin.impl.mediation.ads;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    protected final com.applovin.mediation.MaxAdFormat adFormat;
    protected com.applovin.mediation.MaxAdListener adListener;
    protected com.applovin.mediation.MaxAdReviewListener adReviewListener;
    protected final java.lang.String adUnitId;
    protected com.applovin.mediation.MaxAdExpirationListener expirationListener;
    protected final com.applovin.impl.sdk.n logger;
    protected com.applovin.mediation.MaxAdRequestListener requestListener;
    protected com.applovin.mediation.MaxAdRevenueListener revenueListener;
    protected final com.applovin.impl.sdk.j sdk;
    protected final java.lang.String tag;
    protected final java.util.Map<java.lang.String, java.lang.Object> localExtraParameters = java.util.Collections.synchronizedMap(new java.util.HashMap());
    protected final java.util.Map<java.lang.String, java.lang.Object> extraParameters = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.a$a, reason: collision with other inner class name */
    public interface InterfaceC0040a extends com.applovin.mediation.MaxAdListener, com.applovin.mediation.MaxAdRevenueListener, com.applovin.mediation.MaxAdRequestListener {
    }

    protected a(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat, java.lang.String str2, com.applovin.impl.sdk.j jVar) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = jVar;
        this.tag = str2;
        this.logger = jVar.I();
    }

    void a(com.applovin.impl.fe feVar) {
        com.applovin.impl.pc pcVar = new com.applovin.impl.pc();
        pcVar.a().a("MAX Ad").a(feVar).a();
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, pcVar.toString());
        }
    }

    protected void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
        this.requestListener = null;
        this.expirationListener = null;
        this.adReviewListener = null;
    }

    public java.lang.String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, str);
        }
    }

    public void setAdReviewListener(com.applovin.mediation.MaxAdReviewListener maxAdReviewListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExpirationListener(com.applovin.mediation.MaxAdExpirationListener maxAdExpirationListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Setting expiration listener: " + maxAdExpirationListener);
        }
        this.expirationListener = maxAdExpirationListener;
    }

    public void setExtraParameter(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("No key specified");
        }
        if (com.applovin.impl.yp.c(this.sdk) && ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str))) {
            throw new java.lang.IllegalArgumentException("`setExtraParameter()` is an incorrect method for passing `amazon_ad_response` or `amazon_ad_error`. Please use the following method: `setLocalExtraParameter()`. Also note that this exception occurs in development builds only.");
        }
        if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && com.applovin.impl.sdk.utils.StringUtils.isValidString(str2)) {
            int i = java.lang.Integer.parseInt(str2);
            if (i > java.util.concurrent.TimeUnit.MINUTES.toSeconds(2L)) {
                com.applovin.impl.sdk.n.h(this.tag, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + i + "s) - this will be ignored");
            }
        }
        this.extraParameters.put(str, str2);
    }

    public void setListener(com.applovin.mediation.MaxAdListener maxAdListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("No key specified");
        }
        if (obj instanceof android.app.Activity) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.b(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
            }
        } else {
            if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
                setExtraParameter("is_amazon_integration", java.lang.Boolean.toString(true));
            }
            this.localExtraParameters.put(str, obj);
        }
    }

    public void setRequestListener(com.applovin.mediation.MaxAdRequestListener maxAdRequestListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Setting request listener: " + maxAdRequestListener);
        }
        this.requestListener = maxAdRequestListener;
    }

    public void setRevenueListener(com.applovin.mediation.MaxAdRevenueListener maxAdRevenueListener) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(this.tag, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }

    public static void logApiCall(java.lang.String str, java.lang.String str2) {
        com.applovin.impl.sdk.j jVar = com.applovin.impl.sdk.j.u0;
        if (jVar != null) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.j.u0.I().a(str, str2);
            }
        }
    }
}
