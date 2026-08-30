package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class BooleanResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zaa;
    private final boolean zab;

    public BooleanResult(com.google.android.gms.common.api.Status status, boolean z) {
        this.zaa = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(status, "Status must not be null");
        this.zab = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.BooleanResult)) {
            return false;
        }
        com.google.android.gms.common.api.BooleanResult booleanResult = (com.google.android.gms.common.api.BooleanResult) obj;
        return this.zaa.equals(booleanResult.zaa) && this.zab == booleanResult.zab;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zaa;
    }

    public boolean getValue() {
        return this.zab;
    }

    public final int hashCode() {
        return ((this.zaa.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zab ? 1 : 0);
    }
}
