package org.jacoco.core.data;

/* JADX INFO: loaded from: classes6.dex */
public final class ExecutionDataStore implements org.jacoco.core.data.IExecutionDataVisitor {
    private final java.util.Map<java.lang.Long, org.jacoco.core.data.ExecutionData> entries = new java.util.HashMap();
    private final java.util.Set<java.lang.String> names = new java.util.HashSet();

    public void put(org.jacoco.core.data.ExecutionData executionData) throws java.lang.IllegalStateException {
        java.lang.Long lValueOf = java.lang.Long.valueOf(executionData.getId());
        org.jacoco.core.data.ExecutionData executionData2 = this.entries.get(lValueOf);
        if (executionData2 == null) {
            this.entries.put(lValueOf, executionData);
            this.names.add(executionData.getName());
        } else {
            executionData2.merge(executionData);
        }
    }

    public void subtract(org.jacoco.core.data.ExecutionData executionData) throws java.lang.IllegalStateException {
        org.jacoco.core.data.ExecutionData executionData2 = this.entries.get(java.lang.Long.valueOf(executionData.getId()));
        if (executionData2 != null) {
            executionData2.merge(executionData, false);
        }
    }

    public void subtract(org.jacoco.core.data.ExecutionDataStore executionDataStore) {
        java.util.Iterator<org.jacoco.core.data.ExecutionData> it = executionDataStore.getContents().iterator();
        while (it.hasNext()) {
            subtract(it.next());
        }
    }

    public org.jacoco.core.data.ExecutionData get(long j) {
        return this.entries.get(java.lang.Long.valueOf(j));
    }

    public boolean contains(java.lang.String str) {
        return this.names.contains(str);
    }

    public org.jacoco.core.data.ExecutionData get(java.lang.Long l, java.lang.String str, int i) {
        org.jacoco.core.data.ExecutionData executionData = this.entries.get(l);
        if (executionData == null) {
            org.jacoco.core.data.ExecutionData executionData2 = new org.jacoco.core.data.ExecutionData(l.longValue(), str, i);
            this.entries.put(l, executionData2);
            this.names.add(str);
            return executionData2;
        }
        executionData.assertCompatibility(l.longValue(), str, i);
        return executionData;
    }

    public void reset() {
        java.util.Iterator<org.jacoco.core.data.ExecutionData> it = this.entries.values().iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
    }

    public java.util.Collection<org.jacoco.core.data.ExecutionData> getContents() {
        return new java.util.ArrayList(this.entries.values());
    }

    public void accept(org.jacoco.core.data.IExecutionDataVisitor iExecutionDataVisitor) {
        java.util.Iterator<org.jacoco.core.data.ExecutionData> it = getContents().iterator();
        while (it.hasNext()) {
            iExecutionDataVisitor.visitClassExecution(it.next());
        }
    }

    @Override // org.jacoco.core.data.IExecutionDataVisitor
    public void visitClassExecution(org.jacoco.core.data.ExecutionData executionData) {
        put(executionData);
    }
}
