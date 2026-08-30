package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdapterParametersImpl implements com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters, com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters, com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f1025a;
    private java.util.Map b;
    private android.os.Bundle c;
    private android.os.Bundle d;
    private java.lang.Boolean e;
    private java.lang.Boolean f;
    private java.lang.String g;
    private boolean h;
    private java.lang.String i;
    private java.lang.String j;
    private long k;
    private com.applovin.mediation.MaxAdFormat l;

    private MaxAdapterParametersImpl() {
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public com.applovin.mediation.MaxAdFormat getAdFormat() {
        return this.l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public java.lang.String getAdUnitId() {
        return this.f1025a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public java.lang.String getBidResponse() {
        return this.j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public java.lang.String getConsentString() {
        return this.g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public android.os.Bundle getCustomParameters() {
        return this.d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public java.util.Map<java.lang.String, java.lang.Object> getLocalExtraParameters() {
        return this.b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public android.os.Bundle getServerParameters() {
        return this.c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public java.lang.String getThirdPartyAdPlacementId() {
        return this.i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public java.lang.Boolean hasUserConsent() {
        return this.e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public java.lang.Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public java.lang.Boolean isDoNotSell() {
        return this.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.h;
    }

    static com.applovin.impl.mediation.MaxAdapterParametersImpl a(com.applovin.impl.fe feVar) {
        com.applovin.impl.mediation.MaxAdapterParametersImpl maxAdapterParametersImplA = a((com.applovin.impl.oe) feVar);
        maxAdapterParametersImplA.i = feVar.T();
        maxAdapterParametersImplA.j = feVar.D();
        maxAdapterParametersImplA.k = feVar.C();
        return maxAdapterParametersImplA;
    }

    static com.applovin.impl.mediation.MaxAdapterParametersImpl a(com.applovin.impl.zj zjVar, java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        com.applovin.impl.mediation.MaxAdapterParametersImpl maxAdapterParametersImplA = a(zjVar);
        maxAdapterParametersImplA.f1025a = str;
        maxAdapterParametersImplA.l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    static com.applovin.impl.mediation.MaxAdapterParametersImpl a(com.applovin.impl.oe oeVar) {
        com.applovin.impl.mediation.MaxAdapterParametersImpl maxAdapterParametersImpl = new com.applovin.impl.mediation.MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f1025a = oeVar.getAdUnitId();
        maxAdapterParametersImpl.e = oeVar.n();
        maxAdapterParametersImpl.f = oeVar.o();
        maxAdapterParametersImpl.g = oeVar.d();
        maxAdapterParametersImpl.b = oeVar.i();
        maxAdapterParametersImpl.c = oeVar.l();
        maxAdapterParametersImpl.d = oeVar.f();
        maxAdapterParametersImpl.h = oeVar.p();
        return maxAdapterParametersImpl;
    }
}
