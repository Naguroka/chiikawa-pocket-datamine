package com.google.android.gms.ads.admanager;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class AdManagerAdRequest extends com.google.android.gms.ads.AdRequest {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static final class Builder extends com.google.android.gms.ads.AbstractAdRequestBuilder<com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder> {
        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder addCategoryExclusion(java.lang.String str) {
            this.zza.zzn(str);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.AbstractAdRequestBuilder addCustomTargeting(java.lang.String str, java.lang.String str2) {
            addCustomTargeting(str, str2);
            return this;
        }

        public com.google.android.gms.ads.admanager.AdManagerAdRequest build() {
            return new com.google.android.gms.ads.admanager.AdManagerAdRequest(this, null);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.AbstractAdRequestBuilder self() {
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder self() {
            return this;
        }

        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder setPublisherProvidedId(java.lang.String str) {
            this.zza.zzB(str);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder addCustomTargeting(java.lang.String str, java.lang.String str2) {
            this.zza.zzp(str, str2);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.AbstractAdRequestBuilder addCustomTargeting(java.lang.String str, java.util.List list) {
            addCustomTargeting(str, (java.util.List<java.lang.String>) list);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        public com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder addCustomTargeting(java.lang.String str, java.util.List<java.lang.String> list) {
            if (list != null) {
                this.zza.zzp(str, android.text.TextUtils.join(",", list));
            }
            return this;
        }
    }

    /* synthetic */ AdManagerAdRequest(com.google.android.gms.ads.admanager.AdManagerAdRequest.Builder builder, com.google.android.gms.ads.admanager.zza zzaVar) {
        super(builder);
    }

    @Override // com.google.android.gms.ads.AdRequest
    public android.os.Bundle getCustomTargeting() {
        return this.zza.zze();
    }

    public java.lang.String getPublisherProvidedId() {
        return this.zza.zzl();
    }
}
