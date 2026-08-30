package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public class FiveAdConfig {
    public final java.lang.String appId;
    public com.five_corp.ad.FiveAdAgeRating fiveAdAgeRating;
    public com.five_corp.ad.NeedChildDirectedTreatment needChildDirectedTreatment;
    public com.five_corp.ad.NeedGdprNonPersonalizedAdsTreatment needGdprNonPersonalizedAdsTreatment;

    @java.lang.Deprecated
    public java.util.EnumSet<com.five_corp.ad.FiveAdFormat> formats = java.util.EnumSet.noneOf(com.five_corp.ad.FiveAdFormat.class);
    public boolean isTest = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1763a = 1;

    public FiveAdConfig(java.lang.String str) {
        this.appId = str;
    }

    public final int a() {
        return this.f1763a;
    }

    public com.five_corp.ad.FiveAdConfig deepCopy() {
        com.five_corp.ad.FiveAdConfig fiveAdConfig = new com.five_corp.ad.FiveAdConfig(this.appId);
        fiveAdConfig.isTest = this.isTest;
        fiveAdConfig.needGdprNonPersonalizedAdsTreatment = getNeedGdprNonPersonalizedAdsTreatment();
        fiveAdConfig.needChildDirectedTreatment = getNeedChildDirectedTreatment();
        fiveAdConfig.fiveAdAgeRating = getFiveAdAgeRating();
        fiveAdConfig.f1763a = this.f1763a;
        return fiveAdConfig;
    }

    public void enableSoundByDefault(boolean z) {
        this.f1763a = z ? 2 : 3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.five_corp.ad.FiveAdConfig fiveAdConfig = (com.five_corp.ad.FiveAdConfig) obj;
        if (this.isTest != fiveAdConfig.isTest) {
            return false;
        }
        return java.util.Objects.equals(this.appId, fiveAdConfig.appId);
    }

    public com.five_corp.ad.FiveAdAgeRating getFiveAdAgeRating() {
        com.five_corp.ad.FiveAdAgeRating fiveAdAgeRating = this.fiveAdAgeRating;
        return fiveAdAgeRating == null ? com.five_corp.ad.FiveAdAgeRating.UNSPECIFIED : fiveAdAgeRating;
    }

    public com.five_corp.ad.NeedChildDirectedTreatment getNeedChildDirectedTreatment() {
        com.five_corp.ad.NeedChildDirectedTreatment needChildDirectedTreatment = this.needChildDirectedTreatment;
        return needChildDirectedTreatment == null ? com.five_corp.ad.NeedChildDirectedTreatment.UNSPECIFIED : needChildDirectedTreatment;
    }

    public com.five_corp.ad.NeedGdprNonPersonalizedAdsTreatment getNeedGdprNonPersonalizedAdsTreatment() {
        com.five_corp.ad.NeedGdprNonPersonalizedAdsTreatment needGdprNonPersonalizedAdsTreatment = this.needGdprNonPersonalizedAdsTreatment;
        return needGdprNonPersonalizedAdsTreatment == null ? com.five_corp.ad.NeedGdprNonPersonalizedAdsTreatment.UNSPECIFIED : needGdprNonPersonalizedAdsTreatment;
    }

    public int hashCode() {
        java.lang.String str = this.appId;
        return ((str != null ? str.hashCode() : 0) * 31) + (this.isTest ? 1 : 0);
    }
}
