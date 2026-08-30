package org.jacoco.core.internal.analysis;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CounterImpl implements org.jacoco.core.analysis.ICounter {
    public static final org.jacoco.core.internal.analysis.CounterImpl COUNTER_0_0;
    public static final org.jacoco.core.internal.analysis.CounterImpl COUNTER_0_1;
    public static final org.jacoco.core.internal.analysis.CounterImpl COUNTER_1_0;
    private static final org.jacoco.core.internal.analysis.CounterImpl[][] SINGLETONS = new org.jacoco.core.internal.analysis.CounterImpl[31][];
    private static final int SINGLETON_LIMIT = 30;
    protected int covered;
    protected int missed;

    public abstract org.jacoco.core.internal.analysis.CounterImpl increment(int i, int i2);

    static {
        for (int i = 0; i <= 30; i++) {
            SINGLETONS[i] = new org.jacoco.core.internal.analysis.CounterImpl[31];
            for (int i2 = 0; i2 <= 30; i2++) {
                SINGLETONS[i][i2] = new org.jacoco.core.internal.analysis.CounterImpl.Fix(i, i2);
            }
        }
        org.jacoco.core.internal.analysis.CounterImpl[][] counterImplArr = SINGLETONS;
        org.jacoco.core.internal.analysis.CounterImpl[] counterImplArr2 = counterImplArr[0];
        COUNTER_0_0 = counterImplArr2[0];
        COUNTER_1_0 = counterImplArr[1][0];
        COUNTER_0_1 = counterImplArr2[1];
    }

    private static class Var extends org.jacoco.core.internal.analysis.CounterImpl {
        public Var(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jacoco.core.internal.analysis.CounterImpl
        public org.jacoco.core.internal.analysis.CounterImpl increment(int i, int i2) {
            this.missed += i;
            this.covered += i2;
            return this;
        }
    }

    private static class Fix extends org.jacoco.core.internal.analysis.CounterImpl {
        public Fix(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jacoco.core.internal.analysis.CounterImpl
        public org.jacoco.core.internal.analysis.CounterImpl increment(int i, int i2) {
            return getInstance(this.missed + i, this.covered + i2);
        }
    }

    public static org.jacoco.core.internal.analysis.CounterImpl getInstance(int i, int i2) {
        if (i <= 30 && i2 <= 30) {
            return SINGLETONS[i][i2];
        }
        return new org.jacoco.core.internal.analysis.CounterImpl.Var(i, i2);
    }

    public static org.jacoco.core.internal.analysis.CounterImpl getInstance(org.jacoco.core.analysis.ICounter iCounter) {
        return getInstance(iCounter.getMissedCount(), iCounter.getCoveredCount());
    }

    protected CounterImpl(int i, int i2) {
        this.missed = i;
        this.covered = i2;
    }

    public org.jacoco.core.internal.analysis.CounterImpl increment(org.jacoco.core.analysis.ICounter iCounter) {
        return increment(iCounter.getMissedCount(), iCounter.getCoveredCount());
    }

    /* JADX INFO: renamed from: org.jacoco.core.internal.analysis.CounterImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue;

        static {
            int[] iArr = new int[org.jacoco.core.analysis.ICounter.CounterValue.values().length];
            $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue = iArr;
            try {
                iArr[org.jacoco.core.analysis.ICounter.CounterValue.TOTALCOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[org.jacoco.core.analysis.ICounter.CounterValue.MISSEDCOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[org.jacoco.core.analysis.ICounter.CounterValue.COVEREDCOUNT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[org.jacoco.core.analysis.ICounter.CounterValue.MISSEDRATIO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[org.jacoco.core.analysis.ICounter.CounterValue.COVEREDRATIO.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
        }
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getValue(org.jacoco.core.analysis.ICounter.CounterValue counterValue) {
        int totalCount;
        int i = org.jacoco.core.internal.analysis.CounterImpl.AnonymousClass1.$SwitchMap$org$jacoco$core$analysis$ICounter$CounterValue[counterValue.ordinal()];
        if (i == 1) {
            totalCount = getTotalCount();
        } else if (i == 2) {
            totalCount = getMissedCount();
        } else {
            if (i != 3) {
                if (i == 4) {
                    return getMissedRatio();
                }
                if (i == 5) {
                    return getCoveredRatio();
                }
                throw new java.lang.AssertionError(counterValue);
            }
            totalCount = getCoveredCount();
        }
        return totalCount;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getTotalCount() {
        return this.missed + this.covered;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getCoveredCount() {
        return this.covered;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getMissedCount() {
        return this.missed;
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getCoveredRatio() {
        int i = this.covered;
        return ((double) i) / ((double) (this.missed + i));
    }

    @Override // org.jacoco.core.analysis.ICounter
    public double getMissedRatio() {
        int i = this.missed;
        return ((double) i) / ((double) (i + this.covered));
    }

    @Override // org.jacoco.core.analysis.ICounter
    public int getStatus() {
        int i = this.covered > 0 ? 2 : 0;
        return this.missed > 0 ? i | 1 : i;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.jacoco.core.analysis.ICounter)) {
            return false;
        }
        org.jacoco.core.analysis.ICounter iCounter = (org.jacoco.core.analysis.ICounter) obj;
        return this.missed == iCounter.getMissedCount() && this.covered == iCounter.getCoveredCount();
    }

    public int hashCode() {
        return this.missed ^ (this.covered * 17);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Counter[");
        sb.append(getMissedCount());
        sb.append('/').append(getCoveredCount());
        sb.append(']');
        return sb.toString();
    }
}
