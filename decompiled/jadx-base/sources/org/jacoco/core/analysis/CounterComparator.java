package org.jacoco.core.analysis;

/* JADX INFO: loaded from: classes6.dex */
public class CounterComparator implements java.util.Comparator<org.jacoco.core.analysis.ICounter>, java.io.Serializable {
    private static final long serialVersionUID = -3777463066252746748L;
    private final boolean reverse;
    private final org.jacoco.core.analysis.ICounter.CounterValue value;
    public static final org.jacoco.core.analysis.CounterComparator TOTALITEMS = new org.jacoco.core.analysis.CounterComparator(org.jacoco.core.analysis.ICounter.CounterValue.TOTALCOUNT);
    public static final org.jacoco.core.analysis.CounterComparator COVEREDITEMS = new org.jacoco.core.analysis.CounterComparator(org.jacoco.core.analysis.ICounter.CounterValue.COVEREDCOUNT);
    public static final org.jacoco.core.analysis.CounterComparator MISSEDITEMS = new org.jacoco.core.analysis.CounterComparator(org.jacoco.core.analysis.ICounter.CounterValue.MISSEDCOUNT);
    public static final org.jacoco.core.analysis.CounterComparator COVEREDRATIO = new org.jacoco.core.analysis.CounterComparator(org.jacoco.core.analysis.ICounter.CounterValue.COVEREDRATIO);
    public static final org.jacoco.core.analysis.CounterComparator MISSEDRATIO = new org.jacoco.core.analysis.CounterComparator(org.jacoco.core.analysis.ICounter.CounterValue.MISSEDRATIO);

    private CounterComparator(org.jacoco.core.analysis.ICounter.CounterValue counterValue) {
        this(counterValue, false);
    }

    private CounterComparator(org.jacoco.core.analysis.ICounter.CounterValue counterValue, boolean z) {
        this.value = counterValue;
        this.reverse = z;
    }

    @Override // java.util.Comparator
    public int compare(org.jacoco.core.analysis.ICounter iCounter, org.jacoco.core.analysis.ICounter iCounter2) {
        int iCompare = java.lang.Double.compare(iCounter.getValue(this.value), iCounter2.getValue(this.value));
        return this.reverse ? -iCompare : iCompare;
    }

    public org.jacoco.core.analysis.CounterComparator reverse() {
        return new org.jacoco.core.analysis.CounterComparator(this.value, !this.reverse);
    }

    public org.jacoco.core.analysis.NodeComparator on(org.jacoco.core.analysis.ICoverageNode.CounterEntity counterEntity) {
        return new org.jacoco.core.analysis.NodeComparator(this, counterEntity);
    }
}
