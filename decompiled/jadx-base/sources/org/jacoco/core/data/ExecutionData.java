package org.jacoco.core.data;

/* JADX INFO: loaded from: classes6.dex */
public final class ExecutionData {
    private final long id;
    private final java.lang.String name;
    private final boolean[] probes;

    public ExecutionData(long j, java.lang.String str, boolean[] zArr) {
        this.id = j;
        this.name = str;
        this.probes = zArr;
    }

    public ExecutionData(long j, java.lang.String str, int i) {
        this.id = j;
        this.name = str;
        this.probes = new boolean[i];
    }

    public long getId() {
        return this.id;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public boolean[] getProbes() {
        return this.probes;
    }

    public void reset() {
        java.util.Arrays.fill(this.probes, false);
    }

    public boolean hasHits() {
        for (boolean z : this.probes) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public void merge(org.jacoco.core.data.ExecutionData executionData) {
        merge(executionData, true);
    }

    public void merge(org.jacoco.core.data.ExecutionData executionData, boolean z) {
        assertCompatibility(executionData.getId(), executionData.getName(), executionData.getProbes().length);
        boolean[] probes = executionData.getProbes();
        int i = 0;
        while (true) {
            boolean[] zArr = this.probes;
            if (i >= zArr.length) {
                return;
            }
            if (probes[i]) {
                zArr[i] = z;
            }
            i++;
        }
    }

    public void assertCompatibility(long j, java.lang.String str, int i) throws java.lang.IllegalStateException {
        if (this.id != j) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Different ids (%016x and %016x).", java.lang.Long.valueOf(this.id), java.lang.Long.valueOf(j)));
        }
        if (!this.name.equals(str)) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Different class names %s and %s for id %016x.", this.name, str, java.lang.Long.valueOf(j)));
        }
        if (this.probes.length != i) {
            throw new java.lang.IllegalStateException(java.lang.String.format("Incompatible execution data for class %s with id %016x.", str, java.lang.Long.valueOf(j)));
        }
    }

    public java.lang.String toString() {
        return java.lang.String.format("ExecutionData[name=%s, id=%016x]", this.name, java.lang.Long.valueOf(this.id));
    }
}
