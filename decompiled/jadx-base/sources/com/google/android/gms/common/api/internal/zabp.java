package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabp {
    private final com.google.android.gms.common.api.internal.ApiKey zaa;
    private final com.google.android.gms.common.Feature zab;

    /* synthetic */ zabp(com.google.android.gms.common.api.internal.ApiKey apiKey, com.google.android.gms.common.Feature feature, com.google.android.gms.common.api.internal.zabs zabsVar) {
        this.zaa = apiKey;
        this.zab = feature;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.common.api.internal.zabp)) {
            com.google.android.gms.common.api.internal.zabp zabpVar = (com.google.android.gms.common.api.internal.zabp) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zaa, zabpVar.zaa) && com.google.android.gms.common.internal.Objects.equal(this.zab, zabpVar.zab)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zaa, this.zab);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add(com.ironsource.y8.h.W, this.zaa).add("feature", this.zab).toString();
    }
}
