package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class NodeComparator implements java.util.Comparator<org.jacoco.core.analysis.ICoverageNode>, java.io.Serializable {
    private static final long serialVersionUID = 8550521643608826519L;
    private final java.util.Comparator<org.jacoco.core.analysis.ICounter> counterComparator;
    private final org.jacoco.core.analysis.ICoverageNode.CounterEntity entity;

    NodeComparator(java.util.Comparator<org.jacoco.core.analysis.ICounter> comparator, org.jacoco.core.analysis.ICoverageNode.CounterEntity counterEntity) {
        this.counterComparator = comparator;
        this.entity = counterEntity;
    }

    public org.jacoco.core.analysis.NodeComparator second(final java.util.Comparator<org.jacoco.core.analysis.ICoverageNode> comparator) {
        return new org.jacoco.core.analysis.NodeComparator(null, null) { // from class: org.jacoco.core.analysis.NodeComparator.1
            private static final long serialVersionUID = -5515272752138802838L;

            @Override // org.jacoco.core.analysis.NodeComparator, java.util.Comparator
            public int compare(org.jacoco.core.analysis.ICoverageNode iCoverageNode, org.jacoco.core.analysis.ICoverageNode iCoverageNode2) {
                int iCompare = this.compare(iCoverageNode, iCoverageNode2);
                return iCompare == 0 ? comparator.compare(iCoverageNode, iCoverageNode2) : iCompare;
            }
        };
    }

    public <T extends org.jacoco.core.analysis.ICoverageNode> java.util.List<T> sort(java.util.Collection<T> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList(collection);
        java.util.Collections.sort(arrayList, this);
        return arrayList;
    }

    @Override // java.util.Comparator
    public int compare(org.jacoco.core.analysis.ICoverageNode iCoverageNode, org.jacoco.core.analysis.ICoverageNode iCoverageNode2) {
        return this.counterComparator.compare(iCoverageNode.getCounter(this.entity), iCoverageNode2.getCounter(this.entity));
    }
}
