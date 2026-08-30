package com.applovin.mediation;

/* JADX INFO: loaded from: classes3.dex */
public interface MaxSegmentCollection {

    public interface Builder {
        com.applovin.mediation.MaxSegmentCollection.Builder addSegment(com.applovin.mediation.MaxSegment maxSegment);

        com.applovin.mediation.MaxSegmentCollection build();
    }

    static com.applovin.mediation.MaxSegmentCollection.Builder builder() {
        return new com.applovin.impl.mediation.MaxSegmentCollectionImpl.BuilderImpl();
    }

    java.util.List<com.applovin.mediation.MaxSegment> getSegments();
}
