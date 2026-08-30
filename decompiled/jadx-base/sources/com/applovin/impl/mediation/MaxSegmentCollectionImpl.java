package com.applovin.impl.mediation;

/* JADX INFO: loaded from: classes3.dex */
public class MaxSegmentCollectionImpl implements com.applovin.mediation.MaxSegmentCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.util.List f1030a;
    private final java.util.Map b;

    public static class BuilderImpl implements com.applovin.mediation.MaxSegmentCollection.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f1031a = new java.util.ArrayList();

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public com.applovin.mediation.MaxSegmentCollection.Builder addSegment(com.applovin.mediation.MaxSegment maxSegment) {
            this.f1031a.add(maxSegment);
            return this;
        }

        @Override // com.applovin.mediation.MaxSegmentCollection.Builder
        public com.applovin.mediation.MaxSegmentCollection build() {
            return new com.applovin.impl.mediation.MaxSegmentCollectionImpl(this);
        }
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.Integer>> getJsonData() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxSegmentCollection
    public java.util.List<com.applovin.mediation.MaxSegment> getSegments() {
        return this.f1030a;
    }

    public java.lang.String toString() {
        return "MaxSegmentColletionImpl{segments=" + this.f1030a + "}";
    }

    private MaxSegmentCollectionImpl(com.applovin.impl.mediation.MaxSegmentCollectionImpl.BuilderImpl builderImpl) {
        java.util.List<com.applovin.mediation.MaxSegment> list = builderImpl.f1031a;
        this.f1030a = list;
        this.b = new java.util.HashMap();
        for (com.applovin.mediation.MaxSegment maxSegment : list) {
            this.b.put("segment_" + maxSegment.getKey(), maxSegment.getValues());
        }
    }
}
