package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ApiKey<O extends com.google.android.gms.common.api.Api.ApiOptions> {
    private final int zaa;
    private final com.google.android.gms.common.api.Api zab;
    private final com.google.android.gms.common.api.Api.ApiOptions zac;
    private final java.lang.String zad;

    private ApiKey(com.google.android.gms.common.api.Api api, com.google.android.gms.common.api.Api.ApiOptions apiOptions, java.lang.String str) {
        this.zab = api;
        this.zac = apiOptions;
        this.zad = str;
        this.zaa = com.google.android.gms.common.internal.Objects.hashCode(api, apiOptions, str);
    }

    public static <O extends com.google.android.gms.common.api.Api.ApiOptions> com.google.android.gms.common.api.internal.ApiKey<O> getSharedApiKey(com.google.android.gms.common.api.Api<O> api, O o, java.lang.String str) {
        return new com.google.android.gms.common.api.internal.ApiKey<>(api, o, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.internal.ApiKey)) {
            return false;
        }
        com.google.android.gms.common.api.internal.ApiKey apiKey = (com.google.android.gms.common.api.internal.ApiKey) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zab, apiKey.zab) && com.google.android.gms.common.internal.Objects.equal(this.zac, apiKey.zac) && com.google.android.gms.common.internal.Objects.equal(this.zad, apiKey.zad);
    }

    public final int hashCode() {
        return this.zaa;
    }

    public final java.lang.String zaa() {
        return this.zab.zad();
    }
}
