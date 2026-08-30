package org.jacoco.core.data;

/* JADX INFO: loaded from: classes6.dex */
public class SessionInfo implements java.lang.Comparable<org.jacoco.core.data.SessionInfo> {
    private final long dump;
    private final java.lang.String id;
    private final long start;

    public SessionInfo(java.lang.String str, long j, long j2) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException();
        }
        this.id = str;
        this.start = j;
        this.dump = j2;
    }

    public java.lang.String getId() {
        return this.id;
    }

    public long getStartTimeStamp() {
        return this.start;
    }

    public long getDumpTimeStamp() {
        return this.dump;
    }

    @Override // java.lang.Comparable
    public int compareTo(org.jacoco.core.data.SessionInfo sessionInfo) {
        long j = this.dump;
        long j2 = sessionInfo.dump;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public java.lang.String toString() {
        return "SessionInfo[" + this.id + com.ironsource.y8.i.e;
    }
}
