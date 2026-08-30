package org.jacoco.core.data;

/* JADX INFO: loaded from: classes6.dex */
public class SessionInfoStore implements org.jacoco.core.data.ISessionInfoVisitor {
    private final java.util.List<org.jacoco.core.data.SessionInfo> infos = new java.util.ArrayList();

    public boolean isEmpty() {
        return this.infos.isEmpty();
    }

    public java.util.List<org.jacoco.core.data.SessionInfo> getInfos() {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.infos);
        java.util.Collections.sort(arrayList);
        return arrayList;
    }

    public org.jacoco.core.data.SessionInfo getMerged(java.lang.String str) {
        if (this.infos.isEmpty()) {
            return new org.jacoco.core.data.SessionInfo(str, 0L, 0L);
        }
        long jMin = Long.MAX_VALUE;
        long jMax = Long.MIN_VALUE;
        for (org.jacoco.core.data.SessionInfo sessionInfo : this.infos) {
            jMin = java.lang.Math.min(jMin, sessionInfo.getStartTimeStamp());
            jMax = java.lang.Math.max(jMax, sessionInfo.getDumpTimeStamp());
        }
        return new org.jacoco.core.data.SessionInfo(str, jMin, jMax);
    }

    public void accept(org.jacoco.core.data.ISessionInfoVisitor iSessionInfoVisitor) {
        java.util.Iterator<org.jacoco.core.data.SessionInfo> it = getInfos().iterator();
        while (it.hasNext()) {
            iSessionInfoVisitor.visitSessionInfo(it.next());
        }
    }

    @Override // org.jacoco.core.data.ISessionInfoVisitor
    public void visitSessionInfo(org.jacoco.core.data.SessionInfo sessionInfo) {
        this.infos.add(sessionInfo);
    }
}
