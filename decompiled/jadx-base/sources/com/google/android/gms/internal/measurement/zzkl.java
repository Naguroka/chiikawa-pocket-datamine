package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public enum zzkl implements com.google.android.gms.internal.measurement.zzmf {
    IAB_TCF_PURPOSE_UNKNOWN(0),
    IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE(1),
    IAB_TCF_PURPOSE_SELECT_BASIC_ADS(2),
    IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE(3),
    IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS(4),
    IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE(5),
    IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT(6),
    IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE(7),
    IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE(8),
    IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS(9),
    IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS(10),
    IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT(11),
    UNRECOGNIZED(-1);

    private final int zzo;

    zzkl(int i) {
        this.zzo = i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzo;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
