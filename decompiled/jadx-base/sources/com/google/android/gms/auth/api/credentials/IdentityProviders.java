package com.google.android.gms.auth.api.credentials;

/* JADX INFO: loaded from: classes4.dex */
public final class IdentityProviders {
    public static final java.lang.String FACEBOOK = "https://www.facebook.com";
    public static final java.lang.String GOOGLE = "https://accounts.google.com";
    public static final java.lang.String LINKEDIN = "https://www.linkedin.com";
    public static final java.lang.String MICROSOFT = "https://login.live.com";
    public static final java.lang.String PAYPAL = "https://www.paypal.com";
    public static final java.lang.String TWITTER = "https://twitter.com";
    public static final java.lang.String YAHOO = "https://login.yahoo.com";

    private IdentityProviders() {
    }

    public static final java.lang.String getIdentityProviderForAccount(android.accounts.Account account) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(account, "account cannot be null");
        if ("com.google".equals(account.type)) {
            return GOOGLE;
        }
        if ("com.facebook.auth.login".equals(account.type)) {
            return FACEBOOK;
        }
        return null;
    }
}
