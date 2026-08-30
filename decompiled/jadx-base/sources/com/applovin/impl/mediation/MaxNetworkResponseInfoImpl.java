package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNetworkResponseInfoImpl implements com.applovin.mediation.MaxNetworkResponseInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState f1027a;
    private final com.applovin.mediation.MaxMediatedNetworkInfo b;
    private final android.os.Bundle c;
    private final boolean d;
    private final long e;
    private final java.lang.String f;
    private final com.applovin.mediation.MaxError g;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1028a;

        static {
            int[] iArr = new int[com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.values().length];
            f1028a = iArr;
            try {
                iArr[com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f1028a[com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState adLoadState, com.applovin.mediation.MaxMediatedNetworkInfo maxMediatedNetworkInfo, android.os.Bundle bundle, boolean z, long j, java.lang.String str, com.applovin.mediation.MaxError maxError) {
        this.f1027a = adLoadState;
        this.b = maxMediatedNetworkInfo;
        this.c = bundle;
        this.d = z;
        this.e = j;
        this.f = str;
        this.g = maxError;
    }

    protected boolean canEqual(java.lang.Object obj) {
        return obj instanceof com.applovin.impl.mediation.MaxNetworkResponseInfoImpl;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.mediation.MaxNetworkResponseInfoImpl)) {
            return false;
        }
        com.applovin.impl.mediation.MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (com.applovin.impl.mediation.MaxNetworkResponseInfoImpl) obj;
        if (!maxNetworkResponseInfoImpl.canEqual(this) || isBidding() != maxNetworkResponseInfoImpl.isBidding() || getLatencyMillis() != maxNetworkResponseInfoImpl.getLatencyMillis()) {
            return false;
        }
        com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
        if (adLoadState != null ? !adLoadState.equals(adLoadState2) : adLoadState2 != null) {
            return false;
        }
        com.applovin.mediation.MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        com.applovin.mediation.MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
        if (mediatedNetwork != null ? !mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 != null) {
            return false;
        }
        android.os.Bundle credentials = getCredentials();
        android.os.Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
        if (credentials != null ? !credentials.equals(credentials2) : credentials2 != null) {
            return false;
        }
        java.lang.String bCode = getBCode();
        java.lang.String bCode2 = maxNetworkResponseInfoImpl.getBCode();
        if (bCode != null ? !bCode.equals(bCode2) : bCode2 != null) {
            return false;
        }
        com.applovin.mediation.MaxError error = getError();
        com.applovin.mediation.MaxError error2 = maxNetworkResponseInfoImpl.getError();
        return error != null ? error.equals(error2) : error2 == null;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f1027a;
    }

    public java.lang.String getBCode() {
        return this.f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public android.os.Bundle getCredentials() {
        return this.c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public com.applovin.mediation.MaxError getError() {
        return this.g;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public com.applovin.mediation.MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.b;
    }

    public int hashCode() {
        int i = isBidding() ? 79 : 97;
        long latencyMillis = getLatencyMillis();
        int i2 = ((i + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        com.applovin.mediation.MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int iHashCode = (i2 * 59) + (adLoadState == null ? 43 : adLoadState.hashCode());
        com.applovin.mediation.MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int iHashCode2 = (iHashCode * 59) + (mediatedNetwork == null ? 43 : mediatedNetwork.hashCode());
        android.os.Bundle credentials = getCredentials();
        int iHashCode3 = (iHashCode2 * 59) + (credentials == null ? 43 : credentials.hashCode());
        java.lang.String bCode = getBCode();
        int iHashCode4 = (iHashCode3 * 59) + (bCode == null ? 43 : bCode.hashCode());
        com.applovin.mediation.MaxError error = getError();
        return (iHashCode4 * 59) + (error != null ? error.hashCode() : 43);
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.d;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MaxResponseInfo{adLoadState=" + this.f1027a + ", mediatedNetwork=" + this.b + ", credentials=" + this.c + ", isBidding=" + this.d);
        int i = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.a.f1028a[this.f1027a.ordinal()];
        if (i != 1) {
            if (i == 2) {
            }
            return sb.append("}").toString();
        }
        sb.append(", error=").append(this.g);
        sb.append(", latencyMillis=").append(this.e);
        return sb.append("}").toString();
    }
}
